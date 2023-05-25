// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyBackendModelResponseBody extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBackendModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackendModelResponseBody self = new ModifyBackendModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackendModelResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ModifyBackendModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

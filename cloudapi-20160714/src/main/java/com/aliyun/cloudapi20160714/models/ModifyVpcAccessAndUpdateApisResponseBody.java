// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyVpcAccessAndUpdateApisResponseBody extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcAccessAndUpdateApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcAccessAndUpdateApisResponseBody self = new ModifyVpcAccessAndUpdateApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcAccessAndUpdateApisResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ModifyVpcAccessAndUpdateApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyBackendModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c16a1880f5164d779f6a54f64d997cd9</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <strong>example:</strong>
     * <p>19B89B04-418B-55EE-94A8-6B42CA06002A</p>
     */
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

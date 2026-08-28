// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayElasticPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5B540EB6-7CF6-5326-A312-E3D68446CE07</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateGatewayElasticPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayElasticPolicyResponseBody self = new UpdateGatewayElasticPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayElasticPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGatewayElasticPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayElasticPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

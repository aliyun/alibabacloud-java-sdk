// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteGatewayQuotaRuleResponseBody extends TeaModel {
    /**
     * <p>The status code or error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200, 404, 500</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The message content.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteGatewayQuotaRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayQuotaRuleResponseBody self = new DeleteGatewayQuotaRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayQuotaRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteGatewayQuotaRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGatewayQuotaRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

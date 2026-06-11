// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayQuotaRuleStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200, 404, 500</p>
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
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateGatewayQuotaRuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayQuotaRuleStatusResponseBody self = new UpdateGatewayQuotaRuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayQuotaRuleStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGatewayQuotaRuleStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayQuotaRuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleResponseBody extends TeaModel {
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
     * <p>019FCFBD-4B8D-57A4-91DA-A3B517002442</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleResponseBody self = new UpdateAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAuthorizationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

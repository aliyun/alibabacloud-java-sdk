// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RemoveConsumerAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5B626361-070A-56A7-B127-ADAC8F3655DB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RemoveConsumerAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveConsumerAuthorizationRuleResponseBody self = new RemoveConsumerAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveConsumerAuthorizationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveConsumerAuthorizationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveConsumerAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

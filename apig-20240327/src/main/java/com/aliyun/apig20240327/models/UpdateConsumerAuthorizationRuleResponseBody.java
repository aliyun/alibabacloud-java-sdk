// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateConsumerAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
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
     * <p>C67DED2B-F19B-5BEC-88C1-D6EB854CD0D4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateConsumerAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerAuthorizationRuleResponseBody self = new UpdateConsumerAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerAuthorizationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateConsumerAuthorizationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateConsumerAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

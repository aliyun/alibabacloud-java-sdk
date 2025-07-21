// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteConsumerAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3C3B9A12-3868-5EB9-8BEA-F99E03DD125C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteConsumerAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerAuthorizationRuleResponseBody self = new DeleteConsumerAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerAuthorizationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteConsumerAuthorizationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteConsumerAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

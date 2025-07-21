// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchDeleteConsumerAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
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
     * <p>464F9EA0-1052-51BD-8187-D292AA2D8D24</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchDeleteConsumerAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteConsumerAuthorizationRuleResponseBody self = new BatchDeleteConsumerAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteConsumerAuthorizationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchDeleteConsumerAuthorizationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchDeleteConsumerAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

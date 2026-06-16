// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RateLimitRuleResult extends TeaModel {
    /**
     * <p>A value of <code>SUCCESS</code> indicates the request succeeded. On failure, this field returns the corresponding error type.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The details of the rate limit rule.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public RateLimitRule data;

    /**
     * <p>A unique request identifier for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RateLimitRuleResult build(java.util.Map<String, ?> map) throws Exception {
        RateLimitRuleResult self = new RateLimitRuleResult();
        return TeaModel.build(map, self);
    }

    public RateLimitRuleResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RateLimitRuleResult setData(RateLimitRule data) {
        this.data = data;
        return this;
    }
    public RateLimitRule getData() {
        return this.data;
    }

    public RateLimitRuleResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

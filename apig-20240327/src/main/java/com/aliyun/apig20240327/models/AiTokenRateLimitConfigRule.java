// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiTokenRateLimitConfigRule extends TeaModel {
    /**
     * <p>The action to take when a request exceeds the token rate limit.</p>
     */
    @NameInMap("limitMode")
    public String limitMode;

    /**
     * <p>The scope of the rate limit, such as per user or per project.</p>
     */
    @NameInMap("limitType")
    public String limitType;

    /**
     * <p>The maximum number of tokens allowed within the defined time period. For example, if the time unit is one minute, this value represents the tokens-per-minute (TPM) limit.</p>
     */
    @NameInMap("limitValue")
    public Integer limitValue;

    /**
     * <p>The key that identifies the request source. Its value is extracted from the request context to apply the rule.</p>
     */
    @NameInMap("matchKey")
    public String matchKey;

    /**
     * <p>The matching logic applied to the value of <code>matchKey</code>.</p>
     */
    @NameInMap("matchType")
    public String matchType;

    /**
     * <p>The value to match. The rate limit applies only when the value of <code>matchKey</code> in the request matches this value, according to the <code>matchType</code>.</p>
     */
    @NameInMap("matchValue")
    public String matchValue;

    public static AiTokenRateLimitConfigRule build(java.util.Map<String, ?> map) throws Exception {
        AiTokenRateLimitConfigRule self = new AiTokenRateLimitConfigRule();
        return TeaModel.build(map, self);
    }

    public AiTokenRateLimitConfigRule setLimitMode(String limitMode) {
        this.limitMode = limitMode;
        return this;
    }
    public String getLimitMode() {
        return this.limitMode;
    }

    public AiTokenRateLimitConfigRule setLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }
    public String getLimitType() {
        return this.limitType;
    }

    public AiTokenRateLimitConfigRule setLimitValue(Integer limitValue) {
        this.limitValue = limitValue;
        return this;
    }
    public Integer getLimitValue() {
        return this.limitValue;
    }

    public AiTokenRateLimitConfigRule setMatchKey(String matchKey) {
        this.matchKey = matchKey;
        return this;
    }
    public String getMatchKey() {
        return this.matchKey;
    }

    public AiTokenRateLimitConfigRule setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public AiTokenRateLimitConfigRule setMatchValue(String matchValue) {
        this.matchValue = matchValue;
        return this;
    }
    public String getMatchValue() {
        return this.matchValue;
    }

}

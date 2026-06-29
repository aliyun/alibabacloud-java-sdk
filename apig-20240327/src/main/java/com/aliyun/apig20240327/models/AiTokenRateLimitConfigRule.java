// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiTokenRateLimitConfigRule extends TeaModel {
    /**
     * <p>The throttling mode.</p>
     * 
     * <strong>example:</strong>
     * <p>TokenPerMinute</p>
     */
    @NameInMap("limitMode")
    public String limitMode;

    /**
     * <p>The throttling type.</p>
     * 
     * <strong>example:</strong>
     * <p>Consumer</p>
     */
    @NameInMap("limitType")
    public String limitType;

    /**
     * <p>The throttling value.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("limitValue")
    public Integer limitValue;

    /**
     * <p>The match key name.</p>
     * 
     * <strong>example:</strong>
     * <p>X-API-Key</p>
     */
    @NameInMap("matchKey")
    public String matchKey;

    /**
     * <p>The matching method.</p>
     * 
     * <strong>example:</strong>
     * <p>Exact</p>
     */
    @NameInMap("matchType")
    public String matchType;

    /**
     * <p>The match value.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer-a</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RateLimitRule extends TeaModel {
    /**
     * <p>The creation time of the rate limit rule, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The descriptor ID for the rate limit rule, which associates the rule with a specific throttling target.</p>
     * 
     * <strong>example:</strong>
     * <p>model:gpt-4</p>
     */
    @NameInMap("descriptorId")
    public String descriptorId;

    /**
     * <p>The descriptor type for the rate limit rule, such as \&quot;model\&quot; or \&quot;user\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>model</p>
     */
    @NameInMap("descriptorType")
    public String descriptorType;

    /**
     * <p>Indicates whether the rate limit rule is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The last update time of the rate limit rule, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>The unique identifier for the rate limit rule.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789abc</p>
     */
    @NameInMap("rateLimitRuleId")
    public String rateLimitRuleId;

    /**
     * <p>A list of time window configurations. Multiple windows can be used to enforce layered rate limiting.</p>
     */
    @NameInMap("windows")
    public java.util.List<WindowLimit> windows;

    public static RateLimitRule build(java.util.Map<String, ?> map) throws Exception {
        RateLimitRule self = new RateLimitRule();
        return TeaModel.build(map, self);
    }

    public RateLimitRule setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public RateLimitRule setDescriptorId(String descriptorId) {
        this.descriptorId = descriptorId;
        return this;
    }
    public String getDescriptorId() {
        return this.descriptorId;
    }

    public RateLimitRule setDescriptorType(String descriptorType) {
        this.descriptorType = descriptorType;
        return this;
    }
    public String getDescriptorType() {
        return this.descriptorType;
    }

    public RateLimitRule setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public RateLimitRule setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public RateLimitRule setRateLimitRuleId(String rateLimitRuleId) {
        this.rateLimitRuleId = rateLimitRuleId;
        return this;
    }
    public String getRateLimitRuleId() {
        return this.rateLimitRuleId;
    }

    public RateLimitRule setWindows(java.util.List<WindowLimit> windows) {
        this.windows = windows;
        return this;
    }
    public java.util.List<WindowLimit> getWindows() {
        return this.windows;
    }

}

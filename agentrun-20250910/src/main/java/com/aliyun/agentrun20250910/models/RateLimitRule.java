// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RateLimitRule extends TeaModel {
    /**
     * <p>限流规则的创建时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>限流规则的描述符标识，用于关联具体的限流对象</p>
     * 
     * <strong>example:</strong>
     * <p>model:gpt-4</p>
     */
    @NameInMap("descriptorId")
    public String descriptorId;

    /**
     * <p>限流规则的描述符类型，如model、user等</p>
     * 
     * <strong>example:</strong>
     * <p>model</p>
     */
    @NameInMap("descriptorType")
    public String descriptorType;

    /**
     * <p>限流规则是否启用，true表示启用，false表示禁用</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>限流规则最后一次更新的时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>限流规则的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789abc</p>
     */
    @NameInMap("rateLimitRuleId")
    public String rateLimitRuleId;

    /**
     * <p>限流时间窗口配置列表，支持多个窗口叠加限流</p>
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

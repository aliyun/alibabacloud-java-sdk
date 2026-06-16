// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateRateLimitRuleInput extends TeaModel {
    /**
     * <p>The descriptor ID for the rate limit rule. This parameter is required if the descriptor type is not <code>model</code>. For <code>model</code> types, the server assembles the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>model:gpt-4</p>
     */
    @NameInMap("descriptorId")
    public String descriptorId;

    /**
     * <p>The descriptor type for the rate limit rule, such as <code>model</code> or <code>user</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>model</p>
     */
    @NameInMap("descriptorType")
    public String descriptorType;

    /**
     * <p>Whether to enable the rate limit rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>A list of time window configurations. At least one window is required.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("windows")
    public java.util.List<WindowLimit> windows;

    public static CreateRateLimitRuleInput build(java.util.Map<String, ?> map) throws Exception {
        CreateRateLimitRuleInput self = new CreateRateLimitRuleInput();
        return TeaModel.build(map, self);
    }

    public CreateRateLimitRuleInput setDescriptorId(String descriptorId) {
        this.descriptorId = descriptorId;
        return this;
    }
    public String getDescriptorId() {
        return this.descriptorId;
    }

    public CreateRateLimitRuleInput setDescriptorType(String descriptorType) {
        this.descriptorType = descriptorType;
        return this;
    }
    public String getDescriptorType() {
        return this.descriptorType;
    }

    public CreateRateLimitRuleInput setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateRateLimitRuleInput setWindows(java.util.List<WindowLimit> windows) {
        this.windows = windows;
        return this;
    }
    public java.util.List<WindowLimit> getWindows() {
        return this.windows;
    }

}

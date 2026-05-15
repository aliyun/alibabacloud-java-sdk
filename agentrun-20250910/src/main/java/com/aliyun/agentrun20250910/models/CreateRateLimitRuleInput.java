// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateRateLimitRuleInput extends TeaModel {
    /**
     * <p>限流规则的描述符标识；非model维时必填，model维由服务端拼接</p>
     * 
     * <strong>example:</strong>
     * <p>model:gpt-4</p>
     */
    @NameInMap("descriptorId")
    public String descriptorId;

    /**
     * <p>限流规则的描述符类型，如model、user等</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>model</p>
     */
    @NameInMap("descriptorType")
    public String descriptorType;

    /**
     * <p>是否启用该限流规则</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>限流时间窗口配置列表，至少需要一个窗口</p>
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

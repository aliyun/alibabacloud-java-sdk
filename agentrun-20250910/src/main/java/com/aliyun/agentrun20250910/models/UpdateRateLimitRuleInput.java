// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateRateLimitRuleInput extends TeaModel {
    /**
     * <p>是否启用该限流规则</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>限流时间窗口配置列表，提供时将整组覆盖</p>
     */
    @NameInMap("windows")
    public java.util.List<WindowLimit> windows;

    public static UpdateRateLimitRuleInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateRateLimitRuleInput self = new UpdateRateLimitRuleInput();
        return TeaModel.build(map, self);
    }

    public UpdateRateLimitRuleInput setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateRateLimitRuleInput setWindows(java.util.List<WindowLimit> windows) {
        this.windows = windows;
        return this;
    }
    public java.util.List<WindowLimit> getWindows() {
        return this.windows;
    }

}

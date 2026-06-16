// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateRateLimitRuleInput extends TeaModel {
    /**
     * <p>Specifies whether to enable the rate limit rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>A list of time window configurations. Providing this parameter replaces the entire existing list.</p>
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

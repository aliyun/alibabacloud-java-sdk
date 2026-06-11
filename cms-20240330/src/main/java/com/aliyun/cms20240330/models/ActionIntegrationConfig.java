// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ActionIntegrationConfig extends TeaModel {
    /**
     * <p>A list of actions to perform.</p>
     */
    @NameInMap("actions")
    public java.util.List<String> actions;

    /**
     * <p>Indicates whether action integration is enabled.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    public static ActionIntegrationConfig build(java.util.Map<String, ?> map) throws Exception {
        ActionIntegrationConfig self = new ActionIntegrationConfig();
        return TeaModel.build(map, self);
    }

    public ActionIntegrationConfig setActions(java.util.List<String> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<String> getActions() {
        return this.actions;
    }

    public ActionIntegrationConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}

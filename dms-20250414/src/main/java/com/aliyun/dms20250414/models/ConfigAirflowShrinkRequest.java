// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ConfigAirflowShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af-b3a7f110a6vmvn7xxxxxx</p>
     */
    @NameInMap("AirflowId")
    public String airflowId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomAirflowCfg")
    public String customAirflowCfgShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8630242382****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ConfigAirflowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigAirflowShrinkRequest self = new ConfigAirflowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigAirflowShrinkRequest setAirflowId(String airflowId) {
        this.airflowId = airflowId;
        return this;
    }
    public String getAirflowId() {
        return this.airflowId;
    }

    public ConfigAirflowShrinkRequest setCustomAirflowCfgShrink(String customAirflowCfgShrink) {
        this.customAirflowCfgShrink = customAirflowCfgShrink;
        return this;
    }
    public String getCustomAirflowCfgShrink() {
        return this.customAirflowCfgShrink;
    }

    public ConfigAirflowShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

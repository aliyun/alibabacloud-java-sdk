// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ConfigAirflowRequest extends TeaModel {
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
    public java.util.List<String> customAirflowCfg;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8630242382****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ConfigAirflowRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigAirflowRequest self = new ConfigAirflowRequest();
        return TeaModel.build(map, self);
    }

    public ConfigAirflowRequest setAirflowId(String airflowId) {
        this.airflowId = airflowId;
        return this;
    }
    public String getAirflowId() {
        return this.airflowId;
    }

    public ConfigAirflowRequest setCustomAirflowCfg(java.util.List<String> customAirflowCfg) {
        this.customAirflowCfg = customAirflowCfg;
        return this;
    }
    public java.util.List<String> getCustomAirflowCfg() {
        return this.customAirflowCfg;
    }

    public ConfigAirflowRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

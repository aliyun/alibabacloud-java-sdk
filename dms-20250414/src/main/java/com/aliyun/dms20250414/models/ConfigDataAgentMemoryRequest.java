// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ConfigDataAgentMemoryRequest extends TeaModel {
    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>Specifies whether to enable memory generation. Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>Specifies whether to enable memory recall usage. Valid values:</p>
     * <p>true: Enabled.</p>
     * <p>false: Disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecallEnabled")
    public Boolean recallEnabled;

    public static ConfigDataAgentMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigDataAgentMemoryRequest self = new ConfigDataAgentMemoryRequest();
        return TeaModel.build(map, self);
    }

    public ConfigDataAgentMemoryRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public ConfigDataAgentMemoryRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ConfigDataAgentMemoryRequest setRecallEnabled(Boolean recallEnabled) {
        this.recallEnabled = recallEnabled;
        return this;
    }
    public Boolean getRecallEnabled() {
        return this.recallEnabled;
    }

}

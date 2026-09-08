// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class SetTenantSkillEnabledRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The skill channel.</p>
     * 
     * <strong>example:</strong>
     * <p>BUSINESS</p>
     */
    @NameInMap("SkillChannel")
    public String skillChannel;

    /**
     * <p>The list of skill IDs.</p>
     */
    @NameInMap("SkillIds")
    public java.util.List<String> skillIds;

    public static SetTenantSkillEnabledRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTenantSkillEnabledRequest self = new SetTenantSkillEnabledRequest();
        return TeaModel.build(map, self);
    }

    public SetTenantSkillEnabledRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public SetTenantSkillEnabledRequest setSkillChannel(String skillChannel) {
        this.skillChannel = skillChannel;
        return this;
    }
    public String getSkillChannel() {
        return this.skillChannel;
    }

    public SetTenantSkillEnabledRequest setSkillIds(java.util.List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

}

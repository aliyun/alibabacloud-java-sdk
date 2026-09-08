// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class SetIdentitySkillSecurityRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the skill installation permission. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The list of resource information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdentityIds")
    public java.util.List<SetIdentitySkillSecurityRequestIdentityIds> identityIds;

    /**
     * <p>The skill channel. Valid values:</p>
     * <ul>
     * <li>ENTERPRISE: enterprise edition.</li>
     * <li>BUSINESS: business edition.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("SkillChannel")
    public String skillChannel;

    public static SetIdentitySkillSecurityRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIdentitySkillSecurityRequest self = new SetIdentitySkillSecurityRequest();
        return TeaModel.build(map, self);
    }

    public SetIdentitySkillSecurityRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public SetIdentitySkillSecurityRequest setIdentityIds(java.util.List<SetIdentitySkillSecurityRequestIdentityIds> identityIds) {
        this.identityIds = identityIds;
        return this;
    }
    public java.util.List<SetIdentitySkillSecurityRequestIdentityIds> getIdentityIds() {
        return this.identityIds;
    }

    public SetIdentitySkillSecurityRequest setSkillChannel(String skillChannel) {
        this.skillChannel = skillChannel;
        return this;
    }
    public String getSkillChannel() {
        return this.skillChannel;
    }

    public static class SetIdentitySkillSecurityRequestIdentityIds extends TeaModel {
        /**
         * <p>The resource information ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-b9ej3xiok4tjbgf9x</p>
         */
        @NameInMap("IdentityId")
        public String identityId;

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static SetIdentitySkillSecurityRequestIdentityIds build(java.util.Map<String, ?> map) throws Exception {
            SetIdentitySkillSecurityRequestIdentityIds self = new SetIdentitySkillSecurityRequestIdentityIds();
            return TeaModel.build(map, self);
        }

        public SetIdentitySkillSecurityRequestIdentityIds setIdentityId(String identityId) {
            this.identityId = identityId;
            return this;
        }
        public String getIdentityId() {
            return this.identityId;
        }

        public SetIdentitySkillSecurityRequestIdentityIds setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}

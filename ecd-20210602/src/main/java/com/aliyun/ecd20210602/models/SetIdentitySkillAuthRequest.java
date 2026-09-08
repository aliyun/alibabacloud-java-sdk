// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class SetIdentitySkillAuthRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically install. Valid values:</p>
     * <ul>
     * <li>true: yes</li>
     * <li>false: no</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoInstall")
    public Boolean autoInstall;

    /**
     * <p>The list of authorized objects.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Identities")
    public java.util.List<SetIdentitySkillAuthRequestIdentities> identities;

    /**
     * <p>The operation type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SET_AUTH</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>The skill channel. Valid values:</p>
     * <ul>
     * <li>ENTERPRISE: enterprise edition</li>
     * <li>BUSINESS: business edition</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("SkillChannel")
    public String skillChannel;

    /**
     * <p>The list of skill IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SkillIds")
    public java.util.List<String> skillIds;

    public static SetIdentitySkillAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIdentitySkillAuthRequest self = new SetIdentitySkillAuthRequest();
        return TeaModel.build(map, self);
    }

    public SetIdentitySkillAuthRequest setAutoInstall(Boolean autoInstall) {
        this.autoInstall = autoInstall;
        return this;
    }
    public Boolean getAutoInstall() {
        return this.autoInstall;
    }

    public SetIdentitySkillAuthRequest setIdentities(java.util.List<SetIdentitySkillAuthRequestIdentities> identities) {
        this.identities = identities;
        return this;
    }
    public java.util.List<SetIdentitySkillAuthRequestIdentities> getIdentities() {
        return this.identities;
    }

    public SetIdentitySkillAuthRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public SetIdentitySkillAuthRequest setSkillChannel(String skillChannel) {
        this.skillChannel = skillChannel;
        return this;
    }
    public String getSkillChannel() {
        return this.skillChannel;
    }

    public SetIdentitySkillAuthRequest setSkillIds(java.util.List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    public static class SetIdentitySkillAuthRequestIdentities extends TeaModel {
        /**
         * <p>The ID of the authorized object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-av4u9m5ghko26****</p>
         */
        @NameInMap("IdentityId")
        public String identityId;

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static SetIdentitySkillAuthRequestIdentities build(java.util.Map<String, ?> map) throws Exception {
            SetIdentitySkillAuthRequestIdentities self = new SetIdentitySkillAuthRequestIdentities();
            return TeaModel.build(map, self);
        }

        public SetIdentitySkillAuthRequestIdentities setIdentityId(String identityId) {
            this.identityId = identityId;
            return this;
        }
        public String getIdentityId() {
            return this.identityId;
        }

        public SetIdentitySkillAuthRequestIdentities setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}

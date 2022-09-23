// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class CreateHubClusterRequest extends TeaModel {
    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    @NameInMap("Name")
    public String name;

    @NameInMap("Profile")
    public String profile;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitches")
    public String vSwitches;

    @NameInMap("VpcId")
    public String vpcId;

    public static CreateHubClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHubClusterRequest self = new CreateHubClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateHubClusterRequest setApiServerPublicEip(Boolean apiServerPublicEip) {
        this.apiServerPublicEip = apiServerPublicEip;
        return this;
    }
    public Boolean getApiServerPublicEip() {
        return this.apiServerPublicEip;
    }

    public CreateHubClusterRequest setAuditLogEnabled(Boolean auditLogEnabled) {
        this.auditLogEnabled = auditLogEnabled;
        return this;
    }
    public Boolean getAuditLogEnabled() {
        return this.auditLogEnabled;
    }

    public CreateHubClusterRequest setIsEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
        this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
        return this;
    }
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    public CreateHubClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateHubClusterRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public CreateHubClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHubClusterRequest setVSwitches(String vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public String getVSwitches() {
        return this.vSwitches;
    }

    public CreateHubClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

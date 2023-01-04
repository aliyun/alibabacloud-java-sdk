// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class CreateHubClusterRequest extends TeaModel {
    // Specifies whether to use a public IP address to expose the API server. Valid values: - true: uses a public IP address to expose the API server. - true: uses an internal IP address to expose the API server.
    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    // Specifies whether to enable audit logs. Valid values: - true: enables audit logs. - false: disables audit logs.
    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    // Specifies whether the security group is an advanced security group.
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    // The name of the master instance.
    @NameInMap("Name")
    public String name;

    // Scenario-oriented master control type. The value can be:
    // 
    // - `Default`: Standard scenario Master instance.
    // - `XFlow`: Workflow scenario master instance.
    // 
    // Default Value: `Default`.
    @NameInMap("Profile")
    public String profile;

    // The ID of the region. You can call the DescribeRegions operation to query available regions.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the vSwitch.
    @NameInMap("VSwitches")
    public String vSwitches;

    // The ID of the virtual private cloud (VPC) to which the master instance belongs. You can call the DescribeVpcs operation to query available VPCs.
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

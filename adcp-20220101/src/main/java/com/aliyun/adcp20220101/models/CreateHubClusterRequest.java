// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class CreateHubClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to use a public IP address to expose the API server. Valid values: - true: uses a public IP address to expose the API server. - true: uses an internal IP address to expose the API server.</p>
     */
    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    @NameInMap("ArgoServerEnabled")
    public Boolean argoServerEnabled;

    /**
     * <p>Specifies whether to enable audit logs. Valid values: - true: enables audit logs. - false: disables audit logs.</p>
     */
    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    /**
     * <p>Specifies whether the security group is an advanced security group.</p>
     */
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p>The name of the master instance.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("PriceLimit")
    public String priceLimit;

    /**
     * <p>Scenario-oriented master control type. The value can be:</p>
     * <br>
     * <p>- `Default`: Standard scenario Master instance.</p>
     * <p>- `XFlow`: Workflow scenario master instance.</p>
     * <br>
     * <p>Default Value: `Default`.</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>The ID of the region. You can call the DescribeRegions operation to query available regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitches")
    public String vSwitches;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the master instance belongs. You can call the DescribeVpcs operation to query available VPCs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("WorkflowScheduleMode")
    public String workflowScheduleMode;

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

    public CreateHubClusterRequest setArgoServerEnabled(Boolean argoServerEnabled) {
        this.argoServerEnabled = argoServerEnabled;
        return this;
    }
    public Boolean getArgoServerEnabled() {
        return this.argoServerEnabled;
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

    public CreateHubClusterRequest setPriceLimit(String priceLimit) {
        this.priceLimit = priceLimit;
        return this;
    }
    public String getPriceLimit() {
        return this.priceLimit;
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

    public CreateHubClusterRequest setWorkflowScheduleMode(String workflowScheduleMode) {
        this.workflowScheduleMode = workflowScheduleMode;
        return this;
    }
    public String getWorkflowScheduleMode() {
        return this.workflowScheduleMode;
    }

}

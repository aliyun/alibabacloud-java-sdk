// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class CreateHubClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to expose the API server to the Internet. Valid values:</p>
     * <br>
     * <p>*   true: exposes the API server to the Internet.</p>
     * <p>*   false: exposes the API server to the internal network.</p>
     */
    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    /**
     * <p>Specifies whether to enable the workflow instance UI. This parameter takes effect only if Profile is set to XFlow. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ArgoServerEnabled")
    public Boolean argoServerEnabled;

    /**
     * <p>Specifies whether to enable the audit log feature. Valid values:</p>
     * <br>
     * <p>*   true: enables the audit log feature.</p>
     * <p>*   false: disables the audit log feature.</p>
     */
    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    /**
     * <p>Specifies whether to use an advanced security group.</p>
     */
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p>The name of the master instance.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The limit on the prices of containers in the workflow. This parameter takes effect only if the WorkflowScheduleMode parameter is set to cost-optimized.</p>
     */
    @NameInMap("PriceLimit")
    public String priceLimit;

    /**
     * <p>The type of scenario for which the master instance is suitable. Valid values:</p>
     * <br>
     * <p>*   `Default`: The master instance is suitable for standard scenarios.</p>
     * <p>*   `XFlow`: The master instance is suitable for workflow scenarios.</p>
     * <br>
     * <p>Default value: `Default`.</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>The ID of the region. You can call the DescribeRegions operation to query available regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Resource Group ID.</p>
     */
    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

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

    /**
     * <p>The scheduling mode of the workflow. This parameter takes effect only if Profile is set to XFlow. Valid values:</p>
     * <br>
     * <p>*   cost-optimized: cost-prioritized scheduling mode.</p>
     * <p>*   stock-optimized: inventory-prioritized scheduling mode.</p>
     */
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

    public CreateHubClusterRequest setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
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

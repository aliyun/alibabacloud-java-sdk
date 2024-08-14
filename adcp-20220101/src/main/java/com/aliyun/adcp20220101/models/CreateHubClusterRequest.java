// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class CreateHubClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to expose the API server to the Internet. Valid values:</p>
     * <ul>
     * <li>true: exposes the API server to the Internet.</li>
     * <li>false: exposes the API server to the internal network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    /**
     * <p>Specifies whether to enable the workflow instance UI. This parameter takes effect only if Profile is set to XFlow. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ArgoServerEnabled")
    public Boolean argoServerEnabled;

    /**
     * <p>Specifies whether to enable the audit log feature. Valid values:</p>
     * <ul>
     * <li>true: enables the audit log feature.</li>
     * <li>false: disables the audit log feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    /**
     * <p>Specifies whether to use an advanced security group.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p>The name of the master instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ack-demo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The limit on the prices of containers in the workflow. This parameter takes effect only if the WorkflowScheduleMode parameter is set to cost-optimized.</p>
     * 
     * <strong>example:</strong>
     * <p>0.08</p>
     */
    @NameInMap("PriceLimit")
    public String priceLimit;

    /**
     * <p>The type of scenario for which the master instance is suitable. Valid values:</p>
     * <ul>
     * <li><code>Default</code>: The master instance is suitable for standard scenarios.</li>
     * <li><code>XFlow</code>: The master instance is suitable for workflow scenarios.</li>
     * </ul>
     * <p>Default value: <code>Default</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>The ID of the region. You can call the DescribeRegions operation to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Resource Group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-1exm6tg2h48***</p>
     */
    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The tags.</p>
     * <p>You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    /**
     * <p>The ID of the vSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vsw-2zeaijsas4zkzz81xm***&quot;]</p>
     */
    @NameInMap("VSwitches")
    public String vSwitches;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the master instance belongs. You can call the DescribeVpcs operation to query available VPCs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-f8zin0jscsr84s96tg***</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The scheduling mode of the workflow. This parameter takes effect only if Profile is set to XFlow. Valid values:</p>
     * <ul>
     * <li>cost-optimized: cost-prioritized scheduling mode.</li>
     * <li>stock-optimized: inventory-prioritized scheduling mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cost-optimized</p>
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

    public CreateHubClusterRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
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

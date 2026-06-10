// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateClusterShrinkRequest extends TeaModel {
    /**
     * <p>A list of software to install in the cluster. You can specify up to 10 packages.</p>
     */
    @NameInMap("AdditionalPackages")
    public String additionalPackagesShrink;

    /**
     * <p>The configuration of the custom service component for the cluster. Only one component is supported.</p>
     */
    @NameInMap("Addons")
    public String addonsShrink;

    /**
     * <p>The version of the E-HPC client. By default, the latest version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2.1.0</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The edition of the cluster. Valid values:</p>
     * <ul>
     * <li><p>Standard</p>
     * </li>
     * <li><p>Serverless</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ClusterCategory")
    public String clusterCategory;

    /**
     * <p>The security credentials for the cluster.</p>
     */
    @NameInMap("ClusterCredentials")
    public String clusterCredentialsShrink;

    /**
     * <p>The post-processing script for the cluster.</p>
     */
    @NameInMap("ClusterCustomConfiguration")
    public String clusterCustomConfigurationShrink;

    /**
     * <p>The description of the cluster. The description must be 2 to 128 characters long and can contain letters, Chinese characters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <p>The cluster\&quot;s deployment type. Valid values:</p>
     * <ul>
     * <li><p>Integrated: An integrated cluster.</p>
     * </li>
     * <li><p>Hybrid: A hybrid cloud cluster.</p>
     * </li>
     * <li><p>Custom: A custom cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Integrated</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>The name of the cluster. The name must be 2 to 128 characters long and can contain letters, Chinese characters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The ID of the VSwitch for the cluster. The VSwitch must be in the VPC specified by <code>ClusterVpcId</code>.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/448581.html">DescribeVpcs</a> operation to find available VPCs and VSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-f8za5p0mwzgdu3wgx****</p>
     */
    @NameInMap("ClusterVSwitchId")
    public String clusterVSwitchId;

    /**
     * <p>The ID of the VPC for the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5efjevmclc0xdmys****</p>
     */
    @NameInMap("ClusterVpcId")
    public String clusterVpcId;

    /**
     * <p>Specifies whether to enable deletion protection for the cluster. This feature prevents the cluster from being deleted via the console or the <a href="https://help.aliyun.com/document_detail/424406.html">DeleteCluster</a> operation.</p>
     * <ul>
     * <li><p>true: Enables deletion protection.</p>
     * </li>
     * <li><p>false: Disables deletion protection.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("GrowInterval")
    public Integer growInterval;

    @NameInMap("IdleInterval")
    public Integer idleInterval;

    /**
     * <p>Specifies whether to use an enterprise security group. Valid values:</p>
     * <ul>
     * <li><p>true: The system automatically creates and uses an enterprise security group.</p>
     * </li>
     * <li><p>false: The system automatically creates and uses a security group.</p>
     * </li>
     * </ul>
     * <p>For more information about how to select a security group type, see <a href="https://help.aliyun.com/document_detail/605897.html">Security groups and enterprise security groups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p>Configuration for the cluster manager node.</p>
     */
    @NameInMap("Manager")
    public String managerShrink;

    /**
     * <p>The maximum number of CPU cores that the cluster can manage across all compute nodes. Valid values: 0 to 100,000.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxCoreCount")
    public Integer maxCoreCount;

    /**
     * <p>The maximum number of compute nodes that the cluster can manage. Valid values: 0 to 5,000.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxCount")
    public Integer maxCount;

    /**
     * <p>Configuration for the cluster queues. You can specify up to 8 queues.</p>
     */
    @NameInMap("Queues")
    public String queuesShrink;

    /**
     * <p>The ID of the resource group.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to find resource group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group for the cluster.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/25556.html">DescribeSecurityGroups</a> operation to find available security groups in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp13n61xsydodfyg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Configuration for the cluster\&quot;s shared storage.</p>
     */
    @NameInMap("SharedStorages")
    public String sharedStoragesShrink;

    /**
     * <p>The list of tags to add to the cluster. You can add up to 20 tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static CreateClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterShrinkRequest self = new CreateClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterShrinkRequest setAdditionalPackagesShrink(String additionalPackagesShrink) {
        this.additionalPackagesShrink = additionalPackagesShrink;
        return this;
    }
    public String getAdditionalPackagesShrink() {
        return this.additionalPackagesShrink;
    }

    public CreateClusterShrinkRequest setAddonsShrink(String addonsShrink) {
        this.addonsShrink = addonsShrink;
        return this;
    }
    public String getAddonsShrink() {
        return this.addonsShrink;
    }

    public CreateClusterShrinkRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public CreateClusterShrinkRequest setClusterCategory(String clusterCategory) {
        this.clusterCategory = clusterCategory;
        return this;
    }
    public String getClusterCategory() {
        return this.clusterCategory;
    }

    public CreateClusterShrinkRequest setClusterCredentialsShrink(String clusterCredentialsShrink) {
        this.clusterCredentialsShrink = clusterCredentialsShrink;
        return this;
    }
    public String getClusterCredentialsShrink() {
        return this.clusterCredentialsShrink;
    }

    public CreateClusterShrinkRequest setClusterCustomConfigurationShrink(String clusterCustomConfigurationShrink) {
        this.clusterCustomConfigurationShrink = clusterCustomConfigurationShrink;
        return this;
    }
    public String getClusterCustomConfigurationShrink() {
        return this.clusterCustomConfigurationShrink;
    }

    public CreateClusterShrinkRequest setClusterDescription(String clusterDescription) {
        this.clusterDescription = clusterDescription;
        return this;
    }
    public String getClusterDescription() {
        return this.clusterDescription;
    }

    public CreateClusterShrinkRequest setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public CreateClusterShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterShrinkRequest setClusterVSwitchId(String clusterVSwitchId) {
        this.clusterVSwitchId = clusterVSwitchId;
        return this;
    }
    public String getClusterVSwitchId() {
        return this.clusterVSwitchId;
    }

    public CreateClusterShrinkRequest setClusterVpcId(String clusterVpcId) {
        this.clusterVpcId = clusterVpcId;
        return this;
    }
    public String getClusterVpcId() {
        return this.clusterVpcId;
    }

    public CreateClusterShrinkRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateClusterShrinkRequest setGrowInterval(Integer growInterval) {
        this.growInterval = growInterval;
        return this;
    }
    public Integer getGrowInterval() {
        return this.growInterval;
    }

    public CreateClusterShrinkRequest setIdleInterval(Integer idleInterval) {
        this.idleInterval = idleInterval;
        return this;
    }
    public Integer getIdleInterval() {
        return this.idleInterval;
    }

    public CreateClusterShrinkRequest setIsEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
        this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
        return this;
    }
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    public CreateClusterShrinkRequest setManagerShrink(String managerShrink) {
        this.managerShrink = managerShrink;
        return this;
    }
    public String getManagerShrink() {
        return this.managerShrink;
    }

    public CreateClusterShrinkRequest setMaxCoreCount(Integer maxCoreCount) {
        this.maxCoreCount = maxCoreCount;
        return this;
    }
    public Integer getMaxCoreCount() {
        return this.maxCoreCount;
    }

    public CreateClusterShrinkRequest setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }
    public Integer getMaxCount() {
        return this.maxCount;
    }

    public CreateClusterShrinkRequest setQueuesShrink(String queuesShrink) {
        this.queuesShrink = queuesShrink;
        return this;
    }
    public String getQueuesShrink() {
        return this.queuesShrink;
    }

    public CreateClusterShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateClusterShrinkRequest setSharedStoragesShrink(String sharedStoragesShrink) {
        this.sharedStoragesShrink = sharedStoragesShrink;
        return this;
    }
    public String getSharedStoragesShrink() {
        return this.sharedStoragesShrink;
    }

    public CreateClusterShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}

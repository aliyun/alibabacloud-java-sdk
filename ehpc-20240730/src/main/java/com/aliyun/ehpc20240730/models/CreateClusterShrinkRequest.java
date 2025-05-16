// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateClusterShrinkRequest extends TeaModel {
    /**
     * <p>The list of software that you want to install in the cluster. Valid values of N: 0 to 10.</p>
     */
    @NameInMap("AdditionalPackages")
    public String additionalPackagesShrink;

    /**
     * <p>The configurations of the custom addons in the cluster. Only one addon is supported.</p>
     */
    @NameInMap("Addons")
    public String addonsShrink;

    /**
     * <p>The client version. By default, the latest version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2.1.0</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li>Standard</li>
     * <li>Serverless</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ClusterCategory")
    public String clusterCategory;

    /**
     * <p>The access credentials of the cluster.</p>
     */
    @NameInMap("ClusterCredentials")
    public String clusterCredentialsShrink;

    /**
     * <p>The post-processing script of the cluster.</p>
     */
    @NameInMap("ClusterCustomConfiguration")
    public String clusterCustomConfigurationShrink;

    /**
     * <p>The cluster description. The description must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <p>The deployment mode of the cluster. Valid values:</p>
     * <ul>
     * <li>Integrated</li>
     * <li>Hybrid</li>
     * <li>Custom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Integrated</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>The cluster name. The name must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The ID of the vSwitch that you want the cluster to use. The vSwitch must reside in the VPC that is specified by the <code>ClusterVpcId</code> parameter.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/448581.html">DescribeVpcs</a> operation to query information about the created VPCs and vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-f8za5p0mwzgdu3wgx****</p>
     */
    @NameInMap("ClusterVSwitchId")
    public String clusterVSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5efjevmclc0xdmys****</p>
     */
    @NameInMap("ClusterVpcId")
    public String clusterVpcId;

    /**
     * <p>Specifies whether to enable deletion protection for the cluster. Deletion protection decides whether the cluster can be deleted in the console or by calling the <a href="https://help.aliyun.com/document_detail/424406.html">DeleteCluster</a> operation. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to use an advanced security group. Valid values:</p>
     * <ul>
     * <li>true: automatically creates and uses an advanced security group.</li>
     * <li>false: automatically creates and uses a basic security group.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/605897.html">Basic security groups and advanced security groups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p>The configurations of the cluster management node.</p>
     */
    @NameInMap("Manager")
    public String managerShrink;

    /**
     * <p>The maximum number of vCPUs that can be used by compute nodes in the cluster. Valid values: 0 to 100,000.</p>
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
     * <p>The queues in the cluster. The number of queues can be 0 to 8.</p>
     */
    @NameInMap("Queues")
    public String queuesShrink;

    /**
     * <p>The ID of the resource group to which the cluster belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to obtain the IDs of the resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group to which the cluster belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/25556.html">DescribeSecurityGroups</a> operation to query available security groups in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp13n61xsydodfyg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The shared storage resources of the cluster.</p>
     */
    @NameInMap("SharedStorages")
    public String sharedStoragesShrink;

    /**
     * <p>The tags of the cluster.</p>
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

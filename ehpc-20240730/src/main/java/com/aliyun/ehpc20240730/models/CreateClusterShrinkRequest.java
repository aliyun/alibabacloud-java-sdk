// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateClusterShrinkRequest extends TeaModel {
    @NameInMap("AdditionalPackages")
    public String additionalPackagesShrink;

    @NameInMap("Addons")
    public String addonsShrink;

    /**
     * <strong>example:</strong>
     * <p>2.1.0</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ClusterCategory")
    public String clusterCategory;

    @NameInMap("ClusterCredentials")
    public String clusterCredentialsShrink;

    @NameInMap("ClusterCustomConfiguration")
    public String clusterCustomConfigurationShrink;

    /**
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <strong>example:</strong>
     * <p>Integrated</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <strong>example:</strong>
     * <p>vsw-f8za5p0mwzgdu3wgx****</p>
     */
    @NameInMap("ClusterVSwitchId")
    public String clusterVSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-m5efjevmclc0xdmys****</p>
     */
    @NameInMap("ClusterVpcId")
    public String clusterVpcId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    @NameInMap("Manager")
    public String managerShrink;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxCoreCount")
    public Integer maxCoreCount;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxCount")
    public Integer maxCount;

    @NameInMap("Queues")
    public String queuesShrink;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxazb4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>sg-bp13n61xsydodfyg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SharedStorages")
    public String sharedStoragesShrink;

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

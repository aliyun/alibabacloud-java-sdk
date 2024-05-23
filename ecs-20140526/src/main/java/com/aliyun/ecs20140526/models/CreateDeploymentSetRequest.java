// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDeploymentSetRequest extends TeaModel {
    /**
     * <p>The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the deployment set. The name must be 2 to 128 characters in length and can contain Unicode characters under the Decimal Number category and the categories whose names contain Letter. The name can also contain colons (:), underscores (\_), periods (.), and hyphens (-).</p>
     */
    @NameInMap("DeploymentSetName")
    public String deploymentSetName;

    /**
     * <p>The emergency solution to use in the situation where instances in the deployment set cannot be evenly distributed to different zones due to resource insufficiency after the instances failover. Valid values:</p>
     * <br>
     * <p>*   CancelMembershipAndStart: removes the instances from the deployment set and starts the instances immediately after they are failed over.</p>
     * <p>*   KeepStopped: leaves the instances in the Stopped state and starts them after resources are replenished.</p>
     * <br>
     * <p>Default value: CancelMembershipAndStart.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>>  This parameter is deprecated.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>>  This parameter is deprecated.</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The deployment strategy. Valid values:</p>
     * <br>
     * <p>*   Availability: high availability strategy.</p>
     * <p>*   AvailabilityGroup: high availability group strategy.</p>
     * <br>
     * <p>Default value: Availability.</p>
     */
    @NameInMap("GroupCount")
    public Long groupCount;

    /**
     * <p>The region ID of the deployment set. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("OnUnableToRedeployFailedInstance")
    public String onUnableToRedeployFailedInstance;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Creates a deployment set in a specific region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The deployment strategy. Valid values:</p>
     * <br>
     * <p>*   Availability: high availability strategy</p>
     * <p>*   AvailabilityGroup: high availability group strategy</p>
     * <p>*   LowLatency: low latency strategy</p>
     * <br>
     * <p>Default value: Availability.</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    public static CreateDeploymentSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentSetRequest self = new CreateDeploymentSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDeploymentSetRequest setDeploymentSetName(String deploymentSetName) {
        this.deploymentSetName = deploymentSetName;
        return this;
    }
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    public CreateDeploymentSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDeploymentSetRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDeploymentSetRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public CreateDeploymentSetRequest setGroupCount(Long groupCount) {
        this.groupCount = groupCount;
        return this;
    }
    public Long getGroupCount() {
        return this.groupCount;
    }

    public CreateDeploymentSetRequest setOnUnableToRedeployFailedInstance(String onUnableToRedeployFailedInstance) {
        this.onUnableToRedeployFailedInstance = onUnableToRedeployFailedInstance;
        return this;
    }
    public String getOnUnableToRedeployFailedInstance() {
        return this.onUnableToRedeployFailedInstance;
    }

    public CreateDeploymentSetRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDeploymentSetRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDeploymentSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDeploymentSetRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDeploymentSetRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDeploymentSetRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}

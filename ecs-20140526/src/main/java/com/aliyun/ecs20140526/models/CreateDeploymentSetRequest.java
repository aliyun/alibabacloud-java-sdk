// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDeploymentSetRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The name of the deployment set. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
    @NameInMap("DeploymentSetName")
    public String deploymentSetName;

    // The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
    @NameInMap("Description")
    public String description;

    // The deployment domain. Set the value to Default.
    // 
    // Default: Instances in the deployment set are distributed only within the current zone.
    @NameInMap("Domain")
    public String domain;

    // The deployment granularity. Set the value to host.
    // 
    // host: Instances in the deployment set are dispersed at the granularity of hosts.
    @NameInMap("Granularity")
    public String granularity;

    // The number of deployment set groups in the deployment set. Valid values: 1 to 7.
    // 
    // Default value: 3.
    // 
    // >  This parameter is valid only when `Strategy` is set to AvailabilityGroup.
    @NameInMap("GroupCount")
    public Long groupCount;

    // The emergency solution to use in the following situation: Instances in the deployment set cannot be evenly distributed to different zones due to resource insufficiency after the instances are failed over from faulty physical machines to normal physical machines. Valid values:
    // 
    // *   CancelMembershipAndStart: removes the instances from the deployment set and starts the instances immediately after they are failed over.
    // *   KeepStopped: leaves the instances in the Stopped state and starts them after resources are replenished.
    // 
    // Default value: CancelMembershipAndStart.
    @NameInMap("OnUnableToRedeployFailedInstance")
    public String onUnableToRedeployFailedInstance;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the region in which to create the deployment set. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The deployment strategy. Valid values:
    // 
    // *   Availability: high availability strategy.
    // *   AvailabilityGroup: high availability group strategy.
    // 
    // Default value: Availability.
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

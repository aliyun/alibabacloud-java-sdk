// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDeploymentSetRequest extends TeaModel {
    /**
     * <p>The affinity level of the deployment set. This level determines how instances are distributed within the set. The value must be an integer from 1 to 10. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Affinity")
    public Long affinity;

    /**
     * <p>A client-generated token that you can use to ensure request idempotence. The token must be unique across requests.</p>
     * <p>The <strong>ClientToken</strong> value must be an ASCII string of up to 64 characters. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the deployment set. The name must be 2 to 128 characters long and start with a letter. It can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testDeploymentSetName</p>
     */
    @NameInMap("DeploymentSetName")
    public String deploymentSetName;

    /**
     * <p>The description of the deployment set. The description must be 2 to 256 characters long and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The number of partitions in the deployment set group. Valid values: 1 to 7.</p>
     * <p>Default value: 3.</p>
     * <blockquote>
     * <p>This parameter is valid only when <code>Strategy</code> is set to <code>AvailabilityGroup</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GroupCount")
    public Long groupCount;

    /**
     * <p>The policy for an instance that fails to be redeployed after a failover due to insufficient resources. Valid values:</p>
     * <ul>
     * <li><p>CancelMembershipAndStart: Removes the instance from the deployment set and starts the instance immediately after failover.</p>
     * </li>
     * <li><p>KeepStopped: Keeps the instance in the deployment set and in the Stopped state.</p>
     * </li>
     * </ul>
     * <p>Default value: CancelMembershipAndStart.</p>
     * 
     * <strong>example:</strong>
     * <p>CancelMembershipAndStart</p>
     */
    @NameInMap("OnUnableToRedeployFailedInstance")
    public String onUnableToRedeployFailedInstance;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region for the deployment set. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The deployment strategy. Valid values:</p>
     * <ul>
     * <li><p>Availability: High availability strategy.</p>
     * </li>
     * <li><p>AvailabilityGroup: High availability strategy for deployment set groups.</p>
     * </li>
     * <li><p>LowLatency: Low-latency strategy.</p>
     * </li>
     * </ul>
     * <p>Default value: Availability.</p>
     * 
     * <strong>example:</strong>
     * <p>Availability</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    /**
     * <p>The deployment granularity. Valid values:</p>
     * <ul>
     * <li><p>host: Spreads instances across different hosts.</p>
     * </li>
     * <li><p>sw: Spreads instances across different switches.</p>
     * </li>
     * <li><p>rack: Spreads instances across different racks.</p>
     * </li>
     * </ul>
     * <p>Default value: host.</p>
     * 
     * <strong>example:</strong>
     * <p>host</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateDeploymentSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentSetRequest self = new CreateDeploymentSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentSetRequest setAffinity(Long affinity) {
        this.affinity = affinity;
        return this;
    }
    public Long getAffinity() {
        return this.affinity;
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

    public CreateDeploymentSetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

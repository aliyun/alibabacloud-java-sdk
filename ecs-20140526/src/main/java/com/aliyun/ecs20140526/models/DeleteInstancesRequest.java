// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteInstancesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. <strong>The token can contain only ASCII characters and cannot exceed 64 characters in length.</strong> For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request.</p>
     * <ul>
     * <li>true: performs only a dry run. The system checks the request for potential issues, including invalid AccessKey pairs, unauthorized Resource Access Management (RAM) users, and missing parameter values. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DRYRUN.SUCCESS error code is returned.</li>
     * <li>false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcefully release the ECS instance in the <strong>Running</strong> (<code>Running</code>) state. Valid values:</p>
     * <ul>
     * <li>true: forcefully releases the ECS instance in the <strong>Running</strong> (<code>Running</code>) state.</li>
     * <li>false: normally releases the ECS instance. This value is valid only if the instance is in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>**</p>
     * <p><strong>Warning</strong> When Force is set to true, this operation is equivalent to a power-off operation. Temporary data in the memory and storage of the instance is erased and cannot be restored.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>Specifies whether to forcefully stop the ECS instance in the <strong>Running</strong> (<code>Running</code>) state before the instance is released. This parameter takes effect only when <code>Force</code> is set to true. Valid values:</p>
     * <ul>
     * <li><p>true: forcefully stops and releases the ECS instance. In this case, this operation is equivalent to a power-off operation. The instance directly enters the resource release process.</p>
     * <p>**</p>
     * <p><strong>Warning</strong> A forceful stop and release is equivalent to a power-off operation. Temporary data in the memory and storage of the instance is erased and cannot be restored.</p>
     * </li>
     * <li><p>false: stops the ECS instance in the normal stop process and then releases the instance. In this case, the release process takes several minutes to complete. You can configure business drainage actions to reduce the noise of the business system on operating system shutdown.</p>
     * </li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceStop")
    public Boolean forceStop;

    /**
     * <p>The IDs of ECS instances. You can specify 1 to 100 ECS instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1g6zv0ce8oghu7****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>Specifies whether to release the expired subscription instance.</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TerminateSubscription")
    public Boolean terminateSubscription;

    public static DeleteInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesRequest self = new DeleteInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteInstancesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteInstancesRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public DeleteInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteInstancesRequest setTerminateSubscription(Boolean terminateSubscription) {
        this.terminateSubscription = terminateSubscription;
        return this;
    }
    public Boolean getTerminateSubscription() {
        return this.terminateSubscription;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSimulatedSystemEventsRequest extends TeaModel {
    /**
     * <p>The type of the system event. Valid values:</p>
     * <br>
     * <p>*   SystemMaintenance.Reboot: The instance is restarted due to system maintenance.</p>
     * <p>*   SystemFailure.Reboot: The instance is restarted due to a system error.</p>
     * <p>*   InstanceFailure.Reboot: The instance is restarted due to an instance error.</p>
     * <p>*   SystemMaintenance.Stop: The instance is stopped due to system maintenance.</p>
     * <p>*   SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.</p>
     * <p>*   SystemFailure.Redeploy: The instance is redeployed due to a system error.</p>
     * <p>*   SystemFailure.Stop: The instance is stopped due to a system error.</p>
     * <p>*</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The IDs of the instances. You can specify up to 100 instance IDs.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The scheduled start time of the event. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> For events that occur due to system errors or instance errors, the simulated events of such events enter the `Executing` state when the simulated events are created. The value of `NotBefore` is the time when the simulated events enter the `Executed` state.</p>
     */
    @NameInMap("NotBefore")
    public String notBefore;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateSimulatedSystemEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimulatedSystemEventsRequest self = new CreateSimulatedSystemEventsRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimulatedSystemEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public CreateSimulatedSystemEventsRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public CreateSimulatedSystemEventsRequest setNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public String getNotBefore() {
        return this.notBefore;
    }

    public CreateSimulatedSystemEventsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSimulatedSystemEventsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSimulatedSystemEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSimulatedSystemEventsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSimulatedSystemEventsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

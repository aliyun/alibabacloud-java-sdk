// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AcceptInquiredSystemEventRequest extends TeaModel {
    /**
     * <p>> This parameter is in invitational preview and is unavailable to general users.</p>
     */
    @NameInMap("Choice")
    public String choice;

    /**
     * <p>The ID of the system event.</p>
     */
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the system event. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AcceptInquiredSystemEventRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptInquiredSystemEventRequest self = new AcceptInquiredSystemEventRequest();
        return TeaModel.build(map, self);
    }

    public AcceptInquiredSystemEventRequest setChoice(String choice) {
        this.choice = choice;
        return this;
    }
    public String getChoice() {
        return this.choice;
    }

    public AcceptInquiredSystemEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public AcceptInquiredSystemEventRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AcceptInquiredSystemEventRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AcceptInquiredSystemEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AcceptInquiredSystemEventRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AcceptInquiredSystemEventRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

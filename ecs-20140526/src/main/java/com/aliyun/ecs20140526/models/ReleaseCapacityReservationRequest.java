// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseCapacityReservationRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public ReleaseCapacityReservationRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>Specifies whether to perform a dry run. Set the value to false. false: does not perform a dry run and sends the request. The operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the capacity reservation. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ReleaseCapacityReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCapacityReservationRequest self = new ReleaseCapacityReservationRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseCapacityReservationRequest setPrivatePoolOptions(ReleaseCapacityReservationRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ReleaseCapacityReservationRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ReleaseCapacityReservationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ReleaseCapacityReservationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReleaseCapacityReservationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReleaseCapacityReservationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseCapacityReservationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReleaseCapacityReservationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ReleaseCapacityReservationRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the capacity reservation.</p>
         */
        @NameInMap("Id")
        public String id;

        public static ReleaseCapacityReservationRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ReleaseCapacityReservationRequestPrivatePoolOptions self = new ReleaseCapacityReservationRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ReleaseCapacityReservationRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}

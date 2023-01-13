// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class SetCenInterRegionBandwidthLimitRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth value of the inter-region connection. Unit: Mbit/s.</p>
     */
    @NameInMap("BandwidthLimit")
    public Long bandwidthLimit;

    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the local region.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query regions where you can attach network instances to a CEN instance.</p>
     */
    @NameInMap("LocalRegionId")
    public String localRegionId;

    /**
     * <p>The ID of the peer region.</p>
     */
    @NameInMap("OppositeRegionId")
    public String oppositeRegionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SetCenInterRegionBandwidthLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCenInterRegionBandwidthLimitRequest self = new SetCenInterRegionBandwidthLimitRequest();
        return TeaModel.build(map, self);
    }

    public SetCenInterRegionBandwidthLimitRequest setBandwidthLimit(Long bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
        return this;
    }
    public Long getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    public SetCenInterRegionBandwidthLimitRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public SetCenInterRegionBandwidthLimitRequest setLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
        return this;
    }
    public String getLocalRegionId() {
        return this.localRegionId;
    }

    public SetCenInterRegionBandwidthLimitRequest setOppositeRegionId(String oppositeRegionId) {
        this.oppositeRegionId = oppositeRegionId;
        return this;
    }
    public String getOppositeRegionId() {
        return this.oppositeRegionId;
    }

    public SetCenInterRegionBandwidthLimitRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetCenInterRegionBandwidthLimitRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCenInterRegionBandwidthLimitRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetCenInterRegionBandwidthLimitRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class SetCenInterRegionBandwidthLimitRequest extends TeaModel {
    /**
     * <p>The inter-region bandwidth between the two regions. Unit: Mbps.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("BandwidthLimit")
    public Long bandwidthLimit;

    /**
     * <p>The method used to allocate bandwidth. Valid value:</p>
     * <ul>
     * <li><strong>BandwidthPackage</strong> (default): allocates bandwidth from a bandwidth plan.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BandwidthPackage</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-7qthudw0ll6jmx****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the local region.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the regions where network instances can be attached to a CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LocalRegionId")
    public String localRegionId;

    /**
     * <p>The ID of the peer region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>us-west-1</p>
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

    public SetCenInterRegionBandwidthLimitRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
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

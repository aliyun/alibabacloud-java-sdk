// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class TempUpgradeCenBandwidthPackageSpecRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("CenBandwidthPackageId")
    public String cenBandwidthPackageId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static TempUpgradeCenBandwidthPackageSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        TempUpgradeCenBandwidthPackageSpecRequest self = new TempUpgradeCenBandwidthPackageSpecRequest();
        return TeaModel.build(map, self);
    }

    public TempUpgradeCenBandwidthPackageSpecRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public TempUpgradeCenBandwidthPackageSpecRequest setCenBandwidthPackageId(String cenBandwidthPackageId) {
        this.cenBandwidthPackageId = cenBandwidthPackageId;
        return this;
    }
    public String getCenBandwidthPackageId() {
        return this.cenBandwidthPackageId;
    }

    public TempUpgradeCenBandwidthPackageSpecRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TempUpgradeCenBandwidthPackageSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TempUpgradeCenBandwidthPackageSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TempUpgradeCenBandwidthPackageSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TempUpgradeCenBandwidthPackageSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

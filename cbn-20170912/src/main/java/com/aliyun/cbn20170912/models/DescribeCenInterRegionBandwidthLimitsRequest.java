// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenInterRegionBandwidthLimitsRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **10**. Valid values: **1** to **50**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The region ID of the transit router.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
     */
    @NameInMap("TrRegionId")
    public String trRegionId;

    public static DescribeCenInterRegionBandwidthLimitsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenInterRegionBandwidthLimitsRequest self = new DescribeCenInterRegionBandwidthLimitsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCenInterRegionBandwidthLimitsRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeCenInterRegionBandwidthLimitsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCenInterRegionBandwidthLimitsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCenInterRegionBandwidthLimitsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenInterRegionBandwidthLimitsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenInterRegionBandwidthLimitsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCenInterRegionBandwidthLimitsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCenInterRegionBandwidthLimitsRequest setTrRegionId(String trRegionId) {
        this.trRegionId = trRegionId;
        return this;
    }
    public String getTrRegionId() {
        return this.trRegionId;
    }

}

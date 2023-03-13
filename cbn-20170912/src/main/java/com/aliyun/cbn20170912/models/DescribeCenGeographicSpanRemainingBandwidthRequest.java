// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenGeographicSpanRemainingBandwidthRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance to which the bandwidth plan is associated.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of one of the areas connected by the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **China**: Chinese mainland</p>
     * <p>*   **North-America**: North America</p>
     * <p>*   **Asia-Pacific**: Asia Pacific</p>
     * <p>*   **Europe**: Europe</p>
     * <p>*   **Australia**: Australia</p>
     */
    @NameInMap("GeographicRegionAId")
    public String geographicRegionAId;

    /**
     * <p>The ID of the other area connected by the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **China**: Chinese mainland</p>
     * <p>*   **North-America**: North America</p>
     * <p>*   **Asia-Pacific**: Asia Pacific</p>
     * <p>*   **Europe**: Europe</p>
     * <p>*   **Australia**: Australia</p>
     */
    @NameInMap("GeographicRegionBId")
    public String geographicRegionBId;

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

    public static DescribeCenGeographicSpanRemainingBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenGeographicSpanRemainingBandwidthRequest self = new DescribeCenGeographicSpanRemainingBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCenGeographicSpanRemainingBandwidthRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeCenGeographicSpanRemainingBandwidthRequest setGeographicRegionAId(String geographicRegionAId) {
        this.geographicRegionAId = geographicRegionAId;
        return this;
    }
    public String getGeographicRegionAId() {
        return this.geographicRegionAId;
    }

    public DescribeCenGeographicSpanRemainingBandwidthRequest setGeographicRegionBId(String geographicRegionBId) {
        this.geographicRegionBId = geographicRegionBId;
        return this;
    }
    public String getGeographicRegionBId() {
        return this.geographicRegionBId;
    }

    public DescribeCenGeographicSpanRemainingBandwidthRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCenGeographicSpanRemainingBandwidthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCenGeographicSpanRemainingBandwidthRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenGeographicSpanRemainingBandwidthRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenGeographicSpanRemainingBandwidthRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCenGeographicSpanRemainingBandwidthRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

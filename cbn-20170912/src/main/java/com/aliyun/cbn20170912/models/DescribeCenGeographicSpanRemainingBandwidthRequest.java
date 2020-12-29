// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenGeographicSpanRemainingBandwidthRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("GeographicRegionAId")
    public String geographicRegionAId;

    @NameInMap("GeographicRegionBId")
    public String geographicRegionBId;

    public static DescribeCenGeographicSpanRemainingBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenGeographicSpanRemainingBandwidthRequest self = new DescribeCenGeographicSpanRemainingBandwidthRequest();
        return TeaModel.build(map, self);
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

}

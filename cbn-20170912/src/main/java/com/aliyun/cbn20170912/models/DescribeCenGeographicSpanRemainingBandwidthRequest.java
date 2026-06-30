// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenGeographicSpanRemainingBandwidthRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance to which the bandwidth plan is attached.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-nh98vzx8gfhlwn****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of a connected area of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><p><strong>China</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>North-America</strong>: North America.</p>
     * </li>
     * <li><p><strong>Asia-Pacific</strong>: Asia Pacific.</p>
     * </li>
     * <li><p><strong>Europe</strong>: Europe.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("GeographicRegionAId")
    public String geographicRegionAId;

    /**
     * <p>The ID of the other connected area of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><p><strong>China</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>North-America</strong>: North America.</p>
     * </li>
     * <li><p><strong>Asia-Pacific</strong>: Asia Pacific.</p>
     * </li>
     * <li><p><strong>Europe</strong>: Europe.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>North-America</p>
     */
    @NameInMap("GeographicRegionBId")
    public String geographicRegionBId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The default value is <strong>10</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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

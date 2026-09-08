// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGeographicRegionMembershipRequest extends TeaModel {
    /**
     * <p>The ID of the area to query. Valid values: </p>
     * <ul>
     * <li><p><strong>china</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>asia-pacific</strong>: Asia-Pacific.</p>
     * </li>
     * <li><p><strong>europe</strong>: Europe.</p>
     * </li>
     * <li><p><strong>north-america</strong>: North America.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>china</p>
     */
    @NameInMap("GeographicRegionId")
    public String geographicRegionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Default value: <strong>10</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
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

    public static DescribeGeographicRegionMembershipRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeographicRegionMembershipRequest self = new DescribeGeographicRegionMembershipRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGeographicRegionMembershipRequest setGeographicRegionId(String geographicRegionId) {
        this.geographicRegionId = geographicRegionId;
        return this;
    }
    public String getGeographicRegionId() {
        return this.geographicRegionId;
    }

    public DescribeGeographicRegionMembershipRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeGeographicRegionMembershipRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeGeographicRegionMembershipRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGeographicRegionMembershipRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGeographicRegionMembershipRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeGeographicRegionMembershipRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

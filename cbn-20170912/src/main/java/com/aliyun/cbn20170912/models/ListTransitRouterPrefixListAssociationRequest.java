// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPrefixListAssociationRequest extends TeaModel {
    /**
     * <p>The ID of the next hop connection.</p>
     * <blockquote>
     * <p>To query information about a prefix list that generates blackhole routes, set this parameter to <strong>BlackHole</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-flbq507rg2ckrj****</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The network instance ID associated with the next hop connection.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-6eh7fp9hdqa2wv85t****</p>
     */
    @NameInMap("NextHopInstanceId")
    public String nextHopInstanceId;

    /**
     * <p>The next hop type. Valid values:</p>
     * <ul>
     * <li><strong>BlackHole</strong>: queries information about prefix lists that generate blackhole routes.</li>
     * <li><strong>VPC</strong>: queries information about prefix lists whose next hop is a Virtual Private Cloud (VPC) connection.</li>
     * <li><strong>VBR</strong>: queries information about prefix lists whose next hop is a Virtual Border Router (VBR) connection.</li>
     * <li><strong>TR</strong>: queries information about prefix lists whose next hop is an inter-region connection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the prefix list belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1210123456123456</p>
     */
    @NameInMap("OwnerUid")
    public Long ownerUid;

    /**
     * <p>The page number of the list to query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Maximum value: <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the prefix list.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-6ehtn5kqxgeyy08fi****</p>
     */
    @NameInMap("PrefixListId")
    public String prefixListId;

    /**
     * <p>The region ID of the transit router instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the prefix list.</p>
     * <ul>
     * <li><strong>Active</strong>: active.</li>
     * <li><strong>Updating</strong>: being updated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The transit router instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-6ehx7q2jze8ch5ji0****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The ID of the transit router route table.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-6ehgc262hr170qgyc****</p>
     */
    @NameInMap("TransitRouterTableId")
    public String transitRouterTableId;

    public static ListTransitRouterPrefixListAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterPrefixListAssociationRequest self = new ListTransitRouterPrefixListAssociationRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterPrefixListAssociationRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public ListTransitRouterPrefixListAssociationRequest setNextHopInstanceId(String nextHopInstanceId) {
        this.nextHopInstanceId = nextHopInstanceId;
        return this;
    }
    public String getNextHopInstanceId() {
        return this.nextHopInstanceId;
    }

    public ListTransitRouterPrefixListAssociationRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public ListTransitRouterPrefixListAssociationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterPrefixListAssociationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterPrefixListAssociationRequest setOwnerUid(Long ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public Long getOwnerUid() {
        return this.ownerUid;
    }

    public ListTransitRouterPrefixListAssociationRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTransitRouterPrefixListAssociationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTransitRouterPrefixListAssociationRequest setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public String getPrefixListId() {
        return this.prefixListId;
    }

    public ListTransitRouterPrefixListAssociationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTransitRouterPrefixListAssociationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterPrefixListAssociationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterPrefixListAssociationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTransitRouterPrefixListAssociationRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public ListTransitRouterPrefixListAssociationRequest setTransitRouterTableId(String transitRouterTableId) {
        this.transitRouterTableId = transitRouterTableId;
        return this;
    }
    public String getTransitRouterTableId() {
        return this.transitRouterTableId;
    }

}

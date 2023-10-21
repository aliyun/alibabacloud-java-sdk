// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPrefixListAssociationRequest extends TeaModel {
    /**
     * <p>The ID of the next hop.</p>
     * <br>
     * <p>> Set the value to **BlackHole** if you want to query the prefix list that generates blackhole routes.</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The ID of the network instance associated with the next hop connection.</p>
     */
    @NameInMap("NextHopInstanceId")
    public String nextHopInstanceId;

    /**
     * <p>The type of the next hop. Valid values:</p>
     * <br>
     * <p>*   **BlackHole**: The prefix list that generates blackhole routes.</p>
     * <p>*   **VPC**: The prefix list whose next hop is a virtual private cloud (VPC) connection.</p>
     * <p>*   **VBR**: The prefix list whose next hop is a virtual border router (VBR) connection.</p>
     * <p>*   **TR**: The prefix list whose next hop is an inter-region connection on the transit router.</p>
     */
    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the prefix list belongs.</p>
     */
    @NameInMap("OwnerUid")
    public Long ownerUid;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **100**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the prefix list.</p>
     */
    @NameInMap("PrefixListId")
    public String prefixListId;

    /**
     * <p>The ID of the region where the transit router is deployed.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the prefix list. Valid values:</p>
     * <br>
     * <p>*   **Active**</p>
     * <p>*   **Updating**</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the transit router.</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The ID of the route table of the transit router.</p>
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

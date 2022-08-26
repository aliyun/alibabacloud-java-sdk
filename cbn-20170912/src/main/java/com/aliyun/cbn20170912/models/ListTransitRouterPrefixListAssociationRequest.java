// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPrefixListAssociationRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("OwnerUid")
    public Long ownerUid;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrefixListId")
    public String prefixListId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("TransitRouterTableId")
    public String transitRouterTableId;

    public static ListTransitRouterPrefixListAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterPrefixListAssociationRequest self = new ListTransitRouterPrefixListAssociationRequest();
        return TeaModel.build(map, self);
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

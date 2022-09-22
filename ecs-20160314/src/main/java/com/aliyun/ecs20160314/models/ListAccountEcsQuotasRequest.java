// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ListAccountEcsQuotasRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QuotaResourceName")
    public String quotaResourceName;

    @NameInMap("QuotaResourceType")
    public String quotaResourceType;

    @NameInMap("QuotaUnit")
    public String quotaUnit;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("ZoneId")
    public String zoneId;

    public static ListAccountEcsQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountEcsQuotasRequest self = new ListAccountEcsQuotasRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountEcsQuotasRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ListAccountEcsQuotasRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ListAccountEcsQuotasRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccountEcsQuotasRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListAccountEcsQuotasRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListAccountEcsQuotasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountEcsQuotasRequest setQuotaResourceName(String quotaResourceName) {
        this.quotaResourceName = quotaResourceName;
        return this;
    }
    public String getQuotaResourceName() {
        return this.quotaResourceName;
    }

    public ListAccountEcsQuotasRequest setQuotaResourceType(String quotaResourceType) {
        this.quotaResourceType = quotaResourceType;
        return this;
    }
    public String getQuotaResourceType() {
        return this.quotaResourceType;
    }

    public ListAccountEcsQuotasRequest setQuotaUnit(String quotaUnit) {
        this.quotaUnit = quotaUnit;
        return this;
    }
    public String getQuotaUnit() {
        return this.quotaUnit;
    }

    public ListAccountEcsQuotasRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAccountEcsQuotasRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAccountEcsQuotasRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListAccountEcsQuotasRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListAccountEcsQuotasRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListAccountEcsQuotasRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}

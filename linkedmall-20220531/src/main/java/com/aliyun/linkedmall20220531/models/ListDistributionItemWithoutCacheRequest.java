// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionItemWithoutCacheRequest extends TeaModel {
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("ItemStatus")
    public Integer itemStatus;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    public static ListDistributionItemWithoutCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDistributionItemWithoutCacheRequest self = new ListDistributionItemWithoutCacheRequest();
        return TeaModel.build(map, self);
    }

    public ListDistributionItemWithoutCacheRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public ListDistributionItemWithoutCacheRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ListDistributionItemWithoutCacheRequest setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }
    public Integer getItemStatus() {
        return this.itemStatus;
    }

    public ListDistributionItemWithoutCacheRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public ListDistributionItemWithoutCacheRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributionItemWithoutCacheRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDistributionItemWithoutCacheRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

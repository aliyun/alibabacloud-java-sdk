// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionItemRequest extends TeaModel {
    // 分销商商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // 分销商id
    @NameInMap("DistributorId")
    public String distributorId;

    // 商品状态
    @NameInMap("ItemStatus")
    public Integer itemStatus;

    // 商品id
    @NameInMap("LmItemId")
    public String lmItemId;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 租户Id
    @NameInMap("TenantId")
    public String tenantId;

    public static ListDistributionItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDistributionItemRequest self = new ListDistributionItemRequest();
        return TeaModel.build(map, self);
    }

    public ListDistributionItemRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public ListDistributionItemRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ListDistributionItemRequest setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }
    public Integer getItemStatus() {
        return this.itemStatus;
    }

    public ListDistributionItemRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public ListDistributionItemRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributionItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDistributionItemRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

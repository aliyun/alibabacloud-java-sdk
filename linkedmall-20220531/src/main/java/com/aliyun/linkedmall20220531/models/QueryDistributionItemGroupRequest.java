// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionItemGroupRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

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
    @NameInMap("LmItemIds")
    public java.util.List<String> lmItemIds;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryDistributionItemGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionItemGroupRequest self = new QueryDistributionItemGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributionItemGroupRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryDistributionItemGroupRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryDistributionItemGroupRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryDistributionItemGroupRequest setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }
    public Integer getItemStatus() {
        return this.itemStatus;
    }

    public QueryDistributionItemGroupRequest setLmItemIds(java.util.List<String> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.List<String> getLmItemIds() {
        return this.lmItemIds;
    }

    public QueryDistributionItemGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDistributionItemGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionItemGroupShrinkRequest extends TeaModel {
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
    public String lmItemIdsShrink;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryDistributionItemGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionItemGroupShrinkRequest self = new QueryDistributionItemGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributionItemGroupShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryDistributionItemGroupShrinkRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryDistributionItemGroupShrinkRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryDistributionItemGroupShrinkRequest setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }
    public Integer getItemStatus() {
        return this.itemStatus;
    }

    public QueryDistributionItemGroupShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

    public QueryDistributionItemGroupShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDistributionItemGroupShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

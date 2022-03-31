// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListV2Request extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("ItemIds")
    public java.util.List<Long> itemIds;

    @NameInMap("LmItemIds")
    public java.util.List<String> lmItemIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SubBizId")
    public String subBizId;

    @NameInMap("UserId")
    public String userId;

    public static QueryBizItemListV2Request build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListV2Request self = new QueryBizItemListV2Request();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListV2Request setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBizItemListV2Request setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public QueryBizItemListV2Request setItemIds(java.util.List<Long> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<Long> getItemIds() {
        return this.itemIds;
    }

    public QueryBizItemListV2Request setLmItemIds(java.util.List<String> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.List<String> getLmItemIds() {
        return this.lmItemIds;
    }

    public QueryBizItemListV2Request setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBizItemListV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBizItemListV2Request setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public QueryBizItemListV2Request setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

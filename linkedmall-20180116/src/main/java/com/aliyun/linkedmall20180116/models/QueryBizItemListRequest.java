// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("SubBizId")
    public String subBizId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("LmItemIds")
    public java.util.Map<String, ?> lmItemIds;

    @NameInMap("ItemIds")
    public java.util.Map<String, ?> itemIds;

    @NameInMap("CategoryId")
    public Long categoryId;

    public static QueryBizItemListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListRequest self = new QueryBizItemListRequest();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBizItemListRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public QueryBizItemListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBizItemListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBizItemListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryBizItemListRequest setLmItemIds(java.util.Map<String, ?> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.Map<String, ?> getLmItemIds() {
        return this.lmItemIds;
    }

    public QueryBizItemListRequest setItemIds(java.util.Map<String, ?> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.Map<String, ?> getItemIds() {
        return this.itemIds;
    }

    public QueryBizItemListRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

}

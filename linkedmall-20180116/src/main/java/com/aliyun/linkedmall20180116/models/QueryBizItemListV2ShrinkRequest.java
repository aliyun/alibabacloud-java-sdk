// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListV2ShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("ItemIds")
    public String itemIdsShrink;

    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SubBizId")
    public String subBizId;

    @NameInMap("UserId")
    public String userId;

    public static QueryBizItemListV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListV2ShrinkRequest self = new QueryBizItemListV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListV2ShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBizItemListV2ShrinkRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public QueryBizItemListV2ShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

    public QueryBizItemListV2ShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

    public QueryBizItemListV2ShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBizItemListV2ShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBizItemListV2ShrinkRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public QueryBizItemListV2ShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListWithCacheShrinkRequest extends TeaModel {
    // bizId
    @NameInMap("BizId")
    public String bizId;

    // itemIds
    @NameInMap("ItemIds")
    public String itemIdsShrink;

    // lmItemIds
    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    // pageNumber
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // subBizCode
    @NameInMap("SubBizCode")
    public String subBizCode;

    public static QueryBizItemListWithCacheShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListWithCacheShrinkRequest self = new QueryBizItemListWithCacheShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListWithCacheShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBizItemListWithCacheShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

    public QueryBizItemListWithCacheShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

    public QueryBizItemListWithCacheShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBizItemListWithCacheShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBizItemListWithCacheShrinkRequest setSubBizCode(String subBizCode) {
        this.subBizCode = subBizCode;
        return this;
    }
    public String getSubBizCode() {
        return this.subBizCode;
    }

}

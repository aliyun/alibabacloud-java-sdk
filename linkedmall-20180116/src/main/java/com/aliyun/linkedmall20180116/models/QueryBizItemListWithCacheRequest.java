// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListWithCacheRequest extends TeaModel {
    // bizId
    @NameInMap("BizId")
    public String bizId;

    // itemIds
    @NameInMap("ItemIds")
    public java.util.List<Long> itemIds;

    // lmItemIds
    @NameInMap("LmItemIds")
    public java.util.List<String> lmItemIds;

    // pageNumber
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // subBizCode
    @NameInMap("SubBizCode")
    public String subBizCode;

    public static QueryBizItemListWithCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListWithCacheRequest self = new QueryBizItemListWithCacheRequest();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListWithCacheRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBizItemListWithCacheRequest setItemIds(java.util.List<Long> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<Long> getItemIds() {
        return this.itemIds;
    }

    public QueryBizItemListWithCacheRequest setLmItemIds(java.util.List<String> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.List<String> getLmItemIds() {
        return this.lmItemIds;
    }

    public QueryBizItemListWithCacheRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBizItemListWithCacheRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBizItemListWithCacheRequest setSubBizCode(String subBizCode) {
        this.subBizCode = subBizCode;
        return this;
    }
    public String getSubBizCode() {
        return this.subBizCode;
    }

}

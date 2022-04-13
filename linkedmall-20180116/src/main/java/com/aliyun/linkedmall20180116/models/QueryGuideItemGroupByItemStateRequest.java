// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupByItemStateRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ItemState")
    public String itemState;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static QueryGuideItemGroupByItemStateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupByItemStateRequest self = new QueryGuideItemGroupByItemStateRequest();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupByItemStateRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryGuideItemGroupByItemStateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryGuideItemGroupByItemStateRequest setItemState(String itemState) {
        this.itemState = itemState;
        return this;
    }
    public String getItemState() {
        return this.itemState;
    }

    public QueryGuideItemGroupByItemStateRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryGuideItemGroupByItemStateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupWithOutInventoryRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryGuideItemGroupWithOutInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupWithOutInventoryRequest self = new QueryGuideItemGroupWithOutInventoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupWithOutInventoryRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryGuideItemGroupWithOutInventoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryGuideItemGroupWithOutInventoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryGuideItemGroupWithOutInventoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

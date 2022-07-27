// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupForCrowdOperationRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ItemState")
    public String itemState;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UserFlag")
    public String userFlag;

    public static QueryGuideItemGroupForCrowdOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupForCrowdOperationRequest self = new QueryGuideItemGroupForCrowdOperationRequest();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupForCrowdOperationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryGuideItemGroupForCrowdOperationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryGuideItemGroupForCrowdOperationRequest setItemState(String itemState) {
        this.itemState = itemState;
        return this;
    }
    public String getItemState() {
        return this.itemState;
    }

    public QueryGuideItemGroupForCrowdOperationRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryGuideItemGroupForCrowdOperationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryGuideItemGroupForCrowdOperationRequest setUserFlag(String userFlag) {
        this.userFlag = userFlag;
        return this;
    }
    public String getUserFlag() {
        return this.userFlag;
    }

}

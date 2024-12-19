// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupForCrowdOperationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LMALL20211119****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>taojinbi-shang******</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("ItemState")
    public String itemState;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>level1</p>
     */
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

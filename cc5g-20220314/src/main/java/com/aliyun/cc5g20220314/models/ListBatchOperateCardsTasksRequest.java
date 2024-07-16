// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListBatchOperateCardsTasksRequest extends TeaModel {
    @NameInMap("BatchOperateCardsTaskIds")
    public java.util.List<String> batchOperateCardsTaskIds;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("Names")
    public java.util.List<String> names;

    /**
     * <strong>example:</strong>
     * <p>iou001238joojjaere</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListBatchOperateCardsTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBatchOperateCardsTasksRequest self = new ListBatchOperateCardsTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListBatchOperateCardsTasksRequest setBatchOperateCardsTaskIds(java.util.List<String> batchOperateCardsTaskIds) {
        this.batchOperateCardsTaskIds = batchOperateCardsTaskIds;
        return this;
    }
    public java.util.List<String> getBatchOperateCardsTaskIds() {
        return this.batchOperateCardsTaskIds;
    }

    public ListBatchOperateCardsTasksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListBatchOperateCardsTasksRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public ListBatchOperateCardsTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBatchOperateCardsTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListBatchOperateCardsTasksRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}

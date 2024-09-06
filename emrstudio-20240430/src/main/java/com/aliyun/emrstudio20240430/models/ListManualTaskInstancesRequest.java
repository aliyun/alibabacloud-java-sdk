// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListManualTaskInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>123abc***</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("searchVal")
    public String searchVal;

    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListManualTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListManualTaskInstancesRequest self = new ListManualTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListManualTaskInstancesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListManualTaskInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListManualTaskInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListManualTaskInstancesRequest setSearchVal(String searchVal) {
        this.searchVal = searchVal;
        return this;
    }
    public String getSearchVal() {
        return this.searchVal;
    }

    public ListManualTaskInstancesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListManualTaskInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListManualTaskInstancesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

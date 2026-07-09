// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluationRunsRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJsYXN0SWQiOjEwMX0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The run type filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>backfill</p>
     */
    @NameInMap("runType")
    public String runType;

    /**
     * <p>The run status filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    public static ListEvaluationRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationRunsRequest self = new ListEvaluationRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListEvaluationRunsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEvaluationRunsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEvaluationRunsRequest setRunType(String runType) {
        this.runType = runType;
        return this;
    }
    public String getRunType() {
        return this.runType;
    }

    public ListEvaluationRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

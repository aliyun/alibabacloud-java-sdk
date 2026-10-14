// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListOptimizeTasksRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The task status.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The task type.</p>
     * 
     * <strong>example:</strong>
     * <p>EfficiencyAnalysis</p>
     */
    @NameInMap("type")
    public String type;

    public static ListOptimizeTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOptimizeTasksRequest self = new ListOptimizeTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListOptimizeTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOptimizeTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOptimizeTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListOptimizeTasksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

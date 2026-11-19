// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemoryTasksRequest extends TeaModel {
    /**
     * <p>The maximum number of results per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned for the same resource and filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwMH0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>ruleId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-2f5f9c5a8d0e4c3b</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>status</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCEEDED</p>
     */
    @NameInMap("status")
    public String status;

    public static ListMemoryTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryTasksRequest self = new ListMemoryTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListMemoryTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoryTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemoryTasksRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ListMemoryTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

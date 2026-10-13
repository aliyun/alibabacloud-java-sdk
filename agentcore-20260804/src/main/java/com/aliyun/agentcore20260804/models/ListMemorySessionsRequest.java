// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemorySessionsRequest extends TeaModel {
    /**
     * <p>The agent ID. If this parameter is not specified, all agents are matched. The length is limited to 1 to 128 UTF-8 bytes, and the value cannot contain / or *.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-001</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The maximum number of records per page. Default value: 100. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjEwMH0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The user ID. If this parameter is not specified, all users are matched. The length is limited to 1 to 128 UTF-8 bytes, and the value cannot contain / or *.</p>
     * 
     * <strong>example:</strong>
     * <p>user-001</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ListMemorySessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemorySessionsRequest self = new ListMemorySessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMemorySessionsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListMemorySessionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemorySessionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemorySessionsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

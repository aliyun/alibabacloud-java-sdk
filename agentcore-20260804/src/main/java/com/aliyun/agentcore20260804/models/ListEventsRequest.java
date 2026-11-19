// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListEventsRequest extends TeaModel {
    /**
     * <p>The exact filter for the business agent.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-001</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The maximum number of entries per page. Default value: 200. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to continue reading the same query.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwMH0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of the session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>session-001</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The exact filter for the business team.</p>
     * 
     * <strong>example:</strong>
     * <p>team-001</p>
     */
    @NameInMap("teamId")
    public String teamId;

    /**
     * <p>The exact filter for the business user. This is not the platform tenant identity.</p>
     * 
     * <strong>example:</strong>
     * <p>user-001</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ListEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventsRequest self = new ListEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListEventsRequest setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    public String getTeamId() {
        return this.teamId;
    }

    public ListEventsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemorySessionMessagesRequest extends TeaModel {
    /**
     * <p>The agent ID. You must specify at least one of AgentId and UserId. The length is limited to 1 to 128 UTF-8 bytes. The forward slash (/) and asterisk (*) are not allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-001</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The maximum number of records per page. Default value: 200. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwMH0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The session ID. The length is limited to 1 to 128 UTF-8 bytes. The forward slash (/) and asterisk (*) are not allowed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>session-001</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The user ID. You must specify at least one of UserId and AgentId. The length is limited to 1 to 128 UTF-8 bytes. The forward slash (/) and asterisk (*) are not allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>user-001</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ListMemorySessionMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemorySessionMessagesRequest self = new ListMemorySessionMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListMemorySessionMessagesRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListMemorySessionMessagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemorySessionMessagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemorySessionMessagesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListMemorySessionMessagesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

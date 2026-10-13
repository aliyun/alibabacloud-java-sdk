// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemorySessionMessagesRequest extends TeaModel {
    /**
     * <p>The agent ID. At least one of UserId and AgentId must be provided. The length must be 1 to 128 UTF-8 bytes. The value cannot contain forward slashes (/) or asterisks (*).</p>
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
     * <p>The session ID. The length must be 1 to 128 UTF-8 bytes. The value cannot contain forward slashes (/) or asterisks (*).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>session-001</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The user ID. At least one of UserId and AgentId must be provided. The length must be 1 to 128 UTF-8 bytes. The value cannot contain forward slashes (/) or asterisks (*).</p>
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

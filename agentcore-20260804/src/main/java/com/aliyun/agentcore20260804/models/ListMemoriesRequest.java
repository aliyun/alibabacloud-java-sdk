// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemoriesRequest extends TeaModel {
    /**
     * <p>The agent ID. If not specified, all agents are matched. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*).</p>
     * 
     * <strong>example:</strong>
     * <p>agent-001</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The maximum number of records per page. Default value: 50. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjEwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The session ID. If not specified, all sessions are matched. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*).</p>
     * 
     * <strong>example:</strong>
     * <p>session-001</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The source of the memory. Valid values:</p>
     * <ul>
     * <li>session_extraction: Extracted from session events.</li>
     * <li>content_extraction: Extracted from text or messages.</li>
     * <li>direct: Written directly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>session_extraction</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The business team ID defined by the caller.</p>
     * 
     * <strong>example:</strong>
     * <p>team-001</p>
     */
    @NameInMap("teamId")
    public String teamId;

    /**
     * <p>The memory content types. Specify the value as a JSON array string, such as [&quot;skill&quot;]. Valid values: semantic, skill, user_profile, and session_summary. If this parameter is omitted or set to [], all types are queried. The value auto is not supported. Keep the filter conditions consistent when you retrieve subsequent pages.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;semantic&quot;]</p>
     */
    @NameInMap("types")
    public String types;

    /**
     * <p>The start time for filtering by update time. The time must be in RFC 3339 format with a time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-23T10:00:00Z</p>
     */
    @NameInMap("updatedAtFrom")
    public String updatedAtFrom;

    /**
     * <p>The end time for filtering by update time. The time must be in RFC 3339 format with a time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-24T10:00:00Z</p>
     */
    @NameInMap("updatedAtTo")
    public String updatedAtTo;

    /**
     * <p>The user ID. If not specified, all users are matched. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*).</p>
     * 
     * <strong>example:</strong>
     * <p>user-001</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>Specifies whether the memory is valid. Default value: true. If this parameter is omitted, only valid records are returned. If set to false, revoked records are returned.</p>
     */
    @NameInMap("valid")
    public Boolean valid;

    public static ListMemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemoriesRequest self = new ListMemoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListMemoriesRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListMemoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemoriesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListMemoriesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListMemoriesRequest setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    public String getTeamId() {
        return this.teamId;
    }

    public ListMemoriesRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public ListMemoriesRequest setUpdatedAtFrom(String updatedAtFrom) {
        this.updatedAtFrom = updatedAtFrom;
        return this;
    }
    public String getUpdatedAtFrom() {
        return this.updatedAtFrom;
    }

    public ListMemoriesRequest setUpdatedAtTo(String updatedAtTo) {
        this.updatedAtTo = updatedAtTo;
        return this;
    }
    public String getUpdatedAtTo() {
        return this.updatedAtTo;
    }

    public ListMemoriesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListMemoriesRequest setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

}

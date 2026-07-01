// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListSessionsRequest extends TeaModel {
    /**
     * <p>The number of sessions to return. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNCNhYmM=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The function alias or version information.</p>
     * 
     * <strong>example:</strong>
     * <p>aliasName1</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The session ID to filter by. If specified, all Active or Expired status information associated with this session is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test-session-id-1</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The session status to filter by. By default, all session information in Active or Expired status is returned. Set this parameter to Active to retrieve only active session information, or to Expired to retrieve only expired session information.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("sessionStatus")
    public String sessionStatus;

    public static ListSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSessionsRequest self = new ListSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSessionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListSessionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSessionsRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ListSessionsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListSessionsRequest setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public String getSessionStatus() {
        return this.sessionStatus;
    }

}

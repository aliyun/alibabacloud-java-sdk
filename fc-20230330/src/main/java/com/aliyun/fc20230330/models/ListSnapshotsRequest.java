// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListSnapshotsRequest extends TeaModel {
    /**
     * <p>The function name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-func</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>The maximum number of snapshots to return. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token used to retrieve more results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0be03****f84eb48b699f0a4883</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The function alias.</p>
     * 
     * <strong>example:</strong>
     * <p>alias</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The source session ID from which the snapshot was created. When specified, functionName must also be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>test-session-id-1</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static ListSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsRequest self = new ListSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ListSnapshotsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListSnapshotsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSnapshotsRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ListSnapshotsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}

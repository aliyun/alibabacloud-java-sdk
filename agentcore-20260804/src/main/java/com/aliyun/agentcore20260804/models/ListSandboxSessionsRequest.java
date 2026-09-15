// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSandboxSessionsRequest extends TeaModel {
    /**
     * <p>The maximum number of records per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The cursor used to query the next page.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListSandboxSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxSessionsRequest self = new ListSandboxSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSandboxSessionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSandboxSessionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}

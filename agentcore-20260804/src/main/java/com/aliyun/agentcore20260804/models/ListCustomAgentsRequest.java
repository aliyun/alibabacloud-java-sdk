// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListCustomAgentsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 100. If this parameter is omitted or set to 0, the default value 20 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The opaque token used to query the next page. Omit this parameter in the first request. In subsequent requests, pass the nextToken value returned in the previous response as is, and keep the same workspace. Do not construct the token yourself.</p>
     * 
     * <strong>example:</strong>
     * <p>djE6YWdlbnRjb3JlLmFnZW50Lmxpc3QuY3VzdG9tOjIw</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListCustomAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentsRequest self = new ListCustomAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCustomAgentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}

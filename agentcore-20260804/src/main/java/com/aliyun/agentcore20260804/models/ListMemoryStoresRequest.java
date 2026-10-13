// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemoryStoresRequest extends TeaModel {
    /**
     * <p>The maximum number of records per page. Default value: 10. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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

    public static ListMemoryStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryStoresRequest self = new ListMemoryStoresRequest();
        return TeaModel.build(map, self);
    }

    public ListMemoryStoresRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoryStoresRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}

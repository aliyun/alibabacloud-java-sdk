// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListMemoryStoresRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. The maximum value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The name of the memory store.</p>
     * 
     * <strong>example:</strong>
     * <p>qianyi_test_1</p>
     */
    @NameInMap("memoryStoreName")
    public String memoryStoreName;

    /**
     * <p>The token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxx</p>
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

    public ListMemoryStoresRequest setMemoryStoreName(String memoryStoreName) {
        this.memoryStoreName = memoryStoreName;
        return this;
    }
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    public ListMemoryStoresRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContextStoreAPIKeysRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return in a single request. If this parameter is not specified, the service returns a default number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page of results. Leave this parameter empty to retrieve the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>615dfe7fd00f699ea94d5e63ba564aaf22450858c58f1387cc78f883b2254ab47232ce40fa95d9cb</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListContextStoreAPIKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContextStoreAPIKeysRequest self = new ListContextStoreAPIKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListContextStoreAPIKeysRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContextStoreAPIKeysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}

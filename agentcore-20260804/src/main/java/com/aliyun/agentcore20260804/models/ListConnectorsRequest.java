// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListConnectorsRequest extends TeaModel {
    /**
     * <p>The page size. The current version does not support this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The next page token. The current version does not support this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListConnectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsRequest self = new ListConnectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}

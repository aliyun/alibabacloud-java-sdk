// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListConnectionsRequest extends TeaModel {
    /**
     * <p>The key word that you specify to query connections. Connections can be queried by prefixes.</p>
     */
    @NameInMap("ConnectionNamePrefix")
    public String connectionNamePrefix;

    /**
     * <p>The maximum number of entries to be returned in a single call. You can use this parameter and the NextToken parameter to implement paging.</p>
     * <br>
     * <p>*   Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>If you set the Limit parameter and excess return values exist, this parameter is returned.</p>
     * <br>
     * <p>*   Default value: 0.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionsRequest self = new ListConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectionsRequest setConnectionNamePrefix(String connectionNamePrefix) {
        this.connectionNamePrefix = connectionNamePrefix;
        return this;
    }
    public String getConnectionNamePrefix() {
        return this.connectionNamePrefix;
    }

    public ListConnectionsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}

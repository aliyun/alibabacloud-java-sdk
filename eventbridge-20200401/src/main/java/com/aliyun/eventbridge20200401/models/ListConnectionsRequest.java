// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListConnectionsRequest extends TeaModel {
    /**
     * <p>The name prefix of the connection configurations to query. Supports prefix matching.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionNamePrefix")
    public String connectionNamePrefix;

    /**
     * <p>The maximum number of entries to return on each page. Can be used together with NextToken to implement pagination.</p>
     * <ul>
     * <li>Default value: 10</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>When MaxResults is specified, NextToken is returned if there are more results to fetch.</p>
     * <ul>
     * <li>NextToken starts from 0 by default. Default value: 0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Filters query results by connection type. Valid values: Http, MySQL, PostgreSQL, Elasticsearch. If left empty, connections of all types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("Type")
    public String type;

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

    public ListConnectionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

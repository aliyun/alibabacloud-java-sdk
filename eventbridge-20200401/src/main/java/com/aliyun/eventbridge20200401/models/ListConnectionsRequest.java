// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListConnectionsRequest extends TeaModel {
    /**
     * <p>The connection configuration name prefix used to filter results. Supports prefix matching.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionNamePrefix")
    public String connectionNamePrefix;

    /**
     * <p>Excludes a single connection type. Valid values are the same as those for Type. Specify a single type name. Arrays or comma-separated values are not supported. For example, specify Http to exclude HTTP connections. If this parameter is not specified or is set to an empty string, no types are excluded. If this parameter is set to the same value as Type, an empty list is returned. Pagination and total count are calculated after filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("ExcludeType")
    public String excludeType;

    /**
     * <p>The maximum number of entries to return per request. You can use this parameter together with NextToken to implement pagination.</p>
     * <ul>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>If the number of entries exceeds the value of MaxResults, NextToken is returned in the response.</p>
     * <ul>
     * <li>The NextToken value starts from 0. Default value: 0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Filters query results by connection type. Valid values: Http, MySQL, PostgreSQL, Elasticsearch, OSS_TABLES, SLS, OTS, MaxCompute, MongoDB, Redis, SQLServer, ClickHouse, Oracle, Hive, Iceberg, lakehouse. If this parameter is not specified, all types are returned.</p>
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

    public ListConnectionsRequest setExcludeType(String excludeType) {
        this.excludeType = excludeType;
        return this;
    }
    public String getExcludeType() {
        return this.excludeType;
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

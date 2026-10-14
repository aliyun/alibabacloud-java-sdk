// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticDataSourcesRequest extends TeaModel {
    /**
     * <p>Filters data sources by type. If you leave this parameter empty, no restriction is applied. Valid values: MYSQL, POSTGRESQL, ORACLE, SQLSERVER, MARIADB, POLARDB, POLARDB_POSTGRESQL, POLARDB_ORACLE, OCEANBASEX, DRDS, ADB_MYSQL, ADB_POSTGRESQL, CLICKHOUSE, SELECTDB, STARROCKS, HOLOGRES, MAXCOMPUTE, ES_REST, and TRINO.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>Filters data sources by endpoint. If you leave this parameter empty, no restriction is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.example.com</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>Filters data sources by source. If you leave this parameter empty, no restriction is applied. Valid values:</p>
     * <ul>
     * <li>RDS: ApsaraDB instance</li>
     * <li>PUBLIC_OWN: self-managed database on the public network</li>
     * <li>ECS_OWN: self-managed database on an ECS instance</li>
     * <li>GATEWAY: connected through Database Gateway</li>
     * <li>VPC_IDC: connected over a VPC or IDC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <p>The number of entries to return per page. Default value: 20. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination cursor. Leave this parameter empty when you query the first page. When you query subsequent pages, pass the NextToken value returned from the previous request.</p>
     * 
     * <strong>example:</strong>
     * <p>page-2-token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Filters data sources by connection port. If you leave this parameter empty, no restriction is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>Filters data sources by connection target name. The meaning of this parameter varies based on the data source type. If you leave this parameter empty, no restriction is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>postgres</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>Performs a fuzzy search by data source name or endpoint. If you leave this parameter empty, no fuzzy search is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>Filters data sources by status. If you leave this parameter empty, no restriction is applied. Valid values:</p>
     * <ul>
     * <li>0: normal</li>
     * <li>-1: deleted</li>
     * <li>-2: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public Integer state;

    public static ListAgenticDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticDataSourcesRequest self = new ListAgenticDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgenticDataSourcesRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public ListAgenticDataSourcesRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ListAgenticDataSourcesRequest setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public ListAgenticDataSourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgenticDataSourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgenticDataSourcesRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ListAgenticDataSourcesRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public ListAgenticDataSourcesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListAgenticDataSourcesRequest setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

}

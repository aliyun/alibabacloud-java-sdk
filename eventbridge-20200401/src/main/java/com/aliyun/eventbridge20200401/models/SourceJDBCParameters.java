// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceJDBCParameters extends TeaModel {
    /**
     * <p>The maximum number of rows returned per query. Default value: 1000. Maximum value: 10000.</p>
     */
    @NameInMap("BatchSize")
    public Integer batchSize;

    /**
     * <p>The custom SQL query statement (advanced mode). This parameter is mutually exclusive with TableName.</p>
     */
    @NameInMap("CustomQuery")
    public String customQuery;

    /**
     * <p>The incrementing column name. Required when QueryMode is set to <code>incrementing</code> or <code>timestamp_incrementing</code>.</p>
     */
    @NameInMap("IncrementingColumn")
    public String incrementingColumn;

    /**
     * <p>The JDBC connection URL. ClickHouse example: <code>jdbc:clickhouse://host:8123/database</code>; MySQL example: <code>jdbc:mysql://host:3306/database</code>. The system automatically identifies the database type.</p>
     */
    @NameInMap("JdbcUrl")
    public String jdbcUrl;

    /**
     * <p>The network type. Valid values: <code>PublicNetwork</code> (public network); <code>PrivateNetwork</code> (VPC private network, requires VpcId, VSwitchIds, and SecurityGroupId to be configured).</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The database password.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The polling interval, in seconds. Minimum value: 10. Default value: 60.</p>
     */
    @NameInMap("PollingInterval")
    public Integer pollingInterval;

    /**
     * <p>The query mode. Valid values: <code>bulk</code> (full query); <code>incrementing</code> (incrementing column tracking); <code>timestamp</code> (timestamp tracking); <code>timestamp_incrementing</code> (timestamp and incrementing column dual tracking).</p>
     */
    @NameInMap("QueryMode")
    public String queryMode;

    /**
     * <p>The SQL query timeout period, in seconds. Default value: 30. Maximum value: 300.</p>
     */
    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    /**
     * <p>The security group ID. Required when Network is set to PrivateNetwork.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The target table name. This parameter is mutually exclusive with CustomQuery. Required when custom SQL is not used.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The timestamp column name. Required when QueryMode is set to <code>timestamp</code> or <code>timestamp_incrementing</code>.</p>
     */
    @NameInMap("TimestampColumn")
    public String timestampColumn;

    /**
     * <p>The database username.</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The vSwitch ID. Required when Network is set to PrivateNetwork.</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The VPC ID. Required when Network is set to PrivateNetwork.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SourceJDBCParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceJDBCParameters self = new SourceJDBCParameters();
        return TeaModel.build(map, self);
    }

    public SourceJDBCParameters setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public SourceJDBCParameters setCustomQuery(String customQuery) {
        this.customQuery = customQuery;
        return this;
    }
    public String getCustomQuery() {
        return this.customQuery;
    }

    public SourceJDBCParameters setIncrementingColumn(String incrementingColumn) {
        this.incrementingColumn = incrementingColumn;
        return this;
    }
    public String getIncrementingColumn() {
        return this.incrementingColumn;
    }

    public SourceJDBCParameters setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
        return this;
    }
    public String getJdbcUrl() {
        return this.jdbcUrl;
    }

    public SourceJDBCParameters setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public SourceJDBCParameters setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SourceJDBCParameters setPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }
    public Integer getPollingInterval() {
        return this.pollingInterval;
    }

    public SourceJDBCParameters setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public SourceJDBCParameters setQueryTimeout(Integer queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }
    public Integer getQueryTimeout() {
        return this.queryTimeout;
    }

    public SourceJDBCParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SourceJDBCParameters setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public SourceJDBCParameters setTimestampColumn(String timestampColumn) {
        this.timestampColumn = timestampColumn;
        return this;
    }
    public String getTimestampColumn() {
        return this.timestampColumn;
    }

    public SourceJDBCParameters setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public SourceJDBCParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SourceJDBCParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

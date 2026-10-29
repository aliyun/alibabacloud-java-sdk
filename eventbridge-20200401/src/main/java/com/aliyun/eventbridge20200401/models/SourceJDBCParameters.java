// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceJDBCParameters extends TeaModel {
    /**
     * <p>The maximum number of rows returned per query. Default value: 1000. Maximum value: 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BatchSize")
    public Integer batchSize;

    /**
     * <p>The custom SQL query statement for advanced mode. This parameter is mutually exclusive with TableName.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM example_table</p>
     */
    @NameInMap("CustomQuery")
    public String customQuery;

    /**
     * <p>The name of the auto-increment column. This parameter is required when QueryMode is set to <code>incrementing</code> or <code>timestamp_incrementing</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("IncrementingColumn")
    public String incrementingColumn;

    /**
     * <p>The JDBC connection URL. ClickHouse example: <code>jdbc:clickhouse://host:8123/database</code>. MySQL example: <code>jdbc:mysql://host:3306/database</code>. The system automatically identifies the database type.</p>
     * 
     * <strong>example:</strong>
     * <p>jdbc:mysql://host:3306/database</p>
     */
    @NameInMap("JdbcUrl")
    public String jdbcUrl;

    /**
     * <p>The network type. Valid values: <code>PublicNetwork</code> (public network) and <code>PrivateNetwork</code> (VPC private network, which requires VpcId, VSwitchIds, and SecurityGroupId to be configured).</p>
     * 
     * <strong>example:</strong>
     * <p>PublicNetwork</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The database password.</p>
     * 
     * <strong>example:</strong>
     * <p>example_password</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The polling interval in seconds. Minimum value: 10. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("PollingInterval")
    public Integer pollingInterval;

    /**
     * <p>The query mode. Valid values: <code>bulk</code> (full query), <code>incrementing</code> (auto-increment column tracking), <code>timestamp</code> (timestamp tracking), and <code>timestamp_incrementing</code> (dual tracking by timestamp and auto-increment column).</p>
     * 
     * <strong>example:</strong>
     * <p>bulk</p>
     */
    @NameInMap("QueryMode")
    public String queryMode;

    /**
     * <p>The SQL query timeout in seconds. Default value: 30. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    /**
     * <p>The security group ID. This parameter is required when Network is set to PrivateNetwork.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The name of the target table. This parameter is mutually exclusive with CustomQuery and is required when custom SQL is not used.</p>
     * 
     * <strong>example:</strong>
     * <p>example_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The name of the timestamp column. This parameter is required when QueryMode is set to <code>timestamp</code> or <code>timestamp_incrementing</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>updated_at</p>
     */
    @NameInMap("TimestampColumn")
    public String timestampColumn;

    /**
     * <p>The database username.</p>
     * 
     * <strong>example:</strong>
     * <p>example_user</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The vSwitch IDs. This parameter is required when Network is set to PrivateNetwork.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-a1b2c3d4e5f6g7h8i9j0k</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The VPC ID. This parameter is required when Network is set to PrivateNetwork.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
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

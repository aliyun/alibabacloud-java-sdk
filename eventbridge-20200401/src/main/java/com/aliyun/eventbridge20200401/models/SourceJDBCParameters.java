// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceJDBCParameters extends TeaModel {
    @NameInMap("BatchSize")
    public Integer batchSize;

    @NameInMap("CustomQuery")
    public String customQuery;

    @NameInMap("IncrementingColumn")
    public String incrementingColumn;

    @NameInMap("JdbcUrl")
    public String jdbcUrl;

    @NameInMap("Network")
    public String network;

    @NameInMap("Password")
    public String password;

    @NameInMap("PollingInterval")
    public Integer pollingInterval;

    @NameInMap("QueryMode")
    public String queryMode;

    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TimestampColumn")
    public String timestampColumn;

    @NameInMap("Username")
    public String username;

    @NameInMap("VSwitchIds")
    public String vSwitchIds;

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

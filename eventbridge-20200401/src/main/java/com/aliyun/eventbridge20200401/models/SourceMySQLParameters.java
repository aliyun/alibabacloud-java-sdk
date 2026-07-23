// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceMySQLParameters extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The hostname or IP address of the database server.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>Indicates whether to include schema changes.</p>
     */
    @NameInMap("IncludeSchemaChanges")
    public String includeSchemaChanges;

    /**
     * <p>The network type.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The password for the user.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The database server port.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The ID of the region that contains the data source.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The snapshot mode.</p>
     */
    @NameInMap("SnapshotMode")
    public String snapshotMode;

    /**
     * <p>The names of tables to synchronize. Separate multiple table names with a comma.</p>
     */
    @NameInMap("TableNames")
    public String tableNames;

    /**
     * <p>The database username.</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The VSwitch IDs. Separate multiple IDs with a comma.</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The ID of the VPC.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SourceMySQLParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceMySQLParameters self = new SourceMySQLParameters();
        return TeaModel.build(map, self);
    }

    public SourceMySQLParameters setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public SourceMySQLParameters setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public SourceMySQLParameters setIncludeSchemaChanges(String includeSchemaChanges) {
        this.includeSchemaChanges = includeSchemaChanges;
        return this;
    }
    public String getIncludeSchemaChanges() {
        return this.includeSchemaChanges;
    }

    public SourceMySQLParameters setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SourceMySQLParameters setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SourceMySQLParameters setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public SourceMySQLParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SourceMySQLParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SourceMySQLParameters setSnapshotMode(String snapshotMode) {
        this.snapshotMode = snapshotMode;
        return this;
    }
    public String getSnapshotMode() {
        return this.snapshotMode;
    }

    public SourceMySQLParameters setTableNames(String tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public String getTableNames() {
        return this.tableNames;
    }

    public SourceMySQLParameters setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public SourceMySQLParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SourceMySQLParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

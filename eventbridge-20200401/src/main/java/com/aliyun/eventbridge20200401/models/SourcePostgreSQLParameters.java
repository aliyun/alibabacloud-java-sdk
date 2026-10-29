// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourcePostgreSQLParameters extends TeaModel {
    /**
     * <p>The name of the PostgreSQL database to connect to.</p>
     * 
     * <strong>example:</strong>
     * <p>analytics_db</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The hostname or IP address of the PostgreSQL database server.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1xxxxx.pg.rds.aliyuncs.com</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The network type used to connect to the PostgreSQL data source. Valid values: PublicNetwork (public network) and PrivateNetwork (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>PrivateNetwork</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The password of the database connection user.</p>
     * 
     * <strong>example:</strong>
     * <p>your_password</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The connection port of the PostgreSQL database server.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The ID of the region where the PostgreSQL data source resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the PostgreSQL schema to synchronize.</p>
     * 
     * <strong>example:</strong>
     * <p>test_schema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The ID of the security group used to connect to the PostgreSQL instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The snapshot mode used when PostgreSQL data synchronization is started for the first time.</p>
     * 
     * <strong>example:</strong>
     * <p>when_needed</p>
     */
    @NameInMap("SnapshotMode")
    public String snapshotMode;

    /**
     * <p>The names of the PostgreSQL tables to synchronize. Separate multiple table names with commas. Each table name must be in the {SchemaName}.{TableName} format.</p>
     * 
     * <strong>example:</strong>
     * <p>test_schema.test_table</p>
     */
    @NameInMap("TableNames")
    public String tableNames;

    /**
     * <p>The username for the database connection.</p>
     * 
     * <strong>example:</strong>
     * <p>readonly_user</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The ID of the vSwitch in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>[vsw-a1b2c3d4e5f6g7h8i9j0k]</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The ID of the VPC where the PostgreSQL instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SourcePostgreSQLParameters build(java.util.Map<String, ?> map) throws Exception {
        SourcePostgreSQLParameters self = new SourcePostgreSQLParameters();
        return TeaModel.build(map, self);
    }

    public SourcePostgreSQLParameters setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public SourcePostgreSQLParameters setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public SourcePostgreSQLParameters setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SourcePostgreSQLParameters setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SourcePostgreSQLParameters setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public SourcePostgreSQLParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SourcePostgreSQLParameters setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public SourcePostgreSQLParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SourcePostgreSQLParameters setSnapshotMode(String snapshotMode) {
        this.snapshotMode = snapshotMode;
        return this;
    }
    public String getSnapshotMode() {
        return this.snapshotMode;
    }

    public SourcePostgreSQLParameters setTableNames(String tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public String getTableNames() {
        return this.tableNames;
    }

    public SourcePostgreSQLParameters setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public SourcePostgreSQLParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SourcePostgreSQLParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

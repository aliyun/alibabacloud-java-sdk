// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class TestAgenticDataSourceConnectionRequest extends TeaModel {
    /**
     * <p>The name of the AnalyticDB for MySQL Spark resource group. This parameter takes effect only when DbType is set to ADB_MYSQL_SPARK. You must specify a resource group when connecting to this type of data source. This parameter is independent of Schema (database name) and they cannot replace each other.</p>
     * 
     * <strong>example:</strong>
     * <p>resourceGroup1</p>
     */
    @NameInMap("AdbSparkResourceGroup")
    public String adbSparkResourceGroup;

    /**
     * <p>The alias. You can leave this parameter empty when testing a connection. This operation does not create or modify a data source.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_mysql</p>
     */
    @NameInMap("Alias")
    public String alias;

    /**
     * <p>The logon username. You can leave this parameter empty for authentication methods that do not require a username.</p>
     * 
     * <strong>example:</strong>
     * <p>db_user</p>
     */
    @NameInMap("AuthAccount")
    public String authAccount;

    /**
     * <p>The logon password. When testing an existing data source, you can leave this parameter empty to reuse the saved password. If a new value is passed, the new value takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>P@ss****</p>
     */
    @NameInMap("AuthPassword")
    public String authPassword;

    /**
     * <p>The authentication type. This parameter is optional. Valid values:</p>
     * <ul>
     * <li>-1: No authentication required.</li>
     * <li>0: Username and password.</li>
     * <li>1: Password only.</li>
     * <li>2: Password-free.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthType")
    public Integer authType;

    /**
     * <p>The catalog name. You can leave this parameter empty when testing a connection. This operation does not create a metadata catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_catalog</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The UUID of the data source. Specify this parameter when testing an existing data source. If no new password is passed, the saved password is reused. Leave this parameter empty when testing a new data source.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou_a1b2c3d4e5f6</p>
     */
    @NameInMap("DataSourceUuid")
    public String dataSourceUuid;

    /**
     * <p>The type of the data source. Use uppercase letters for the identifier. Do not pass numbers. Valid values: MYSQL, POSTGRESQL, ORACLE, SQLSERVER, MARIADB, POLARDB, POLARDB_POSTGRESQL, POLARDB_ORACLE, OCEANBASEX, DRDS, ADB_MYSQL, ADB_POSTGRESQL, CLICKHOUSE, SELECTDB, STARROCKS, HOLOGRES, MAXCOMPUTE, ES_REST, and TRINO.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The environment type. This parameter is optional when testing a connection. Valid values: product, pre, dev, test, sit, uat, pet, and stag.</p>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The domain name or IP address of the database. Do not include the protocol, path, or port. This parameter is optional. You can leave this parameter empty if you select an existing cloud instance and the address is automatically populated.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.example.com</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The ID of the cloud resource instance. Specify this parameter when you select an existing cloud instance. You can leave this parameter empty when you enter an endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1234567890</p>
     */
    @NameInMap("InstanceResourceId")
    public String instanceResourceId;

    /**
     * <p>The source of the data source. Valid values:</p>
     * <ul>
     * <li>RDS: ApsaraDB instance.</li>
     * <li>PUBLIC_OWN: Self-managed database connected over the Internet.</li>
     * <li>ECS_OWN: Self-managed database hosted on an ECS instance.</li>
     * <li>GATEWAY: Database connected through Database Gateway.</li>
     * <li>VPC_IDC: Database connected through a VPC or data center.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <p>The name of the credential managed by Key Management Service (KMS). Specify this parameter when you use KMS to manage database credentials. Leave this parameter empty in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource-secret</p>
     */
    @NameInMap("KmsSecret")
    public String kmsSecret;

    /**
     * <p>The service port of the database. This parameter is optional. You can leave this parameter empty if you select an existing cloud instance and the port is automatically populated.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The complete ARN of the Resource Access Management (RAM) role. Specify this parameter when you use an Alibaba Cloud RAM role to access the data source. Leave this parameter empty in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/DataSourceRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The schema name. This parameter is optional. For ADB_POSTGRESQL, DRDS, POSTGRESQL, and POLARDB_POSTGRESQL, specify the database name. For ORACLE, specify the SID or service name, and prefix the service name with a forward slash (/). For POLARDB_ORACLE, specify the SID. For MAXCOMPUTE, specify the project name. Leave this parameter empty for other types.</p>
     * 
     * <strong>example:</strong>
     * <p>postgres</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The name of the Snowflake role. This parameter takes effect only when DbType is set to SNOWFLAKE.</p>
     * 
     * <strong>example:</strong>
     * <p>ROLE</p>
     */
    @NameInMap("SnowflakeRole")
    public String snowflakeRole;

    /**
     * <p>The name of the Snowflake compute warehouse. This parameter takes effect only when DbType is set to SNOWFLAKE.</p>
     * 
     * <strong>example:</strong>
     * <p>WAREHOUSE</p>
     */
    @NameInMap("SnowflakeWarehouse")
    public String snowflakeWarehouse;

    /**
     * <p>Specifies whether to synchronize the alias. This parameter is optional when testing a connection. This operation does not modify the data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SyncAlias")
    public Integer syncAlias;

    /**
     * <p>Specifies whether to enable SSL. Valid values:</p>
     * <ul>
     * <li>1: Enable.</li>
     * <li>0: Disable.</li>
     * <li>-1: Use default settings.
     * SSL is supported only for ADB_MYSQL, CLICKHOUSE, MARIADB, MYSQL, OCEANBASEX, POLARDB, SELECTDB, and STARROCKS. Leave this parameter empty for other types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UseSsl")
    public Integer useSsl;

    /**
     * <p>The ID of the vSwitch. Specify this parameter when you access MaxCompute through a VPC. Leave this parameter empty in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1234567890</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC. Specify this parameter when you access MaxCompute through a VPC. Leave this parameter empty in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1234567890</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone. Specify this parameter when you access MaxCompute through a VPC. Leave this parameter empty in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static TestAgenticDataSourceConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        TestAgenticDataSourceConnectionRequest self = new TestAgenticDataSourceConnectionRequest();
        return TeaModel.build(map, self);
    }

    public TestAgenticDataSourceConnectionRequest setAdbSparkResourceGroup(String adbSparkResourceGroup) {
        this.adbSparkResourceGroup = adbSparkResourceGroup;
        return this;
    }
    public String getAdbSparkResourceGroup() {
        return this.adbSparkResourceGroup;
    }

    public TestAgenticDataSourceConnectionRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public TestAgenticDataSourceConnectionRequest setAuthAccount(String authAccount) {
        this.authAccount = authAccount;
        return this;
    }
    public String getAuthAccount() {
        return this.authAccount;
    }

    public TestAgenticDataSourceConnectionRequest setAuthPassword(String authPassword) {
        this.authPassword = authPassword;
        return this;
    }
    public String getAuthPassword() {
        return this.authPassword;
    }

    public TestAgenticDataSourceConnectionRequest setAuthType(Integer authType) {
        this.authType = authType;
        return this;
    }
    public Integer getAuthType() {
        return this.authType;
    }

    public TestAgenticDataSourceConnectionRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public TestAgenticDataSourceConnectionRequest setDataSourceUuid(String dataSourceUuid) {
        this.dataSourceUuid = dataSourceUuid;
        return this;
    }
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
    }

    public TestAgenticDataSourceConnectionRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public TestAgenticDataSourceConnectionRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public TestAgenticDataSourceConnectionRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public TestAgenticDataSourceConnectionRequest setInstanceResourceId(String instanceResourceId) {
        this.instanceResourceId = instanceResourceId;
        return this;
    }
    public String getInstanceResourceId() {
        return this.instanceResourceId;
    }

    public TestAgenticDataSourceConnectionRequest setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public TestAgenticDataSourceConnectionRequest setKmsSecret(String kmsSecret) {
        this.kmsSecret = kmsSecret;
        return this;
    }
    public String getKmsSecret() {
        return this.kmsSecret;
    }

    public TestAgenticDataSourceConnectionRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public TestAgenticDataSourceConnectionRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public TestAgenticDataSourceConnectionRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public TestAgenticDataSourceConnectionRequest setSnowflakeRole(String snowflakeRole) {
        this.snowflakeRole = snowflakeRole;
        return this;
    }
    public String getSnowflakeRole() {
        return this.snowflakeRole;
    }

    public TestAgenticDataSourceConnectionRequest setSnowflakeWarehouse(String snowflakeWarehouse) {
        this.snowflakeWarehouse = snowflakeWarehouse;
        return this;
    }
    public String getSnowflakeWarehouse() {
        return this.snowflakeWarehouse;
    }

    public TestAgenticDataSourceConnectionRequest setSyncAlias(Integer syncAlias) {
        this.syncAlias = syncAlias;
        return this;
    }
    public Integer getSyncAlias() {
        return this.syncAlias;
    }

    public TestAgenticDataSourceConnectionRequest setUseSsl(Integer useSsl) {
        this.useSsl = useSsl;
        return this;
    }
    public Integer getUseSsl() {
        return this.useSsl;
    }

    public TestAgenticDataSourceConnectionRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public TestAgenticDataSourceConnectionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public TestAgenticDataSourceConnectionRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}

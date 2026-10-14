// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AddAgenticDataSourceRequest extends TeaModel {
    /**
     * <p>The display name of the data source. If you do not specify this parameter, the server generates a name.</p>
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
     * <p>The logon password. This is sensitive information. Do not record or disclose it.</p>
     * 
     * <strong>example:</strong>
     * <p>P@ss****</p>
     */
    @NameInMap("AuthPassword")
    public String authPassword;

    /**
     * <p>Optional. The authentication type. Valid values:</p>
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
     * <p>The name of the metadata catalog. If you do not specify this parameter, the name is automatically generated. The name can be up to 128 characters in length. It must start with a Chinese character, a letter, or an underscore, and can contain digits and hyphens. It cannot contain only digits.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_catalog</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The entry method. Valid values:</p>
     * <ul>
     * <li>INSTANCE_ID: Select an existing cloud instance.</li>
     * <li>HOST_PORT: Enter the endpoint and port.
     * If you do not specify this parameter, HOST_PORT is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HOST_PORT</p>
     */
    @NameInMap("CreateMode")
    public String createMode;

    /**
     * <p>The type of the data source. Use uppercase letters. Do not pass numbers. Valid values: MYSQL, POSTGRESQL, ORACLE, SQLSERVER, MARIADB, POLARDB, POLARDB_POSTGRESQL, POLARDB_ORACLE, OCEANBASEX, DRDS, ADB_MYSQL, ADB_POSTGRESQL, CLICKHOUSE, SELECTDB, STARROCKS, HOLOGRES, MAXCOMPUTE, ES_REST, and TRINO.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The environment type. Valid values: product, pre, dev, test, sit, uat, pet, and stag.</p>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>Optional. The domain name or IP address of the database. Do not include the protocol, path, or port. You can leave this parameter empty if you select an existing cloud instance and the address is automatically populated.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.example.com</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The ID of the cloud resource instance. This parameter is required when you select an existing cloud instance. You can leave this parameter empty when you enter an endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1234567890</p>
     */
    @NameInMap("InstanceResourceId")
    public String instanceResourceId;

    /**
     * <p>The source of the data source. Valid values:</p>
     * <ul>
     * <li>RDS: An ApsaraDB instance.</li>
     * <li>PUBLIC_OWN: A self-managed database on the Internet.</li>
     * <li>ECS_OWN: A self-managed database on an ECS instance.</li>
     * <li>GATEWAY: A database accessed through Database Gateway.</li>
     * <li>VPC_IDC: A database accessed through a VPC or data center.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <p>The name of the credential. Specify this parameter when you use Key Management Service (KMS) to manage database credentials. Leave this parameter empty in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource-secret</p>
     */
    @NameInMap("KmsSecret")
    public String kmsSecret;

    /**
     * <p>Optional. The ID of the data access security policy. This policy is used to control the access and protection rules for the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-usr-example</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>Optional. The service port of the database. You can leave this parameter empty if you select an existing cloud instance and the port is automatically populated.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The complete ARN of the Resource Access Management (RAM) role. Specify this parameter when you use a RAM role to access the data source. Leave this parameter empty in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/DataSourceRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>Optional. For ADB_POSTGRESQL, DRDS, POSTGRESQL, and POLARDB_POSTGRESQL, enter the database name. For ORACLE, enter the SID or service name, and prefix the service name with a forward slash (/). For POLARDB_ORACLE, enter the SID. For MAXCOMPUTE, enter the project name. Leave this parameter empty for other types.</p>
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
     * <p>Specifies whether to use the cloud instance name as the data source name. Valid values:</p>
     * <ul>
     * <li>1: Yes.</li>
     * <li>0: No.
     * This parameter takes effect only when you select a cloud database instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SyncAlias")
    public Integer syncAlias;

    /**
     * <p>Specifies whether to use SSL. Valid values:</p>
     * <ul>
     * <li>1: Enable.</li>
     * <li>0: Disable.</li>
     * <li>-1: Use the default setting.
     * Only ADB_MYSQL, CLICKHOUSE, MARIADB, MYSQL, OCEANBASEX, POLARDB, SELECTDB, and STARROCKS support SSL. Leave this parameter empty for other types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UseSsl")
    public Integer useSsl;

    /**
     * <p>The ID of the destination vSwitch. Specify this parameter when you access MaxCompute through a VPC. Leave this parameter empty in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1234567890</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the destination VPC. Specify this parameter when you access MaxCompute through a VPC. Leave this parameter empty in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1234567890</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the destination zone. Specify this parameter when you access MaxCompute through a VPC. Leave this parameter empty in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static AddAgenticDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAgenticDataSourceRequest self = new AddAgenticDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public AddAgenticDataSourceRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public AddAgenticDataSourceRequest setAuthAccount(String authAccount) {
        this.authAccount = authAccount;
        return this;
    }
    public String getAuthAccount() {
        return this.authAccount;
    }

    public AddAgenticDataSourceRequest setAuthPassword(String authPassword) {
        this.authPassword = authPassword;
        return this;
    }
    public String getAuthPassword() {
        return this.authPassword;
    }

    public AddAgenticDataSourceRequest setAuthType(Integer authType) {
        this.authType = authType;
        return this;
    }
    public Integer getAuthType() {
        return this.authType;
    }

    public AddAgenticDataSourceRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public AddAgenticDataSourceRequest setCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }
    public String getCreateMode() {
        return this.createMode;
    }

    public AddAgenticDataSourceRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public AddAgenticDataSourceRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public AddAgenticDataSourceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public AddAgenticDataSourceRequest setInstanceResourceId(String instanceResourceId) {
        this.instanceResourceId = instanceResourceId;
        return this;
    }
    public String getInstanceResourceId() {
        return this.instanceResourceId;
    }

    public AddAgenticDataSourceRequest setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public AddAgenticDataSourceRequest setKmsSecret(String kmsSecret) {
        this.kmsSecret = kmsSecret;
        return this;
    }
    public String getKmsSecret() {
        return this.kmsSecret;
    }

    public AddAgenticDataSourceRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public AddAgenticDataSourceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public AddAgenticDataSourceRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public AddAgenticDataSourceRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public AddAgenticDataSourceRequest setSnowflakeRole(String snowflakeRole) {
        this.snowflakeRole = snowflakeRole;
        return this;
    }
    public String getSnowflakeRole() {
        return this.snowflakeRole;
    }

    public AddAgenticDataSourceRequest setSnowflakeWarehouse(String snowflakeWarehouse) {
        this.snowflakeWarehouse = snowflakeWarehouse;
        return this;
    }
    public String getSnowflakeWarehouse() {
        return this.snowflakeWarehouse;
    }

    public AddAgenticDataSourceRequest setSyncAlias(Integer syncAlias) {
        this.syncAlias = syncAlias;
        return this;
    }
    public Integer getSyncAlias() {
        return this.syncAlias;
    }

    public AddAgenticDataSourceRequest setUseSsl(Integer useSsl) {
        this.useSsl = useSsl;
        return this;
    }
    public Integer getUseSsl() {
        return this.useSsl;
    }

    public AddAgenticDataSourceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public AddAgenticDataSourceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public AddAgenticDataSourceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}

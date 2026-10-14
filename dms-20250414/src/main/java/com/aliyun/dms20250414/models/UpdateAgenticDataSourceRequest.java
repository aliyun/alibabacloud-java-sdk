// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateAgenticDataSourceRequest extends TeaModel {
    /**
     * <p>The new display name of the data source. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_mysql</p>
     */
    @NameInMap("Alias")
    public String alias;

    /**
     * <p>The new logon username. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>db_user</p>
     */
    @NameInMap("AuthAccount")
    public String authAccount;

    /**
     * <p>The new logon password. If this parameter is not specified, the value is not updated. This is sensitive information. Do not record or disclose it.</p>
     * 
     * <strong>example:</strong>
     * <p>P@ss****</p>
     */
    @NameInMap("AuthPassword")
    public String authPassword;

    /**
     * <p>Optional. The authentication type. Valid values: -1: No authentication required. 0: Username and password. 1: Password only. 2: Password-free. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthType")
    public Integer authType;

    /**
     * <p>The new metadata catalog name. If this parameter is not specified, the value is not updated. The name can be up to 128 characters in length. It must start with a Chinese character, a letter, or an underscore, and can contain digits and hyphens. It cannot contain only digits.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_catalog</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The registration method. Valid values: INSTANCE_ID: Select an existing cloud instance. HOST_PORT: Register by endpoint and port. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>HOST_PORT</p>
     */
    @NameInMap("CreateMode")
    public String createMode;

    /**
     * <p>The UUID of the data source to be updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou_a1b2c3d4e5f6</p>
     */
    @NameInMap("DataSourceUuid")
    public String dataSourceUuid;

    /**
     * <p>Modifying the data source type is not supported. Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The environment type. Valid values: product, pre, dev, test, sit, uat, pet, and stag. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>Optional. The new database domain name or IP address. Do not include the protocol, path, or port. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.example.com</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The new cloud resource instance ID. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1234567890</p>
     */
    @NameInMap("InstanceResourceId")
    public String instanceResourceId;

    /**
     * <p>The new KMS managed credential name. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource-secret</p>
     */
    @NameInMap("KmsSecret")
    public String kmsSecret;

    /**
     * <p>Optional. The new data access security policy ID. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-usr-example</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>Optional. The new database service port. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The new Alibaba Cloud RAM role ARN. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/DataSourceRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>Optional. For ADB_POSTGRESQL, DRDS, POSTGRESQL, and POLARDB_POSTGRESQL, specify the database name. For ORACLE, specify the SID or service name, and prefix the service name with a forward slash (/). For POLARDB_ORACLE, specify the SID. For MAXCOMPUTE, specify the project name. For other types, leave this parameter empty. If this parameter is not specified, the value is not updated.</p>
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
     * <p>Specifies whether to use the cloud instance name as the data source name. Valid values: 1: Yes. 0: No. If this parameter is not specified, the value is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SyncAlias")
    public Integer syncAlias;

    /**
     * <p>The new SSL setting. Valid values: 1: Enable. 0: Disable. -1: Use the default setting. If this parameter is not specified, the value is not updated. SSL is supported only for ADB_MYSQL, CLICKHOUSE, MARIADB, MYSQL, OCEANBASEX, POLARDB, SELECTDB, and STARROCKS.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UseSsl")
    public Integer useSsl;

    public static UpdateAgenticDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgenticDataSourceRequest self = new UpdateAgenticDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgenticDataSourceRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public UpdateAgenticDataSourceRequest setAuthAccount(String authAccount) {
        this.authAccount = authAccount;
        return this;
    }
    public String getAuthAccount() {
        return this.authAccount;
    }

    public UpdateAgenticDataSourceRequest setAuthPassword(String authPassword) {
        this.authPassword = authPassword;
        return this;
    }
    public String getAuthPassword() {
        return this.authPassword;
    }

    public UpdateAgenticDataSourceRequest setAuthType(Integer authType) {
        this.authType = authType;
        return this;
    }
    public Integer getAuthType() {
        return this.authType;
    }

    public UpdateAgenticDataSourceRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public UpdateAgenticDataSourceRequest setCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }
    public String getCreateMode() {
        return this.createMode;
    }

    public UpdateAgenticDataSourceRequest setDataSourceUuid(String dataSourceUuid) {
        this.dataSourceUuid = dataSourceUuid;
        return this;
    }
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
    }

    public UpdateAgenticDataSourceRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public UpdateAgenticDataSourceRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public UpdateAgenticDataSourceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public UpdateAgenticDataSourceRequest setInstanceResourceId(String instanceResourceId) {
        this.instanceResourceId = instanceResourceId;
        return this;
    }
    public String getInstanceResourceId() {
        return this.instanceResourceId;
    }

    public UpdateAgenticDataSourceRequest setKmsSecret(String kmsSecret) {
        this.kmsSecret = kmsSecret;
        return this;
    }
    public String getKmsSecret() {
        return this.kmsSecret;
    }

    public UpdateAgenticDataSourceRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdateAgenticDataSourceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public UpdateAgenticDataSourceRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public UpdateAgenticDataSourceRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public UpdateAgenticDataSourceRequest setSnowflakeRole(String snowflakeRole) {
        this.snowflakeRole = snowflakeRole;
        return this;
    }
    public String getSnowflakeRole() {
        return this.snowflakeRole;
    }

    public UpdateAgenticDataSourceRequest setSnowflakeWarehouse(String snowflakeWarehouse) {
        this.snowflakeWarehouse = snowflakeWarehouse;
        return this;
    }
    public String getSnowflakeWarehouse() {
        return this.snowflakeWarehouse;
    }

    public UpdateAgenticDataSourceRequest setSyncAlias(Integer syncAlias) {
        this.syncAlias = syncAlias;
        return this;
    }
    public Integer getSyncAlias() {
        return this.syncAlias;
    }

    public UpdateAgenticDataSourceRequest setUseSsl(Integer useSsl) {
        this.useSsl = useSsl;
        return this;
    }
    public Integer getUseSsl() {
        return this.useSsl;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticDataSourceResponseBody extends TeaModel {
    /**
     * <p>The data source details. This parameter is empty if the data source does not exist.</p>
     */
    @NameInMap("Data")
    public GetAgenticDataSourceResponseBodyData data;

    /**
     * <p>The error code returned when the call fails. This parameter is empty if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails. This parameter is empty if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter is invalid</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAgenticDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticDataSourceResponseBody self = new GetAgenticDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgenticDataSourceResponseBody setData(GetAgenticDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgenticDataSourceResponseBodyData getData() {
        return this.data;
    }

    public GetAgenticDataSourceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAgenticDataSourceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAgenticDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgenticDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgenticDataSourceResponseBodyData extends TeaModel {
        /**
         * <p>The display name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_mysql</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The logon username for the data source. This parameter is empty if username authentication is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>db_user</p>
         */
        @NameInMap("AuthAccount")
        public String authAccount;

        /**
         * <p>The masked value of the password or token. The actual value is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>P@ss****</p>
         */
        @NameInMap("AuthPassword")
        public String authPassword;

        /**
         * <p>The authentication method. Valid values:</p>
         * <ul>
         * <li>-1: no authentication required</li>
         * <li>0: username and password</li>
         * <li>1: password only</li>
         * <li>2: password-free</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AuthType")
        public Integer authType;

        /**
         * <p>The name of the metadata catalog associated with the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_catalog</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>The UUID of the metadata catalog associated with the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-ab-0123456789abcdefghijk</p>
         */
        @NameInMap("CatalogUuid")
        public String catalogUuid;

        /**
         * <p>The method used to register the data source. Valid values:</p>
         * <ul>
         * <li>INSTANCE_ID: select an existing cloud instance</li>
         * <li>HOST_PORT: register by endpoint and port</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HOST_PORT</p>
         */
        @NameInMap("CreateMode")
        public String createMode;

        /**
         * <p>The unique identifier of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou_a1b2c3d4e5f6</p>
         */
        @NameInMap("DataSourceUuid")
        public String dataSourceUuid;

        /**
         * <p>The type of the data source. Valid values: MYSQL, POSTGRESQL, ORACLE, SQLSERVER, MARIADB, POLARDB, POLARDB_POSTGRESQL, POLARDB_ORACLE, OCEANBASEX, DRDS, ADB_MYSQL, ADB_POSTGRESQL, CLICKHOUSE, SELECTDB, STARROCKS, HOLOGRES, MAXCOMPUTE, ES_REST, and TRINO.</p>
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
         * <p>The time when the data source was created. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-13 14:30:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the data source was last modified. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-13 14:35:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The endpoint of the data source. A masked value may be returned in sensitive scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.example.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The ID of the cloud resource instance. This parameter may be empty for data sources registered by endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1234567890</p>
         */
        @NameInMap("InstanceResourceId")
        public String instanceResourceId;

        /**
         * <p>The source of the data source. Valid values:</p>
         * <ul>
         * <li>RDS: ApsaraDB instance</li>
         * <li>PUBLIC_OWN: self-managed database on the Internet</li>
         * <li>ECS_OWN: self-managed database on an ECS instance</li>
         * <li>GATEWAY: connected through Database Gateway</li>
         * <li>VPC_IDC: connected through a VPC or IDC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceSource")
        public String instanceSource;

        /**
         * <p>The name of the KMS-managed credential. This parameter is empty if KMS is not used. This field contains sensitive information.</p>
         * 
         * <strong>example:</strong>
         * <p>datasource-secret</p>
         */
        @NameInMap("KmsSecret")
        public String kmsSecret;

        /**
         * <p>The ID of the data access security policy currently in use. This parameter is empty if no policy is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-usr-example</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The connection port of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The region where the data source is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012****</p>
         */
        @NameInMap("ResourceAccountId")
        public String resourceAccountId;

        /**
         * <p>The ARN of the RAM role used to access the data source. This parameter is empty if role-based authorization is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/DataSourceRole</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The name of the connection target. For ADB_POSTGRESQL, DRDS, POSTGRESQL, and POLARDB_POSTGRESQL, this indicates the database name. For ORACLE, this indicates the SID or service name. For POLARDB_ORACLE, this indicates the SID. For MAXCOMPUTE, this indicates the project. For other types, this parameter is usually empty.</p>
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
         * <p>WAREHOUSE</p>
         */
        @NameInMap("SnowflakeRole")
        public String snowflakeRole;

        /**
         * <p>The name of the Snowflake compute warehouse. This parameter takes effect only when DbType is set to SNOWFLAKE.</p>
         * 
         * <strong>example:</strong>
         * <p>ROLE</p>
         */
        @NameInMap("SnowflakeWarehouse")
        public String snowflakeWarehouse;

        /**
         * <p>The status of the data source. Valid values:</p>
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

        /**
         * <p>Specifies whether to use the cloud instance name as the data source name. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SyncAlias")
        public Integer syncAlias;

        /**
         * <p>The SSL settings. Valid values:</p>
         * <ul>
         * <li>1: enabled</li>
         * <li>0: disabled</li>
         * <li>-1: use default settings</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UseSsl")
        public Integer useSsl;

        /**
         * <p>The ID of the destination vSwitch used when accessing MaxCompute. This parameter is empty in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1234567890</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the destination VPC used when accessing MaxCompute. This parameter is empty in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1234567890</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the destination zone used when accessing MaxCompute. This parameter is empty in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetAgenticDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgenticDataSourceResponseBodyData self = new GetAgenticDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgenticDataSourceResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetAgenticDataSourceResponseBodyData setAuthAccount(String authAccount) {
            this.authAccount = authAccount;
            return this;
        }
        public String getAuthAccount() {
            return this.authAccount;
        }

        public GetAgenticDataSourceResponseBodyData setAuthPassword(String authPassword) {
            this.authPassword = authPassword;
            return this;
        }
        public String getAuthPassword() {
            return this.authPassword;
        }

        public GetAgenticDataSourceResponseBodyData setAuthType(Integer authType) {
            this.authType = authType;
            return this;
        }
        public Integer getAuthType() {
            return this.authType;
        }

        public GetAgenticDataSourceResponseBodyData setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetAgenticDataSourceResponseBodyData setCatalogUuid(String catalogUuid) {
            this.catalogUuid = catalogUuid;
            return this;
        }
        public String getCatalogUuid() {
            return this.catalogUuid;
        }

        public GetAgenticDataSourceResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public GetAgenticDataSourceResponseBodyData setDataSourceUuid(String dataSourceUuid) {
            this.dataSourceUuid = dataSourceUuid;
            return this;
        }
        public String getDataSourceUuid() {
            return this.dataSourceUuid;
        }

        public GetAgenticDataSourceResponseBodyData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetAgenticDataSourceResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetAgenticDataSourceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAgenticDataSourceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAgenticDataSourceResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetAgenticDataSourceResponseBodyData setInstanceResourceId(String instanceResourceId) {
            this.instanceResourceId = instanceResourceId;
            return this;
        }
        public String getInstanceResourceId() {
            return this.instanceResourceId;
        }

        public GetAgenticDataSourceResponseBodyData setInstanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }
        public String getInstanceSource() {
            return this.instanceSource;
        }

        public GetAgenticDataSourceResponseBodyData setKmsSecret(String kmsSecret) {
            this.kmsSecret = kmsSecret;
            return this;
        }
        public String getKmsSecret() {
            return this.kmsSecret;
        }

        public GetAgenticDataSourceResponseBodyData setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetAgenticDataSourceResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetAgenticDataSourceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAgenticDataSourceResponseBodyData setResourceAccountId(String resourceAccountId) {
            this.resourceAccountId = resourceAccountId;
            return this;
        }
        public String getResourceAccountId() {
            return this.resourceAccountId;
        }

        public GetAgenticDataSourceResponseBodyData setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public GetAgenticDataSourceResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetAgenticDataSourceResponseBodyData setSnowflakeRole(String snowflakeRole) {
            this.snowflakeRole = snowflakeRole;
            return this;
        }
        public String getSnowflakeRole() {
            return this.snowflakeRole;
        }

        public GetAgenticDataSourceResponseBodyData setSnowflakeWarehouse(String snowflakeWarehouse) {
            this.snowflakeWarehouse = snowflakeWarehouse;
            return this;
        }
        public String getSnowflakeWarehouse() {
            return this.snowflakeWarehouse;
        }

        public GetAgenticDataSourceResponseBodyData setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public GetAgenticDataSourceResponseBodyData setSyncAlias(Integer syncAlias) {
            this.syncAlias = syncAlias;
            return this;
        }
        public Integer getSyncAlias() {
            return this.syncAlias;
        }

        public GetAgenticDataSourceResponseBodyData setUseSsl(Integer useSsl) {
            this.useSsl = useSsl;
            return this;
        }
        public Integer getUseSsl() {
            return this.useSsl;
        }

        public GetAgenticDataSourceResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetAgenticDataSourceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetAgenticDataSourceResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}

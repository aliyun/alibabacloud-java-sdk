// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureMigrationJobRequest extends TeaModel {
    @NameInMap("DestinationEndpoint")
    public ConfigureMigrationJobRequestDestinationEndpoint destinationEndpoint;

    @NameInMap("MigrationMode")
    public ConfigureMigrationJobRequestMigrationMode migrationMode;

    @NameInMap("SourceEndpoint")
    public ConfigureMigrationJobRequestSourceEndpoint sourceEndpoint;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The start offset of incremental data migration. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>The ID of the data migration instance. You can call the <strong>DescribeMigrationJobs</strong> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsl3m1213ye7l****</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    /**
     * <p>The name of the data migration task. The name can be up to 32 characters in length. We recommend that you specify an informative name to identify the task. You do not need to use a unique task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL_TO_RDS</p>
     */
    @NameInMap("MigrationJobName")
    public String migrationJobName;

    /**
     * <p>The objects that you want to migrate. The value is a JSON string and can contain regular expressions.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/141227.html">MigrationObject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;DBName&quot;:&quot;dtstestdata&quot;,&quot;TableIncludes&quot;:[{&quot;TableName&quot;:&quot;customer&quot;}]}]</p>
     */
    @NameInMap("MigrationObject")
    public String migrationObject;

    /**
     * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, for example, whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;autoStartModulesAfterConfig&quot;: &quot;none&quot;,     &quot;targetTableMode&quot;: 2 }</p>
     */
    @NameInMap("MigrationReserved")
    public String migrationReserved;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region where the data migration instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <blockquote>
     * <p> The region ID of the data migration instance is the same as that of the destination database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ConfigureMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureMigrationJobRequest self = new ConfigureMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureMigrationJobRequest setDestinationEndpoint(ConfigureMigrationJobRequestDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public ConfigureMigrationJobRequestDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public ConfigureMigrationJobRequest setMigrationMode(ConfigureMigrationJobRequestMigrationMode migrationMode) {
        this.migrationMode = migrationMode;
        return this;
    }
    public ConfigureMigrationJobRequestMigrationMode getMigrationMode() {
        return this.migrationMode;
    }

    public ConfigureMigrationJobRequest setSourceEndpoint(ConfigureMigrationJobRequestSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public ConfigureMigrationJobRequestSourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public ConfigureMigrationJobRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfigureMigrationJobRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public ConfigureMigrationJobRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public ConfigureMigrationJobRequest setMigrationJobName(String migrationJobName) {
        this.migrationJobName = migrationJobName;
        return this;
    }
    public String getMigrationJobName() {
        return this.migrationJobName;
    }

    public ConfigureMigrationJobRequest setMigrationObject(String migrationObject) {
        this.migrationObject = migrationObject;
        return this;
    }
    public String getMigrationObject() {
        return this.migrationObject;
    }

    public ConfigureMigrationJobRequest setMigrationReserved(String migrationReserved) {
        this.migrationReserved = migrationReserved;
        return this;
    }
    public String getMigrationReserved() {
        return this.migrationReserved;
    }

    public ConfigureMigrationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureMigrationJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureMigrationJobRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class ConfigureMigrationJobRequestDestinationEndpoint extends TeaModel {
        /**
         * <p>The name of the destination database or the authentication database.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>You must specify the database name only if the <strong>DestinationEndpoint.EngineName</strong> parameter is set to <strong>PostgreSQL</strong>, <strong>DRDS</strong>, or <strong>MongoDB</strong>.</li>
         * <li>If the <strong>DestinationEndpoint.EngineName</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>DRDS</strong>, specify the name of the destination database. If the DestinationEndpoint.EngineName parameter is set to <strong>MongoDB</strong>, specify the name of the authentication database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dtstestdatabase</p>
         */
        @NameInMap("DataBaseName")
        public String dataBaseName;

        /**
         * <p>The engine type of the destination database. Valid values: <strong>MySQL</strong>, <strong>DRDS</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>PPAS</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>POLARDB</strong>, and <strong>polardb_pg</strong>.</p>
         * <blockquote>
         * <p> You must specify the engine type only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>POLARDB</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The endpoint of the destination database.</p>
         * <blockquote>
         * <p> You must specify the endpoint only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the instance that hosts the destination database.</p>
         * <blockquote>
         * <p> You must specify the instance ID only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>DRDS</strong>, <strong>PetaData</strong>, <strong>OceanBase</strong>, <strong>POLARDB</strong>, <strong>PolarDB_o</strong>, <strong>AnalyticDB</strong>, or <strong>Greenplum</strong>. For example, if the DestinationEndpoint.InstanceType parameter is set to <strong>ECS</strong>, you must specify the ID of the ECS instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1r46452ai50****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The instance type of the destination database. Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: self-managed database that is hosted on Elastic Compute Service (ECS)</li>
         * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
         * <li><strong>DRDS</strong>: PolarDB-X instance</li>
         * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance</li>
         * <li><strong>Redis</strong>: ApsaraDB for Redis instance</li>
         * <li><strong>PetaData</strong>: HybridDB for MySQL instance</li>
         * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster or PolarDB for PostgreSQL cluster</li>
         * <li><strong>PolarDB_o</strong>: PolarDB O Edition cluster</li>
         * <li><strong>AnalyticDB</strong>: AnalyticDB for MySQL cluster V3.0 or V2.0</li>
         * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The SID of the Oracle database.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>DestinationEndpoint.EngineName</strong> parameter is set to <strong>Oracle</strong> and the <strong>Oracle</strong> database is deployed in a non-RAC architecture.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The password of the destination database account.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the destination database.</p>
         * <blockquote>
         * <p> You must specify the service port number only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The region ID of the destination database.</p>
         * <blockquote>
         * <p> If the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>LocalInstance</strong>, you can enter <strong>cn-hangzhou</strong> or the ID of the region closest to the self-managed database. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The database account of the destination database.</p>
         * <blockquote>
         * <p> The permissions that are required for database accounts vary with the migration scenario. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Overview of data migration scenarios</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtstestaccount</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ConfigureMigrationJobRequestDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigureMigrationJobRequestDestinationEndpoint self = new ConfigureMigrationJobRequestDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setDataBaseName(String dataBaseName) {
            this.dataBaseName = dataBaseName;
            return this;
        }
        public String getDataBaseName() {
            return this.dataBaseName;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ConfigureMigrationJobRequestMigrationMode extends TeaModel {
        /**
         * <p>Specifies whether to perform full data migration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> For more information about databases that support full data migration, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataIntialization")
        public Boolean dataIntialization;

        /**
         * <p>Specifies whether to perform incremental data migration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> For more information about databases that support incremental data migration, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Specifies whether to perform schema migration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> For more information about databases that support schema migration, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StructureIntialization")
        public Boolean structureIntialization;

        public static ConfigureMigrationJobRequestMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            ConfigureMigrationJobRequestMigrationMode self = new ConfigureMigrationJobRequestMigrationMode();
            return TeaModel.build(map, self);
        }

        public ConfigureMigrationJobRequestMigrationMode setDataIntialization(Boolean dataIntialization) {
            this.dataIntialization = dataIntialization;
            return this;
        }
        public Boolean getDataIntialization() {
            return this.dataIntialization;
        }

        public ConfigureMigrationJobRequestMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public ConfigureMigrationJobRequestMigrationMode setStructureIntialization(Boolean structureIntialization) {
            this.structureIntialization = structureIntialization;
            return this;
        }
        public Boolean getStructureIntialization() {
            return this.structureIntialization;
        }

    }

    public static class ConfigureMigrationJobRequestSourceEndpoint extends TeaModel {
        /**
         * <p>The name of the source database or the authentication database.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>You must specify the database name only if the <strong>SourceEndpoint.EngineName</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</li>
         * <li>If the <strong>SourceEndpoint.EngineName</strong> parameter is set to <strong>PostgreSQL</strong>, specify the name of the source database. If the SourceEndpoint.EngineName parameter is set to <strong>MongoDB</strong>, specify the name of the authentication database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dtstestdatabase</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The engine type of the source database. Valid values: <strong>MySQL</strong>, <strong>TiDB</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>Oracle</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>POLARDB</strong>, and <strong>polardb_pg</strong>.</p>
         * <blockquote>
         * <p> You must specify the engine type only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>POLARDB</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The endpoint of the source database.</p>
         * <blockquote>
         * <p> You must specify the endpoint only if the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the instance that hosts the source database.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>You must specify the instance ID only if the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>Express</strong>, <strong>MongoDB</strong>, <strong>POLARDB</strong>, or <strong>PolarDB_o</strong>. For example, if the SourceEndpoint.InstanceType parameter is set to <strong>ECS</strong>, you must specify the ID of the ECS instance.</li>
         * <li>If the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>Express</strong>, you must specify the ID of the virtual private cloud (VPC).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1i99e8l7913****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The instance type of the source database. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
         * <li><strong>ECS</strong>: self-managed database that is hosted on ECS</li>
         * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
         * <li><strong>Express</strong>: self-managed database that is connected over Express Connect, VPN Gateway, or Smart Access Gateway</li>
         * <li><strong>dg</strong>: self-managed database that is connected over Database Gateway</li>
         * <li><strong>cen</strong>: self-managed database that is connected over Cloud Enterprise Network (CEN)</li>
         * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance</li>
         * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster or PolarDB for PostgreSQL cluster</li>
         * <li><strong>PolarDB_o</strong>: PolarDB O Edition cluster</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The system ID (SID) of the Oracle database.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>SourceEndpoint.EngineName</strong> parameter is set to <strong>Oracle</strong> and the <strong>Oracle</strong> database is deployed in a non-RAC architecture.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The ID of the Alibaba Cloud account to which the source instance belongs.</p>
         * <blockquote>
         * <p> You must specify this parameter only when you configure data migration across different Alibaba Cloud accounts.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The password of the source database account.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the source database.</p>
         * <blockquote>
         * <p> You must specify the service port number only if the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The region ID of the source database.</p>
         * <blockquote>
         * <p> If the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>LocalInstance</strong>, you can enter <strong>cn-hangzhou</strong> or the ID of the region closest to the self-managed database. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The authorized RAM role of the source instance. You must specify the RAM role only if the source instance and the destination instance belong to different Alibaba Cloud accounts. You can use the RAM role to allow the Alibaba Cloud account that owns the destination instance to access the source instance.</p>
         * <blockquote>
         * <p> For information about the permissions and authorization methods of the RAM role, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration and synchronization</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The database account of the source database.</p>
         * <blockquote>
         * <p> The permissions that are required for database accounts vary with the migration scenario. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Overview of data migration scenarios</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtstestaccount</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ConfigureMigrationJobRequestSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigureMigrationJobRequestSourceEndpoint self = new ConfigureMigrationJobRequestSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigureMigrationJobRequestSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}

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
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter is pending deprecation.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The start checkpoint for incremental data migration. The value is a UNIX timestamp in seconds.</p>
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
     * <p>dtsxxxxxxxx</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    /**
     * <p>The name of the migration task. The name can be up to 32 characters in length. Specify a descriptive name for easy identification. The name does not need to be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL_TO_RDS</p>
     */
    @NameInMap("MigrationJobName")
    public String migrationJobName;

    /**
     * <p>The objects to be migrated. The value is a JSON string and supports specific regular expressions. For more information, see <a href="~141901~">Configure migration objects</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;DBName&quot;:&quot;dtstestdata&quot;,&quot;TableIncludes&quot;:[{&quot;TableName&quot;:&quot;customer&quot;}]}]</p>
     */
    @NameInMap("MigrationObject")
    public String migrationObject;

    /**
     * <p>The reserved parameters of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, such as specifying whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;autoStartModulesAfterConfig&quot;: &quot;none&quot;,     &quot;targetTableMode&quot;: 2 }</p>
     */
    @NameInMap("MigrationReserved")
    public String migrationReserved;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region where the data migration instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <blockquote>
     * <p>The region ID must be the same as the region ID of the destination database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
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
         * <p>The name of the destination database or the authentication database. </p>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required only when <strong>DestinationEndpoint.EngineName</strong> is set to <strong>PostgreSQL</strong>, <strong>DRDS</strong>, or <strong>MongoDB</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>When <strong>DestinationEndpoint.EngineName</strong> is set to <strong>PostgreSQL</strong> or <strong>DRDS</strong>, specify the name of the database to be migrated. When it is set to <strong>MongoDB</strong>, specify the name of the authentication database for the database account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dtstestdatabase</p>
         */
        @NameInMap("DataBaseName")
        public String dataBaseName;

        /**
         * <p>The database engine of the destination database. Valid values: <strong>MySQL</strong>, <strong>DRDS</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>PPAS</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>POLARDB</strong>, and <strong>polardb_pg</strong>.</p>
         * <blockquote>
         * <p>This parameter is available and required only when <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>RDS</strong>, <strong>POLARDB</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
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
         * <p>This parameter is available and required only when <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the destination instance.</p>
         * <blockquote>
         * <p>This parameter is available and required only when <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>DRDS</strong>, <strong>PetaData</strong>, <strong>OceanBase</strong>, <strong>POLARDB</strong>, <strong>PolarDB_o</strong>, <strong>AnalyticDB</strong>, or <strong>Greenplum</strong>. You must specify the corresponding instance ID. For example, if the value is <strong>ECS</strong>, specify the ID of the ECS instance.</p>
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
         * <li><strong>ECS</strong>: Self-managed database hosted on ECS.</li>
         * <li><strong>LocalInstance</strong>: Self-managed database with a public IP address.</li>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance.</li>
         * <li><strong>DRDS</strong>: PolarDB-X instance.</li>
         * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance.</li>
         * <li><strong>Redis</strong>: ApsaraDB for Redis instance.</li>
         * <li><strong>PetaData</strong>: HybridDB for MySQL instance.</li>
         * <li><strong>POLARDB</strong>: PolarDB for MySQL or PolarDB for PostgreSQL cluster.</li>
         * <li><strong>PolarDB_o</strong>: PolarDB for Oracle cluster.</li>
         * <li><strong>AnalyticDB</strong>: AnalyticDB for MySQL 3.0 or 2.0 cluster.</li>
         * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL cluster.</li>
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
         * <p>This parameter is available and required only when <strong>DestinationEndpoint.EngineName</strong> is set to <strong>Oracle</strong> and the Oracle database is a non-Real Application Cluster instance.</p>
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
         * <p>This parameter is available and required only when <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the region where the destination database resides.</p>
         * <blockquote>
         * <p>When <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>LocalInstance</strong>, you can specify <strong>cn-hangzhou</strong> or the ID of the region that is closest to your self-managed database. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The database account of the destination database.</p>
         * <p>Note: The required permissions vary based on the database engine. For more information, see the corresponding configuration examples in the migration overview.</p>
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
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>The support for full data migration varies based on the database engine. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
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
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>The support for incremental data migration varies based on the database engine. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
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
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>The support for schema migration varies based on the database engine. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</p>
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
         * <p>The name of the database to be migrated or the authentication database.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required only when <strong>SourceEndpoint.EngineName</strong> is set to <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>When <strong>SourceEndpoint.EngineName</strong> is set to <strong>PostgreSQL</strong>, specify the name of the database to be migrated. When it is set to <strong>MongoDB</strong>, specify the name of the authentication database for the database account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dtstestdatabase</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database engine of the source database. Valid values: <strong>MySQL</strong>, <strong>TiDB</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>Oracle</strong>, <strong>MongoDB</strong>, <strong>Redis</strong>, <strong>POLARDB</strong>, and <strong>polardb_pg</strong>.</p>
         * <blockquote>
         * <p>This parameter is available and required only when <strong>DestinationEndpoint.InstanceType</strong> is set to <strong>RDS</strong>, <strong>POLARDB</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
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
         * <p>This parameter is available and required only when <strong>SourceEndpoint.InstanceType</strong> is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the source instance.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required only when <strong>SourceEndpoint.InstanceType</strong> is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>Express</strong>, <strong>MongoDB</strong>, <strong>POLARDB</strong>, or <strong>PolarDB_o</strong>. You must specify the corresponding instance ID. For example, if the value is <strong>ECS</strong>, specify the ID of the ECS instance.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>When <strong>SourceEndpoint.InstanceType</strong> is set to <strong>Express</strong>, specify the VPC ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bp-rmxxxxxxxx</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The instance type of the source database. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance.</li>
         * <li><strong>ECS</strong>: Self-managed database hosted on Elastic Compute Service (ECS).</li>
         * <li><strong>LocalInstance</strong>: Self-managed database with a public IP address.</li>
         * <li><strong>Express</strong>: Self-managed database connected over Express Connect, VPN Gateway, or Smart Access Gateway.</li>
         * <li><strong>dg</strong>: Self-managed database connected over Database Gateway.</li>
         * <li><strong>cen</strong>: Self-managed database connected over Cloud Enterprise Network (CEN).</li>
         * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance.</li>
         * <li><strong>POLARDB</strong>: PolarDB for MySQL or PolarDB for PostgreSQL cluster.</li>
         * <li><strong>PolarDB_o</strong>: PolarDB for Oracle cluster.</li>
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
         * <p>This parameter is available and required only when <strong>SourceEndpoint.EngineName</strong> is set to <strong>Oracle</strong> and the Oracle database is a non-Real Application Cluster instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The Alibaba Cloud account ID to which the source instance belongs.</p>
         * <blockquote>
         * <p>This parameter is active and required only when you configure a cross-account data migration task.</p>
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
         * <p>This parameter is available and required only when <strong>SourceEndpoint.InstanceType</strong> is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the region where the source database resides.</p>
         * <blockquote>
         * <p>When <strong>SourceEndpoint.InstanceType</strong> is set to <strong>LocalInstance</strong>, you can specify <strong>cn-hangzhou</strong> or the ID of the region that is closest to your self-managed database. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The RAM role that is authorized to the destination Alibaba Cloud account to access the source instance. This parameter is required when the source and destination instances belong to different Alibaba Cloud accounts.</p>
         * <blockquote>
         * <p>For more information about the required permissions and authorization method, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration or synchronization</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The database account of the source database.</p>
         * <p>Note: The required permissions vary based on the database engine. For more information, see the corresponding configuration examples in the migration overview.</p>
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

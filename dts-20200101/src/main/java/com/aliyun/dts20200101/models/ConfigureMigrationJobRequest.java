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
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The start offset of incremental data migration. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>The ID of the data migration instance. You can call the **DescribeMigrationJobs** operation to query the instance ID.</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    /**
     * <p>The name of the data migration task. The name can be up to 32 characters in length. We recommend that you specify an informative name to identify the task. You do not need to use a unique task name.</p>
     */
    @NameInMap("MigrationJobName")
    public String migrationJobName;

    /**
     * <p>The objects that you want to migrate. The value is a JSON string and can contain regular expressions.</p>
     * <br>
     * <p>For more information, see [MigrationObject](~~141227~~).</p>
     */
    @NameInMap("MigrationObject")
    public String migrationObject;

    /**
     * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).</p>
     */
    @NameInMap("MigrationReserved")
    public String migrationReserved;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region where the data migration instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     * <br>
     * <p>>  The region ID of the data migration instance is the same as that of the destination database.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

    public static class ConfigureMigrationJobRequestDestinationEndpoint extends TeaModel {
        /**
         * <p>The name of the destination database or the authentication database.</p>
         * <br>
         * <p>> </p>
         * <p>*   You must specify the database name only if the **DestinationEndpoint.EngineName** parameter is set to **PostgreSQL**, **DRDS**, or **MongoDB**.</p>
         * <p>*   If the **DestinationEndpoint.EngineName** parameter is set to **PostgreSQL** or **DRDS**, specify the name of the destination database. If the DestinationEndpoint.EngineName parameter is set to **MongoDB**, specify the name of the authentication database.</p>
         */
        @NameInMap("DataBaseName")
        public String dataBaseName;

        /**
         * <p>The engine type of the destination database. Valid values: **MySQL**, **DRDS**, **SQLServer**, **PostgreSQL**, **PPAS**, **MongoDB**, **Redis**, **POLARDB**, and **polardb_pg**.</p>
         * <br>
         * <p>>  You must specify the engine type only if the **DestinationEndpoint.InstanceType** parameter is set to **RDS**, **POLARDB**, **ECS**, **LocalInstance**, or **Express**.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The endpoint of the destination database.</p>
         * <br>
         * <p>>  You must specify the endpoint only if the **DestinationEndpoint.InstanceType** parameter is set to **LocalInstance** or **Express**.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the instance that hosts the destination database.</p>
         * <br>
         * <p>>  You must specify the instance ID only if the **DestinationEndpoint.InstanceType** parameter is set to **RDS**, **ECS**, **MongoDB**, **Redis**, **DRDS**, **PetaData**, **OceanBase**, **POLARDB**, **PolarDB_o**, **AnalyticDB**, or **Greenplum**. For example, if the DestinationEndpoint.InstanceType parameter is set to **ECS**, you must specify the ID of the ECS instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The instance type of the destination database. Valid values:</p>
         * <br>
         * <p>*   **ECS**: self-managed database that is hosted on Elastic Compute Service (ECS)</p>
         * <p>*   **LocalInstance**: self-managed database with a public IP address</p>
         * <p>*   **RDS**: ApsaraDB RDS instance</p>
         * <p>*   **DRDS**: PolarDB-X instance</p>
         * <p>*   **MongoDB**: ApsaraDB for MongoDB instance</p>
         * <p>*   **Redis**: ApsaraDB for Redis instance</p>
         * <p>*   **PetaData**: HybridDB for MySQL instance</p>
         * <p>*   **POLARDB**: PolarDB for MySQL cluster or PolarDB for PostgreSQL cluster</p>
         * <p>*   **PolarDB_o**: PolarDB O Edition cluster</p>
         * <p>*   **AnalyticDB**: AnalyticDB for MySQL cluster V3.0 or V2.0</p>
         * <p>*   **Greenplum**: AnalyticDB for PostgreSQL instance</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The SID of the Oracle database.</p>
         * <br>
         * <p>>  You must specify this parameter only if the **DestinationEndpoint.EngineName** parameter is set to **Oracle** and the **Oracle** database is deployed in a non-RAC architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The password of the destination database account.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the destination database.</p>
         * <br>
         * <p>>  You must specify the service port number only if the **DestinationEndpoint.InstanceType** parameter is set to **ECS**, **LocalInstance**, or **Express**.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The region ID of the destination database.</p>
         * <br>
         * <p>>  If the **DestinationEndpoint.InstanceType** parameter is set to **LocalInstance**, you can enter **cn-hangzhou** or the ID of the region closest to the self-managed database. For more information, see [List of supported regions](~~141033~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The database account of the destination database.</p>
         * <br>
         * <p>>  The permissions that are required for database accounts vary with the migration scenario. For more information, see [Overview of data migration scenarios](~~26618~~).</p>
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
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>>  For more information about databases that support full data migration, see [Supported databases and migration types](~~26618~~).</p>
         */
        @NameInMap("DataIntialization")
        public Boolean dataIntialization;

        /**
         * <p>Specifies whether to perform incremental data migration. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>>  For more information about databases that support incremental data migration, see [Supported databases and migration types](~~26618~~).</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Specifies whether to perform schema migration. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>>  For more information about databases that support schema migration, see [Supported databases and migration types](~~26618~~).</p>
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
         * <br>
         * <p>> </p>
         * <p>*   You must specify the database name only if the **SourceEndpoint.EngineName** parameter is set to **PostgreSQL** or **MongoDB**.</p>
         * <p>*   If the **SourceEndpoint.EngineName** parameter is set to **PostgreSQL**, specify the name of the source database. If the SourceEndpoint.EngineName parameter is set to **MongoDB**, specify the name of the authentication database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The engine type of the source database. Valid values: **MySQL**, **TiDB**, **SQLServer**, **PostgreSQL**, **Oracle**, **MongoDB**, **Redis**, **POLARDB**, and **polardb_pg**.</p>
         * <br>
         * <p>>  You must specify the engine type only if the **DestinationEndpoint.InstanceType** parameter is set to **RDS**, **POLARDB**, **ECS**, **LocalInstance**, or **Express**.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The endpoint of the source database.</p>
         * <br>
         * <p>>  You must specify the endpoint only if the **SourceEndpoint.InstanceType** parameter is set to **LocalInstance** or **Express**.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the instance that hosts the source database.</p>
         * <br>
         * <p>> </p>
         * <p>*   You must specify the instance ID only if the **SourceEndpoint.InstanceType** parameter is set to **RDS**, **ECS**, **Express**, **MongoDB**, **POLARDB**, or **PolarDB_o**. For example, if the SourceEndpoint.InstanceType parameter is set to **ECS**, you must specify the ID of the ECS instance.</p>
         * <p>*   If the **SourceEndpoint.InstanceType** parameter is set to **Express**, you must specify the ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The instance type of the source database. Valid values:</p>
         * <br>
         * <p>*   **RDS**: ApsaraDB RDS instance</p>
         * <p>*   **ECS**: self-managed database that is hosted on ECS</p>
         * <p>*   **LocalInstance**: self-managed database with a public IP address</p>
         * <p>*   **Express**: self-managed database that is connected over Express Connect, VPN Gateway, or Smart Access Gateway</p>
         * <p>*   **dg**: self-managed database that is connected over Database Gateway</p>
         * <p>*   **cen**: self-managed database that is connected over Cloud Enterprise Network (CEN)</p>
         * <p>*   **MongoDB**: ApsaraDB for MongoDB instance</p>
         * <p>*   **POLARDB**: PolarDB for MySQL cluster or PolarDB for PostgreSQL cluster</p>
         * <p>*   **PolarDB_o**: PolarDB O Edition cluster</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The system ID (SID) of the Oracle database.</p>
         * <br>
         * <p>>  You must specify this parameter only if the **SourceEndpoint.EngineName** parameter is set to **Oracle** and the **Oracle** database is deployed in a non-RAC architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The ID of the Alibaba Cloud account to which the source instance belongs.</p>
         * <br>
         * <p>>  You must specify this parameter only when you configure data migration across different Alibaba Cloud accounts.</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The password of the source database account.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the source database.</p>
         * <br>
         * <p>>  You must specify the service port number only if the **SourceEndpoint.InstanceType** parameter is set to **ECS**, **LocalInstance**, or **Express**.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The region ID of the source database.</p>
         * <br>
         * <p>>  If the **SourceEndpoint.InstanceType** parameter is set to **LocalInstance**, you can enter **cn-hangzhou** or the ID of the region closest to the self-managed database. For more information, see [List of supported regions](~~141033~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The authorized RAM role of the source instance. You must specify the RAM role only if the source instance and the destination instance belong to different Alibaba Cloud accounts. You can use the RAM role to allow the Alibaba Cloud account that owns the destination instance to access the source instance.</p>
         * <br>
         * <p>>  For information about the permissions and authorization methods of the RAM role, see [Configure RAM authorization for cross-account data migration and synchronization](~~48468~~).</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The database account of the source database.</p>
         * <br>
         * <p>>  The permissions that are required for database accounts vary with the migration scenario. For more information, see [Overview of data migration scenarios](~~26618~~).</p>
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

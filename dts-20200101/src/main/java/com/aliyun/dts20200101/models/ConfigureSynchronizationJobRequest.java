// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobRequest extends TeaModel {
    @NameInMap("DestinationEndpoint")
    public ConfigureSynchronizationJobRequestDestinationEndpoint destinationEndpoint;

    @NameInMap("PartitionKey")
    public ConfigureSynchronizationJobRequestPartitionKey partitionKey;

    @NameInMap("SourceEndpoint")
    public ConfigureSynchronizationJobRequestSourceEndpoint sourceEndpoint;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The synchronization checkpoint.</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>Specifies whether to perform initial full data synchronization. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     * <br>
     * <p>>  Default value: **true**.</p>
     */
    @NameInMap("DataInitialization")
    public Boolean dataInitialization;

    /**
     * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).</p>
     * <br>
     * <p>>  This parameter can be used for data synchronization between ApsaraDB for Redis Enterprise Edition instances. For more information, see [Use OpenAPI Explorer to configure one-way or two-way data synchronization between ApsaraDB for Redis Enterprise Edition instances](~~155967~~).</p>
     */
    @NameInMap("MigrationReserved")
    public String migrationReserved;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to perform initial schema synchronization. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     * <br>
     * <p>>  Default value: **true**.</p>
     */
    @NameInMap("StructureInitialization")
    public Boolean structureInitialization;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <br>
     * <p>*   **Forward**</p>
     * <p>*   **Reverse**</p>
     * <br>
     * <p>> </p>
     * <p>*   Default value: **Forward**.</p>
     * <p>*   The value **Reverse** takes effect only if the topology of the data synchronization instance is two-way synchronization.</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>The ID of the data synchronization instance. You can call the [DescribeSynchronizationJobs](~~49454~~) operation to query the instance ID.</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    /**
     * <p>The name of the data synchronization task.</p>
     * <br>
     * <p>>  We recommend that you specify an informative name for easy identification. You do not need to use a unique task name.</p>
     */
    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    /**
     * <p>The objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see [SynchronizationObjects](~~141901~~).</p>
     */
    @NameInMap("SynchronizationObjects")
    public String synchronizationObjects;

    public static ConfigureSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSynchronizationJobRequest self = new ConfigureSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSynchronizationJobRequest setDestinationEndpoint(ConfigureSynchronizationJobRequestDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public ConfigureSynchronizationJobRequestDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public ConfigureSynchronizationJobRequest setPartitionKey(ConfigureSynchronizationJobRequestPartitionKey partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }
    public ConfigureSynchronizationJobRequestPartitionKey getPartitionKey() {
        return this.partitionKey;
    }

    public ConfigureSynchronizationJobRequest setSourceEndpoint(ConfigureSynchronizationJobRequestSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public ConfigureSynchronizationJobRequestSourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public ConfigureSynchronizationJobRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfigureSynchronizationJobRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public ConfigureSynchronizationJobRequest setDataInitialization(Boolean dataInitialization) {
        this.dataInitialization = dataInitialization;
        return this;
    }
    public Boolean getDataInitialization() {
        return this.dataInitialization;
    }

    public ConfigureSynchronizationJobRequest setMigrationReserved(String migrationReserved) {
        this.migrationReserved = migrationReserved;
        return this;
    }
    public String getMigrationReserved() {
        return this.migrationReserved;
    }

    public ConfigureSynchronizationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureSynchronizationJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureSynchronizationJobRequest setStructureInitialization(Boolean structureInitialization) {
        this.structureInitialization = structureInitialization;
        return this;
    }
    public Boolean getStructureInitialization() {
        return this.structureInitialization;
    }

    public ConfigureSynchronizationJobRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ConfigureSynchronizationJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public ConfigureSynchronizationJobRequest setSynchronizationJobName(String synchronizationJobName) {
        this.synchronizationJobName = synchronizationJobName;
        return this;
    }
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    public ConfigureSynchronizationJobRequest setSynchronizationObjects(String synchronizationObjects) {
        this.synchronizationObjects = synchronizationObjects;
        return this;
    }
    public String getSynchronizationObjects() {
        return this.synchronizationObjects;
    }

    public static class ConfigureSynchronizationJobRequestDestinationEndpoint extends TeaModel {
        /**
         * <p>The name of the database to which the synchronization object in the destination instance belongs.</p>
         */
        @NameInMap("DataBaseName")
        public String dataBaseName;

        /**
         * <p>The IP address of the destination database.</p>
         * <br>
         * <p>>  You must specify this parameter only if the **DestinationEndpoint.InstanceType** parameter is set to **Express**, **dg**, or **cen**.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the destination instance.</p>
         * <br>
         * <p>>  If the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute** or **DataHub**, you must specify the name of the MaxCompute project or the DataHub project.</p>
         * <br>
         * <p>If the destination instance is an AnalyticDB for MySQL cluster, specify the ID of the AnalyticDB for MySQL cluster.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the destination instance. Valid values:</p>
         * <br>
         * <p>*   **Redis**: ApsaraDB for Redis instance</p>
         * <p>*   **RDS**: ApsaraDB RDS instance</p>
         * <p>*   **PolarDB**: PolarDB for MySQL cluster or PolarDB O Edition cluster</p>
         * <p>*   **ECS**: self-managed database that is hosted on ECS</p>
         * <p>*   **Express**: self-managed database that is connected over Express Connect</p>
         * <p>*   **DataHub**: DataHub project</p>
         * <p>*   **MaxCompute**: MaxCompute project</p>
         * <p>*   **AnalyticDB**: AnalyticDB for MySQL cluster V3.0 or V2.0</p>
         * <p>*   **Greenplum**: AnalyticDB for PostgreSQL instance</p>
         * <br>
         * <p>>  The default value is **RDS**.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The password of the destination database account.</p>
         * <br>
         * <p>> </p>
         * <p>*   If the **DestinationEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**, you must specify the DestinationEndpoint.Password parameter.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the destination database.</p>
         * <br>
         * <p>>  You must specify this parameter only if the **DestinationEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The database account of the destination database.</p>
         * <br>
         * <p>> </p>
         * <p>*   The permissions that are required for database accounts vary with the synchronization scenario. For more information, see [Overview of data synchronization scenarios](~~140954~~).</p>
         * <p>*   If the **DestinationEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**, you must specify the DestinationEndpoint.UserName parameter.</p>
         * <p>*   If the **DestinationEndpoint.InstanceType** parameter is set to RDS and the database version is MySQL 5.5 or MySQL 5.6, you do not need to specify the DestinationEndpoint.UserName and **DestinationEndpoint.Password** parameters.</p>
         * <p>*   If the **DestinationEndpoint.InstanceType** parameter is set to **Redis**, you do not need to specify the DestinationEndpoint.UserName parameter.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ConfigureSynchronizationJobRequestDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSynchronizationJobRequestDestinationEndpoint self = new ConfigureSynchronizationJobRequestDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setDataBaseName(String dataBaseName) {
            this.dataBaseName = dataBaseName;
            return this;
        }
        public String getDataBaseName() {
            return this.dataBaseName;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ConfigureSynchronizationJobRequestPartitionKey extends TeaModel {
        /**
         * <p>Specifies whether the incremental data table contains partitions defined by the modifytime_day field. Valid values: **true** and **false**.</p>
         * <br>
         * <p>>  This parameter is available only if the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute**.</p>
         */
        @NameInMap("ModifyTime_Day")
        public Boolean modifyTimeDay;

        /**
         * <p>Specifies whether the incremental data table contains partitions defined by the modifytime_hour field. Valid values: **true** and **false**.</p>
         * <br>
         * <p>>  This parameter is available only if the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute**.</p>
         */
        @NameInMap("ModifyTime_Hour")
        public Boolean modifyTimeHour;

        /**
         * <p>Specifies whether the incremental data table contains partitions defined by the modifytime_minute field. Valid values: **true** and **false**.</p>
         * <br>
         * <p>>  This parameter is available only if the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute**.</p>
         */
        @NameInMap("ModifyTime_Minute")
        public Boolean modifyTimeMinute;

        /**
         * <p>Specifies whether the incremental data table contains partitions defined by the modifytime_month field. Valid values: **true** and **false**.</p>
         * <br>
         * <p>>  This parameter is available only if the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute**.</p>
         */
        @NameInMap("ModifyTime_Month")
        public Boolean modifyTimeMonth;

        /**
         * <p>Specifies whether the incremental data table contains partitions defined by the modifytime_year field. Valid values: **true** and **false**.</p>
         * <br>
         * <p>>  This parameter is available only if the **DestinationEndpoint.InstanceType** parameter is set to **MaxCompute**.</p>
         */
        @NameInMap("ModifyTime_Year")
        public Boolean modifyTimeYear;

        public static ConfigureSynchronizationJobRequestPartitionKey build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSynchronizationJobRequestPartitionKey self = new ConfigureSynchronizationJobRequestPartitionKey();
            return TeaModel.build(map, self);
        }

        public ConfigureSynchronizationJobRequestPartitionKey setModifyTimeDay(Boolean modifyTimeDay) {
            this.modifyTimeDay = modifyTimeDay;
            return this;
        }
        public Boolean getModifyTimeDay() {
            return this.modifyTimeDay;
        }

        public ConfigureSynchronizationJobRequestPartitionKey setModifyTimeHour(Boolean modifyTimeHour) {
            this.modifyTimeHour = modifyTimeHour;
            return this;
        }
        public Boolean getModifyTimeHour() {
            return this.modifyTimeHour;
        }

        public ConfigureSynchronizationJobRequestPartitionKey setModifyTimeMinute(Boolean modifyTimeMinute) {
            this.modifyTimeMinute = modifyTimeMinute;
            return this;
        }
        public Boolean getModifyTimeMinute() {
            return this.modifyTimeMinute;
        }

        public ConfigureSynchronizationJobRequestPartitionKey setModifyTimeMonth(Boolean modifyTimeMonth) {
            this.modifyTimeMonth = modifyTimeMonth;
            return this;
        }
        public Boolean getModifyTimeMonth() {
            return this.modifyTimeMonth;
        }

        public ConfigureSynchronizationJobRequestPartitionKey setModifyTimeYear(Boolean modifyTimeYear) {
            this.modifyTimeYear = modifyTimeYear;
            return this;
        }
        public Boolean getModifyTimeYear() {
            return this.modifyTimeYear;
        }

    }

    public static class ConfigureSynchronizationJobRequestSourceEndpoint extends TeaModel {
        /**
         * <p>The name of the database to which the synchronization object in the source instance belongs.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The IP address of the source database.</p>
         * <br>
         * <p>>  You must specify this parameter only if the **SourceEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the source instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the source instance. Valid values:</p>
         * <br>
         * <p>*   **RDS**: ApsaraDB RDS instance</p>
         * <p>*   **Redis**: ApsaraDB for Redis instance</p>
         * <p>*   **PolarDB**: PolarDB for MySQL cluster or PolarDB O Edition cluster</p>
         * <p>*   **ECS**: self-managed database that is hosted on Elastic Compute Service (ECS)</p>
         * <p>*   **Express**: self-managed database that is connected over Express Connect</p>
         * <p>*   **dg**: self-managed database that is connected over Database Gateway</p>
         * <p>*   **cen**: self-managed database that is connected over Cloud Enterprise Network (CEN)</p>
         * <br>
         * <p>>  The default value is **RDS**.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the source RDS instance.</p>
         * <br>
         * <p>>  You can specify this parameter to synchronize data across different Alibaba Cloud accounts. In this case, you also need to specify the **SourceEndpoint.Role** parameter.</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The password of the source database account.</p>
         * <br>
         * <p>>  You must specify this parameter only if the **SourceEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the source database.</p>
         * <br>
         * <p>>  You must specify this parameter only if the **SourceEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.</p>
         * <br>
         * <p>>  You must specify this parameter when you synchronize data across different Alibaba Cloud accounts. For information about the permissions and authorization methods of the RAM role, see [Configure RAM authorization for cross-account data migration and synchronization](~~48468~~).</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The database account of the source database.</p>
         * <br>
         * <p>> </p>
         * <p>*   You must specify this parameter only if the **SourceEndpoint.InstanceType** parameter is set to **ECS**, **Express**, **dg**, or **cen**.</p>
         * <p>*   If the **SourceEndpoint.InstanceType** parameter is set to **Redis**, you do not need to specify the database account.</p>
         * <p>*   The permissions that are required for database accounts vary with the synchronization scenario. For more information, see [Overview of data synchronization scenarios](~~140954~~).</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ConfigureSynchronizationJobRequestSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSynchronizationJobRequestSourceEndpoint self = new ConfigureSynchronizationJobRequestSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}

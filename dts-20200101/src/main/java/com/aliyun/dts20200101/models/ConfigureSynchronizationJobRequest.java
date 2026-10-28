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
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter will be deprecated soon.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The synchronization checkpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>1610540493</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>Specifies whether to perform initial full data synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>true</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataInitialization")
    public Boolean dataInitialization;

    /**
     * <p>The reserved parameter for DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, such as whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
     * <blockquote>
     * <p>For example, you can use this parameter for data synchronization between Redis Enterprise instances. For more information, see <a href="https://help.aliyun.com/document_detail/155967.html">Call OpenAPI operations to configure one-way or two-way data synchronization between Redis Enterprise instances</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;autoStartModulesAfterConfig&quot;: &quot;none&quot;,     &quot;targetTableMode&quot;: 2 }</p>
     */
    @NameInMap("MigrationReserved")
    public String migrationReserved;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region where the data synchronization instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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

    /**
     * <p>Specifies whether to perform initial schema synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>true</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StructureInitialization")
    public Boolean structureInitialization;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong>: Forward synchronization.</li>
     * <li><strong>Reverse</strong>: Reverse synchronization.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>Forward</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>This parameter takes effect only when the synchronization topology of the data synchronization instance is two-way synchronization and the value is set to <strong>Reverse</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>The ID of the data synchronization instance. You can call the <a href="https://help.aliyun.com/document_detail/49454.html">DescribeSynchronizationJobs</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsz4ao1dor13d****</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    /**
     * <p>The name of the synchronization task.</p>
     * <blockquote>
     * <p>Specify a descriptive name that is easy to identify. The name does not need to be unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MySQL synchronization</p>
     */
    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    /**
     * <p>The objects to be synchronized. The value is a JSON string and supports specific regular expressions. For more information, see <a href="https://help.aliyun.com/document_detail/141901.html">Configure synchronization objects</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;DBName&quot;:&quot;dtstestdata&quot;,&quot;TableIncludes&quot;:[{&quot;TableName&quot;:&quot;customer&quot;}]}]</p>
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

    public ConfigureSynchronizationJobRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
         * <p>The name of the database to which the synchronization objects in the destination instance belong.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DataBaseName")
        public String dataBaseName;

        /**
         * <p>The IP address of the destination database.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The instance ID of the destination instance for synchronization.</p>
         * <blockquote>
         * <p>When the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong> or <strong>DataHub</strong>, set this parameter to the name of the MaxCompute project or DataHub project.
         * If the destination instance is an Alibaba Cloud AnalyticDB for MySQL database, set this parameter to the cluster ID of the AnalyticDB for MySQL database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1r46452ai50****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The destination instance type. Valid values:</p>
         * <ul>
         * <li><strong>Redis</strong>: Alibaba Cloud Redis instance.</li>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance.</li>
         * <li><strong>PolarDB</strong>: PolarDB cluster (only MySQL or Oracle-compatible engines are supported).</li>
         * <li><strong>ECS</strong>: Self-managed database hosted on ECS.</li>
         * <li><strong>Express</strong>: Self-managed database connected over Express Connect.</li>
         * <li><strong>DataHub</strong>: DataHub instance.</li>
         * <li><strong>MaxCompute</strong>: MaxCompute instance.</li>
         * <li><strong>AnalyticDB</strong>: AnalyticDB for MySQL 3.0 and 2.0.</li>
         * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL.</li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>RDS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The password of the database account for the destination database.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test654321</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the destination database.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The database account of the destination database.</p>
         * <blockquote>
         * <ul>
         * <li>The permissions required for synchronizing different databases vary. For more information, see the corresponding configuration examples in <a href="https://help.aliyun.com/document_detail/140954.html">Overview of DTS data synchronization solutions</a>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>This parameter is required when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</li>
         * <li>This parameter and the <strong>DestinationEndpoint.Password</strong> parameter are not required when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>RDS</strong> and the database engine version is MySQL 5.5 or MySQL 5.6.</li>
         * <li>This parameter is not required when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>Redis</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dtstestaccount</p>
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
         * <p>Specifies whether the incremental log table contains partitions defined by the day of the incremental update time. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p>This parameter is available only when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Day")
        public Boolean modifyTimeDay;

        /**
         * <p>Specifies whether the incremental log table contains partitions defined by the hour of the incremental update time. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p>This parameter is available only when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Hour")
        public Boolean modifyTimeHour;

        /**
         * <p>Specifies whether the incremental log table contains partitions defined by the minute of the incremental update time. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p>This parameter is available only when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Minute")
        public Boolean modifyTimeMinute;

        /**
         * <p>Specifies whether the incremental log table contains partitions defined by the month of the incremental update time. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p>This parameter is available only when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Month")
        public Boolean modifyTimeMonth;

        /**
         * <p>Specifies whether the incremental log table contains partitions defined by the year of the incremental update time. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p>This parameter is available only when the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The name of the database to which the synchronization objects in the source instance belong.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The IP address of the source database.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The instance ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1i99e8l7913****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the source instance. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance.</li>
         * <li><strong>Redis</strong>: Alibaba Cloud Redis instance.</li>
         * <li><strong>PolarDB</strong>: PolarDB cluster (only MySQL or Oracle-compatible engines are supported).</li>
         * <li><strong>ECS</strong>: Self-managed database hosted on Elastic Compute Service (ECS).</li>
         * <li><strong>Express</strong>: Self-managed database connected over Express Connect.</li>
         * <li><strong>dg</strong>: Self-managed database connected over Database Gateway.</li>
         * <li><strong>cen</strong>: Self-managed database connected over Cloud Enterprise Network (CEN).</li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>RDS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The Alibaba Cloud account ID to which the source ApsaraDB RDS instance belongs.</p>
         * <blockquote>
         * <p>Specifying this parameter indicates that cross-Alibaba Cloud account data synchronization is executed. You must also specify the <strong>SourceEndpoint.Role</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The password of the database account for the source database.</p>
         * <blockquote>
         * <p>This parameter is required only when the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the source database.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The name of the RAM role configured for the Alibaba Cloud account to which the source instance belongs.</p>
         * <blockquote>
         * <p>This parameter is required for cross-account data synchronization. For more information about the permissions required for the role and how to grant the permissions, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration or synchronization</a>.</p>
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
         * <ul>
         * <li>This parameter is available and required only when the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>This parameter is not required when the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>Redis</strong>.</li>
         * <li>The permissions required for synchronizing different databases vary. For more information, see the corresponding configuration examples in <a href="https://help.aliyun.com/document_detail/140954.html">Overview of DTS data synchronization solutions</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dtstestaccount</p>
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

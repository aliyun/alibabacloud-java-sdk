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
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * <blockquote>
     * <p> Default value: <strong>true</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataInitialization")
    public Boolean dataInitialization;

    /**
     * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, for example, whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
     * <blockquote>
     * <p> This parameter can be used for data synchronization between ApsaraDB for Redis Enterprise Edition instances. For more information, see <a href="https://help.aliyun.com/document_detail/155967.html">Use OpenAPI Explorer to configure one-way or two-way data synchronization between ApsaraDB for Redis Enterprise Edition instances</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;autoStartModulesAfterConfig&quot;: &quot;none&quot;,     &quot;targetTableMode&quot;: 2 }</p>
     */
    @NameInMap("MigrationReserved")
    public String migrationReserved;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to perform initial schema synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * <blockquote>
     * <p> Default value: <strong>true</strong>.</p>
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
     * <li><strong>Forward</strong></li>
     * <li><strong>Reverse</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Default value: <strong>Forward</strong>.</li>
     * <li>The value <strong>Reverse</strong> takes effect only if the topology of the data synchronization instance is two-way synchronization.</li>
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
     * <p>The name of the data synchronization task.</p>
     * <blockquote>
     * <p> We recommend that you specify an informative name for easy identification. You do not need to use a unique task name.</p>
     * </blockquote>
     */
    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    /**
     * <p>The objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see <a href="https://help.aliyun.com/document_detail/141901.html">SynchronizationObjects</a>.</p>
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
         * <p>The name of the database to which the synchronization object in the destination instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DataBaseName")
        public String dataBaseName;

        /**
         * <p>The IP address of the destination database.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</p>
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
         * <p> If the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong> or <strong>DataHub</strong>, you must specify the name of the MaxCompute project or the DataHub project.</p>
         * </blockquote>
         * <p>If the destination instance is an AnalyticDB for MySQL cluster, specify the ID of the AnalyticDB for MySQL cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1r46452ai50****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the destination instance. Valid values:</p>
         * <ul>
         * <li><strong>Redis</strong>: ApsaraDB for Redis instance</li>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
         * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster or PolarDB O Edition cluster</li>
         * <li><strong>ECS</strong>: self-managed database that is hosted on ECS</li>
         * <li><strong>Express</strong>: self-managed database that is connected over Express Connect</li>
         * <li><strong>DataHub</strong>: DataHub project</li>
         * <li><strong>MaxCompute</strong>: MaxCompute project</li>
         * <li><strong>AnalyticDB</strong>: AnalyticDB for MySQL cluster V3.0 or V2.0</li>
         * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL instance</li>
         * </ul>
         * <blockquote>
         * <p> The default value is <strong>RDS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The password of the destination database account.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>, you must specify the DestinationEndpoint.Password parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Test654321</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the destination database.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</p>
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
         * </blockquote>
         * <ul>
         * <li>The permissions that are required for database accounts vary with the synchronization scenario. For more information, see <a href="https://help.aliyun.com/document_detail/140954.html">Overview of data synchronization scenarios</a>.</li>
         * <li>If the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>, you must specify the DestinationEndpoint.UserName parameter.</li>
         * <li>If the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to RDS and the database version is MySQL 5.5 or MySQL 5.6, you do not need to specify the DestinationEndpoint.UserName and <strong>DestinationEndpoint.Password</strong> parameters.</li>
         * <li>If the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>Redis</strong>, you do not need to specify the DestinationEndpoint.UserName parameter.</li>
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
         * <p>Specifies whether the incremental data table contains partitions defined by the modifytime_day field. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p> This parameter is available only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Day")
        public Boolean modifyTimeDay;

        /**
         * <p>Specifies whether the incremental data table contains partitions defined by the modifytime_hour field. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p> This parameter is available only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Hour")
        public Boolean modifyTimeHour;

        /**
         * <p>Specifies whether the incremental data table contains partitions defined by the modifytime_minute field. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p> This parameter is available only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Minute")
        public Boolean modifyTimeMinute;

        /**
         * <p>Specifies whether the incremental data table contains partitions defined by the modifytime_month field. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p> This parameter is available only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Month")
        public Boolean modifyTimeMonth;

        /**
         * <p>Specifies whether the incremental data table contains partitions defined by the modifytime_year field. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p> This parameter is available only if the <strong>DestinationEndpoint.InstanceType</strong> parameter is set to <strong>MaxCompute</strong>.</p>
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
         * <p>The name of the database to which the synchronization object in the source instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The IP address of the source database.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1i99e8l7913****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the source instance. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
         * <li><strong>Redis</strong>: ApsaraDB for Redis instance</li>
         * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster or PolarDB O Edition cluster</li>
         * <li><strong>ECS</strong>: self-managed database that is hosted on Elastic Compute Service (ECS)</li>
         * <li><strong>Express</strong>: self-managed database that is connected over Express Connect</li>
         * <li><strong>dg</strong>: self-managed database that is connected over Database Gateway</li>
         * <li><strong>cen</strong>: self-managed database that is connected over Cloud Enterprise Network (CEN)</li>
         * </ul>
         * <blockquote>
         * <p> The default value is <strong>RDS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the source RDS instance.</p>
         * <blockquote>
         * <p> You can specify this parameter to synchronize data across different Alibaba Cloud accounts. In this case, you also need to specify the <strong>SourceEndpoint.Role</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The password of the source database account.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</p>
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
         * <p> You must specify this parameter only if the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.</p>
         * <blockquote>
         * <p> You must specify this parameter when you synchronize data across different Alibaba Cloud accounts. For information about the permissions and authorization methods of the RAM role, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration and synchronization</a>.</p>
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
         * </blockquote>
         * <ul>
         * <li>You must specify this parameter only if the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>Express</strong>, <strong>dg</strong>, or <strong>cen</strong>.</li>
         * <li>If the <strong>SourceEndpoint.InstanceType</strong> parameter is set to <strong>Redis</strong>, you do not need to specify the database account.</li>
         * <li>The permissions that are required for database accounts vary with the synchronization scenario. For more information, see <a href="https://help.aliyun.com/document_detail/140954.html">Overview of data synchronization scenarios</a>.</li>
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

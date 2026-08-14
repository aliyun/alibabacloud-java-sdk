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
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because it will be discontinued.</p>
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
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
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
     * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, such as specifying whether to automatically start the precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
     * <blockquote>
     * <p>For example, you can use this parameter for data synchronization between ApsaraDB for Redis Enhanced Edition (Tair) instances. For more information, see <a href="https://help.aliyun.com/document_detail/155967.html">Use OpenAPI to configure one-way or bidirectional data synchronization between ApsaraDB for Redis Enhanced Edition instances</a>.</p>
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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to perform initial schema synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
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
     * <li><strong>Forward</strong>: forward.</li>
     * <li><strong>Reverse</strong>: reverse.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>Forward</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>This parameter takes effect only if you set it to <strong>Reverse</strong> and the synchronization topology of the data synchronization instance is two-way synchronization.</li>
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
     * <p>Specify a descriptive name that makes it easy to identify the task. It does not need to be unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MySQL同步</p>
     */
    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    /**
     * <p>The objects to be synchronized. The value is a JSON string and supports certain regular expressions. For more information, see <a href="https://help.aliyun.com/document_detail/141901.html">Synchronization object configuration</a>.</p>
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
         * <p>目标实例中的同步对象所属数据库名称。</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DataBaseName")
        public String dataBaseName;

        /**
         * <p>目标库的IP地址。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数必须传入本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>同步目标实例的实例ID</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>MaxCompute</strong>或<strong>DataHub</strong>时，本参数传入MaxCompute实例或DataHub的Project名称。
         * 当目标实例为阿里云分析型数据库MySQL版时，传入分析型数据库MySQL版的集群ID。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1r46452ai50****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>目标实例类型，取值为：</p>
         * <ul>
         * <li><strong>Redis</strong>：阿里云Redis实例。</li>
         * <li><strong>RDS</strong>：阿里云RDS实例。</li>
         * <li><strong>PolarDB</strong>：阿里云PolarDB集群（仅支持MySQL或兼容Oracle语法的引擎）。</li>
         * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
         * <li><strong>Express</strong>：通过专线接入的本地数据库。</li>
         * <li><strong>DataHub</strong>：阿里云DataHub实例。</li>
         * <li><strong>MaxCompute</strong>：阿里云MaxCompute实例。</li>
         * <li><strong>AnalyticDB</strong>：云原生数据仓库AnalyticDB MySQL  3.0和2.0版本。</li>
         * <li><strong>Greenplum</strong>：云原生数据仓库ADB PostgreSQL版（原分析型数据库PostgreSQL版）。</li>
         * </ul>
         * <blockquote>
         * <p>默认取值为<strong>RDS</strong>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>目标库数据库账号密码。</p>
         * <blockquote>
         * <ul>
         * <li>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数必须传入。</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test654321</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>目标库的数据库服务端口。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>目标库的数据库账号。</p>
         * <blockquote>
         * <ul>
         * <li>同步不同的数据库所需的权限有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/140954.html">DTS数据同步方案概览</a>中对应的配置案例。</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数必须传入。</li>
         * <li>当<strong>DestinationEndpoint.InstanceType</strong>取值为RDS且数据库版本为MySQL 5.5或MySQL 5.6，无需传入本参数和<strong>DestinationEndpoint.Password</strong>参数。</li>
         * <li>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>Redis</strong>时，无需传入本参数。</li>
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
         * <p>设置增量日志表是否包含以增量更新时间对应日期信息定义的分区，取值：<strong>true</strong>或<strong>false</strong>。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>参数取值为<strong>Maxcompute</strong>时，本参数才可用。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Day")
        public Boolean modifyTimeDay;

        /**
         * <p>设置增量日志表是否包含以增量更新时间对应小时信息定义的分区，取值：<strong>true</strong>或<strong>false</strong>。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>参数取值为<strong>Maxcompute</strong>时，本参数才可用。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Hour")
        public Boolean modifyTimeHour;

        /**
         * <p>设置增量日志表是否包含以增量更新时间对应分钟信息定义的分区，取值：<strong>true</strong>或<strong>false</strong>。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>参数取值为<strong>Maxcompute</strong>时，本参数才可用。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Minute")
        public Boolean modifyTimeMinute;

        /**
         * <p>设置增量日志表是否包含以增量更新时间对应月份信息定义的分区，取值：<strong>true</strong>或<strong>false</strong>。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>参数取值为<strong>Maxcompute</strong>时，本参数才可用。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifyTime_Month")
        public Boolean modifyTimeMonth;

        /**
         * <p>设置增量日志表是否包含以增量更新时间对应年份信息定义的分区，取值：<strong>true</strong>或<strong>false</strong>。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>参数取值为<strong>Maxcompute</strong>时，本参数才可用。</p>
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
         * <p>源实例中的同步对象所属数据库名称。</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>源库的IP地址。</p>
         * <blockquote>
         * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>源实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1i99e8l7913****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>源实例类型，取值为：</p>
         * <ul>
         * <li><strong>RDS</strong>：阿里云RDS实例。</li>
         * <li><strong>Redis</strong>：阿里云Redis实例。</li>
         * <li><strong>PolarDB</strong>：阿里云PolarDB集群（仅支持MySQL或兼容Oracle语法的引擎）。</li>
         * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
         * <li><strong>Express</strong>：通过专线接入的自建数据库。</li>
         * <li><strong>dg</strong>：通过数据库网关DG接入的自建数据库。</li>
         * <li><strong>cen</strong>：通过云企业网CEN接入的自建数据库。</li>
         * </ul>
         * <blockquote>
         * <p>默认取值为<strong>RDS</strong>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>源RDS实例所属的阿里云账号ID。</p>
         * <blockquote>
         * <p>传入本参数即代表执行跨阿里云账号的数据同步，同时您还需要传入<strong>SourceEndpoint.Role</strong>参数。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>源库数据库账号密码。</p>
         * <blockquote>
         * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>源库的数据库服务端口。</p>
         * <blockquote>
         * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>源实例所属云账号配置的角色名称。</p>
         * <blockquote>
         * <p>执行跨阿里云账号的数据同步时须传入本参数，该角色所需的权限及授权方式请参见<a href="https://help.aliyun.com/document_detail/48468.html">跨阿里云账号数据迁移或同步时如何配置RAM授权</a>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>源库的数据库账号。</p>
         * <blockquote>
         * <ul>
         * <li>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数才可用且必须传入。</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>Redis</strong>时，本参数无需传入。</li>
         * <li>同步不同的数据库所需的权限有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/140954.html">DTS数据同步方案概览</a>中对应的配置案例。</li>
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

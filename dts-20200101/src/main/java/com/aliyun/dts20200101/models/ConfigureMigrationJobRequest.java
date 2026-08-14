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
     * <p>The Alibaba Cloud account ID. You do not need to specify this parameter because it will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The start position of incremental data migration. The value is a UNIX timestamp in seconds.</p>
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
     * <p>The name of the migration task. The name can be up to 32 characters in length. Specify a descriptive name for easy identification. Uniqueness is not required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL_TO_RDS</p>
     */
    @NameInMap("MigrationJobName")
    public String migrationJobName;

    /**
     * <p>The objects to be migrated. The value is a JSON string that supports regular expressions. For more information, see <a href="~141901~">Migration object configuration</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;DBName&quot;:&quot;dtstestdata&quot;,&quot;TableIncludes&quot;:[{&quot;TableName&quot;:&quot;customer&quot;}]}]</p>
     */
    @NameInMap("MigrationObject")
    public String migrationObject;

    /**
     * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, such as whether to automatically start the precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;autoStartModulesAfterConfig&quot;: &quot;none&quot;,     &quot;targetTableMode&quot;: 2 }</p>
     */
    @NameInMap("MigrationReserved")
    public String migrationReserved;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The region ID of the data migration instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
     * <p>The resource group ID.</p>
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
         * <p>待迁入的数据库名称或鉴权数据库名称。 </p>
         * <blockquote>
         * <ul>
         * <li>当<strong>DestinationEndpoint.EngineName</strong>取值为<strong>PostgreSQL</strong>、<strong>DRDS</strong>或<strong>MongoDB</strong>时，本参数才可用且必须传入。</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>当<strong>DestinationEndpoint.EngineName</strong>取值为<strong>PostgreSQL</strong>或<strong>DRDS</strong>时，传入待迁移的数据库名称；取值为<strong>MongoDB</strong>时，传入数据库账号的鉴权数据库名称。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dtstestdatabase</p>
         */
        @NameInMap("DataBaseName")
        public String dataBaseName;

        /**
         * <p>目标库的数据库类型。取值：<strong>MySQL</strong>、<strong>DRDS</strong>、<strong>SQLServer</strong>、<strong>PostgreSQL</strong>、<strong>PPAS</strong>、<strong>MongoDB</strong>、<strong>Redis</strong>、<strong>POLARDB</strong>、<strong>polardb_pg</strong></p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>RDS</strong>、<strong>POLARDB</strong>、<strong>ECS</strong>、<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>目标库的连接地址。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>目标实例ID。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>RDS</strong>、<strong>ECS</strong>、<strong>MongoDB</strong>、<strong>Redis</strong>、<strong>DRDS</strong>、<strong>PetaData</strong>、<strong>OceanBase</strong>、<strong>POLARDB</strong>、<strong>PolarDB_o</strong>、<strong>AnalyticDB</strong>或<strong>Greenplum</strong>时，本参数才可用且必须传入对应的实例ID（例如取值为<strong>ECS</strong>，则需要传入ECS实例ID）。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1r46452ai50****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>目标库的实例类型，取值：</p>
         * <ul>
         * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
         * <li><strong>LocalInstance</strong>：有公网IP的自建数据库。</li>
         * <li><strong>RDS</strong>：阿里云RDS实例。</li>
         * <li><strong>DRDS</strong>：阿里云PolarDB-X实例。</li>
         * <li><strong>MongoDB</strong>：阿里云MongoDB实例。</li>
         * <li><strong>Redis</strong>：阿里云Redis实例。</li>
         * <li><strong>PetaData</strong>：阿里云HybridDB for MySQL实例。</li>
         * <li><strong>POLARDB</strong>：阿里云PolarDB MySQL、PolarDB PostgreSQL。</li>
         * <li><strong>PolarDB_o</strong>：阿里云PolarDB O引擎集群。</li>
         * <li><strong>AnalyticDB</strong>：阿里云云原生数据仓库AnalyticDB MySQL 3.0和2.0版本。</li>
         * <li><strong>Greenplum</strong>：阿里云云原生数据仓库AnalyticDB PostgreSQL。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Oracle数据库的SID信息。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.EngineName</strong>取值为<strong>Oracle</strong>，且<strong>Oracle</strong>数据库为非RAC实例时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>目标库数据库账号的密码。</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>目标库的服务端口。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>目标库所属的地域ID。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>LocalInstance</strong>时，您可以传入<strong>cn-hangzhou</strong>或者离自建数据库地物理距离最近的地域ID，详情请参见<a href="https://help.aliyun.com/document_detail/141033.html">支持的地域列表</a>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>目标库的数据库账号。</p>
         * <p>说明 迁移不同的数据库所需的权限有所差异，详情请参见迁移方案概览中对应的配置案例。</p>
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
         * <p>是否进行全量数据迁移，取值：</p>
         * <ul>
         * <li><strong>true</strong>：是。</li>
         * <li><strong>false</strong>：否。</li>
         * </ul>
         * <blockquote>
         * <p>DTS对全量数据迁移的支持情况因数据库类型不同而有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/26618.html">支持的数据库和迁移类型</a>。</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataIntialization")
        public Boolean dataIntialization;

        /**
         * <p>是否进行增量数据迁移，取值：</p>
         * <ul>
         * <li><strong>true</strong>：是。</li>
         * <li><strong>false</strong>：否。</li>
         * </ul>
         * <blockquote>
         * <p>DTS对增量数据迁移的支持情况因数据库类型不同而有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/26618.html">支持的数据库和迁移类型</a>。</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>是否进行结构迁移，取值：</p>
         * <ul>
         * <li><strong>true</strong>：是。</li>
         * <li><strong>false</strong>：否。</li>
         * </ul>
         * <blockquote>
         * <p>DTS对结构迁移的支持情况因数据库类型不同而有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/26618.html">支持的数据库和迁移类型</a>。</p>
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
         * <p>待迁移的数据库名称或鉴权数据库名称。</p>
         * <blockquote>
         * <ul>
         * <li>当<strong>SourceEndpoint.EngineName</strong>取值为<strong>PostgreSQL</strong>或<strong>MongoDB</strong>时，本参数才可用且必须传入。</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>当<strong>SourceEndpoint.EngineName</strong>取值为<strong>PostgreSQL</strong>时，传入待迁移的数据库名称；取值为<strong>MongoDB</strong>时，传入数据库账号的鉴权数据库名称。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dtstestdatabase</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>源库的数据库类型，取值：<strong>MySQL</strong>、<strong>TiDB</strong>、<strong>SQLServer</strong>、<strong>PostgreSQL</strong>、<strong>Oracle</strong>、<strong>MongoDB</strong>、<strong>Redis</strong>、<strong>POLARDB</strong>、<strong>polardb_pg</strong>。</p>
         * <blockquote>
         * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>RDS</strong>、<strong>POLARDB</strong>、<strong>ECS</strong>、<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>源库的连接地址。</p>
         * <blockquote>
         * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>源库的实例ID。</p>
         * <blockquote>
         * <ul>
         * <li>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>RDS</strong>、<strong>ECS</strong>、<strong>Express</strong>、<strong>MongoDB</strong>、<strong>POLARDB</strong>或<strong>PolarDB_o</strong>时，本参数才可用且必须传入对应的实例ID（例如取值为<strong>ECS</strong>，则本参数传入ECS实例的ID）。</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>Express</strong>时，本参数传入VPC ID（即专有网络ID）。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bp-rmxxxxxxxx</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>源库的实例类型，取值：</p>
         * <ul>
         * <li><strong>RDS</strong>：阿里云RDS实例。</li>
         * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
         * <li><strong>LocalInstance</strong>：有公网IP的自建数据库。</li>
         * <li><strong>Express</strong>：通过专线/VPN网关/智能接入网关接入的自建数据库。</li>
         * <li><strong>dg</strong>：通过数据库网关DG接入的自建数据库。</li>
         * <li><strong>cen</strong>：通过云企业网CEN接入的自建数据库。</li>
         * <li><strong>MongoDB</strong>：阿里云MongoDB实例。</li>
         * <li><strong>POLARDB</strong>：阿里云PolarDB MySQL、PolarDB PostgreSQL。</li>
         * <li><strong>PolarDB_o</strong>：阿里云PolarDB O引擎集群。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Oracle数据库的SID信息。</p>
         * <blockquote>
         * <p>当<strong>SourceEndpoint.EngineName</strong>取值为<strong>Oracle</strong>，且Oracle数据库为非RAC实例时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>源实例所属的阿里云账号ID。</p>
         * <blockquote>
         * <p>仅在配置跨阿里云账号的数据迁移时本参数才可用，且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>源库数据库账号对应的密码。</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>源库的服务端口。</p>
         * <blockquote>
         * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>LocalInstance</strong>或<strong>Express</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>源库所属的地域ID。</p>
         * <blockquote>
         * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>LocalInstance</strong>时，您可以传入<strong>cn-hangzhou</strong>或者离自建数据库地物理距离最近的地域ID，详情请参见<a href="https://help.aliyun.com/document_detail/141033.html">支持的地域列表</a>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>当源实例与目标实例所属阿里云账号不同时，需传入该参数，来指定源实例的授权角色，以允许目标实例阿里云账号访问源实例的实例信息。</p>
         * <blockquote>
         * <p>角色所需的权限及授权方式，请参见<a href="https://help.aliyun.com/document_detail/48468.html">跨阿里云账号数据迁移或同步时如何配置RAM授权</a>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>源库的数据库账号。</p>
         * <p>说明 迁移不同的数据库所需的权限有所差异，详情请参见迁移方案概览中对应的配置案例。</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceResponseBody extends TeaModel {
    /**
     * <p>The UID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>164901546557****</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>The ID of the vSwitch in the arbiter zone for the multi-zone instance. The vSwitch must be deployed in the zone that is specified by <code>ArbiterZoneId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6664pqjawb87k36****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>The arbiter zone ID of the multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-g</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>The deployment architecture. Valid values:</p>
     * <ul>
     * <li><p><strong>1.0</strong>: single-zone deployment.</p>
     * </li>
     * <li><p><strong>2.0</strong>: multi-zone deployment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("ArchVersion")
    public String archVersion;

    /**
     * <p>The billable storage capacity of the archive storage. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>0GB</p>
     */
    @NameInMap("ArchiveStorage")
    public Integer archiveStorage;

    /**
     * <p>Indicates whether auto-renewal is enabled for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The ID of the backup instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-xxxx</p>
     */
    @NameInMap("BackupInstance")
    public String backupInstance;

    /**
     * <p>The capacity of the cold storage.</p>
     * 
     * <strong>example:</strong>
     * <p>0GB</p>
     */
    @NameInMap("ColdStorage")
    public Integer coldStorage;

    /**
     * <p>The disk type of the core nodes in a multi-zone instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cloud_efficiency</strong>: Standard.</p>
     * </li>
     * <li><p><strong>cloud_ssd</strong>: Performance.</p>
     * </li>
     * <li><p><strong>cloud_essd</strong>: ESSD.</p>
     * </li>
     * <li><p><strong>cloud_essd_pl0</strong>: ESSD PL0.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("CoreDiskCategory")
    public String coreDiskCategory;

    /**
     * <p>The number of core nodes in the multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CoreNum")
    public Integer coreNum;

    /**
     * <p>The storage capacity of a single core node in the multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CoreSingleStorage")
    public Integer coreSingleStorage;

    /**
     * <p>The specification of the core nodes in the multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("CoreSpec")
    public String coreSpec;

    /**
     * <p>The time at which the instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1627290664000</p>
     */
    @NameInMap("CreateMilliseconds")
    public Long createMilliseconds;

    /**
     * <p>The time at which the instance was created. The time is displayed in the <strong>yyyy-MM-dd HH:mm:ss</strong> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-26 17:10:26</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether release protection is enabled for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public String deletionProtection;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li><p><strong>cloud_efficiency</strong>: Standard.</p>
     * </li>
     * <li><p><strong>cloud_ssd</strong>: Performance.</p>
     * </li>
     * <li><p><strong>cloud_essd</strong>: Enhanced SSD (ESSD).</p>
     * </li>
     * <li><p><strong>cloud_essd_pl0</strong>: ESSD PL0.</p>
     * </li>
     * <li><p><strong>capacity_cloud_storage</strong>: Capacity.</p>
     * </li>
     * <li><p><strong>local_ssd_pro</strong>: local SSD.</p>
     * </li>
     * <li><p><strong>local_hdd_pro</strong>: local HDD.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The disk space threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>80%</p>
     */
    @NameInMap("DiskThreshold")
    public String diskThreshold;

    /**
     * <p>The disk usage.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0%</p>
     */
    @NameInMap("DiskUsage")
    public String diskUsage;

    /**
     * <p>Indicates whether LBlob is enabled. Valid values:</p>
     * <p>true: Enabled. false: Disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBlob")
    public Boolean enableBlob;

    /**
     * <p>Indicates whether Change Data Capture (CDC) is enabled for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCdc")
    public Boolean enableCdc;

    /**
     * <p>Indicates whether the compute engine is enabled for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCompute")
    public Boolean enableCompute;

    /**
     * <p>Indicates whether Key Management Service (KMS) is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableKms")
    public Boolean enableKms;

    /**
     * <p>Specifies whether the wide table engine supports the Thrift and CQL protocols. If this feature is disabled, you can call the SwitchLProxyService operation to enable it.</p>
     * <p>true: Supported.</p>
     * <p>false: Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("EnableLProxy")
    public Boolean enableLProxy;

    /**
     * <p>Indicates whether the LTS engine is enabled for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLTS")
    public Boolean enableLTS;

    /**
     * <p>Indicates whether LindormSQL V3.0, which is compatible with the MySQL protocol, is supported by the wide table engine.
     * This feature is supported by default on instances created after October 24, 2023. For existing instances, contact technical support to enable this feature.</p>
     * <ul>
     * <li><p>true: Supported.</p>
     * </li>
     * <li><p>false: Not supported.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableLsqlVersionV3")
    public Boolean enableLsqlVersionV3;

    /**
     * <p>Indicates whether the ML node is enabled. Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("EnableMLCtrl")
    public Boolean enableMLCtrl;

    /**
     * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSSL")
    public Boolean enableSSL;

    /**
     * <p>Indicates whether the History Server is enabled for the compute engine.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableShs")
    public Boolean enableShs;

    /**
     * <p>Indicates whether Transparent Data Encryption (TDE) is enabled. Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableStoreTDE")
    public Boolean enableStoreTDE;

    /**
     * <p>Indicates whether the stream engine is enabled for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableStream")
    public Boolean enableStream;

    /**
     * <p>The information about the engines.</p>
     */
    @NameInMap("EngineList")
    public java.util.List<GetLindormInstanceResponseBodyEngineList> engineList;

    /**
     * <p>The types of the engines that are supported by the instance. The value of this parameter is the sum of the values of all supported engine types.</p>
     * <ul>
     * <li><p>1: search engine</p>
     * </li>
     * <li><p>2: time series engine</p>
     * </li>
     * <li><p>4: wide table engine</p>
     * </li>
     * <li><p>8: file engine</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For example, if the value of this parameter is 15, it indicates that the instance supports the search, time series, wide table, and file engines because 1 + 2 + 4 + 8 = 15. If the value of this parameter is 6, it indicates that the instance supports the time series and wide table engines because 2 + 4 = 6.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("EngineType")
    public Integer engineType;

    /**
     * <p>The expiration time of the instance. The time is displayed in the <strong>yyyy-MM-dd HH:mm:ss</strong> format.</p>
     * <blockquote>
     * <p>This parameter is returned only for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-08-27 00:00:00</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The expiration time of the instance. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1629993600000</p>
     */
    @NameInMap("ExpiredMilliseconds")
    public Long expiredMilliseconds;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test0726</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1o3y0yme2i2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>CREATING</strong>: The instance is being created.</p>
     * </li>
     * <li><p><strong>ACTIVATION</strong>: The instance is running.</p>
     * </li>
     * <li><p><strong>COLD_EXPANDING</strong>: The capacity of the cold storage is being expanded.</p>
     * </li>
     * <li><p><strong>MINOR_VERSION_TRANSITIONING</strong>: The minor version of the instance is being changed.</p>
     * </li>
     * <li><p><strong>RESIZING</strong>: The number of nodes is being changed.</p>
     * </li>
     * <li><p><strong>SHRINKING</strong>: The number of nodes is being changed.</p>
     * </li>
     * <li><p><strong>CLASS_CHANGING</strong>: The specification of the instance is being changed.</p>
     * </li>
     * <li><p><strong>SSL_SWITCHING</strong>: SSL is being enabled or disabled.</p>
     * </li>
     * <li><p><strong>CDC_OPENING</strong>: The CDC feature is being enabled.</p>
     * </li>
     * <li><p><strong>TRANSFER</strong>: Data is being migrated.</p>
     * </li>
     * <li><p><strong>DATABASE_TRANSFER</strong>: Data is being migrated.</p>
     * </li>
     * <li><p><strong>GUARD_CREATING</strong>: A disaster recovery instance is being created.</p>
     * </li>
     * <li><p><strong>BACKUP_RECOVERING</strong>: Data is being restored from a backup.</p>
     * </li>
     * <li><p><strong>DATABASE_IMPORTING</strong>: Data is being imported.</p>
     * </li>
     * <li><p><strong>NET_MODIFYING</strong>: The network type is being changed.</p>
     * </li>
     * <li><p><strong>NET_SWITCHING</strong>: The network is being switched.</p>
     * </li>
     * <li><p><strong>NET_CREATING</strong>: A network connection is being created.</p>
     * </li>
     * <li><p><strong>NET_DELETING</strong>: A network connection is being deleted.</p>
     * </li>
     * <li><p><strong>DELETING</strong>: The instance is being deleted.</p>
     * </li>
     * <li><p><strong>RESTARTING</strong>: The instance is being restarted.</p>
     * </li>
     * <li><p><strong>LOCKED</strong>: The instance is locked.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The storage capacity of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>480</p>
     */
    @NameInMap("InstanceStorage")
    public String instanceStorage;

    /**
     * <p>The disk type of the log nodes in the multi-zone instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cloud_efficiency</strong>: Standard.</p>
     * </li>
     * <li><p><strong>cloud_ssd</strong>: Performance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("LogDiskCategory")
    public String logDiskCategory;

    /**
     * <p>The number of log nodes in the multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogNum")
    public Integer logNum;

    /**
     * <p>The storage capacity of a single log node in the multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>400GB</p>
     */
    @NameInMap("LogSingleStorage")
    public Integer logSingleStorage;

    /**
     * <p>The specification of the log nodes in the multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm.sn1.large</p>
     */
    @NameInMap("LogSpec")
    public String logSpec;

    /**
     * <p>The end time of the maintenance window.</p>
     * 
     * <strong>example:</strong>
     * <p>20:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the maintenance window.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <p>The combination of zones. For more information about the supported zone combinations, see the instance buy page.</p>
     * <ul>
     * <li><p><strong>ap-southeast-5abc-aliyun</strong>: Indonesia (Jakarta) Zone A, B, and C.</p>
     * </li>
     * <li><p><strong>cn-hangzhou-ehi-aliyun</strong>: China (Hangzhou) Zone E, H, and I.</p>
     * </li>
     * <li><p><strong>cn-beijing-acd-aliyun</strong>: China (Beijing) Zone A, C, and D.</p>
     * </li>
     * <li><p><strong>ap-southeast-1-abc-aliyun</strong>: Singapore Zone A, B, and C.</p>
     * </li>
     * <li><p><strong>cn-zhangjiakou-abc-aliyun</strong>: China (Zhangjiakou) Zone A, B, and C.</p>
     * </li>
     * <li><p><strong>cn-shanghai-efg-aliyun</strong>: China (Shanghai) Zone E, F, and G.</p>
     * </li>
     * <li><p><strong>cn-shanghai-abd-aliyun</strong>: China (Shanghai) Zone A, B, and D.</p>
     * </li>
     * <li><p><strong>cn-hangzhou-bef-aliyun</strong>: China (Hangzhou) Zone B, E, and F.</p>
     * </li>
     * <li><p><strong>cn-hangzhou-bce-aliyun</strong>: China (Hangzhou) Zone B, C, and E.</p>
     * </li>
     * <li><p><strong>cn-beijing-fgh-aliyun</strong>: China (Beijing) Zone F, G, and H.</p>
     * </li>
     * <li><p><strong>cn-shenzhen-abc-aliyun</strong>: China (Shenzhen) Zone A, B, and C.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-efg-aliyun</p>
     */
    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    /**
     * <p>The network type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>PREPAY</strong>: subscription</p>
     * </li>
     * <li><p><strong>POSTPAY</strong>: pay-as-you-go</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the vSwitch in the primary zone for the multi-zone instance. The vSwitch must be deployed in the zone that is specified by <code>PrimaryZoneId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6fdqa7c0pipnqzq****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>The primary zone ID of the multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-e</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>633F1BE4-C8DA-5744-8FDF-A3075C3FE37F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2wvd6oia****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm</strong>: a single-zone instance.</p>
     * </li>
     * <li><p><strong>lindorm_multizone</strong>: a multi-zone instance.</p>
     * </li>
     * <li><p><strong>serverless_lindorm</strong>: a serverless instance.</p>
     * </li>
     * <li><p><strong>lindorm_standalone</strong>: a single-node instance.</p>
     * </li>
     * <li><p><strong>lts</strong>: a Lindorm Tunnel Service (LTS) instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The ID of the vSwitch in the secondary zone for the multi-zone instance. The vSwitch must be deployed in the zone that is specified by <code>StandbyZoneId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zec0kcn08cgdtr6****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The secondary zone ID of the multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1n3i15v90el48nx****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1vbjzmod9q3l9eo****</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    /**
     * <p>The ID of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static GetLindormInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceResponseBody self = new GetLindormInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetLindormInstanceResponseBody setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public GetLindormInstanceResponseBody setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public GetLindormInstanceResponseBody setArchVersion(String archVersion) {
        this.archVersion = archVersion;
        return this;
    }
    public String getArchVersion() {
        return this.archVersion;
    }

    public GetLindormInstanceResponseBody setArchiveStorage(Integer archiveStorage) {
        this.archiveStorage = archiveStorage;
        return this;
    }
    public Integer getArchiveStorage() {
        return this.archiveStorage;
    }

    public GetLindormInstanceResponseBody setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public GetLindormInstanceResponseBody setBackupInstance(String backupInstance) {
        this.backupInstance = backupInstance;
        return this;
    }
    public String getBackupInstance() {
        return this.backupInstance;
    }

    public GetLindormInstanceResponseBody setColdStorage(Integer coldStorage) {
        this.coldStorage = coldStorage;
        return this;
    }
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    public GetLindormInstanceResponseBody setCoreDiskCategory(String coreDiskCategory) {
        this.coreDiskCategory = coreDiskCategory;
        return this;
    }
    public String getCoreDiskCategory() {
        return this.coreDiskCategory;
    }

    public GetLindormInstanceResponseBody setCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
        return this;
    }
    public Integer getCoreNum() {
        return this.coreNum;
    }

    public GetLindormInstanceResponseBody setCoreSingleStorage(Integer coreSingleStorage) {
        this.coreSingleStorage = coreSingleStorage;
        return this;
    }
    public Integer getCoreSingleStorage() {
        return this.coreSingleStorage;
    }

    public GetLindormInstanceResponseBody setCoreSpec(String coreSpec) {
        this.coreSpec = coreSpec;
        return this;
    }
    public String getCoreSpec() {
        return this.coreSpec;
    }

    public GetLindormInstanceResponseBody setCreateMilliseconds(Long createMilliseconds) {
        this.createMilliseconds = createMilliseconds;
        return this;
    }
    public Long getCreateMilliseconds() {
        return this.createMilliseconds;
    }

    public GetLindormInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetLindormInstanceResponseBody setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public GetLindormInstanceResponseBody setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public GetLindormInstanceResponseBody setDiskThreshold(String diskThreshold) {
        this.diskThreshold = diskThreshold;
        return this;
    }
    public String getDiskThreshold() {
        return this.diskThreshold;
    }

    public GetLindormInstanceResponseBody setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }
    public String getDiskUsage() {
        return this.diskUsage;
    }

    public GetLindormInstanceResponseBody setEnableBlob(Boolean enableBlob) {
        this.enableBlob = enableBlob;
        return this;
    }
    public Boolean getEnableBlob() {
        return this.enableBlob;
    }

    public GetLindormInstanceResponseBody setEnableCdc(Boolean enableCdc) {
        this.enableCdc = enableCdc;
        return this;
    }
    public Boolean getEnableCdc() {
        return this.enableCdc;
    }

    public GetLindormInstanceResponseBody setEnableCompute(Boolean enableCompute) {
        this.enableCompute = enableCompute;
        return this;
    }
    public Boolean getEnableCompute() {
        return this.enableCompute;
    }

    public GetLindormInstanceResponseBody setEnableKms(Boolean enableKms) {
        this.enableKms = enableKms;
        return this;
    }
    public Boolean getEnableKms() {
        return this.enableKms;
    }

    public GetLindormInstanceResponseBody setEnableLProxy(Boolean enableLProxy) {
        this.enableLProxy = enableLProxy;
        return this;
    }
    public Boolean getEnableLProxy() {
        return this.enableLProxy;
    }

    public GetLindormInstanceResponseBody setEnableLTS(Boolean enableLTS) {
        this.enableLTS = enableLTS;
        return this;
    }
    public Boolean getEnableLTS() {
        return this.enableLTS;
    }

    public GetLindormInstanceResponseBody setEnableLsqlVersionV3(Boolean enableLsqlVersionV3) {
        this.enableLsqlVersionV3 = enableLsqlVersionV3;
        return this;
    }
    public Boolean getEnableLsqlVersionV3() {
        return this.enableLsqlVersionV3;
    }

    public GetLindormInstanceResponseBody setEnableMLCtrl(Boolean enableMLCtrl) {
        this.enableMLCtrl = enableMLCtrl;
        return this;
    }
    public Boolean getEnableMLCtrl() {
        return this.enableMLCtrl;
    }

    public GetLindormInstanceResponseBody setEnableSSL(Boolean enableSSL) {
        this.enableSSL = enableSSL;
        return this;
    }
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    public GetLindormInstanceResponseBody setEnableShs(Boolean enableShs) {
        this.enableShs = enableShs;
        return this;
    }
    public Boolean getEnableShs() {
        return this.enableShs;
    }

    public GetLindormInstanceResponseBody setEnableStoreTDE(Boolean enableStoreTDE) {
        this.enableStoreTDE = enableStoreTDE;
        return this;
    }
    public Boolean getEnableStoreTDE() {
        return this.enableStoreTDE;
    }

    public GetLindormInstanceResponseBody setEnableStream(Boolean enableStream) {
        this.enableStream = enableStream;
        return this;
    }
    public Boolean getEnableStream() {
        return this.enableStream;
    }

    public GetLindormInstanceResponseBody setEngineList(java.util.List<GetLindormInstanceResponseBodyEngineList> engineList) {
        this.engineList = engineList;
        return this;
    }
    public java.util.List<GetLindormInstanceResponseBodyEngineList> getEngineList() {
        return this.engineList;
    }

    public GetLindormInstanceResponseBody setEngineType(Integer engineType) {
        this.engineType = engineType;
        return this;
    }
    public Integer getEngineType() {
        return this.engineType;
    }

    public GetLindormInstanceResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetLindormInstanceResponseBody setExpiredMilliseconds(Long expiredMilliseconds) {
        this.expiredMilliseconds = expiredMilliseconds;
        return this;
    }
    public Long getExpiredMilliseconds() {
        return this.expiredMilliseconds;
    }

    public GetLindormInstanceResponseBody setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public GetLindormInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLindormInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetLindormInstanceResponseBody setInstanceStorage(String instanceStorage) {
        this.instanceStorage = instanceStorage;
        return this;
    }
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    public GetLindormInstanceResponseBody setLogDiskCategory(String logDiskCategory) {
        this.logDiskCategory = logDiskCategory;
        return this;
    }
    public String getLogDiskCategory() {
        return this.logDiskCategory;
    }

    public GetLindormInstanceResponseBody setLogNum(Integer logNum) {
        this.logNum = logNum;
        return this;
    }
    public Integer getLogNum() {
        return this.logNum;
    }

    public GetLindormInstanceResponseBody setLogSingleStorage(Integer logSingleStorage) {
        this.logSingleStorage = logSingleStorage;
        return this;
    }
    public Integer getLogSingleStorage() {
        return this.logSingleStorage;
    }

    public GetLindormInstanceResponseBody setLogSpec(String logSpec) {
        this.logSpec = logSpec;
        return this;
    }
    public String getLogSpec() {
        return this.logSpec;
    }

    public GetLindormInstanceResponseBody setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public GetLindormInstanceResponseBody setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public GetLindormInstanceResponseBody setMultiZoneCombination(String multiZoneCombination) {
        this.multiZoneCombination = multiZoneCombination;
        return this;
    }
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    public GetLindormInstanceResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetLindormInstanceResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public GetLindormInstanceResponseBody setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public GetLindormInstanceResponseBody setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public GetLindormInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLindormInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetLindormInstanceResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetLindormInstanceResponseBody setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public GetLindormInstanceResponseBody setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public GetLindormInstanceResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetLindormInstanceResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public GetLindormInstanceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class GetLindormInstanceResponseBodyEngineList extends TeaModel {
        /**
         * <p>The number of nodes in the arbiter zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ArbiterCoreCount")
        public String arbiterCoreCount;

        /**
         * <p>The number of engine nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CoreCount")
        public String coreCount;

        /**
         * <p>The number of vCPUs for the engine node.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CpuCount")
        public String cpuCount;

        /**
         * <p>The type of the engine. Valid values:</p>
         * <ul>
         * <li><p><strong>lindorm</strong>: the wide table engine.</p>
         * </li>
         * <li><p><strong>tsdb</strong>: the time series engine.</p>
         * </li>
         * <li><p><strong>solr</strong>: the search engine.</p>
         * </li>
         * <li><p><strong>store</strong>: the file engine.</p>
         * </li>
         * <li><p><strong>bds</strong>: the LTS engine.</p>
         * </li>
         * <li><p><strong>compute</strong>: the compute engine.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>Indicates whether the engine is of the latest version. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The engine is of the latest version.</p>
         * </li>
         * <li><p><strong>false</strong>: The engine is not of the latest version.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsLastVersion")
        public Boolean isLastVersion;

        /**
         * <p>The latest version of the engine.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.19.2</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        /**
         * <p>The memory size of the engine node.</p>
         * 
         * <strong>example:</strong>
         * <p>8GB</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <p>The number of nodes in the primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PrimaryCoreCount")
        public String primaryCoreCount;

        /**
         * <p>The specification of the engine nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.2xlarge</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The number of nodes in the secondary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StandbyCoreCount")
        public String standbyCoreCount;

        /**
         * <p>The version of the engine.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.3</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetLindormInstanceResponseBodyEngineList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormInstanceResponseBodyEngineList self = new GetLindormInstanceResponseBodyEngineList();
            return TeaModel.build(map, self);
        }

        public GetLindormInstanceResponseBodyEngineList setArbiterCoreCount(String arbiterCoreCount) {
            this.arbiterCoreCount = arbiterCoreCount;
            return this;
        }
        public String getArbiterCoreCount() {
            return this.arbiterCoreCount;
        }

        public GetLindormInstanceResponseBodyEngineList setCoreCount(String coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public String getCoreCount() {
            return this.coreCount;
        }

        public GetLindormInstanceResponseBodyEngineList setCpuCount(String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public String getCpuCount() {
            return this.cpuCount;
        }

        public GetLindormInstanceResponseBodyEngineList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetLindormInstanceResponseBodyEngineList setIsLastVersion(Boolean isLastVersion) {
            this.isLastVersion = isLastVersion;
            return this;
        }
        public Boolean getIsLastVersion() {
            return this.isLastVersion;
        }

        public GetLindormInstanceResponseBodyEngineList setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public GetLindormInstanceResponseBodyEngineList setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public GetLindormInstanceResponseBodyEngineList setPrimaryCoreCount(String primaryCoreCount) {
            this.primaryCoreCount = primaryCoreCount;
            return this;
        }
        public String getPrimaryCoreCount() {
            return this.primaryCoreCount;
        }

        public GetLindormInstanceResponseBodyEngineList setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public GetLindormInstanceResponseBodyEngineList setStandbyCoreCount(String standbyCoreCount) {
            this.standbyCoreCount = standbyCoreCount;
            return this;
        }
        public String getStandbyCoreCount() {
            return this.standbyCoreCount;
        }

        public GetLindormInstanceResponseBodyEngineList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}

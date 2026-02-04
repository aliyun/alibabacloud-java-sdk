// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceResponseBody extends TeaModel {
    /**
     * <p>16-digit AliUid of the Alibaba Cloud primary account (main account).</p>
     * 
     * <strong>example:</strong>
     * <p>164901546557****</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>Multi-AZ instance, coordinating Availability Zone virtual switch ID, which must be located in the Availability Zone corresponding to ArbiterZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6664pqjawb87k36****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>Multi-zone instance, coordinating Availability Zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-g</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>The architecture of the instance. Valid values:</p>
     * <ul>
     * <li><strong>1.0</strong>: The instance is deployed in a single zone.</li>
     * <li><strong>2.0</strong>: The instance is deployed across multiple zones.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("ArchVersion")
    public String archVersion;

    /**
     * <p>The Archive storage size of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0GB</p>
     */
    @NameInMap("ArchiveStorage")
    public Integer archiveStorage;

    /**
     * <p>Indicates whether auto-renewal is enabled, with the following returns:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled. </li>
     * <li><strong>false</strong>: Disabled.<blockquote>
     * <p>This parameter is returned when the instance\&quot;s payment type is prepaid.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("BackupInstance")
    public String backupInstance;

    /**
     * <p>The Capacity storage size of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0GB</p>
     */
    @NameInMap("ColdStorage")
    public Integer coldStorage;

    /**
     * <p>The disk type of the core nodes. This parameter is returned only for multi-zone instances. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: This instance uses the Standard type of storage.</li>
     * <li><strong>cloud_ssd</strong>: This instance uses the Performance type of storage.</li>
     * <li><strong>cloud_essd</strong>: This instance uses ESSDs for storage.</li>
     * <li><strong>cloud_essd_pl0</strong>: This instance uses PL0 ESSDs for storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("CoreDiskCategory")
    public String coreDiskCategory;

    /**
     * <p>Multi-zone instance, number of core nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CoreNum")
    public Integer coreNum;

    /**
     * <p>Multi-zone instance, core single-node disk capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CoreSingleStorage")
    public Integer coreSingleStorage;

    /**
     * <p>Multi-zone instance, core node specification.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("CoreSpec")
    public String coreSpec;

    /**
     * <p>The timestamp in milliseconds between the instance creation time and 1970-01-01 00:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1627290664000</p>
     */
    @NameInMap("CreateMilliseconds")
    public Long createMilliseconds;

    /**
     * <p>The storage capacity of the disk of a single log node. This parameter is returned only for multi-zone instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-26 17:10:26</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether deletion protection is enabled, returning:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public String deletionProtection;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: This instance uses the Standard type of storage.</li>
     * <li><strong>cloud_ssd</strong>: This instance uses the Performance type of storage.</li>
     * <li><strong>cloud_essd</strong>: This instance uses ESSDs for storage.</li>
     * <li><strong>cloud_essd_pl0</strong>: This instance uses PL0 ESSDs for storage.</li>
     * <li><strong>capacity_cloud_storage</strong>: This instance uses the Capacity type of storage.</li>
     * <li><strong>local_ssd_pro</strong>: This instance uses local SSDs for storage.</li>
     * <li><strong>local_hdd_pro</strong>: This instance uses local HDDs for storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The threshold for disk space.</p>
     * 
     * <strong>example:</strong>
     * <p>80%</p>
     */
    @NameInMap("DiskThreshold")
    public String diskThreshold;

    /**
     * <p>Disk space usage rate.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0%</p>
     */
    @NameInMap("DiskUsage")
    public String diskUsage;

    /**
     * <p>Indicates whether LBlob is enabled for the instance. Valid values:</p>
     * <p>true: LBlob is enabled for the instance. false: LBlob is not enabled for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBlob")
    public Boolean enableBlob;

    /**
     * <p>Indicates whether the data subscription feature for the instance is enabled. Returns:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled. </li>
     * <li><strong>false</strong>: Not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCdc")
    public Boolean enableCdc;

    /**
     * <p>Indicates whether the instance\&quot;s compute engine is enabled, returning:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled. </li>
     * <li><strong>false</strong>: Not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCompute")
    public Boolean enableCompute;

    /**
     * <p>Indicates whether the Key Management Service (KMS) is enabled, returning:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableKms")
    public Boolean enableKms;

    /**
     * <p>Indicates whether LindormTable supports the Thrift and CQL protocols. If these protocols are not supported. You can call the SwitchLProxyService operation to enable or disable the support on these protocols for LindormTable.</p>
     * <p>True: LindormTable supports the Thrift and CQL protocols.</p>
     * <p>False: LindormTable does not support the Thrift and CQL protocols.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("EnableLProxy")
    public Boolean enableLProxy;

    /**
     * <p>Indicates whether the LTS engine is activated for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The LTS engine is activated for the instance.</li>
     * <li><strong>false</strong>: The LTS engine is not activated for the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLTS")
    public Boolean enableLTS;

    /**
     * <p>Indicates whether LindormTable of the instance supports LindormSQL V3 that is compatible with MySQL. By default, LindormTable of instances that are purchased after October 24, 2023 supports LindormSQL V3. If your instance is purchased before this date and want to enable LindormSQL V3, contact the technical support.</p>
     * <ul>
     * <li>True: LindormTable supports LindormSQL V3.</li>
     * <li>False: LindormTable does not support LindormSQL V3.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableLsqlVersionV3")
    public Boolean enableLsqlVersionV3;

    /**
     * <p>Indicates whether AI control nodes are enabled for the instance.</p>
     * <ul>
     * <li>True: AI control nodes are enabled for the instance.</li>
     * <li>False: AI control nodes are not enabled for the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("EnableMLCtrl")
    public Boolean enableMLCtrl;

    /**
     * <p>Indicates whether SSL link encryption is enabled, returning:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled. </li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSSL")
    public Boolean enableSSL;

    /**
     * <p>Whether to enable the Compute Engine History Server.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableShs")
    public Boolean enableShs;

    /**
     * <p>Indicates whether the Transparent Data Encryption (TDE) is enabled, returning:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled. </li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableStoreTDE")
    public Boolean enableStoreTDE;

    /**
     * <p>Indicates whether the instance has the stream engine enabled. Return values:</p>
     * <ul>
     * <li><strong>true</strong>: Stream engine is enabled. </li>
     * <li><strong>false</strong>: Stream engine is not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableStream")
    public Boolean enableStream;

    /**
     * <p>The list of engines supported by the instance.</p>
     */
    @NameInMap("EngineList")
    public java.util.List<GetLindormInstanceResponseBodyEngineList> engineList;

    /**
     * <p>Supported engine types, the return value is obtained by performing addition operations on the values of the following engine types.</p>
     * <ul>
     * <li>1: Search Engine </li>
     * <li>2: Time Series Engine</li>
     * <li>4: Wide Table Engine</li>
     * <li>8: File Engine<blockquote>
     * <p>For example: If EngineType is 15, where 15 = 8 + 4 + 2 + 1, it indicates that the instance supports Search Engine, Time Series Engine, Wide Table Engine, and File Engine. If EngineType is 6, where 6 = 4 + 2, it signifies that the instance supports Time Series Engine and Wide Table Engine.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("EngineType")
    public Integer engineType;

    /**
     * <p>Expiration time of the instance, format: <strong>yyyy-MM-dd HH:mm:ss</strong>.</p>
     * <blockquote>
     * <p>This parameter is only returned when the payment type is pre-paid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-08-27 00:00:00</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The millisecond value between the instance expiration time and 1970-01-01 00:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1629993600000</p>
     */
    @NameInMap("ExpiredMilliseconds")
    public Long expiredMilliseconds;

    /**
     * <p>Instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>test0726</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1o3y0yme2i2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li><strong>CREATING</strong>: The instance is being created.</li>
     * <li><strong>ACTIVATION</strong>: The instance is running.</li>
     * <li><strong>COLD_EXPANDING</strong>: The Capacity storage of the instance is being scaled up.</li>
     * <li><strong>MINOR_VERSION_TRANSING</strong>: The minor version of the instance is being updated.</li>
     * <li><strong>RESIZING</strong>: The nodes in the instance are being scaled up.</li>
     * <li><strong>SHRINKING</strong>: The nodes in the instance are being scaled down.</li>
     * <li><strong>CLASS_CHANGING</strong>: The specification of the instance is being changed.</li>
     * <li><strong>SSL_SWITCHING: SSL</strong>: The SSL configurations of the instance are being changed.</li>
     * <li><strong>CDC_OPENING</strong>: Data subscription is being enabled for the instance.</li>
     * <li><strong>TRANSFER</strong>: The data of the instance is being transferred.</li>
     * <li><strong>DATABASE_TRANSFER</strong>: The data of the instance is being transferred to databases.</li>
     * <li><strong>GUARD_CREATING</strong>: A disaster recovery instance is being created.</li>
     * <li><strong>BACKUP_RECOVERING</strong>: The data of the instance is being restored from a backup.</li>
     * <li><strong>DATABASE_IMPORTING</strong>: Data is being imported to the instance.</li>
     * <li><strong>NET_MODIFYING</strong>: The network configurations of the instance are being changed.</li>
     * <li><strong>NET_SWITCHING</strong>: The network of the instance is being switched between a virtual private cloud (VPC) and the Internet.</li>
     * <li><strong>NET_CREATING</strong>: The connection to the instance is being created.</li>
     * <li><strong>NET_DELETING</strong>: The connection to the instance is being deleted.</li>
     * <li><strong>DELETING</strong>: The instance is being deleted.</li>
     * <li><strong>RESTARTING</strong>: The instance is restarting.</li>
     * <li><strong>LOCKED</strong>: The instance is locked because it expires.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>Instance\&quot;s storage capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>480</p>
     */
    @NameInMap("InstanceStorage")
    public String instanceStorage;

    /**
     * <p>Multi-zone instance, log node disk type, returns:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: Standard cloud storage. </li>
     * <li><strong>cloud_ssd</strong>: Performance cloud storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("LogDiskCategory")
    public String logDiskCategory;

    /**
     * <p>Multi-zone instance, number of log nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogNum")
    public Integer logNum;

    /**
     * <p>The storage capacity of the disk of a single log node. This parameter is returned only for multi-zone instances.</p>
     * 
     * <strong>example:</strong>
     * <p>400GB</p>
     */
    @NameInMap("LogSingleStorage")
    public Integer logSingleStorage;

    /**
     * <p>Multi-zone instance, log node specification.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm.sn1.large</p>
     */
    @NameInMap("LogSpec")
    public String logSpec;

    /**
     * <p>Maintainable end time.</p>
     * 
     * <strong>example:</strong>
     * <p>20:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>Maintainable start time.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <p>Multi-zone combinations. For support details on zone combinations, please refer to the product page.</p>
     * <ul>
     * <li><strong>ap-southeast-5abc-aliyun</strong>: Indonesia (Jakarta) A+B+C. </li>
     * <li><strong>cn-hangzhou-ehi-aliyun</strong>: East China 1 (Hangzhou) E+H+I.</li>
     * <li><strong>cn-beijing-acd-aliyun</strong>: North China 2 (Beijing) A+C+D.</li>
     * <li><strong>ap-southeast-1-abc-aliyun</strong>: Singapore A+B+C.</li>
     * <li><strong>cn-zhangjiakou-abc-aliyun</strong>: North China 3 (Zhangjiakou) A+B+C.</li>
     * <li><strong>cn-shanghai-efg-aliyun</strong>: East China 2 (Shanghai) E+F+G.</li>
     * <li><strong>cn-shanghai-abd-aliyun</strong>: East China 2 (Shanghai) A+B+D.</li>
     * <li><strong>cn-hangzhou-bef-aliyun</strong>: East China 1 (Hangzhou) B+E+F.</li>
     * <li><strong>cn-hangzhou-bce-aliyun</strong>: East China 1 (Hangzhou) B+C+E.</li>
     * <li><strong>cn-beijing-fgh-aliyun</strong>: North China 2 (Beijing) F+G+H.</li>
     * <li><strong>cn-shenzhen-abc-aliyun</strong>: South China 1 (Shenzhen) A+B+C.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-efg-aliyun</p>
     */
    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    /**
     * <p>Instance\&quot;s network type.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <p>PREPAY: subscription.
     * POSTPAY: pay-as-you-go.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Multi-zone instance, the virtual switch ID of the primary availability zone, which must be in the availability zone corresponding to PrimaryZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6fdqa7c0pipnqzq****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>Multi-zone instance, availability zone ID of the primary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-e</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>633F1BE4-C8DA-5744-8FDF-A3075C3FE37F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2wvd6oia****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Instance type, valid values:</p>
     * <ul>
     * <li><strong>lindorm</strong>: represents a Lindorm single-zone instance.</li>
     * <li><strong>lindorm_multizone</strong>: represents a Lindorm multi-zone instance.</li>
     * <li><strong>serverless_lindorm</strong>: represents a Lindorm Serverless instance.</li>
     * <li><strong>lindorm_standalone</strong>: represents a Lindorm standalone instance.</li>
     * <li><strong>lts</strong>: represents the Lindorm Data Channel Service type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>Multi-zone instance, the virtual switch ID of the backup availability zone, which must be in the availability zone corresponding to StandbyZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zec0kcn08cgdtr6****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>Multi-zone instance, backup availability zone\&quot;s availability zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The type of the log nodes. This parameter is returned only for multi-zone instances.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1n3i15v90el48nx****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The number of the log nodes. This parameter is returned only for multi-zone instances.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1vbjzmod9q3l9eo****</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    /**
     * <p>Availability Zone ID.</p>
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
         * <p>The number of CPU cores on the engine node.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CpuCount")
        public String cpuCount;

        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li><strong>lindorm</strong>: LindormTable.</li>
         * <li><strong>tsdb</strong>: LindormTSDB.</li>
         * <li><strong>solr</strong>: LindormSearch.</li>
         * <li><strong>store</strong>: LindormDFS.</li>
         * <li><strong>bds</strong>: Lindorm Tunnel Service (LTS).</li>
         * <li><strong>compute</strong>: Lindorm Distributed Processing System (LDPS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>Indicates whether the version of the engine is the latest. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The version of the engine is the latest.</li>
         * <li><strong>false</strong>: The version of the engine is not the latest.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsLastVersion")
        public Boolean isLastVersion;

        /**
         * <p>The latest version number of the engine.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.19.2</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        /**
         * <p>The memory size of the engine nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>8GB</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        @NameInMap("PrimaryCoreCount")
        public String primaryCoreCount;

        /**
         * <p>The specification of the engine node.</p>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.2xlarge</p>
         */
        @NameInMap("Specification")
        public String specification;

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

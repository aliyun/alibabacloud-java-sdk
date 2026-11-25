// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2InstanceDetailsResponseBody extends TeaModel {
    /**
     * <p>The 16-digit AliUid of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>164901546557****</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>The vSwitch ID of the arbitration zone for a multi-zone instance. The vSwitch must be in the zone specified by ArbiterZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6664pqjawb87k36****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>The zone ID of the arbitration zone for a multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-g</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>Indicates whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only when the billing method of the instance is subscription.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The cloud storage capacity, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>480</p>
     */
    @NameInMap("CloudStorageSize")
    public Long cloudStorageSize;

    /**
     * <p>The storage-optimized cloud storage capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("ColdStorage")
    public Integer coldStorage;

    /**
     * <p>The number of milliseconds between the instance creation time and 1970-01-01 00:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1627290664000</p>
     */
    @NameInMap("CreateMilliseconds")
    public Long createMilliseconds;

    /**
     * <p>Indicates whether deletion protection is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
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
     * <li><strong>StandardStorage</strong>: standard cloud storage.</li>
     * <li><strong>PerformanceStorage</strong>: performance cloud storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PerformanceStorage</p>
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
     * <p>The disk space usage.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0%</p>
     */
    @NameInMap("DiskUsage")
    public String diskUsage;

    /**
     * <p>Indicates whether the compute engine is activated for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: activated.</li>
     * <li><strong>false</strong>: not activated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCompute")
    public Boolean enableCompute;

    /**
     * <p>Indicates whether the file engine is activated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableFs")
    public String enableFs;

    /**
     * <p>Indicates whether storage TDE encryption is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableStoreTDE")
    public String enableStoreTDE;

    /**
     * <p>The list of engine information.</p>
     */
    @NameInMap("EngineList")
    public java.util.List<GetLindormV2InstanceDetailsResponseBodyEngineList> engineList;

    /**
     * <p>The number of milliseconds between the instance expires time and 1970-01-01 00:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1629993600000</p>
     */
    @NameInMap("ExpiredMilliseconds")
    public Long expiredMilliseconds;

    /**
     * <p>The initial default password.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("InitialRootPassword")
    public String initialRootPassword;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm-test</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1mq0tdzbx1m****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>CREATING</strong>: the instance is being created.</li>
     * <li><strong>ACTIVATION</strong>: the instance is running.</li>
     * <li><strong>COLD_EXPANDING</strong>: the storage-optimized cloud storage is undergoing storage expansion.</li>
     * <li><strong>MINOR_VERSION_TRANSING</strong>: a minor version upgrade is in progress.</li>
     * <li><strong>RESIZING</strong>: nodes are being scaled out.</li>
     * <li><strong>SHRINKING</strong>: nodes are being scaled in.</li>
     * <li><strong>CLASS_CHANGING</strong>: instance specifications are being upgraded or the quota is being decreased.</li>
     * <li><strong>SSL_SWITCHING</strong>: an SSL change is in progress.</li>
     * <li><strong>CDC_OPENING</strong>: the Lindorm Tunnel Service feature is being activated.</li>
     * <li><strong>TRANSFER</strong>: data migration is in progress.</li>
     * <li><strong>DATABASE_TRANSFER</strong>: data is being migrated to a database.</li>
     * <li><strong>GUARD_CREATING</strong>: a disaster recovery instance is being created.</li>
     * <li><strong>BACKUP_RECOVERING</strong>: backup recovery is in progress.</li>
     * <li><strong>DATABASE_IMPORTING</strong>: data import is in progress.</li>
     * <li><strong>NET_MODIFYING</strong>: a network change is in progress.</li>
     * <li><strong>NET_SWITCHING</strong>: the network is switching between the private network and the public network.</li>
     * <li><strong>NET_CREATING</strong>: a network connection is being created.</li>
     * <li><strong>NET_DELETING</strong>: a network connection is being deleted.</li>
     * <li><strong>DELETING</strong>: the instance is being deleted.</li>
     * <li><strong>RESTARTING</strong>: the instance is restarting.</li>
     * <li><strong>LOCKED</strong>: the instance has expired and is locked.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The instance form factor. Valid values:</p>
     * <ul>
     * <li>basic: production type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The end time of the maintenance window, in HH:mmZ format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>20:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the maintenance window, in HH:mmZ format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>00:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <p>The network type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PREPAY</strong>: subscription.</li>
     * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The vSwitch ID of the primary zone for a multi-zone instance. The vSwitch must be in the zone specified by PrimaryZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6fdqa7c0pipnqzq****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>The zone ID of the primary zone for a multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-e</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1556DCB0-043A-4444-8BD9-CF4A68E7EE64</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2i6weeb4nfii</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><strong>lindorm_v2</strong>: Lindorm V2 single-zone instance.</li>
     * <li><strong>lindorm_v2_multizone</strong>: Lindorm V2 multi-zone Basic Edition instance.</li>
     * <li><strong>lindorm_v2_multizone_ha</strong>: Lindorm V2 multi-zone High Availability Edition instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm_v2</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The vSwitch ID of the secondary zone for a multi-zone instance. The vSwitch must be in the zone specified by StandbyZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zec0kcn08cgdtr6****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The zone ID of the secondary zone for a multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The instance storage usage level.</p>
     */
    @NameInMap("StorageUsage")
    public GetLindormV2InstanceDetailsResponseBodyStorageUsage storageUsage;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1xxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1xxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    /**
     * <p>The instance access whitelist.</p>
     */
    @NameInMap("WhiteIpList")
    public java.util.List<GetLindormV2InstanceDetailsResponseBodyWhiteIpList> whiteIpList;

    /**
     * <p>The details of engine deployment by zone.</p>
     * 
     * <strong>example:</strong>
     * <p>ZoneEngineInfoMap</p>
     */
    @NameInMap("ZoneEngineInfoMap")
    public java.util.Map<String, ?> zoneEngineInfoMap;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static GetLindormV2InstanceDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2InstanceDetailsResponseBody self = new GetLindormV2InstanceDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormV2InstanceDetailsResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetLindormV2InstanceDetailsResponseBody setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public GetLindormV2InstanceDetailsResponseBody setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public GetLindormV2InstanceDetailsResponseBody setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public GetLindormV2InstanceDetailsResponseBody setCloudStorageSize(Long cloudStorageSize) {
        this.cloudStorageSize = cloudStorageSize;
        return this;
    }
    public Long getCloudStorageSize() {
        return this.cloudStorageSize;
    }

    public GetLindormV2InstanceDetailsResponseBody setColdStorage(Integer coldStorage) {
        this.coldStorage = coldStorage;
        return this;
    }
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    public GetLindormV2InstanceDetailsResponseBody setCreateMilliseconds(Long createMilliseconds) {
        this.createMilliseconds = createMilliseconds;
        return this;
    }
    public Long getCreateMilliseconds() {
        return this.createMilliseconds;
    }

    public GetLindormV2InstanceDetailsResponseBody setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public GetLindormV2InstanceDetailsResponseBody setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public GetLindormV2InstanceDetailsResponseBody setDiskThreshold(String diskThreshold) {
        this.diskThreshold = diskThreshold;
        return this;
    }
    public String getDiskThreshold() {
        return this.diskThreshold;
    }

    public GetLindormV2InstanceDetailsResponseBody setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }
    public String getDiskUsage() {
        return this.diskUsage;
    }

    public GetLindormV2InstanceDetailsResponseBody setEnableCompute(Boolean enableCompute) {
        this.enableCompute = enableCompute;
        return this;
    }
    public Boolean getEnableCompute() {
        return this.enableCompute;
    }

    public GetLindormV2InstanceDetailsResponseBody setEnableFs(String enableFs) {
        this.enableFs = enableFs;
        return this;
    }
    public String getEnableFs() {
        return this.enableFs;
    }

    public GetLindormV2InstanceDetailsResponseBody setEnableStoreTDE(String enableStoreTDE) {
        this.enableStoreTDE = enableStoreTDE;
        return this;
    }
    public String getEnableStoreTDE() {
        return this.enableStoreTDE;
    }

    public GetLindormV2InstanceDetailsResponseBody setEngineList(java.util.List<GetLindormV2InstanceDetailsResponseBodyEngineList> engineList) {
        this.engineList = engineList;
        return this;
    }
    public java.util.List<GetLindormV2InstanceDetailsResponseBodyEngineList> getEngineList() {
        return this.engineList;
    }

    public GetLindormV2InstanceDetailsResponseBody setExpiredMilliseconds(Long expiredMilliseconds) {
        this.expiredMilliseconds = expiredMilliseconds;
        return this;
    }
    public Long getExpiredMilliseconds() {
        return this.expiredMilliseconds;
    }

    public GetLindormV2InstanceDetailsResponseBody setInitialRootPassword(String initialRootPassword) {
        this.initialRootPassword = initialRootPassword;
        return this;
    }
    public String getInitialRootPassword() {
        return this.initialRootPassword;
    }

    public GetLindormV2InstanceDetailsResponseBody setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public GetLindormV2InstanceDetailsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLindormV2InstanceDetailsResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetLindormV2InstanceDetailsResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public GetLindormV2InstanceDetailsResponseBody setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public GetLindormV2InstanceDetailsResponseBody setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public GetLindormV2InstanceDetailsResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetLindormV2InstanceDetailsResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public GetLindormV2InstanceDetailsResponseBody setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public GetLindormV2InstanceDetailsResponseBody setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public GetLindormV2InstanceDetailsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLindormV2InstanceDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormV2InstanceDetailsResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetLindormV2InstanceDetailsResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetLindormV2InstanceDetailsResponseBody setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public GetLindormV2InstanceDetailsResponseBody setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public GetLindormV2InstanceDetailsResponseBody setStorageUsage(GetLindormV2InstanceDetailsResponseBodyStorageUsage storageUsage) {
        this.storageUsage = storageUsage;
        return this;
    }
    public GetLindormV2InstanceDetailsResponseBodyStorageUsage getStorageUsage() {
        return this.storageUsage;
    }

    public GetLindormV2InstanceDetailsResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetLindormV2InstanceDetailsResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public GetLindormV2InstanceDetailsResponseBody setWhiteIpList(java.util.List<GetLindormV2InstanceDetailsResponseBodyWhiteIpList> whiteIpList) {
        this.whiteIpList = whiteIpList;
        return this;
    }
    public java.util.List<GetLindormV2InstanceDetailsResponseBodyWhiteIpList> getWhiteIpList() {
        return this.whiteIpList;
    }

    public GetLindormV2InstanceDetailsResponseBody setZoneEngineInfoMap(java.util.Map<String, ?> zoneEngineInfoMap) {
        this.zoneEngineInfoMap = zoneEngineInfoMap;
        return this;
    }
    public java.util.Map<String, ?> getZoneEngineInfoMap() {
        return this.zoneEngineInfoMap;
    }

    public GetLindormV2InstanceDetailsResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList extends TeaModel {
        /**
         * <p>The connection address.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-mxj9asg***-proxy-lindorm-vpc.lindorm.aliyuncs.com:33060</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The port number of the database endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>33060</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The connection address type. Valid values:</p>
         * <ul>
         * <li>INTRANET: VPC private network address.</li>
         * <li>INTERNET: public address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTRANET</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList self = new GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup extends TeaModel {
        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>caculated</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The number of vCPU cores on the node.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        /**
         * <p>Indicates whether a local cloud disk is attached to the node.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableAttachLocalDisk")
        public Boolean enableAttachLocalDisk;

        /**
         * <p>The local cloud disk capacity, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LocalDiskCapacity")
        public Long localDiskCapacity;

        /**
         * <p>The local cloud disk type. Valid values:</p>
         * <ul>
         * <li>cloud_essd: performance cloud disk.</li>
         * <li>cloud_efficiency: standard cloud disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("LocalDiskCategory")
        public String localDiskCategory;

        /**
         * <p>The memory size of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("MemorySizeGiB")
        public Integer memorySizeGiB;

        /**
         * <p>The node specifications.</p>
         * <p>If you select performance cloud storage or standard cloud storage, valid values are:</p>
         * <ul>
         * <li>lindorm.c.2xlarge: 8 vCores and 16 GB memory.</li>
         * <li>lindorm.g.2xlarge: 8 vCores and 32 GB memory.</li>
         * <li>lindorm.c.4xlarge: 16 vCores and 32 GB memory.</li>
         * <li>lindorm.g.4xlarge: 16 vCores and 64 GB memory.</li>
         * <li>lindorm.c.8xlarge: 32 vCores and 64 GB memory.</li>
         * <li>lindorm.g.8xlarge: 32 vCores and 128 GB memory.</li>
         * <li>lindorm.r.2xlarge: 8 vCores and 64 GB memory.</li>
         * <li>lindorm.r.4xlarge: 16 vCores and 128 GB memory.</li>
         * <li>lindorm.r.8xlarge: 32 vCores and 256 GB memory.</li>
         * </ul>
         * <p>If you select local SSD storage, valid values are:</p>
         * <ul>
         * <li>lindorm.i4.xlarge: 4 vCores and 32 GB memory (I4).</li>
         * <li>lindorm.i4.2xlarge: 8 vCores and 64 GB memory (I4).</li>
         * <li>lindorm.i4.4xlarge: 16 vCores and 128 GB memory (I4).</li>
         * <li>lindorm.i4.8xlarge: 32 vCores and 256 GB memory (I4).</li>
         * <li>lindorm.i3.xlarge: 4 vCores and 32 GB memory (I3).</li>
         * <li>lindorm.i3.2xlarge: 8 vCores and 64 GB memory (I3).</li>
         * <li>lindorm.i3.4xlarge: 16 vCores and 128 GB memory (I3).</li>
         * <li>lindorm.i3.8xlarge: 32 vCores and 256 GB memory (I3).</li>
         * <li>lindorm.i2.xlarge: 4 vCores and 32 GB memory (I2).</li>
         * <li>lindorm.i2.2xlarge: 8 vCores and 64 GB memory (I2).</li>
         * <li>lindorm.i2.4xlarge: 16 vCores and 128 GB memory (I2).</li>
         * <li>lindorm.i2.8xlarge: 32 vCores and 256 GB memory (I2).</li>
         * </ul>
         * <p>If you select big data instance type, valid values are:</p>
         * <ul>
         * <li>lindorm.sd3c.3xlarge: 14 vCores and 56 GB memory (D3C PRO).</li>
         * <li>lindorm.sd3c.7xlarge: 28 vCores and 112 GB memory (D3C PRO).</li>
         * <li>lindorm.sd3c.14xlarge: 56 vCores and 224 GB memory (D3C PRO).</li>
         * <li>lindorm.d2c.6xlarge: 24 vCores and 88 GB memory (D2C).</li>
         * <li>lindorm.d2c.12xlarge: 48 vCores and 176 GB memory (D2C).</li>
         * <li>lindorm.d2c.24xlarge: 96 vCores and 352 GB memory (D2C).</li>
         * <li>lindorm.d2s.5xlarge: 20 vCores and 88 GB memory (D2S).</li>
         * <li>lindorm.d2s.10xlarge: 40 vCores and 176 GB memory (D2S).</li>
         * <li>lindorm.d1.2xlarge: 8 vCores and 32 GB memory (D1NE).</li>
         * <li>lindorm.d1.4xlarge: 16 vCores and 64 GB memory (D1NE).</li>
         * <li>lindorm.d1.6xlarge: 24 vCores and 96 GB memory (D1NE).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.2xlarge</p>
         */
        @NameInMap("NodeSpec")
        public String nodeSpec;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <p>The node group name. <strong>Required.</strong> Must match the name specified at creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>job_debug</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The ID that uniquely corresponds to the delivery group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("SpecId")
        public String specId;

        /**
         * <p>The node status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup self = new GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setEnableAttachLocalDisk(Boolean enableAttachLocalDisk) {
            this.enableAttachLocalDisk = enableAttachLocalDisk;
            return this;
        }
        public Boolean getEnableAttachLocalDisk() {
            return this.enableAttachLocalDisk;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setLocalDiskCapacity(Long localDiskCapacity) {
            this.localDiskCapacity = localDiskCapacity;
            return this;
        }
        public Long getLocalDiskCapacity() {
            return this.localDiskCapacity;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setLocalDiskCategory(String localDiskCategory) {
            this.localDiskCategory = localDiskCategory;
            return this;
        }
        public String getLocalDiskCategory() {
            return this.localDiskCategory;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setMemorySizeGiB(Integer memorySizeGiB) {
            this.memorySizeGiB = memorySizeGiB;
            return this;
        }
        public Integer getMemorySizeGiB() {
            return this.memorySizeGiB;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setNodeSpec(String nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetLindormV2InstanceDetailsResponseBodyEngineList extends TeaModel {
        /**
         * <p>The list of engine connection addresses.</p>
         */
        @NameInMap("ConnectAddressList")
        public java.util.List<GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList> connectAddressList;

        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li><strong>TABLE</strong>: LindormTable.</li>
         * <li><strong>TSDB</strong>: LindormTSDB.</li>
         * <li><strong>LSEARCH</strong>: search index engine.</li>
         * <li><strong>LTS</strong>: LTS timing engine.</li>
         * <li><strong>LVECTOR</strong>: vector engine.</li>
         * <li><strong>LCOLUMN</strong>: column store engine.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>Indicates whether the engine is running the latest version. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: the latest version.</li>
         * <li><strong>false</strong>: not the latest version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsLastVersion")
        public Boolean isLastVersion;

        /**
         * <p>The latest version number for the engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.19.2</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        /**
         * <p>The list of engine node groups.</p>
         */
        @NameInMap("NodeGroup")
        public java.util.List<GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup> nodeGroup;

        /**
         * <p>The version number of the engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.3</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetLindormV2InstanceDetailsResponseBodyEngineList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceDetailsResponseBodyEngineList self = new GetLindormV2InstanceDetailsResponseBodyEngineList();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineList setConnectAddressList(java.util.List<GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList> connectAddressList) {
            this.connectAddressList = connectAddressList;
            return this;
        }
        public java.util.List<GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList> getConnectAddressList() {
            return this.connectAddressList;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineList setIsLastVersion(Boolean isLastVersion) {
            this.isLastVersion = isLastVersion;
            return this;
        }
        public Boolean getIsLastVersion() {
            return this.isLastVersion;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineList setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineList setNodeGroup(java.util.List<GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup> nodeGroup) {
            this.nodeGroup = nodeGroup;
            return this;
        }
        public java.util.List<GetLindormV2InstanceDetailsResponseBodyEngineListNodeGroup> getNodeGroup() {
            return this.nodeGroup;
        }

        public GetLindormV2InstanceDetailsResponseBodyEngineList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetLindormV2InstanceDetailsResponseBodyStorageUsage extends TeaModel {
        /**
         * <p>The instance storage usage level.</p>
         */
        @NameInMap("CapacityByDiskCategory")
        public java.util.List<java.util.Map<String, ?>> capacityByDiskCategory;

        /**
         * <p>The storage usage of each engine.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("EngineUsage")
        public java.util.Map<String, ?> engineUsage;

        public static GetLindormV2InstanceDetailsResponseBodyStorageUsage build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceDetailsResponseBodyStorageUsage self = new GetLindormV2InstanceDetailsResponseBodyStorageUsage();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceDetailsResponseBodyStorageUsage setCapacityByDiskCategory(java.util.List<java.util.Map<String, ?>> capacityByDiskCategory) {
            this.capacityByDiskCategory = capacityByDiskCategory;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getCapacityByDiskCategory() {
            return this.capacityByDiskCategory;
        }

        public GetLindormV2InstanceDetailsResponseBodyStorageUsage setEngineUsage(java.util.Map<String, ?> engineUsage) {
            this.engineUsage = engineUsage;
            return this;
        }
        public java.util.Map<String, ?> getEngineUsage() {
            return this.engineUsage;
        }

    }

    public static class GetLindormV2InstanceDetailsResponseBodyWhiteIpList extends TeaModel {
        /**
         * <p>The group name. Only letters, digits, and underscores are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>swhy</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The IP addresses in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;10.2.0.0/18\&quot;, \&quot;10.0.0.0/24\&quot;, \&quot;119.23.188.139/32\&quot;]</p>
         */
        @NameInMap("IpList")
        public String ipList;

        public static GetLindormV2InstanceDetailsResponseBodyWhiteIpList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceDetailsResponseBodyWhiteIpList self = new GetLindormV2InstanceDetailsResponseBodyWhiteIpList();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceDetailsResponseBodyWhiteIpList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetLindormV2InstanceDetailsResponseBodyWhiteIpList setIpList(String ipList) {
            this.ipList = ipList;
            return this;
        }
        public String getIpList() {
            return this.ipList;
        }

    }

}

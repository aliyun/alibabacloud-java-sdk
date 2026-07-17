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
     * <p>For a multi-zone instance, this is the ID of the virtual switch in the arbiter zone. The vSwitch must be in the zone specified by ArbiterZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6664pqjawb87k36****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>For a multi-zone instance, this is the ID of the arbiter zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-g</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>Indicates whether auto-renewal is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The cloud storage capacity in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>480</p>
     */
    @NameInMap("CloudStorageSize")
    public Long cloudStorageSize;

    /**
     * <p>The capacity of the storage-optimized cloud storage.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("ColdStorage")
    public Integer coldStorage;

    /**
     * <p>The number of milliseconds between the instance creation time and 00:00:00 on January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1627290664000</p>
     */
    @NameInMap("CreateMilliseconds")
    public Long createMilliseconds;

    /**
     * <p>Indicates whether deletion protection is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public String deletionProtection;

    /**
     * <p>The storage class. Valid values:</p>
     * <ul>
     * <li><p><strong>StandardStorage</strong>: Standard cloud storage.</p>
     * </li>
     * <li><p><strong>PerformanceStorage</strong>: Performance cloud storage.</p>
     * </li>
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
     * <p>Indicates whether the compute engine is enabled for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCompute")
    public Boolean enableCompute;

    /**
     * <p>Indicates whether the file engine is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableFs")
    public String enableFs;

    /**
     * <p>Indicates whether transparent data encryption (TDE) is enabled for storage.</p>
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
     * <p>The number of milliseconds between the instance expiration time and 00:00:00 on January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1629993600000</p>
     */
    @NameInMap("ExpiredMilliseconds")
    public Long expiredMilliseconds;

    /**
     * <p>The default initial password.</p>
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
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1mq0tdzbx1m****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><p><strong>CREATING</strong>: The instance is being created.</p>
     * </li>
     * <li><p><strong>ACTIVATION</strong>: The instance is running.</p>
     * </li>
     * <li><p><strong>COLD_EXPANDING</strong>: The storage-optimized cloud storage is being scaled out.</p>
     * </li>
     * <li><p><strong>MINOR_VERSION_TRANSING</strong>: The minor version is being upgraded.</p>
     * </li>
     * <li><p><strong>RESIZING</strong>: The nodes are being scaled out.</p>
     * </li>
     * <li><p><strong>SHRINKING</strong>: The nodes are being scaled in.</p>
     * </li>
     * <li><p><strong>CLASS_CHANGING</strong>: The instance specifications are being upgraded or downgraded.</p>
     * </li>
     * <li><p><strong>SSL_SWITCHING</strong>: The SSL certificate is being changed.</p>
     * </li>
     * <li><p><strong>CDC_OPENING</strong>: The data subscription feature is being enabled.</p>
     * </li>
     * <li><p><strong>TRANSFER</strong>: Data is being migrated.</p>
     * </li>
     * <li><p><strong>DATABASE_TRANSFER</strong>: Data is being migrated to the database.</p>
     * </li>
     * <li><p><strong>GUARD_CREATING</strong>: A disaster recovery instance is being created.</p>
     * </li>
     * <li><p><strong>BACKUP_RECOVERING</strong>: Data is being restored from a backup.</p>
     * </li>
     * <li><p><strong>DATABASE_IMPORTING</strong>: Data is being imported.</p>
     * </li>
     * <li><p><strong>NET_MODIFYING</strong>: The network is being modified.</p>
     * </li>
     * <li><p><strong>NET_SWITCHING</strong>: The network is being switched between the private network and the public network.</p>
     * </li>
     * <li><p><strong>NET_CREATING</strong>: A network connection is being created.</p>
     * </li>
     * <li><p><strong>NET_DELETING</strong>: A network connection is being deleted.</p>
     * </li>
     * <li><p><strong>DELETING</strong>: The instance is being deleted.</p>
     * </li>
     * <li><p><strong>RESTARTING</strong>: The instance is being restarted.</p>
     * </li>
     * <li><p><strong>LOCKED</strong>: The instance has expired and is locked.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The instance type. Valid value:</p>
     * <ul>
     * <li>basic: Production.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

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
     * <li><p><strong>PREPAY</strong>: subscription.</p>
     * </li>
     * <li><p><strong>POSTPAY</strong>: pay-as-you-go.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>For a multi-zone instance, this is the ID of the virtual switch in the primary zone. The vSwitch must be in the zone specified by PrimaryZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6fdqa7c0pipnqzq****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>For a multi-zone instance, this is the ID of the primary zone.</p>
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
     * <li><p><strong>lindorm_v2</strong>: Lindorm V2 single-zone instance.</p>
     * </li>
     * <li><p><strong>lindorm_v2_multizone</strong>: Lindorm V2 Multi-zone Deployment (Basic) instance.</p>
     * </li>
     * <li><p><strong>lindorm_v2_multizone_ha</strong>: Lindorm V2 multi-zone High-availability Edition instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm_v2</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>For a multi-zone instance, this is the ID of the virtual switch in the secondary zone. The vSwitch must be in the zone specified by StandbyZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zec0kcn08cgdtr6****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>For a multi-zone instance, this is the ID of the secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The instance storage usage.</p>
     */
    @NameInMap("StorageUsage")
    public GetLindormV2InstanceDetailsResponseBodyStorageUsage storageUsage;

    /**
     * <p>The ID of the virtual private cloud (VPC) where the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1xxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the virtual switch.</p>
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
     * <p>The deployment details of the engine in the zone.</p>
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
         * <p>The endpoint.</p>
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
         * <p>The endpoint type.</p>
         * <ul>
         * <li><p>INTRANET: VPC private endpoint.</p>
         * </li>
         * <li><p>INTERNET: Public endpoint.</p>
         * </li>
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
         * <p>The number of vCPUs for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        /**
         * <p>Indicates whether a local disk is attached to the node.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableAttachLocalDisk")
        public Boolean enableAttachLocalDisk;

        /**
         * <p>The capacity of the local disk in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LocalDiskCapacity")
        public Long localDiskCapacity;

        /**
         * <p>The type of the local cloud disk.</p>
         * <ul>
         * <li><p>cloud_essd: performance cloud disk</p>
         * </li>
         * <li><p>cloud_efficiency: standard cloud disk</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("LocalDiskCategory")
        public String localDiskCategory;

        /**
         * <p>The memory size of the node in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("MemorySizeGiB")
        public Integer memorySizeGiB;

        /**
         * <p>The node specifications.</p>
         * <p>If you select Performance cloud storage or Standard cloud storage, this parameter can be set to one of the following values:</p>
         * <ul>
         * <li><p>lindorm.c.2xlarge: 8 vCPUs, 16 GB memory.</p>
         * </li>
         * <li><p>lindorm.g.2xlarge: 8 vCPUs, 32 GB memory.</p>
         * </li>
         * <li><p>lindorm.c.4xlarge: 16 vCPUs, 32 GB memory.</p>
         * </li>
         * <li><p>lindorm.g.4xlarge: 16 vCPUs, 64 GB memory.</p>
         * </li>
         * <li><p>lindorm.c.8xlarge: 32 vCPUs, 64 GB memory.</p>
         * </li>
         * <li><p>lindorm.g.8xlarge: 32 vCPUs, 128 GB memory.</p>
         * </li>
         * <li><p>lindorm.r.2xlarge: 8 vCPUs, 64 GB memory.</p>
         * </li>
         * <li><p>lindorm.r.4xlarge: 16 vCPUs, 128 GB memory.</p>
         * </li>
         * <li><p>lindorm.r.8xlarge: 32 vCPUs, 256 GB memory.</p>
         * </li>
         * </ul>
         * <p>If you select Local SSD, this parameter can be set to one of the following values:</p>
         * <ul>
         * <li><p>lindorm.i4.xlarge: 4 vCPUs, 32 GB memory (I4).</p>
         * </li>
         * <li><p>lindorm.i4.2xlarge: 8 vCPUs, 64 GB memory (I4).</p>
         * </li>
         * <li><p>lindorm.i4.4xlarge: 16 vCPUs, 128 GB memory (I4).</p>
         * </li>
         * <li><p>lindorm.i4.8xlarge: 32 vCPUs, 256 GB memory (I4).</p>
         * </li>
         * <li><p>lindorm.i3.xlarge: 4 vCPUs, 32 GB memory (I3).</p>
         * </li>
         * <li><p>lindorm.i3.2xlarge: 8 vCPUs, 64 GB memory (I3).</p>
         * </li>
         * <li><p>lindorm.i3.4xlarge: 16 vCPUs, 128 GB memory (I3).</p>
         * </li>
         * <li><p>lindorm.i3.8xlarge: 32 vCPUs, 256 GB memory (I3).</p>
         * </li>
         * <li><p>lindorm.i2.xlarge: 4 vCPUs, 32 GB memory (I2).</p>
         * </li>
         * <li><p>lindorm.i2.2xlarge: 8 vCPUs, 64 GB memory (I2).</p>
         * </li>
         * <li><p>lindorm.i2.4xlarge: 16 vCPUs, 128 GB memory (I2).</p>
         * </li>
         * <li><p>lindorm.i2.8xlarge: 32 vCPUs, 256 GB memory (I2).</p>
         * </li>
         * </ul>
         * <p>If you select Big Data, this parameter can be set to one of the following values:</p>
         * <ul>
         * <li><p>lindorm.sd3c.3xlarge: 14 vCPUs, 56 GB memory (D3C PRO).</p>
         * </li>
         * <li><p>lindorm.sd3c.7xlarge: 28 vCPUs, 112 GB memory (D3C PRO).</p>
         * </li>
         * <li><p>lindorm.sd3c.14xlarge: 56 vCPUs, 224 GB memory (D3C PRO).</p>
         * </li>
         * <li><p>lindorm.d2c.6xlarge: 24 vCPUs, 88 GB memory (D2C).</p>
         * </li>
         * <li><p>lindorm.d2c.12xlarge: 48 vCPUs, 176 GB memory (D2C).</p>
         * </li>
         * <li><p>lindorm.d2c.24xlarge: 96 vCPUs, 352 GB memory (D2C).</p>
         * </li>
         * <li><p>lindorm.d2s.5xlarge: 20 vCPUs, 88 GB memory (D2S).</p>
         * </li>
         * <li><p>lindorm.d2s.10xlarge: 40 vCPUs, 176 GB memory (D2S).</p>
         * </li>
         * <li><p>lindorm.d1.2xlarge: 8 vCPUs, 32 GB memory (D1NE).</p>
         * </li>
         * <li><p>lindorm.d1.4xlarge: 16 vCPUs, 64 GB memory (D1NE).</p>
         * </li>
         * <li><p>lindorm.d1.6xlarge: 24 vCPUs, 96 GB memory (D1NE).</p>
         * </li>
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
         * <p>The name of the node group. <strong>Required</strong>. This must be the same as the name used during creation.</p>
         * 
         * <strong>example:</strong>
         * <p>job_debug</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The unique ID that corresponds to the delivery group ID.</p>
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
         * <p>A list of engine endpoints.</p>
         */
        @NameInMap("ConnectAddressList")
        public java.util.List<GetLindormV2InstanceDetailsResponseBodyEngineListConnectAddressList> connectAddressList;

        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li><p><strong>TABLE</strong>: LindormTable.</p>
         * </li>
         * <li><p><strong>TSDB</strong>: LindormTSDB.</p>
         * </li>
         * <li><p><strong>LSEARCH</strong>: Search engine.</p>
         * </li>
         * <li><p><strong>LTS</strong>: LTS engine.</p>
         * </li>
         * <li><p><strong>LVECTOR</strong>: Vector engine.</p>
         * </li>
         * <li><p><strong>LCOLUMN</strong>: Column store.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>Indicates whether the engine is the latest version. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The engine is the latest version.</p>
         * </li>
         * <li><p><strong>false</strong>: The engine is not the latest version.</p>
         * </li>
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
         * <p>A list of engine node groups.</p>
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
         * <p>The instance storage usage.</p>
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
         * <p>The group name. The name can contain only letters, digits, and underscores (_).</p>
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

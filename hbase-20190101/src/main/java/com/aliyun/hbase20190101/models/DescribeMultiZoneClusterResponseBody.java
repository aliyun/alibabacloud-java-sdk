// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneClusterResponseBody extends TeaModel {
    /**
     * <p>The vSwitch ID of the arbiter zone.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-t4nax9mp3wk0czn****</p>
     */
    @NameInMap("ArbiterVSwitchIds")
    public String arbiterVSwitchIds;

    /**
     * <p>The zone ID of the arbiter zone.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1c</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>Indicates whether auto-renewal is enabled for the multi-zone instance when PayType is set to Prepaid. Valid values:</p>
     * <ul>
     * <li>True: Auto-renewal is enabled.</li>
     * <li>False: Auto-renewal is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-t4nn71xa0yn****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>mz_test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The cold storage size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("ColdStorageSize")
    public Integer coldStorageSize;

    /**
     * <p>The number of core node disks.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CoreDiskCount")
    public String coreDiskCount;

    /**
     * <p>The disk size of a core node. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CoreDiskSize")
    public Integer coreDiskSize;

    /**
     * <p>The disk type of core nodes. Valid values:</p>
     * <ul>
     * <li>cloud_efficiency: ultra cloud disk.</li>
     * <li>cloud_ssd: standard SSD.</li>
     * <li>local_hdd_pro: throughput-intensive local disk.</li>
     * <li>local_ssd_pro: I/O-intensive local disk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("CoreDiskType")
    public String coreDiskType;

    /**
     * <p>The node specifications of core nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    /**
     * <p>The number of core nodes. The minimum value is 4, and the increment is a multiple of 2.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("CoreNodeCount")
    public Integer coreNodeCount;

    /**
     * <p>The creation time in the current time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-15T18:04:52</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The creation time in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-15T10:04:52Z</p>
     */
    @NameInMap("CreatedTimeUTC")
    public String createdTimeUTC;

    /**
     * <p>The Unified Auto Renewal Cycle. This parameter is not returned for pay-as-you-go instances.</p>
     * <ul>
     * <li>Monthly subscription: The auto-renewal epoch is 1 month.</li>
     * <li>Yearly subscription: The auto-renewal epoch is 1 year (12 months).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The ID of the encryption key. This parameter is empty if encryption is not enabled.</p>
     * <blockquote>
     * <p>Cloud disk encryption cannot be disabled after it is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2a****</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption type. Valid values:</p>
     * <ul>
     * <li><p>NULL: Encryption is not enabled. This is the default value.</p>
     * </li>
     * <li><p>CloudDisk: Cloud disk encryption. The encryption key is specified by the <strong>EncryptionKey</strong> parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudDisk</p>
     */
    @NameInMap("EncryptionType")
    public String encryptionType;

    /**
     * <p>The service type. Currently, only hbaseue is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>hbaseue</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The expiration time in the current time zone. This parameter is returned only when PayType is set to Prepaid.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-16T08:00:00</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The expiration time in UTC. This parameter is returned only when PayType is set to Prepaid.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-16T00:00:00Z</p>
     */
    @NameInMap("ExpireTimeUTC")
    public String expireTimeUTC;

    /**
     * <p>The initial default password.</p>
     * 
     * <strong>example:</strong>
     * <p>yKcYVkFsULmC</p>
     */
    @NameInMap("InitialRootPassword")
    public String initialRootPassword;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-t4nn71xa0yn****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>mz_test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Indicates whether deletion protection is enabled. Valid values:</p>
     * <ul>
     * <li>True: Deletion protection is enabled. The instance cannot be deleted. An error message is returned if you attempt to delete the instance.</li>
     * <li>False: Deletion protection is disabled. The instance can be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDeletionProtection")
    public Boolean isDeletionProtection;

    /**
     * <p>The number of disks per log node.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogDiskCount")
    public String logDiskCount;

    /**
     * <p>The size of a single disk on a log node. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("LogDiskSize")
    public Integer logDiskSize;

    /**
     * <p>The disk type of log nodes. Valid values:</p>
     * <ul>
     * <li>cloud_efficiency: ultra cloud disk.</li>
     * <li>cloud_ssd: standard SSD.</li>
     * <li>local_hdd_pro: throughput-intensive local disk.</li>
     * <li>local_ssd_pro: I/O-intensive local disk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("LogDiskType")
    public String logDiskType;

    /**
     * <p>The node specifications of log nodes. You can call <a href="https://help.aliyun.com/document_detail/145796.html">DescribeInstanceType</a> to query the exact information.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("LogInstanceType")
    public String logInstanceType;

    /**
     * <p>The number of log nodes. The minimum value is 4, and the value must be a multiple of 4.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogNodeCount")
    public Integer logNodeCount;

    /**
     * <p>The end time of the O&amp;M window. The format is HH:MMZ, such as 20:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>06:00:00</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the O&amp;M window. The format is HH:MMZ, such as 20:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>02:00:00</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <p>The major version based on the engine type. Currently, only version 2.0 of hbaseue is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("MajorVersion")
    public String majorVersion;

    /**
     * <p>The disk size of master nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MasterDiskSize")
    public Integer masterDiskSize;

    /**
     * <p>The disk type of master nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("MasterDiskType")
    public String masterDiskType;

    /**
     * <p>The node specifications of master nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    /**
     * <p>The number of master nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MasterNodeCount")
    public Integer masterNodeCount;

    /**
     * <p>The module ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ModuleId")
    public Integer moduleId;

    /**
     * <p>The module software stack version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("ModuleStackVersion")
    public String moduleStackVersion;

    /**
     * <p>The zone combination of the multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1-abc-aliyun</p>
     */
    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    @NameInMap("MultiZoneInstanceModels")
    public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels multiZoneInstanceModels;

    /**
     * <p>The network type. Currently, only VPC is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The instance ID of the primary instance. This parameter is returned only when the instance is a component instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-fls1gf31y5s35****</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>Prepaid: subscription.</li>
     * <li>Postpaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The vSwitch ID of the primary zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-t4n3s1zd2gtidg****</p>
     */
    @NameInMap("PrimaryVSwitchIds")
    public String primaryVSwitchIds;

    /**
     * <p>The zone ID of the primary zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1a</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A02C0E6D-3A47-4FA0-BA7E-60793CE256DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-lk51f5fer315e****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The vSwitch ID of the secondary zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-t4nvvk7xur3rdi****</p>
     */
    @NameInMap("StandbyVSwitchIds")
    public String standbyVSwitchIds;

    /**
     * <p>The zone ID of the secondary zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1b</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The cluster status. Valid values:</p>
     * <ul>
     * <li>CREATING: The cluster is being created.</li>
     * <li>ACTIVATION: The cluster is running.</li>
     * <li>DELETING: The cluster is being deleted.</li>
     * <li>RESTARTING: The cluster is being restarted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public DescribeMultiZoneClusterResponseBodyTags tags;

    /**
     * <p>The progress of the task running on the instance, in percentage (%). Tasks initiated from the ApsaraDB for HBase console include specification changes, node scale-out, node scale-in, instance restart, and minor engine version update.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("TaskProgress")
    public String taskProgress;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>running: The task is running.</li>
     * <li>pause: The task is paused.</li>
     * <li>fail: The task is interrupted.</li>
     * <li>finish: The task is completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-t4nx81tmlixcq5****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeMultiZoneClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneClusterResponseBody self = new DescribeMultiZoneClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneClusterResponseBody setArbiterVSwitchIds(String arbiterVSwitchIds) {
        this.arbiterVSwitchIds = arbiterVSwitchIds;
        return this;
    }
    public String getArbiterVSwitchIds() {
        return this.arbiterVSwitchIds;
    }

    public DescribeMultiZoneClusterResponseBody setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public DescribeMultiZoneClusterResponseBody setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public DescribeMultiZoneClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeMultiZoneClusterResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeMultiZoneClusterResponseBody setColdStorageSize(Integer coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public Integer getColdStorageSize() {
        return this.coldStorageSize;
    }

    public DescribeMultiZoneClusterResponseBody setCoreDiskCount(String coreDiskCount) {
        this.coreDiskCount = coreDiskCount;
        return this;
    }
    public String getCoreDiskCount() {
        return this.coreDiskCount;
    }

    public DescribeMultiZoneClusterResponseBody setCoreDiskSize(Integer coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public DescribeMultiZoneClusterResponseBody setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public DescribeMultiZoneClusterResponseBody setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public DescribeMultiZoneClusterResponseBody setCoreNodeCount(Integer coreNodeCount) {
        this.coreNodeCount = coreNodeCount;
        return this;
    }
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    public DescribeMultiZoneClusterResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeMultiZoneClusterResponseBody setCreatedTimeUTC(String createdTimeUTC) {
        this.createdTimeUTC = createdTimeUTC;
        return this;
    }
    public String getCreatedTimeUTC() {
        return this.createdTimeUTC;
    }

    public DescribeMultiZoneClusterResponseBody setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public DescribeMultiZoneClusterResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeMultiZoneClusterResponseBody setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public DescribeMultiZoneClusterResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeMultiZoneClusterResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeMultiZoneClusterResponseBody setExpireTimeUTC(String expireTimeUTC) {
        this.expireTimeUTC = expireTimeUTC;
        return this;
    }
    public String getExpireTimeUTC() {
        return this.expireTimeUTC;
    }

    public DescribeMultiZoneClusterResponseBody setInitialRootPassword(String initialRootPassword) {
        this.initialRootPassword = initialRootPassword;
        return this;
    }
    public String getInitialRootPassword() {
        return this.initialRootPassword;
    }

    public DescribeMultiZoneClusterResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMultiZoneClusterResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeMultiZoneClusterResponseBody setIsDeletionProtection(Boolean isDeletionProtection) {
        this.isDeletionProtection = isDeletionProtection;
        return this;
    }
    public Boolean getIsDeletionProtection() {
        return this.isDeletionProtection;
    }

    public DescribeMultiZoneClusterResponseBody setLogDiskCount(String logDiskCount) {
        this.logDiskCount = logDiskCount;
        return this;
    }
    public String getLogDiskCount() {
        return this.logDiskCount;
    }

    public DescribeMultiZoneClusterResponseBody setLogDiskSize(Integer logDiskSize) {
        this.logDiskSize = logDiskSize;
        return this;
    }
    public Integer getLogDiskSize() {
        return this.logDiskSize;
    }

    public DescribeMultiZoneClusterResponseBody setLogDiskType(String logDiskType) {
        this.logDiskType = logDiskType;
        return this;
    }
    public String getLogDiskType() {
        return this.logDiskType;
    }

    public DescribeMultiZoneClusterResponseBody setLogInstanceType(String logInstanceType) {
        this.logInstanceType = logInstanceType;
        return this;
    }
    public String getLogInstanceType() {
        return this.logInstanceType;
    }

    public DescribeMultiZoneClusterResponseBody setLogNodeCount(Integer logNodeCount) {
        this.logNodeCount = logNodeCount;
        return this;
    }
    public Integer getLogNodeCount() {
        return this.logNodeCount;
    }

    public DescribeMultiZoneClusterResponseBody setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public DescribeMultiZoneClusterResponseBody setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public DescribeMultiZoneClusterResponseBody setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public DescribeMultiZoneClusterResponseBody setMasterDiskSize(Integer masterDiskSize) {
        this.masterDiskSize = masterDiskSize;
        return this;
    }
    public Integer getMasterDiskSize() {
        return this.masterDiskSize;
    }

    public DescribeMultiZoneClusterResponseBody setMasterDiskType(String masterDiskType) {
        this.masterDiskType = masterDiskType;
        return this;
    }
    public String getMasterDiskType() {
        return this.masterDiskType;
    }

    public DescribeMultiZoneClusterResponseBody setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public DescribeMultiZoneClusterResponseBody setMasterNodeCount(Integer masterNodeCount) {
        this.masterNodeCount = masterNodeCount;
        return this;
    }
    public Integer getMasterNodeCount() {
        return this.masterNodeCount;
    }

    public DescribeMultiZoneClusterResponseBody setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public Integer getModuleId() {
        return this.moduleId;
    }

    public DescribeMultiZoneClusterResponseBody setModuleStackVersion(String moduleStackVersion) {
        this.moduleStackVersion = moduleStackVersion;
        return this;
    }
    public String getModuleStackVersion() {
        return this.moduleStackVersion;
    }

    public DescribeMultiZoneClusterResponseBody setMultiZoneCombination(String multiZoneCombination) {
        this.multiZoneCombination = multiZoneCombination;
        return this;
    }
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    public DescribeMultiZoneClusterResponseBody setMultiZoneInstanceModels(DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels multiZoneInstanceModels) {
        this.multiZoneInstanceModels = multiZoneInstanceModels;
        return this;
    }
    public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels getMultiZoneInstanceModels() {
        return this.multiZoneInstanceModels;
    }

    public DescribeMultiZoneClusterResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeMultiZoneClusterResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeMultiZoneClusterResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeMultiZoneClusterResponseBody setPrimaryVSwitchIds(String primaryVSwitchIds) {
        this.primaryVSwitchIds = primaryVSwitchIds;
        return this;
    }
    public String getPrimaryVSwitchIds() {
        return this.primaryVSwitchIds;
    }

    public DescribeMultiZoneClusterResponseBody setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public DescribeMultiZoneClusterResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMultiZoneClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMultiZoneClusterResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeMultiZoneClusterResponseBody setStandbyVSwitchIds(String standbyVSwitchIds) {
        this.standbyVSwitchIds = standbyVSwitchIds;
        return this;
    }
    public String getStandbyVSwitchIds() {
        return this.standbyVSwitchIds;
    }

    public DescribeMultiZoneClusterResponseBody setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public DescribeMultiZoneClusterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeMultiZoneClusterResponseBody setTags(DescribeMultiZoneClusterResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeMultiZoneClusterResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeMultiZoneClusterResponseBody setTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
        return this;
    }
    public String getTaskProgress() {
        return this.taskProgress;
    }

    public DescribeMultiZoneClusterResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeMultiZoneClusterResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel extends TeaModel {
        @NameInMap("HdfsMinorVersion")
        public String hdfsMinorVersion;

        @NameInMap("InsName")
        public String insName;

        @NameInMap("IsHdfsLatestVersion")
        public String isHdfsLatestVersion;

        @NameInMap("IsLatestVersion")
        public Boolean isLatestVersion;

        @NameInMap("LatestHdfsMinorVersion")
        public String latestHdfsMinorVersion;

        @NameInMap("LatestMinorVersion")
        public String latestMinorVersion;

        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("Role")
        public String role;

        @NameInMap("Status")
        public String status;

        public static DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel self = new DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setHdfsMinorVersion(String hdfsMinorVersion) {
            this.hdfsMinorVersion = hdfsMinorVersion;
            return this;
        }
        public String getHdfsMinorVersion() {
            return this.hdfsMinorVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setIsHdfsLatestVersion(String isHdfsLatestVersion) {
            this.isHdfsLatestVersion = isHdfsLatestVersion;
            return this;
        }
        public String getIsHdfsLatestVersion() {
            return this.isHdfsLatestVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setIsLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }
        public Boolean getIsLatestVersion() {
            return this.isLatestVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setLatestHdfsMinorVersion(String latestHdfsMinorVersion) {
            this.latestHdfsMinorVersion = latestHdfsMinorVersion;
            return this;
        }
        public String getLatestHdfsMinorVersion() {
            return this.latestHdfsMinorVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setLatestMinorVersion(String latestMinorVersion) {
            this.latestMinorVersion = latestMinorVersion;
            return this;
        }
        public String getLatestMinorVersion() {
            return this.latestMinorVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels extends TeaModel {
        @NameInMap("MultiZoneInstanceModel")
        public java.util.List<DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel> multiZoneInstanceModel;

        public static DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels self = new DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels setMultiZoneInstanceModel(java.util.List<DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel> multiZoneInstanceModel) {
            this.multiZoneInstanceModel = multiZoneInstanceModel;
            return this;
        }
        public java.util.List<DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel> getMultiZoneInstanceModel() {
            return this.multiZoneInstanceModel;
        }

    }

    public static class DescribeMultiZoneClusterResponseBodyTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeMultiZoneClusterResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneClusterResponseBodyTagsTag self = new DescribeMultiZoneClusterResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneClusterResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMultiZoneClusterResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMultiZoneClusterResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeMultiZoneClusterResponseBodyTagsTag> tag;

        public static DescribeMultiZoneClusterResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneClusterResponseBodyTags self = new DescribeMultiZoneClusterResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneClusterResponseBodyTags setTag(java.util.List<DescribeMultiZoneClusterResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeMultiZoneClusterResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}

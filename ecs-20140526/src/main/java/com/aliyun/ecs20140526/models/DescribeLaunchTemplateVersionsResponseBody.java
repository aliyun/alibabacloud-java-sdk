// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplateVersionsResponseBody extends TeaModel {
    /**
     * <p>Details about the launch template versions.</p>
     */
    @NameInMap("LaunchTemplateVersionSets")
    public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets launchTemplateVersionSets;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3989ED0C-20A1-4351-A127-2067FF8390AX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of launch templates.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLaunchTemplateVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplateVersionsResponseBody self = new DescribeLaunchTemplateVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplateVersionsResponseBody setLaunchTemplateVersionSets(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets launchTemplateVersionSets) {
        this.launchTemplateVersionSets = launchTemplateVersionSets;
        return this;
    }
    public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets getLaunchTemplateVersionSets() {
        return this.launchTemplateVersionSets;
    }

    public DescribeLaunchTemplateVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLaunchTemplateVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLaunchTemplateVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLaunchTemplateVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("Iops")
        public Integer iops;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        @NameInMap("Size")
        public Integer size;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setIops(Integer iops) {
            this.iops = iops;
            return this;
        }
        public Integer getIops() {
            return this.iops;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-wz91dz3ghear2a5s****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Indicates whether the performance burst feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Indicates whether to release the data disk when the instance is released.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>testDiskDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data disk. The mount points are named based on the number of data disks:</p>
         * <ul>
         * <li>1st to 25th data disks: /dev/xvd<code>[b-z]</code>.</li>
         * <li>From the 26th data disk on: /dev/xvd<code>[aa-zz]</code>. For example, the 26th data disk is named /dev/xvdaa, the 27th data disk is named /dev/xvdab, and so on.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is applicable to scenarios in which a full image is used to create instances. A full image is an image that contains an operating system, application software, and business data. For these scenarios, you can set the parameter to the mount point of data disk N contained in the full image and modify <code>DataDisk.N.Size</code> and <code>DataDisk.N.Category</code> to change the category and size of data disk N created based on the image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvda</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>testDiskName</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Indicates whether the data disk is encrypted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD to use as a data disk. This parameter is returned only when the value of <code>Category</code> is cloud_essd. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
         * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p> This parameter is available only if you set DataDisk.N.Category to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the performance configurations of an ESSD AutoPL disk</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot to use to create the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp67acfmxazb4p****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk> dataDisk;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks setDataDisk(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface extends TeaModel {
        /**
         * <p>Indicates whether to retain the ENI when the associated instance is released. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteOnRelease")
        public Boolean deleteOnRelease;

        /**
         * <p>The description of the secondary ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>testNetworkInterfacesDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.s2.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The name of the secondary ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>testNetworkInterfaceName</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The communication mode of the primary ENI. Valid values:</p>
         * <ul>
         * <li>Standard: uses the TCP communication mode.</li>
         * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The primary private IP address of the secondary ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.<em>.</em></p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>The ID of the security group to which to assign the secondary ENI. The security group and the ENI must belong to the same VPC.</p>
         * <blockquote>
         * <p> SecurityGroupId and SecurityGroupIds are mutually exclusive in the response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of the security groups to which to assign the secondary ENI.</p>
         * <blockquote>
         * <p> SecurityGroupId and SecurityGroupIds are mutually exclusive in the response.</p>
         * </blockquote>
         */
        @NameInMap("SecurityGroupIds")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds securityGroupIds;

        /**
         * <p>The ID of the vSwitch to which to connect the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp67acfmxazb4p****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setDeleteOnRelease(Boolean deleteOnRelease) {
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }
        public Boolean getDeleteOnRelease() {
            return this.deleteOnRelease;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setSecurityGroupIds(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface> networkInterface;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces setNetworkInterface(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag extends TeaModel {
        /**
         * <p>The key of the tag to add to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag to add to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags extends TeaModel {
        @NameInMap("InstanceTag")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag> instanceTag;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags setInstanceTag(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag> instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag> getInstanceTag() {
            return this.instanceTag;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData extends TeaModel {
        @NameInMap("SystemDisk")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk systemDisk;

        /**
         * <p>The automatic release time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-05-14T14:18:00Z</p>
         */
        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        /**
         * <p>Indicates whether auto-renewal is enabled for the instance. This parameter is valid only if <code>InstanceChargeType</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal period of the instance. Valid values:</p>
         * <p>Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoRenewPeriod")
        public Integer autoRenewPeriod;

        /**
         * <p>The performance mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: the standard mode. For more information, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * <li>Unlimited: the unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        /**
         * <p>Details about the data disks.</p>
         */
        @NameInMap("DataDisks")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks dataDisks;

        /**
         * <p>Indicates whether release protection is enabled for the instance. This parameter indicates whether you can use the ECS console or call the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation to release the instance. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> This parameter is applicable only to pay-as-you-go instances. The release protection feature can protect instances against manual releases, but not against automatic releases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The ID of the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1brhwhoqinyjd6****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The description of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>testInstanceDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the operating system configuration of the instance is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableVmOsConfig")
        public Boolean enableVmOsConfig;

        /**
         * <p>The hostname of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testHostName</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>Indicates whether the access channel is enabled for instance metadata. Valid values:</p>
         * <ul>
         * <li>enabled</li>
         * <li>disabled</li>
         * </ul>
         * <p>Default value: enabled.</p>
         * <blockquote>
         * <p> For information about instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Obtain information about an ECS instance, such as instance attributes, by using instance metadata</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("HttpEndpoint")
        public String httpEndpoint;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HttpPutResponseHopLimit")
        public Integer httpPutResponseHopLimit;

        /**
         * <p>Indicates whether the security hardening mode (IMDSv2) is forcefully used to access instance metadata. Valid values:</p>
         * <ul>
         * <li>optional: The security hardening mode (IMDSv2) is not forcefully used.</li>
         * <li>required: The security hardening mode (IMDSv2) is forcefully used. After you set this parameter to required, you cannot access instance metadata in normal mode.</li>
         * </ul>
         * <p>Default value: optional.</p>
         * <blockquote>
         * <p> For more information about the modes of accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Obtain information about an ECS instance, such as instance attributes, by using instance metadata</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("HttpTokens")
        public String httpTokens;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp67acfmxazb4p****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The source of the image. Valid values:</p>
         * <ul>
         * <li>system: public image provided by Alibaba Cloud</li>
         * <li>self: custom image that you created</li>
         * <li>others: shared image from another Alibaba Cloud account</li>
         * <li>marketplace: Alibaba Cloud Marketplace image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription</li>
         * <li>PostPaid: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testInstanceName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The billing method for network usage.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The maximum inbound public bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        /**
         * <p>The maximum outbound public bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>Indicates whether the instance is I/O optimized.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("IoOptimized")
        public String ioOptimized;

        /**
         * <p>The number of IPv6 addresses to assign to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>testKeyPairName</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>Details about the secondary elastic network interfaces (ENIs).</p>
         */
        @NameInMap("NetworkInterfaces")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces networkInterfaces;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>classic: classic network</li>
         * <li>vpc: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>Indicates whether the username and password preset in the image are used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        /**
         * <p>The subscription duration of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the subscription period. Valid values:</p>
         * <p>Month (default)</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The private IP address to assign to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p><code>10.1.**.**</code></p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The name of the instance Resource Access Management (RAM) role.</p>
         * 
         * <strong>example:</strong>
         * <p>testRamRoleName</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The ID of the resource group to which the launch template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether Security Hardening is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        /**
         * <p>The ID of the security group to which to assign the instance.</p>
         * <blockquote>
         * <p> <code>SecurityGroupId</code> and <code>SecurityGroupIds</code> are mutually exclusive in the response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of the security groups to which to assign the instance.</p>
         * <blockquote>
         * <p> <code>SecurityGroupId</code> and <code>SecurityGroupIds</code> are mutually exclusive in the response.</p>
         * </blockquote>
         */
        @NameInMap("SecurityGroupIds")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds securityGroupIds;

        /**
         * <p>The protection period of the preemptible instance. Unit: hours. Valid values:</p>
         * <ul>
         * <li>1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * <li>0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * </ul>
         * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.</p>
         * <blockquote>
         * <p> This parameter is returned when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The maximum hourly price of the preemptible instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.98</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The bidding policy for the pay-as-you-go instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price. The market price can be up to the pay-as-you-go price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The tags to add to the instance.</p>
         */
        @NameInMap("Tags")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags tags;

        /**
         * <p>The user data of the instance, which is Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>SGVsbG9FQ1M=</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The ID of the vSwitch to which to connect the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp67acfmxazb4p****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>v-bp67acfmxazb4p****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSystemDisk(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setDataDisks(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks getDataDisks() {
            return this.dataDisks;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setEnableVmOsConfig(Boolean enableVmOsConfig) {
            this.enableVmOsConfig = enableVmOsConfig;
            return this;
        }
        public Boolean getEnableVmOsConfig() {
            return this.enableVmOsConfig;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setHttpEndpoint(String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }
        public String getHttpEndpoint() {
            return this.httpEndpoint;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }
        public Integer getHttpPutResponseHopLimit() {
            return this.httpPutResponseHopLimit;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setHttpTokens(String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }
        public String getHttpTokens() {
            return this.httpTokens;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setNetworkInterfaces(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSecurityGroupIds(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setTags(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags getTags() {
            return this.tags;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet extends TeaModel {
        /**
         * <p>The time when the launch template version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-17T08:22:43Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the Alibaba Cloud account that created the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>Indicates whether the launch template version is the default version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultVersion")
        public Boolean defaultVersion;

        /**
         * <p>The configurations of the launch template.</p>
         */
        @NameInMap("LaunchTemplateData")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData launchTemplateData;

        /**
         * <p>The ID of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-bp67acfmxazb4p****</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The name of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>testLaunchTemplateName</p>
         */
        @NameInMap("LaunchTemplateName")
        public String launchTemplateName;

        /**
         * <p>The time when the launch template version was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-17T08:40:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The description of the launch template version.</p>
         * 
         * <strong>example:</strong>
         * <p>testVersionDescription</p>
         */
        @NameInMap("VersionDescription")
        public String versionDescription;

        /**
         * <p>The number of the launch template version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionNumber")
        public Long versionNumber;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setDefaultVersion(Boolean defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setLaunchTemplateData(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData launchTemplateData) {
            this.launchTemplateData = launchTemplateData;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData getLaunchTemplateData() {
            return this.launchTemplateData;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setLaunchTemplateName(String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setVersionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public Long getVersionNumber() {
            return this.versionNumber;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets extends TeaModel {
        @NameInMap("LaunchTemplateVersionSet")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet> launchTemplateVersionSet;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setLaunchTemplateVersionSet(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet> launchTemplateVersionSet) {
            this.launchTemplateVersionSet = launchTemplateVersionSet;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet> getLaunchTemplateVersionSet() {
            return this.launchTemplateVersionSet;
        }

    }

}

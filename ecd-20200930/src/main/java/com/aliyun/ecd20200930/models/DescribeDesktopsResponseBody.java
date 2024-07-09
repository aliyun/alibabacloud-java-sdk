// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsResponseBody extends TeaModel {
    /**
     * <p>The details about the cloud desktops.</p>
     */
    @NameInMap("Desktops")
    public java.util.List<DescribeDesktopsResponseBodyDesktops> desktops;

    /**
     * <p>The token that is used for the next query. If this parameter is left empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>484256DA-D816-44D2-9D86-B6EE4D5BA78C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsResponseBody self = new DescribeDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopsResponseBody setDesktops(java.util.List<DescribeDesktopsResponseBodyDesktops> desktops) {
        this.desktops = desktops;
        return this;
    }
    public java.util.List<DescribeDesktopsResponseBodyDesktops> getDesktops() {
        return this.desktops;
    }

    public DescribeDesktopsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDesktopsResponseBodyDesktopsDisks extends TeaModel {
        /**
         * <p>The disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-jedbpr4sl9l37****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The type of the disk.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SYSTEM: system disk</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DATA: data disk</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The performance level (PL) of the disk when an enhanced SSD (ESSD) is used. Valid values:</p>
         * <ul>
         * <li>PL0</li>
         * <li>PL1</li>
         * <li>PL2</li>
         * <li>PL3</li>
         * </ul>
         * <p>For more information about the differences among ESSDs at different PLs, see <a href="https://help.aliyun.com/document_detail/122389.html">Enhanced SSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static DescribeDesktopsResponseBodyDesktopsDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsDisks self = new DescribeDesktopsResponseBodyDesktopsDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDesktopsResponseBodyDesktopsDisks setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeDesktopsResponseBodyDesktopsDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeDesktopsResponseBodyDesktopsDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktopsFotaUpdate extends TeaModel {
        /**
         * <p>The current image version of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0-D-20220102.000000</p>
         */
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        /**
         * <p>The image version to which the cloud desktop can be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0-R-20220307.190736</p>
         */
        @NameInMap("NewAppVersion")
        public String newAppVersion;

        /**
         * <p>The description of the image version to which the cloud desktop can be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade package for testing 03-07</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The English description of the image version to which the cloud desktop can be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>Release note</p>
         */
        @NameInMap("ReleaseNoteEn")
        public String releaseNoteEn;

        /**
         * <p>The Japanese description of the image version to which the cloud desktop can be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>リリースノート</p>
         */
        @NameInMap("ReleaseNoteJp")
        public String releaseNoteJp;

        /**
         * <p>The size of the installation package for the image to which the cloud desktop can be updated. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>108815097</p>
         */
        @NameInMap("Size")
        public Long size;

        public static DescribeDesktopsResponseBodyDesktopsFotaUpdate build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsFotaUpdate self = new DescribeDesktopsResponseBodyDesktopsFotaUpdate();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsFotaUpdate setCurrentAppVersion(String currentAppVersion) {
            this.currentAppVersion = currentAppVersion;
            return this;
        }
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        public DescribeDesktopsResponseBodyDesktopsFotaUpdate setNewAppVersion(String newAppVersion) {
            this.newAppVersion = newAppVersion;
            return this;
        }
        public String getNewAppVersion() {
            return this.newAppVersion;
        }

        public DescribeDesktopsResponseBodyDesktopsFotaUpdate setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeDesktopsResponseBodyDesktopsFotaUpdate setReleaseNoteEn(String releaseNoteEn) {
            this.releaseNoteEn = releaseNoteEn;
            return this;
        }
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        public DescribeDesktopsResponseBodyDesktopsFotaUpdate setReleaseNoteJp(String releaseNoteJp) {
            this.releaseNoteJp = releaseNoteJp;
            return this;
        }
        public String getReleaseNoteJp() {
            return this.releaseNoteJp;
        }

        public DescribeDesktopsResponseBodyDesktopsFotaUpdate setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktopsResourceGroups extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static DescribeDesktopsResponseBodyDesktopsResourceGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsResourceGroups self = new DescribeDesktopsResponseBodyDesktopsResourceGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsResourceGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDesktopsResponseBodyDesktopsResourceGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktopsSessions extends TeaModel {
        /**
         * <p>The ID of the end user who logged on to the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>29615820929547****</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The time when the desktop session was established.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-07T08:23Z</p>
         */
        @NameInMap("EstablishmentTime")
        public String establishmentTime;

        /**
         * <p>The name of the external user.</p>
         * 
         * <strong>example:</strong>
         * <p>Testname</p>
         */
        @NameInMap("ExternalUserName")
        public String externalUserName;

        public static DescribeDesktopsResponseBodyDesktopsSessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsSessions self = new DescribeDesktopsResponseBodyDesktopsSessions();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsSessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeDesktopsResponseBodyDesktopsSessions setEstablishmentTime(String establishmentTime) {
            this.establishmentTime = establishmentTime;
            return this;
        }
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

        public DescribeDesktopsResponseBodyDesktopsSessions setExternalUserName(String externalUserName) {
            this.externalUserName = externalUserName;
            return this;
        }
        public String getExternalUserName() {
            return this.externalUserName;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktopsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDesktopsResponseBodyDesktopsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsTags self = new DescribeDesktopsResponseBodyDesktopsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDesktopsResponseBodyDesktopsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktops extends TeaModel {
        /**
         * <p>The number of sessions that are allowed for each cloud desktop in the multi-session desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BindAmount")
        public Integer bindAmount;

        /**
         * <p>The ID of the desktop template that is used to create the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>b-2g65ljy4291vl****</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The name of the desktop template that is used to create the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("BundleName")
        public String bundleName;

        /**
         * <p>The billing method of the cloud desktop.</p>
         * <p>Default value: PostPaid. Valid values:</p>
         * <ul>
         * <li><p>Postpaid: pay-as-you-go</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>PrePaid: subscription</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The connection status of the end user.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Unknown</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Connected</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Disconnected</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disconnected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the cloud desktop was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-06T08:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        /**
         * <p>The ID of the desktop group to which the cloud desktop belongs. Default value: null.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The cloud desktop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The cloud desktop name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesktopName</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The status of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The type of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd.basic.large</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The directory ID. The value of this parameter is the same as the workspace ID that is indicated by the OfficeSiteId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>Details of the disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> disks;

        /**
         * <p>The number of times for which the cloud desktop can be downgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DowngradeQuota")
        public Long downgradeQuota;

        /**
         * <p>The number of times for which the cloud desktop has been downgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DowngradedTimes")
        public Long downgradedTimes;

        /**
         * <p>The IDs of the end users who are authorized to connect to the cloud desktop.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The time when the subscription cloud desktop expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-31T15:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The information about the image version that the cloud desktop uses.</p>
         */
        @NameInMap("FotaUpdate")
        public DescribeDesktopsResponseBodyDesktopsFotaUpdate fotaUpdate;

        /**
         * <p>Indicates whether the cloud desktop is a GPU-accelerated desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GpuCategory")
        public Long gpuCategory;

        /**
         * <p>The number of GPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The version number of the GPU driver of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The GPU Specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>NVIDIA T4</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HibernationBeta")
        public Boolean hibernationBeta;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HibernationOptionsConfigured")
        public Boolean hibernationOptionsConfigured;

        /**
         * <p>The hostname of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-4zfb6zj728hhr****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The flag that is used to manage the cloud desktop.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Updating: The configurations of the cloud desktop are being updated.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>NoFlag: No flags are available.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoFlag</p>
         */
        @NameInMap("ManagementFlag")
        public String managementFlag;

        /**
         * <p>The flags that are used to manage the cloud desktops.</p>
         */
        @NameInMap("ManagementFlags")
        public java.util.List<String> managementFlags;

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The ID of the secondary network interface controller (NIC) created by the RAM or Active Directory (AD) user in Elastic Desktop Service (EDS). You do not have permissions to modify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The IP address of the secondary NIC that is created by the RAM or AD user in EDS.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.74.165</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The account type of the workspace.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SIMPLE: convenience account</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>AD_CONNECTOR: enterprise AD account</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The virtual private cloud (VPC) type of the workspace.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>standard</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>customized</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>basic</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("OfficeSiteVpcType")
        public String officeSiteVpcType;

        /**
         * <p>The OS that is defined in the desktop template.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The information about the OS platform. Valid values:</p>
         * <ul>
         * <li>CentOS</li>
         * <li>Ubuntu</li>
         * <li>Windows Server 2016</li>
         * <li>Windows Server 2019</li>
         * <li>UOS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ubuntu</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>system-all-enabled-policy</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The policy IDs.</p>
         */
        @NameInMap("PolicyGroupIdList")
        public java.util.List<String> policyGroupIdList;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        /**
         * <p>The policy names.</p>
         */
        @NameInMap("PolicyGroupNameList")
        public java.util.List<String> policyGroupNameList;

        /**
         * <p>The progress when the cloud desktop was created.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The protocol.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>HDX: High-definition Experience (HDX) protocol</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ASP: Adaptive Streaming Protocol (ASP) developed by Alibaba Cloud</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("ResourceGroups")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsResourceGroups> resourceGroups;

        /**
         * <p>The type of the session.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SINGLE_SESSION</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>MULTIPLE_SESSION</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SINGLE_SESSION</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        /**
         * <p>The information about the desktop sessions of end users.</p>
         */
        @NameInMap("Sessions")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> sessions;

        /**
         * <p>The ID of the snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-gi007jgyc3kcey2bb</p>
         */
        @NameInMap("SnapshotPolicyId")
        public String snapshotPolicyId;

        /**
         * <p>The name of the snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>testSnapshotName</p>
         */
        @NameInMap("SnapshotPolicyName")
        public String snapshotPolicyName;

        /**
         * <p>The time when the cloud desktop was first started.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-06T08:31Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Indicates whether the cloud desktop supports hibernation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportHibernation")
        public Boolean supportHibernation;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>Details about the tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsTags> tags;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to query the list of KMS keys.</p>
         * 
         * <strong>example:</strong>
         * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
         */
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        /**
         * <p>The zone type. Default value: <strong>AvailabilityZone</strong>. This value indicates Alibaba Cloud zones.</p>
         * 
         * <strong>example:</strong>
         * <p>AvailabilityZone</p>
         */
        @NameInMap("ZoneType")
        public String zoneType;

        public static DescribeDesktopsResponseBodyDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktops self = new DescribeDesktopsResponseBodyDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktops setBindAmount(Integer bindAmount) {
            this.bindAmount = bindAmount;
            return this;
        }
        public Integer getBindAmount() {
            return this.bindAmount;
        }

        public DescribeDesktopsResponseBodyDesktops setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public DescribeDesktopsResponseBodyDesktops setBundleName(String bundleName) {
            this.bundleName = bundleName;
            return this;
        }
        public String getBundleName() {
            return this.bundleName;
        }

        public DescribeDesktopsResponseBodyDesktops setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDesktopsResponseBodyDesktops setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeDesktopsResponseBodyDesktops setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeDesktopsResponseBodyDesktops setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDesktopsResponseBodyDesktops setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeDesktopsResponseBodyDesktops setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeDesktopsResponseBodyDesktops setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeDesktopsResponseBodyDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopsResponseBodyDesktops setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeDesktopsResponseBodyDesktops setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeDesktopsResponseBodyDesktops setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeDesktopsResponseBodyDesktops setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDesktopsResponseBodyDesktops setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeDesktopsResponseBodyDesktops setDisks(java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> getDisks() {
            return this.disks;
        }

        public DescribeDesktopsResponseBodyDesktops setDowngradeQuota(Long downgradeQuota) {
            this.downgradeQuota = downgradeQuota;
            return this;
        }
        public Long getDowngradeQuota() {
            return this.downgradeQuota;
        }

        public DescribeDesktopsResponseBodyDesktops setDowngradedTimes(Long downgradedTimes) {
            this.downgradedTimes = downgradedTimes;
            return this;
        }
        public Long getDowngradedTimes() {
            return this.downgradedTimes;
        }

        public DescribeDesktopsResponseBodyDesktops setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public DescribeDesktopsResponseBodyDesktops setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDesktopsResponseBodyDesktops setFotaUpdate(DescribeDesktopsResponseBodyDesktopsFotaUpdate fotaUpdate) {
            this.fotaUpdate = fotaUpdate;
            return this;
        }
        public DescribeDesktopsResponseBodyDesktopsFotaUpdate getFotaUpdate() {
            return this.fotaUpdate;
        }

        public DescribeDesktopsResponseBodyDesktops setGpuCategory(Long gpuCategory) {
            this.gpuCategory = gpuCategory;
            return this;
        }
        public Long getGpuCategory() {
            return this.gpuCategory;
        }

        public DescribeDesktopsResponseBodyDesktops setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public DescribeDesktopsResponseBodyDesktops setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public DescribeDesktopsResponseBodyDesktops setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeDesktopsResponseBodyDesktops setHibernationBeta(Boolean hibernationBeta) {
            this.hibernationBeta = hibernationBeta;
            return this;
        }
        public Boolean getHibernationBeta() {
            return this.hibernationBeta;
        }

        public DescribeDesktopsResponseBodyDesktops setHibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
            this.hibernationOptionsConfigured = hibernationOptionsConfigured;
            return this;
        }
        public Boolean getHibernationOptionsConfigured() {
            return this.hibernationOptionsConfigured;
        }

        public DescribeDesktopsResponseBodyDesktops setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeDesktopsResponseBodyDesktops setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopsResponseBodyDesktops setManagementFlag(String managementFlag) {
            this.managementFlag = managementFlag;
            return this;
        }
        public String getManagementFlag() {
            return this.managementFlag;
        }

        public DescribeDesktopsResponseBodyDesktops setManagementFlags(java.util.List<String> managementFlags) {
            this.managementFlags = managementFlags;
            return this;
        }
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        public DescribeDesktopsResponseBodyDesktops setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeDesktopsResponseBodyDesktops setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeDesktopsResponseBodyDesktops setNetworkInterfaceIp(String networkInterfaceIp) {
            this.networkInterfaceIp = networkInterfaceIp;
            return this;
        }
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        public DescribeDesktopsResponseBodyDesktops setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeDesktopsResponseBodyDesktops setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeDesktopsResponseBodyDesktops setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeDesktopsResponseBodyDesktops setOfficeSiteVpcType(String officeSiteVpcType) {
            this.officeSiteVpcType = officeSiteVpcType;
            return this;
        }
        public String getOfficeSiteVpcType() {
            return this.officeSiteVpcType;
        }

        public DescribeDesktopsResponseBodyDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeDesktopsResponseBodyDesktops setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeDesktopsResponseBodyDesktops setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeDesktopsResponseBodyDesktops setPolicyGroupIdList(java.util.List<String> policyGroupIdList) {
            this.policyGroupIdList = policyGroupIdList;
            return this;
        }
        public java.util.List<String> getPolicyGroupIdList() {
            return this.policyGroupIdList;
        }

        public DescribeDesktopsResponseBodyDesktops setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        public DescribeDesktopsResponseBodyDesktops setPolicyGroupNameList(java.util.List<String> policyGroupNameList) {
            this.policyGroupNameList = policyGroupNameList;
            return this;
        }
        public java.util.List<String> getPolicyGroupNameList() {
            return this.policyGroupNameList;
        }

        public DescribeDesktopsResponseBodyDesktops setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDesktopsResponseBodyDesktops setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeDesktopsResponseBodyDesktops setResourceGroups(java.util.List<DescribeDesktopsResponseBodyDesktopsResourceGroups> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsResourceGroups> getResourceGroups() {
            return this.resourceGroups;
        }

        public DescribeDesktopsResponseBodyDesktops setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public DescribeDesktopsResponseBodyDesktops setSessions(java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> getSessions() {
            return this.sessions;
        }

        public DescribeDesktopsResponseBodyDesktops setSnapshotPolicyId(String snapshotPolicyId) {
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }
        public String getSnapshotPolicyId() {
            return this.snapshotPolicyId;
        }

        public DescribeDesktopsResponseBodyDesktops setSnapshotPolicyName(String snapshotPolicyName) {
            this.snapshotPolicyName = snapshotPolicyName;
            return this;
        }
        public String getSnapshotPolicyName() {
            return this.snapshotPolicyName;
        }

        public DescribeDesktopsResponseBodyDesktops setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDesktopsResponseBodyDesktops setSupportHibernation(Boolean supportHibernation) {
            this.supportHibernation = supportHibernation;
            return this;
        }
        public Boolean getSupportHibernation() {
            return this.supportHibernation;
        }

        public DescribeDesktopsResponseBodyDesktops setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeDesktopsResponseBodyDesktops setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeDesktopsResponseBodyDesktops setTags(java.util.List<DescribeDesktopsResponseBodyDesktopsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsTags> getTags() {
            return this.tags;
        }

        public DescribeDesktopsResponseBodyDesktops setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public DescribeDesktopsResponseBodyDesktops setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        public DescribeDesktopsResponseBodyDesktops setZoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }
        public String getZoneType() {
            return this.zoneType;
        }

    }

}

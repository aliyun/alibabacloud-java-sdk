// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsResponseBody extends TeaModel {
    /**
     * <p>The cloud computers.</p>
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
     * <p>The page number.</p>
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
     * <p>484256DA-D816-44D2-9D86-B6EE4D5BA78C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of cloud computers.</p>
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

    public DescribeDesktopsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDesktopsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public static class DescribeDesktopsResponseBodyDesktopsDesktopDurationList extends TeaModel {
        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        @NameInMap("PackageCreationTime")
        public String packageCreationTime;

        @NameInMap("PackageExpiredTime")
        public String packageExpiredTime;

        @NameInMap("PackageId")
        public String packageId;

        @NameInMap("PackageStatus")
        public String packageStatus;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("PackageUsedUpStrategy")
        public String packageUsedUpStrategy;

        @NameInMap("PeriodEndTime")
        public String periodEndTime;

        @NameInMap("PeriodStartTime")
        public String periodStartTime;

        @NameInMap("PostPaidLimitFee")
        public Float postPaidLimitFee;

        @NameInMap("TotalDuration")
        public Long totalDuration;

        @NameInMap("UsedDuration")
        public Long usedDuration;

        public static DescribeDesktopsResponseBodyDesktopsDesktopDurationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsDesktopDurationList self = new DescribeDesktopsResponseBodyDesktopsDesktopDurationList();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setPackageCreationTime(String packageCreationTime) {
            this.packageCreationTime = packageCreationTime;
            return this;
        }
        public String getPackageCreationTime() {
            return this.packageCreationTime;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setPackageExpiredTime(String packageExpiredTime) {
            this.packageExpiredTime = packageExpiredTime;
            return this;
        }
        public String getPackageExpiredTime() {
            return this.packageExpiredTime;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
            return this;
        }
        public String getPackageStatus() {
            return this.packageStatus;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setPackageUsedUpStrategy(String packageUsedUpStrategy) {
            this.packageUsedUpStrategy = packageUsedUpStrategy;
            return this;
        }
        public String getPackageUsedUpStrategy() {
            return this.packageUsedUpStrategy;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setPeriodEndTime(String periodEndTime) {
            this.periodEndTime = periodEndTime;
            return this;
        }
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setPeriodStartTime(String periodStartTime) {
            this.periodStartTime = periodStartTime;
            return this;
        }
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setPostPaidLimitFee(Float postPaidLimitFee) {
            this.postPaidLimitFee = postPaidLimitFee;
            return this;
        }
        public Float getPostPaidLimitFee() {
            return this.postPaidLimitFee;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public DescribeDesktopsResponseBodyDesktopsDesktopDurationList setUsedDuration(Long usedDuration) {
            this.usedDuration = usedDuration;
            return this;
        }
        public Long getUsedDuration() {
            return this.usedDuration;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktopsDisks extends TeaModel {
        /**
         * <p>The type of the disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_auto: standard SSD.</li>
         * <li>cloud_essd: enhanced SSD (ESSD).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

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
         * <p>The performance level (PL) of the disk when an enterprise SSD (ESSD) is used.</p>
         * <p>For more information about the differences among enterprise SSDs (ESSDs) at different PLs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PL1</li>
         * <li>PL0</li>
         * <li>PL3</li>
         * <li>PL2</li>
         * </ul>
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

        public DescribeDesktopsResponseBodyDesktopsDisks setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
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
         * <p>The current image version of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0-D-20220102.000000</p>
         */
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        /**
         * <p>The version number to which the image of the cloud computer can be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0-R-20220307.190736</p>
         */
        @NameInMap("NewAppVersion")
        public String newAppVersion;

        /**
         * <p>The description of the version to which the image of the cloud computer can be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade package for testing 03-07</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The English description of the version to which the image of the cloud computer can be updated.</p>
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

    public static class DescribeDesktopsResponseBodyDesktopsOsUpdatePackages extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Kb")
        public String kb;

        @NameInMap("Title")
        public String title;

        public static DescribeDesktopsResponseBodyDesktopsOsUpdatePackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsOsUpdatePackages self = new DescribeDesktopsResponseBodyDesktopsOsUpdatePackages();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsOsUpdatePackages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDesktopsResponseBodyDesktopsOsUpdatePackages setKb(String kb) {
            this.kb = kb;
            return this;
        }
        public String getKb() {
            return this.kb;
        }

        public DescribeDesktopsResponseBodyDesktopsOsUpdatePackages setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktopsOsUpdate extends TeaModel {
        @NameInMap("CheckId")
        public String checkId;

        @NameInMap("PackageCount")
        public Integer packageCount;

        @NameInMap("Packages")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsOsUpdatePackages> packages;

        public static DescribeDesktopsResponseBodyDesktopsOsUpdate build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsOsUpdate self = new DescribeDesktopsResponseBodyDesktopsOsUpdate();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsOsUpdate setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public DescribeDesktopsResponseBodyDesktopsOsUpdate setPackageCount(Integer packageCount) {
            this.packageCount = packageCount;
            return this;
        }
        public Integer getPackageCount() {
            return this.packageCount;
        }

        public DescribeDesktopsResponseBodyDesktopsOsUpdate setPackages(java.util.List<DescribeDesktopsResponseBodyDesktopsOsUpdatePackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsOsUpdatePackages> getPackages() {
            return this.packages;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktopsResourceGroups extends TeaModel {
        /**
         * <p>The ID of the enterprise resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-4hsvzbbmqdzu3s****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the enterprise resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource group 01</p>
         */
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
         * <p>The ID of the end user that connects to the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>29615820929547****</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The time when the cloud computer session was established.</p>
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
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The number of concurrent sessions of each cloud computer in a multi-session cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BindAmount")
        public Integer bindAmount;

        /**
         * <p>The ID of the template used to create the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>b-2g65ljy4291vl****</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The name of the template used to create the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("BundleName")
        public String bundleName;

        /**
         * <p>The billing method of the cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Postpaid (default): pay-as-you-go</li>
         * <li>PrePaid: subscription</li>
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
         * <p>The time when the cloud computer was created.</p>
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

        @NameInMap("DesktopDurationList")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsDesktopDurationList> desktopDurationList;

        /**
         * <p>The ID of the cloud computer pool to which cloud computers belong. Default value: null.``</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesktopName</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The cloud computer status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The cloud computer type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd.basic.large</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The directory ID, which is the same as the office network ID (OfficeSiteId).</p>
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
         * <p>The information about the disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> disks;

        @NameInMap("DomainType")
        public String domainType;

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
         * <p>The end user IDs.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        @NameInMap("EntraDomainName")
        public String entraDomainName;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The time when a subscription cloud computer expired.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-31T15:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The information about the image version of the cloud computer.</p>
         */
        @NameInMap("FotaUpdate")
        public DescribeDesktopsResponseBodyDesktopsFotaUpdate fotaUpdate;

        /**
         * <p>Indicates whether the cloud computer uses GPUs.</p>
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
         * <p>The GPU driver version used by the cloud computer.</p>
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

        @NameInMap("IsLdap")
        public Boolean isLdap;

        /**
         * <p>The flag that is used to manage the cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Migrating: The cloud computer is being migrated.</li>
         * <li>Updating: The configurations of the cloud computer are being updated.</li>
         * <li>NoFlag: No flags are available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoFlag</p>
         */
        @NameInMap("ManagementFlag")
        public String managementFlag;

        /**
         * <p>The flags that are used to manage the cloud computers.</p>
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
         * <p>The ID of the supplementary network interface controller (NIC) created by EDS within an RAM user or Active Directory (AD) user. You cannot modify the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The IP address of the supplementary NIC created by EDS within an RAM or AD user.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.74.165</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The office network name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The account type of the office network.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SIMPLE: convenience account</li>
         * <li>AD_CONNECTOR: enterprise AD account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The VPC type of the office network.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard</li>
         * <li>customized</li>
         * <li>basic</li>
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

        @NameInMap("OsUpdate")
        public DescribeDesktopsResponseBodyDesktopsOsUpdate osUpdate;

        /**
         * <p>The information about the OS platform.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Ubuntu</li>
         * <li>Windows Server 2022</li>
         * <li>UOS</li>
         * <li>CentOS</li>
         * <li>Windows Server 2019</li>
         * <li>Windows Server 2016</li>
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
         * <p>The IDs of the cloud computer policies.</p>
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
         * <p>The names of the cloud computer policies.</p>
         */
        @NameInMap("PolicyGroupNameList")
        public java.util.List<String> policyGroupNameList;

        /**
         * <p>The progress of creating the cloud computer.</p>
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
         * <li>HDX</li>
         * <li>ASP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The information about the enterprise resource groups.</p>
         */
        @NameInMap("ResourceGroups")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsResourceGroups> resourceGroups;

        @NameInMap("SerialNumber")
        public String serialNumber;

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
         * <p>The session information about cloud computers connected by end users.</p>
         */
        @NameInMap("Sessions")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> sessions;

        /**
         * <p>The snapshot policy ID.</p>
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
         * <p>The standard start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-24T06:38:02Z</p>
         */
        @NameInMap("StandardStartTime")
        public String standardStartTime;

        /**
         * <p>The time when the cloud computer was first started.</p>
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
         * <p>The zone type. Default value: <code>AvailabilityZone</code>. This value indicates Alibaba Cloud zones.</p>
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

        public DescribeDesktopsResponseBodyDesktops setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
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

        public DescribeDesktopsResponseBodyDesktops setDesktopDurationList(java.util.List<DescribeDesktopsResponseBodyDesktopsDesktopDurationList> desktopDurationList) {
            this.desktopDurationList = desktopDurationList;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsDesktopDurationList> getDesktopDurationList() {
            return this.desktopDurationList;
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

        public DescribeDesktopsResponseBodyDesktops setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
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

        public DescribeDesktopsResponseBodyDesktops setEntraDomainName(String entraDomainName) {
            this.entraDomainName = entraDomainName;
            return this;
        }
        public String getEntraDomainName() {
            return this.entraDomainName;
        }

        public DescribeDesktopsResponseBodyDesktops setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeDesktopsResponseBodyDesktops setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
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

        public DescribeDesktopsResponseBodyDesktops setIsLdap(Boolean isLdap) {
            this.isLdap = isLdap;
            return this;
        }
        public Boolean getIsLdap() {
            return this.isLdap;
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

        public DescribeDesktopsResponseBodyDesktops setOsUpdate(DescribeDesktopsResponseBodyDesktopsOsUpdate osUpdate) {
            this.osUpdate = osUpdate;
            return this;
        }
        public DescribeDesktopsResponseBodyDesktopsOsUpdate getOsUpdate() {
            return this.osUpdate;
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

        public DescribeDesktopsResponseBodyDesktops setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
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

        public DescribeDesktopsResponseBodyDesktops setStandardStartTime(String standardStartTime) {
            this.standardStartTime = standardStartTime;
            return this;
        }
        public String getStandardStartTime() {
            return this.standardStartTime;
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

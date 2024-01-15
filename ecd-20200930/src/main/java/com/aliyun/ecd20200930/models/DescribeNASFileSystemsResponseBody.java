// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNASFileSystemsResponseBody extends TeaModel {
    /**
     * <p>Details about the NAS file systems.</p>
     */
    @NameInMap("FileSystems")
    public java.util.List<DescribeNASFileSystemsResponseBodyFileSystems> fileSystems;

    /**
     * <p>The token that determines the start point of the next query. This parameter is empty if no additional results exist.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNASFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNASFileSystemsResponseBody self = new DescribeNASFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNASFileSystemsResponseBody setFileSystems(java.util.List<DescribeNASFileSystemsResponseBodyFileSystems> fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public java.util.List<DescribeNASFileSystemsResponseBodyFileSystems> getFileSystems() {
        return this.fileSystems;
    }

    public DescribeNASFileSystemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNASFileSystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNASFileSystemsResponseBodyFileSystemsDesktopGroups extends TeaModel {
        /**
         * <p>The ID of the desktop group.</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The name of the desktop group.</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        public static DescribeNASFileSystemsResponseBodyFileSystemsDesktopGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeNASFileSystemsResponseBodyFileSystemsDesktopGroups self = new DescribeNASFileSystemsResponseBodyFileSystemsDesktopGroups();
            return TeaModel.build(map, self);
        }

        public DescribeNASFileSystemsResponseBodyFileSystemsDesktopGroups setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeNASFileSystemsResponseBodyFileSystemsDesktopGroups setDesktopGroupName(String desktopGroupName) {
            this.desktopGroupName = desktopGroupName;
            return this;
        }
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

    }

    public static class DescribeNASFileSystemsResponseBodyFileSystems extends TeaModel {
        /**
         * <p>The total capacity of the NAS file system. Unit: GiB.</p>
         * <br>
         * <p>*   The Capacity type has 10 PiB of storage, which is equal to 10,485,760 GiB.</p>
         * <p>*   The Performance type has 1 PiB of storage, which is equal to 1,048,576 GiB.</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The time when the NAS file system was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the NAS file system.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The desktop groups that are associated with the NAS file systems that support the UPM feature.</p>
         */
        @NameInMap("DesktopGroups")
        public java.util.List<DescribeNASFileSystemsResponseBodyFileSystemsDesktopGroups> desktopGroups;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         */
        @NameInMap("EncryptionEnabled")
        public Boolean encryptionEnabled;

        /**
         * <p>The ID of the NAS file system.</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The name of the NAS file system.</p>
         */
        @NameInMap("FileSystemName")
        public String fileSystemName;

        /**
         * <p>The status of the NAS file system. The possible values include:</p>
         * <br>
         * <p>*   Pending: The NAS file system is being created.</p>
         * <p>*   Running: The NAS file system is running.</p>
         * <p>*   Stopped: The NAS file system is stopped.</p>
         * <p>*   Deleting: The NAS file system is being deleted.</p>
         * <p>*   Deleted: The NAS file system is deleted.</p>
         * <p>*   Invalid: The NAS file system is invalid.</p>
         */
        @NameInMap("FileSystemStatus")
        public String fileSystemStatus;

        /**
         * <p>The type of the NAS file system. Valid value: Universal NAS. This value indicates that the NAS file system is a General-purpose one.</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The used storage of the NAS file system. Unit: byte.</p>
         */
        @NameInMap("MeteredSize")
        public Long meteredSize;

        /**
         * <p>The domain name of the mount target.</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The status of the mount target. The possible values include:</p>
         * <br>
         * <p>*   Pending: The mount target is being created.</p>
         * <p>*   Active: The mount target is enabled.</p>
         * <p>*   Inactive: The mount target is disabled.</p>
         * <p>*   Deleting: The mount target is being deleted.</p>
         * <p>*   Invalid: The mount target is invalid.</p>
         */
        @NameInMap("MountTargetStatus")
        public String mountTargetStatus;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The name of the workspace.</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>Indicates whether the User Profile Management (UPM) feature is supported.</p>
         */
        @NameInMap("ProfileCompatible")
        public Boolean profileCompatible;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The storage type of the NAS file system. Valid values:</p>
         * <br>
         * <p>*   Capacity</p>
         * <p>*   Performance</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>Indicates whether the Server Message Block (SMB) access control list (ACL) feature was enabled.</p>
         */
        @NameInMap("SupportAcl")
        public Boolean supportAcl;

        /**
         * <p>The ID of the zone where the NAS file system resides.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeNASFileSystemsResponseBodyFileSystems build(java.util.Map<String, ?> map) throws Exception {
            DescribeNASFileSystemsResponseBodyFileSystems self = new DescribeNASFileSystemsResponseBodyFileSystems();
            return TeaModel.build(map, self);
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setDesktopGroups(java.util.List<DescribeNASFileSystemsResponseBodyFileSystemsDesktopGroups> desktopGroups) {
            this.desktopGroups = desktopGroups;
            return this;
        }
        public java.util.List<DescribeNASFileSystemsResponseBodyFileSystemsDesktopGroups> getDesktopGroups() {
            return this.desktopGroups;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setEncryptionEnabled(Boolean encryptionEnabled) {
            this.encryptionEnabled = encryptionEnabled;
            return this;
        }
        public Boolean getEncryptionEnabled() {
            return this.encryptionEnabled;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setFileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            return this;
        }
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setFileSystemStatus(String fileSystemStatus) {
            this.fileSystemStatus = fileSystemStatus;
            return this;
        }
        public String getFileSystemStatus() {
            return this.fileSystemStatus;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setMountTargetStatus(String mountTargetStatus) {
            this.mountTargetStatus = mountTargetStatus;
            return this;
        }
        public String getMountTargetStatus() {
            return this.mountTargetStatus;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setProfileCompatible(Boolean profileCompatible) {
            this.profileCompatible = profileCompatible;
            return this;
        }
        public Boolean getProfileCompatible() {
            return this.profileCompatible;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setSupportAcl(Boolean supportAcl) {
            this.supportAcl = supportAcl;
            return this;
        }
        public Boolean getSupportAcl() {
            return this.supportAcl;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}

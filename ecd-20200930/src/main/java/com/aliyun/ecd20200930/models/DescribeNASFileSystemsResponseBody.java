// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNASFileSystemsResponseBody extends TeaModel {
    @NameInMap("FileSystems")
    public java.util.List<DescribeNASFileSystemsResponseBodyFileSystems> fileSystems;

    @NameInMap("NextToken")
    public String nextToken;

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
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

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
        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DesktopGroups")
        public java.util.List<DescribeNASFileSystemsResponseBodyFileSystemsDesktopGroups> desktopGroups;

        @NameInMap("EncryptionEnabled")
        public Boolean encryptionEnabled;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("FileSystemName")
        public String fileSystemName;

        @NameInMap("FileSystemStatus")
        public String fileSystemStatus;

        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("MeteredSize")
        public Long meteredSize;

        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        @NameInMap("MountTargetStatus")
        public String mountTargetStatus;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        @NameInMap("ProfileCompatible")
        public Boolean profileCompatible;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("SupportAcl")
        public Boolean supportAcl;

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

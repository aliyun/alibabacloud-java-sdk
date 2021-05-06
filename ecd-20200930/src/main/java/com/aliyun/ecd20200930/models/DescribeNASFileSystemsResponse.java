// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNASFileSystemsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("FileSystems")
    @Validation(required = true)
    public java.util.List<DescribeNASFileSystemsResponseFileSystems> fileSystems;

    public static DescribeNASFileSystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNASFileSystemsResponse self = new DescribeNASFileSystemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNASFileSystemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNASFileSystemsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNASFileSystemsResponse setFileSystems(java.util.List<DescribeNASFileSystemsResponseFileSystems> fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public java.util.List<DescribeNASFileSystemsResponseFileSystems> getFileSystems() {
        return this.fileSystems;
    }

    public static class DescribeNASFileSystemsResponseFileSystems extends TeaModel {
        @NameInMap("FileSystemId")
        @Validation(required = true)
        public String fileSystemId;

        @NameInMap("FileSystemName")
        @Validation(required = true)
        public String fileSystemName;

        @NameInMap("OfficeSiteId")
        @Validation(required = true)
        public String officeSiteId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("FileSystemType")
        @Validation(required = true)
        public String fileSystemType;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("SupportAcl")
        @Validation(required = true)
        public Boolean supportAcl;

        @NameInMap("Capacity")
        @Validation(required = true)
        public Long capacity;

        @NameInMap("MeteredSize")
        @Validation(required = true)
        public Long meteredSize;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("FileSystemStatus")
        @Validation(required = true)
        public String fileSystemStatus;

        @NameInMap("MountTargetStatus")
        @Validation(required = true)
        public String mountTargetStatus;

        @NameInMap("MountTargetDomain")
        @Validation(required = true)
        public String mountTargetDomain;

        public static DescribeNASFileSystemsResponseFileSystems build(java.util.Map<String, ?> map) throws Exception {
            DescribeNASFileSystemsResponseFileSystems self = new DescribeNASFileSystemsResponseFileSystems();
            return TeaModel.build(map, self);
        }

        public DescribeNASFileSystemsResponseFileSystems setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeNASFileSystemsResponseFileSystems setFileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            return this;
        }
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        public DescribeNASFileSystemsResponseFileSystems setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeNASFileSystemsResponseFileSystems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNASFileSystemsResponseFileSystems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeNASFileSystemsResponseFileSystems setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeNASFileSystemsResponseFileSystems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeNASFileSystemsResponseFileSystems setSupportAcl(Boolean supportAcl) {
            this.supportAcl = supportAcl;
            return this;
        }
        public Boolean getSupportAcl() {
            return this.supportAcl;
        }

        public DescribeNASFileSystemsResponseFileSystems setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeNASFileSystemsResponseFileSystems setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeNASFileSystemsResponseFileSystems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNASFileSystemsResponseFileSystems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeNASFileSystemsResponseFileSystems setFileSystemStatus(String fileSystemStatus) {
            this.fileSystemStatus = fileSystemStatus;
            return this;
        }
        public String getFileSystemStatus() {
            return this.fileSystemStatus;
        }

        public DescribeNASFileSystemsResponseFileSystems setMountTargetStatus(String mountTargetStatus) {
            this.mountTargetStatus = mountTargetStatus;
            return this;
        }
        public String getMountTargetStatus() {
            return this.mountTargetStatus;
        }

        public DescribeNASFileSystemsResponseFileSystems setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

    }

}

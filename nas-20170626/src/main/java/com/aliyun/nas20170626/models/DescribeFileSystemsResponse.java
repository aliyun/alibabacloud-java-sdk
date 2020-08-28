// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("FileSystems")
    @Validation(required = true)
    public DescribeFileSystemsResponseFileSystems fileSystems;

    public static DescribeFileSystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemsResponse self = new DescribeFileSystemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileSystemsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFileSystemsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileSystemsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileSystemsResponse setFileSystems(DescribeFileSystemsResponseFileSystems fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public DescribeFileSystemsResponseFileSystems getFileSystems() {
        return this.fileSystems;
    }

    public static class DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget extends TeaModel {
        @NameInMap("MountTargetDomain")
        @Validation(required = true)
        public String mountTargetDomain;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VswId")
        @Validation(required = true)
        public String vswId;

        @NameInMap("AccessGroupName")
        @Validation(required = true)
        public String accessGroupName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget self = new DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget setAccessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeFileSystemsResponseFileSystemsFileSystemMountTargets extends TeaModel {
        @NameInMap("MountTarget")
        @Validation(required = true)
        public java.util.List<DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget> mountTarget;

        public static DescribeFileSystemsResponseFileSystemsFileSystemMountTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseFileSystemsFileSystemMountTargets self = new DescribeFileSystemsResponseFileSystemsFileSystemMountTargets();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemMountTargets setMountTarget(java.util.List<DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget> mountTarget) {
            this.mountTarget = mountTarget;
            return this;
        }
        public java.util.List<DescribeFileSystemsResponseFileSystemsFileSystemMountTargetsMountTarget> getMountTarget() {
            return this.mountTarget;
        }

    }

    public static class DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage extends TeaModel {
        @NameInMap("PackageId")
        @Validation(required = true)
        public String packageId;

        @NameInMap("PackageType")
        @Validation(required = true)
        public String packageType;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        public static DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage self = new DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

    }

    public static class DescribeFileSystemsResponseFileSystemsFileSystemPackages extends TeaModel {
        @NameInMap("Package")
        @Validation(required = true)
        public java.util.List<DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage> _package;

        public static DescribeFileSystemsResponseFileSystemsFileSystemPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseFileSystemsFileSystemPackages self = new DescribeFileSystemsResponseFileSystemsFileSystemPackages();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemPackages set_package(java.util.List<DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage> _package) {
            this._package = _package;
            return this;
        }
        public java.util.List<DescribeFileSystemsResponseFileSystemsFileSystemPackagesPackage> get_package() {
            return this._package;
        }

    }

    public static class DescribeFileSystemsResponseFileSystemsFileSystemLdap extends TeaModel {
        @NameInMap("BindDN")
        @Validation(required = true)
        public String bindDN;

        @NameInMap("URI")
        @Validation(required = true)
        public String URI;

        @NameInMap("SearchBase")
        @Validation(required = true)
        public String searchBase;

        public static DescribeFileSystemsResponseFileSystemsFileSystemLdap build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseFileSystemsFileSystemLdap self = new DescribeFileSystemsResponseFileSystemsFileSystemLdap();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemLdap setBindDN(String bindDN) {
            this.bindDN = bindDN;
            return this;
        }
        public String getBindDN() {
            return this.bindDN;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemLdap setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemLdap setSearchBase(String searchBase) {
            this.searchBase = searchBase;
            return this;
        }
        public String getSearchBase() {
            return this.searchBase;
        }

    }

    public static class DescribeFileSystemsResponseFileSystemsFileSystemSupportedFeatures extends TeaModel {
        // SupportedFeature
        @NameInMap("SupportedFeature")
        @Validation(required = true)
        public java.util.List<String> supportedFeature;

        public static DescribeFileSystemsResponseFileSystemsFileSystemSupportedFeatures build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseFileSystemsFileSystemSupportedFeatures self = new DescribeFileSystemsResponseFileSystemsFileSystemSupportedFeatures();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseFileSystemsFileSystemSupportedFeatures setSupportedFeature(java.util.List<String> supportedFeature) {
            this.supportedFeature = supportedFeature;
            return this;
        }
        public java.util.List<String> getSupportedFeature() {
            return this.supportedFeature;
        }

    }

    public static class DescribeFileSystemsResponseFileSystemsFileSystem extends TeaModel {
        @NameInMap("FileSystemId")
        @Validation(required = true)
        public String fileSystemId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("ProtocolType")
        @Validation(required = true)
        public String protocolType;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("FileSystemType")
        @Validation(required = true)
        public String fileSystemType;

        @NameInMap("EncryptType")
        @Validation(required = true)
        public Integer encryptType;

        @NameInMap("MeteredSize")
        @Validation(required = true)
        public Long meteredSize;

        @NameInMap("MeteredIASize")
        @Validation(required = true)
        public Long meteredIASize;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Long bandwidth;

        @NameInMap("Capacity")
        @Validation(required = true)
        public Long capacity;

        @NameInMap("AutoSnapshotPolicyId")
        @Validation(required = true)
        public String autoSnapshotPolicyId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("MountTargetCountLimit")
        @Validation(required = true)
        public Long mountTargetCountLimit;

        @NameInMap("NasNamespaceId")
        @Validation(required = true)
        public String nasNamespaceId;

        @NameInMap("KMSKeyId")
        @Validation(required = true)
        public String KMSKeyId;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("MountTargets")
        @Validation(required = true)
        public DescribeFileSystemsResponseFileSystemsFileSystemMountTargets mountTargets;

        @NameInMap("Packages")
        @Validation(required = true)
        public DescribeFileSystemsResponseFileSystemsFileSystemPackages packages;

        @NameInMap("Ldap")
        @Validation(required = true)
        public DescribeFileSystemsResponseFileSystemsFileSystemLdap ldap;

        @NameInMap("SupportedFeatures")
        @Validation(required = true)
        public DescribeFileSystemsResponseFileSystemsFileSystemSupportedFeatures supportedFeatures;

        public static DescribeFileSystemsResponseFileSystemsFileSystem build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseFileSystemsFileSystem self = new DescribeFileSystemsResponseFileSystemsFileSystem();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setEncryptType(Integer encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public Integer getEncryptType() {
            return this.encryptType;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setMeteredIASize(Long meteredIASize) {
            this.meteredIASize = meteredIASize;
            return this;
        }
        public Long getMeteredIASize() {
            return this.meteredIASize;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setMountTargetCountLimit(Long mountTargetCountLimit) {
            this.mountTargetCountLimit = mountTargetCountLimit;
            return this;
        }
        public Long getMountTargetCountLimit() {
            return this.mountTargetCountLimit;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setNasNamespaceId(String nasNamespaceId) {
            this.nasNamespaceId = nasNamespaceId;
            return this;
        }
        public String getNasNamespaceId() {
            return this.nasNamespaceId;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setMountTargets(DescribeFileSystemsResponseFileSystemsFileSystemMountTargets mountTargets) {
            this.mountTargets = mountTargets;
            return this;
        }
        public DescribeFileSystemsResponseFileSystemsFileSystemMountTargets getMountTargets() {
            return this.mountTargets;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setPackages(DescribeFileSystemsResponseFileSystemsFileSystemPackages packages) {
            this.packages = packages;
            return this;
        }
        public DescribeFileSystemsResponseFileSystemsFileSystemPackages getPackages() {
            return this.packages;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setLdap(DescribeFileSystemsResponseFileSystemsFileSystemLdap ldap) {
            this.ldap = ldap;
            return this;
        }
        public DescribeFileSystemsResponseFileSystemsFileSystemLdap getLdap() {
            return this.ldap;
        }

        public DescribeFileSystemsResponseFileSystemsFileSystem setSupportedFeatures(DescribeFileSystemsResponseFileSystemsFileSystemSupportedFeatures supportedFeatures) {
            this.supportedFeatures = supportedFeatures;
            return this;
        }
        public DescribeFileSystemsResponseFileSystemsFileSystemSupportedFeatures getSupportedFeatures() {
            return this.supportedFeatures;
        }

    }

    public static class DescribeFileSystemsResponseFileSystems extends TeaModel {
        @NameInMap("FileSystem")
        @Validation(required = true)
        public java.util.List<DescribeFileSystemsResponseFileSystemsFileSystem> fileSystem;

        public static DescribeFileSystemsResponseFileSystems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseFileSystems self = new DescribeFileSystemsResponseFileSystems();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseFileSystems setFileSystem(java.util.List<DescribeFileSystemsResponseFileSystemsFileSystem> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public java.util.List<DescribeFileSystemsResponseFileSystemsFileSystem> getFileSystem() {
            return this.fileSystem;
        }

    }

}

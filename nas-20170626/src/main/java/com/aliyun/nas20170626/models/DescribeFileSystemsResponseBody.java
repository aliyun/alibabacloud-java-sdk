// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("FileSystems")
    public DescribeFileSystemsResponseBodyFileSystems fileSystems;

    public static DescribeFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemsResponseBody self = new DescribeFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileSystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileSystemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileSystemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFileSystemsResponseBody setFileSystems(DescribeFileSystemsResponseBodyFileSystems fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public DescribeFileSystemsResponseBodyFileSystems getFileSystems() {
        return this.fileSystems;
    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode extends TeaModel {
        @NameInMap("EcsIp")
        public String ecsIp;

        @NameInMap("EcsId")
        public String ecsId;

        @NameInMap("DefaultPasswd")
        public String defaultPasswd;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode setEcsIp(String ecsIp) {
            this.ecsIp = ecsIp;
            return this;
        }
        public String getEcsIp() {
            return this.ecsIp;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode setDefaultPasswd(String defaultPasswd) {
            this.defaultPasswd = defaultPasswd;
            return this;
        }
        public String getDefaultPasswd() {
            return this.defaultPasswd;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes extends TeaModel {
        @NameInMap("ClientMasterNode")
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode> clientMasterNode;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes setClientMasterNode(java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode> clientMasterNode) {
            this.clientMasterNode = clientMasterNode;
            return this;
        }
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode> getClientMasterNode() {
            return this.clientMasterNode;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTagsTag self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTagsTag> tag;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags setTag(java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        @NameInMap("AccessGroupName")
        public String accessGroupName;

        @NameInMap("DualStackMountTargetDomain")
        public String dualStackMountTargetDomain;

        @NameInMap("VswId")
        public String vswId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("ClientMasterNodes")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes clientMasterNodes;

        @NameInMap("Tags")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags tags;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setAccessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
            this.dualStackMountTargetDomain = dualStackMountTargetDomain;
            return this;
        }
        public String getDualStackMountTargetDomain() {
            return this.dualStackMountTargetDomain;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setClientMasterNodes(DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes clientMasterNodes) {
            this.clientMasterNodes = clientMasterNodes;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes getClientMasterNodes() {
            return this.clientMasterNodes;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setTags(DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets extends TeaModel {
        @NameInMap("MountTarget")
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget> mountTarget;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets setMountTarget(java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget> mountTarget) {
            this.mountTarget = mountTarget;
            return this;
        }
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget> getMountTarget() {
            return this.mountTarget;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("PackageId")
        public String packageId;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("PackageType")
        public String packageType;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages extends TeaModel {
        @NameInMap("Package")
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage> _package;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages set_package(java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage> _package) {
            this._package = _package;
            return this;
        }
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage> get_package() {
            return this._package;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemTagsTag self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemTagsTag> tag;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemTags self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemTags();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemTags setTag(java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystemTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures extends TeaModel {
        @NameInMap("SupportedFeature")
        public java.util.List<String> supportedFeature;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures setSupportedFeature(java.util.List<String> supportedFeature) {
            this.supportedFeature = supportedFeature;
            return this;
        }
        public java.util.List<String> getSupportedFeature() {
            return this.supportedFeature;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap extends TeaModel {
        @NameInMap("SearchBase")
        public String searchBase;

        @NameInMap("URI")
        public String URI;

        @NameInMap("BindDN")
        public String bindDN;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap setSearchBase(String searchBase) {
            this.searchBase = searchBase;
            return this;
        }
        public String getSearchBase() {
            return this.searchBase;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap setBindDN(String bindDN) {
            this.bindDN = bindDN;
            return this;
        }
        public String getBindDN() {
            return this.bindDN;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystem extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("MeteredIASize")
        public Long meteredIASize;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("MeteredSize")
        public Long meteredSize;

        @NameInMap("EncryptType")
        public Integer encryptType;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("Description")
        public String description;

        @NameInMap("Version")
        public String version;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("MountTargets")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets mountTargets;

        @NameInMap("Packages")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages packages;

        @NameInMap("Tags")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemTags tags;

        @NameInMap("SupportedFeatures")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures supportedFeatures;

        @NameInMap("Ldap")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap ldap;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystem build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystem self = new DescribeFileSystemsResponseBodyFileSystemsFileSystem();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setMeteredIASize(Long meteredIASize) {
            this.meteredIASize = meteredIASize;
            return this;
        }
        public Long getMeteredIASize() {
            return this.meteredIASize;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setEncryptType(Integer encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public Integer getEncryptType() {
            return this.encryptType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setMountTargets(DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets mountTargets) {
            this.mountTargets = mountTargets;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets getMountTargets() {
            return this.mountTargets;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setPackages(DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages packages) {
            this.packages = packages;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages getPackages() {
            return this.packages;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setTags(DescribeFileSystemsResponseBodyFileSystemsFileSystemTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemTags getTags() {
            return this.tags;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setSupportedFeatures(DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures supportedFeatures) {
            this.supportedFeatures = supportedFeatures;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures getSupportedFeatures() {
            return this.supportedFeatures;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setLdap(DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap ldap) {
            this.ldap = ldap;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap getLdap() {
            return this.ldap;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystems extends TeaModel {
        @NameInMap("FileSystem")
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystem> fileSystem;

        public static DescribeFileSystemsResponseBodyFileSystems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystems self = new DescribeFileSystemsResponseBodyFileSystems();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystems setFileSystem(java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystem> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsFileSystem> getFileSystem() {
            return this.fileSystem;
        }

    }

}

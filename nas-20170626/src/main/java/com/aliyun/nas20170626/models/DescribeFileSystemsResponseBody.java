// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsResponseBody extends TeaModel {
    /**
     * <p>The file system list.</p>
     */
    @NameInMap("FileSystems")
    public DescribeFileSystemsResponseBodyFileSystems fileSystems;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>035B3A3A-E514-4B41-B906-5D906CFB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of file systems.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemsResponseBody self = new DescribeFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemsResponseBody setFileSystems(DescribeFileSystemsResponseBodyFileSystems fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public DescribeFileSystemsResponseBodyFileSystems getFileSystems() {
        return this.fileSystems;
    }

    public DescribeFileSystemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileSystemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileSystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileSystemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap extends TeaModel {
        /**
         * <p>An LDAP entry.</p>
         * 
         * <strong>example:</strong>
         * <p>cn=alibaba,dc=com</p>
         */
        @NameInMap("BindDN")
        public String bindDN;

        /**
         * <p>An LDAP search base.</p>
         * 
         * <strong>example:</strong>
         * <p>dc=example</p>
         */
        @NameInMap("SearchBase")
        public String searchBase;

        /**
         * <p>An LDAP URI.</p>
         * 
         * <strong>example:</strong>
         * <p>ldap://ldap.example.example</p>
         */
        @NameInMap("URI")
        public String URI;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap setBindDN(String bindDN) {
            this.bindDN = bindDN;
            return this;
        }
        public String getBindDN() {
            return this.bindDN;
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

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode extends TeaModel {
        /**
         * <p>The default logon password of the ECS instance on the client management node.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("DefaultPasswd")
        public String defaultPasswd;

        /**
         * <p>The ID of the ECS instance on the client management node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-hp3i3odi5ory1buo****</p>
         */
        @NameInMap("EcsId")
        public String ecsId;

        /**
         * <p>The IP address of the ECS instance on the client management node.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0</p>
         */
        @NameInMap("EcsIp")
        public String ecsIp;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode setDefaultPasswd(String defaultPasswd) {
            this.defaultPasswd = defaultPasswd;
            return this;
        }
        public String getDefaultPasswd() {
            return this.defaultPasswd;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodesClientMasterNode setEcsIp(String ecsIp) {
            this.ecsIp = ecsIp;
            return this;
        }
        public String getEcsIp() {
            return this.ecsIp;
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
         */
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
        /**
         * <p>The name of the permission group that is attached to the mount target.</p>
         * 
         * <strong>example:</strong>
         * <p>test-001</p>
         */
        @NameInMap("AccessGroupName")
        public String accessGroupName;

        /**
         * <p>The information about client management nodes.</p>
         * <p>This parameter is available only for CPFS file systems.</p>
         */
        @NameInMap("ClientMasterNodes")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes clientMasterNodes;

        /**
         * <p>The dual-stack (IPv4 and IPv6) domain name of the mount target.</p>
         * <blockquote>
         * <p>Only Extreme NAS file systems that reside in the Chinese mainland support IPv6.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>174494b666-x****.dualstack.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("DualStackMountTargetDomain")
        public String dualStackMountTargetDomain;

        /**
         * <p>The domain name of the mount target.</p>
         * 
         * <strong>example:</strong>
         * <p>109c042666-w****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The network type. Valid value: vpc.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The status of the mount target.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Active</li>
         * <li>Inactive</li>
         * <li>Pending</li>
         * <li>Deleting</li>
         * <li>Hibernating</li>
         * <li>Hibernated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are attached to the mount target.</p>
         */
        @NameInMap("Tags")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags tags;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1sevsgtqvk5gxbl****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1omfzsszekkvaxn****</p>
         */
        @NameInMap("VswId")
        public String vswId;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setAccessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setClientMasterNodes(DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes clientMasterNodes) {
            this.clientMasterNodes = clientMasterNodes;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetClientMasterNodes getClientMasterNodes() {
            return this.clientMasterNodes;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
            this.dualStackMountTargetDomain = dualStackMountTargetDomain;
            return this;
        }
        public String getDualStackMountTargetDomain() {
            return this.dualStackMountTargetDomain;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setTags(DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTargetTags getTags() {
            return this.tags;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargetsMountTarget setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
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

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemOptions extends TeaModel {
        @NameInMap("EnableABE")
        public Boolean enableABE;

        /**
         * <p>Specifies whether to enable the oplock feature. Valid values:</p>
         * <ul>
         * <li>true: enables the feature.</li>
         * <li>false: disables the feature.</li>
         * </ul>
         * <blockquote>
         * <p> Only Server Message Block (SMB) file systems support this feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableOplock")
        public Boolean enableOplock;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemOptions self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemOptions();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemOptions setEnableABE(Boolean enableABE) {
            this.enableABE = enableABE;
            return this;
        }
        public Boolean getEnableABE() {
            return this.enableABE;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemOptions setEnableOplock(Boolean enableOplock) {
            this.enableOplock = enableOplock;
            return this;
        }
        public Boolean getEnableOplock() {
            return this.enableOplock;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage extends TeaModel {
        /**
         * <p>The end time of the validity period for the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-05T16:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>naspackage-0be9c4b624-37****</p>
         */
        @NameInMap("PackageId")
        public String packageId;

        /**
         * <p>The type of the storage plan.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ssd: The storage plan for Performance NAS file systems.</li>
         * <li>hybrid: The storage plan for Capacity NAS file systems.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hybrid</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The capacity of the storage plan. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The start time of the validity period for the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-05T01:40:56Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackagesPackage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
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

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemRedundancyVSwitchIds extends TeaModel {
        @NameInMap("RedundancyVSwitchId")
        public java.util.List<String> redundancyVSwitchId;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemRedundancyVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemRedundancyVSwitchIds self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemRedundancyVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemRedundancyVSwitchIds setRedundancyVSwitchId(java.util.List<String> redundancyVSwitchId) {
            this.redundancyVSwitchId = redundancyVSwitchId;
            return this;
        }
        public java.util.List<String> getRedundancyVSwitchId() {
            return this.redundancyVSwitchId;
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

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
         */
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

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystemVswIds extends TeaModel {
        @NameInMap("VswId")
        public java.util.List<String> vswId;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystemVswIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystemVswIds self = new DescribeFileSystemsResponseBodyFileSystemsFileSystemVswIds();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystemVswIds setVswId(java.util.List<String> vswId) {
            this.vswId = vswId;
            return this;
        }
        public java.util.List<String> getVswId() {
            return this.vswId;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystemsFileSystem extends TeaModel {
        /**
         * <p>Number of access points.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AccessPointCount")
        public String accessPointCount;

        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-extreme-233e6****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>The bandwidth of the file system.</p>
         * <p>Unit: MB/s. This parameter is unavailable for General-purpose NAS file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The capacity of the file system.</p>
         * <p>Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Subscription</li>
         * <li>PayAsYouGo</li>
         * <li>Package: storage plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the file system was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-05T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the data in the file system is encrypted.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: The data in the file system is not encrypted.</li>
         * <li>1: A NAS-managed key is used to encrypt the data in the file system.</li>
         * <li>2: A KMS-managed key is used to encrypt the data in the file system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EncryptType")
        public Integer encryptType;

        /**
         * <p>The time when the file system expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-05T16:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>109c04****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The file system type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard: General-purpose NAS</li>
         * <li>extreme: Extreme NAS</li>
         * <li>cpfs: CPFS (locally redundant storage)</li>
         * <li>cpfsse: CPFS SE (zone-redundant storage)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The ID of the key that is managed by Key Management Service (KMS).</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The Lightweight Directory Access Protocol (LDAP) configurations.</p>
         * <p>This parameter is available only for CPFS file systems.</p>
         */
        @NameInMap("Ldap")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap ldap;

        /**
         * <p>Archive storage usage.</p>
         * <p>Unit: Byte.</p>
         * 
         * <strong>example:</strong>
         * <p>1611661312</p>
         */
        @NameInMap("MeteredArchiveSize")
        public Long meteredArchiveSize;

        /**
         * <p>The storage usage of the Infrequent Access (IA) storage medium.</p>
         * <p>Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>362832</p>
         */
        @NameInMap("MeteredIASize")
        public Long meteredIASize;

        /**
         * <p>The storage usage of the file system.</p>
         * <p>The value of this parameter is the maximum storage usage of the file system over the last hour. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1611661312</p>
         */
        @NameInMap("MeteredSize")
        public Long meteredSize;

        /**
         * <p>The queried mount targets.</p>
         */
        @NameInMap("MountTargets")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets mountTargets;

        /**
         * <p>The options.</p>
         */
        @NameInMap("Options")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemOptions options;

        /**
         * <p>The information about storage plans.</p>
         */
        @NameInMap("Packages")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages packages;

        /**
         * <p>The protocol type of the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NFS: Network File System.</li>
         * <li>SMB: Server Message Block.</li>
         * <li>cpfs: The protocol type supported by the CPFS file system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze37k6jh8ums2fw2****</p>
         */
        @NameInMap("QuorumVswId")
        public String quorumVswId;

        /**
         * <p>Storage redundancy type. Returned only for CPFS SE.</p>
         * 
         * <strong>example:</strong>
         * <p>LRS</p>
         */
        @NameInMap("RedundancyType")
        public String redundancyType;

        /**
         * <p>A list of IDs for the zone-redundant vSwitches.</p>
         */
        @NameInMap("RedundancyVSwitchIds")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemRedundancyVSwitchIds redundancyVSwitchIds;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwavnfdf****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the file system. Valid values:</p>
         * <ul>
         * <li>Pending: The file system is being created or modified.</li>
         * <li>Running: The file system is available. Before you create a mount target for the file system, make sure that the file system is in the Running state.</li>
         * <li>Stopped: The file system is unavailable.</li>
         * <li>Extending: The file system is being scaled up.</li>
         * <li>Stopping: The file system is being stopped.</li>
         * <li>Deleting: The file system is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>General-purpose NAS: Capacity, Performance, Premium</li>
         * <li>Extreme NAS: standard, advance</li>
         * <li>CPFS: advance_100 (100 MB/s/TiB Baseline), advance_200 (200 MB/s/TiB Baseline), economic</li>
         * <li>CPFS SE: advance_100 (100 MB/s/TiB Baseline)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Performance</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The features that are supported by the file system.</p>
         */
        @NameInMap("SupportedFeatures")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures supportedFeatures;

        /**
         * <p>The tags that are attached to the file system.</p>
         */
        @NameInMap("Tags")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemTags tags;

        /**
         * <p>The version number of the file system.</p>
         * <p>This parameter is available only for Extreme NAS file systems and CPFS file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>2.3.4</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1cbv1ljve4j5hlw****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cpfs-370y1tv921vpuj4****-000001.cn-wulanchabu.cpfs.aliyuncs.com</p>
         */
        @NameInMap("VscTarget")
        public String vscTarget;

        /**
         * <p>The information about vSwitch.</p>
         */
        @NameInMap("VswIds")
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemVswIds vswIds;

        /**
         * <p>The ID of the zone where the file system resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeFileSystemsResponseBodyFileSystemsFileSystem build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsFileSystem self = new DescribeFileSystemsResponseBodyFileSystemsFileSystem();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setAccessPointCount(String accessPointCount) {
            this.accessPointCount = accessPointCount;
            return this;
        }
        public String getAccessPointCount() {
            return this.accessPointCount;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setEncryptType(Integer encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public Integer getEncryptType() {
            return this.encryptType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setLdap(DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap ldap) {
            this.ldap = ldap;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemLdap getLdap() {
            return this.ldap;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setMeteredArchiveSize(Long meteredArchiveSize) {
            this.meteredArchiveSize = meteredArchiveSize;
            return this;
        }
        public Long getMeteredArchiveSize() {
            return this.meteredArchiveSize;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setMeteredIASize(Long meteredIASize) {
            this.meteredIASize = meteredIASize;
            return this;
        }
        public Long getMeteredIASize() {
            return this.meteredIASize;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setMountTargets(DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets mountTargets) {
            this.mountTargets = mountTargets;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemMountTargets getMountTargets() {
            return this.mountTargets;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setOptions(DescribeFileSystemsResponseBodyFileSystemsFileSystemOptions options) {
            this.options = options;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemOptions getOptions() {
            return this.options;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setPackages(DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages packages) {
            this.packages = packages;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemPackages getPackages() {
            return this.packages;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setQuorumVswId(String quorumVswId) {
            this.quorumVswId = quorumVswId;
            return this;
        }
        public String getQuorumVswId() {
            return this.quorumVswId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setRedundancyType(String redundancyType) {
            this.redundancyType = redundancyType;
            return this;
        }
        public String getRedundancyType() {
            return this.redundancyType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setRedundancyVSwitchIds(DescribeFileSystemsResponseBodyFileSystemsFileSystemRedundancyVSwitchIds redundancyVSwitchIds) {
            this.redundancyVSwitchIds = redundancyVSwitchIds;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemRedundancyVSwitchIds getRedundancyVSwitchIds() {
            return this.redundancyVSwitchIds;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setSupportedFeatures(DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures supportedFeatures) {
            this.supportedFeatures = supportedFeatures;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemSupportedFeatures getSupportedFeatures() {
            return this.supportedFeatures;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setTags(DescribeFileSystemsResponseBodyFileSystemsFileSystemTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemTags getTags() {
            return this.tags;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setVscTarget(String vscTarget) {
            this.vscTarget = vscTarget;
            return this;
        }
        public String getVscTarget() {
            return this.vscTarget;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setVswIds(DescribeFileSystemsResponseBodyFileSystemsFileSystemVswIds vswIds) {
            this.vswIds = vswIds;
            return this;
        }
        public DescribeFileSystemsResponseBodyFileSystemsFileSystemVswIds getVswIds() {
            return this.vswIds;
        }

        public DescribeFileSystemsResponseBodyFileSystemsFileSystem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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

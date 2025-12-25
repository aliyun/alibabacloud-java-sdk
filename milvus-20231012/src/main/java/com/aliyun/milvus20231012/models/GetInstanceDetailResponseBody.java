// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class GetInstanceDetailResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the failed permission verification.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;milvus:xxxx&quot; }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public GetInstanceDetailResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Failed to find instance c-123xxx</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABCD-1234-5678-EFGH</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDetailResponseBody self = new GetInstanceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetInstanceDetailResponseBody setData(GetInstanceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceDetailResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceDetailResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetInstanceDetailResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetInstanceDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList extends TeaModel {
        /**
         * <p>The component type. Valid values:</p>
         * <ul>
         * <li>standalone</li>
         * <li>proxy</li>
         * <li>mix_coordinator</li>
         * <li>query</li>
         * <li>index</li>
         * <li>data</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>QueryNode</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The number of CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CuNum")
        public Integer cuNum;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CuRatio")
        public Integer cuRatio;

        /**
         * <p>The disk size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>essd</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The number of replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Replica")
        public Integer replica;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList self = new GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList();
            return TeaModel.build(map, self);
        }

        public GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList setCuNum(Integer cuNum) {
            this.cuNum = cuNum;
            return this;
        }
        public Integer getCuNum() {
            return this.cuNum;
        }

        public GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList setCuRatio(Integer cuRatio) {
            this.cuRatio = cuRatio;
            return this;
        }
        public Integer getCuRatio() {
            return this.cuRatio;
        }

        public GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetInstanceDetailResponseBodyDataClusterInfo extends TeaModel {
        /**
         * <p>The port of the Attu component.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("AttuPort")
        public Integer attuPort;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>c-123xxx-.milvus.aliyuncs.com</p>
         */
        @NameInMap("InternetUrl")
        public String internetUrl;

        /**
         * <p>The internal IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>c-123xxx-internal.milvus.aliyuncs.com</p>
         */
        @NameInMap("IntranetUrl")
        public String intranetUrl;

        /**
         * <p>The resource details.</p>
         */
        @NameInMap("MilvusResourceInfoList")
        public java.util.List<GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList> milvusResourceInfoList;

        /**
         * <p>The size of the data stored in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>125.15 GB</p>
         */
        @NameInMap("OssStorageSize")
        public String ossStorageSize;

        /**
         * <p>The timestamp when the OSS metric is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>1718604000000</p>
         */
        @NameInMap("OssStorageTimestamp")
        public Long ossStorageTimestamp;

        /**
         * <p>The proxy port.</p>
         * 
         * <strong>example:</strong>
         * <p>19530</p>
         */
        @NameInMap("ProxyPort")
        public Integer proxyPort;

        /**
         * <p>The total number of CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("TotalCuNum")
        public Integer totalCuNum;

        /**
         * <p>The total number of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("TotalDiskSize")
        public Integer totalDiskSize;

        public static GetInstanceDetailResponseBodyDataClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDetailResponseBodyDataClusterInfo self = new GetInstanceDetailResponseBodyDataClusterInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceDetailResponseBodyDataClusterInfo setAttuPort(Integer attuPort) {
            this.attuPort = attuPort;
            return this;
        }
        public Integer getAttuPort() {
            return this.attuPort;
        }

        public GetInstanceDetailResponseBodyDataClusterInfo setInternetUrl(String internetUrl) {
            this.internetUrl = internetUrl;
            return this;
        }
        public String getInternetUrl() {
            return this.internetUrl;
        }

        public GetInstanceDetailResponseBodyDataClusterInfo setIntranetUrl(String intranetUrl) {
            this.intranetUrl = intranetUrl;
            return this;
        }
        public String getIntranetUrl() {
            return this.intranetUrl;
        }

        public GetInstanceDetailResponseBodyDataClusterInfo setMilvusResourceInfoList(java.util.List<GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList> milvusResourceInfoList) {
            this.milvusResourceInfoList = milvusResourceInfoList;
            return this;
        }
        public java.util.List<GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList> getMilvusResourceInfoList() {
            return this.milvusResourceInfoList;
        }

        public GetInstanceDetailResponseBodyDataClusterInfo setOssStorageSize(String ossStorageSize) {
            this.ossStorageSize = ossStorageSize;
            return this;
        }
        public String getOssStorageSize() {
            return this.ossStorageSize;
        }

        public GetInstanceDetailResponseBodyDataClusterInfo setOssStorageTimestamp(Long ossStorageTimestamp) {
            this.ossStorageTimestamp = ossStorageTimestamp;
            return this;
        }
        public Long getOssStorageTimestamp() {
            return this.ossStorageTimestamp;
        }

        public GetInstanceDetailResponseBodyDataClusterInfo setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
            return this;
        }
        public Integer getProxyPort() {
            return this.proxyPort;
        }

        public GetInstanceDetailResponseBodyDataClusterInfo setTotalCuNum(Integer totalCuNum) {
            this.totalCuNum = totalCuNum;
            return this;
        }
        public Integer getTotalCuNum() {
            return this.totalCuNum;
        }

        public GetInstanceDetailResponseBodyDataClusterInfo setTotalDiskSize(Integer totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Integer getTotalDiskSize() {
            return this.totalDiskSize;
        }

    }

    public static class GetInstanceDetailResponseBodyDataHighAvailability extends TeaModel {
        @NameInMap("CurrentActiveAZ")
        public String currentActiveAZ;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("PrimaryZoneId")
        public String primaryZoneId;

        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        public static GetInstanceDetailResponseBodyDataHighAvailability build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDetailResponseBodyDataHighAvailability self = new GetInstanceDetailResponseBodyDataHighAvailability();
            return TeaModel.build(map, self);
        }

        public GetInstanceDetailResponseBodyDataHighAvailability setCurrentActiveAZ(String currentActiveAZ) {
            this.currentActiveAZ = currentActiveAZ;
            return this;
        }
        public String getCurrentActiveAZ() {
            return this.currentActiveAZ;
        }

        public GetInstanceDetailResponseBodyDataHighAvailability setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetInstanceDetailResponseBodyDataHighAvailability setPrimaryZoneId(String primaryZoneId) {
            this.primaryZoneId = primaryZoneId;
            return this;
        }
        public String getPrimaryZoneId() {
            return this.primaryZoneId;
        }

        public GetInstanceDetailResponseBodyDataHighAvailability setSecondaryZoneId(String secondaryZoneId) {
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

    }

    public static class GetInstanceDetailResponseBodyDataMeasureConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DataNodeCuNum")
        public Integer dataNodeCuNum;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DataNodeReplica")
        public Integer dataNodeReplica;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IndexNodeCuNum")
        public Integer indexNodeCuNum;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IndexNodeReplica")
        public Integer indexNodeReplica;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MixCoodinatorNodeCuNum")
        public Integer mixCoodinatorNodeCuNum;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MixCoodinatorNodeReplica")
        public Integer mixCoodinatorNodeReplica;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ProxyNodeCuNum")
        public Integer proxyNodeCuNum;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProxyNodeReplica")
        public Integer proxyNodeReplica;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("QueryNodeCuNum")
        public Integer queryNodeCuNum;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("QueryNodeReplica")
        public Integer queryNodeReplica;

        public static GetInstanceDetailResponseBodyDataMeasureConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDetailResponseBodyDataMeasureConfig self = new GetInstanceDetailResponseBodyDataMeasureConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceDetailResponseBodyDataMeasureConfig setDataNodeCuNum(Integer dataNodeCuNum) {
            this.dataNodeCuNum = dataNodeCuNum;
            return this;
        }
        public Integer getDataNodeCuNum() {
            return this.dataNodeCuNum;
        }

        public GetInstanceDetailResponseBodyDataMeasureConfig setDataNodeReplica(Integer dataNodeReplica) {
            this.dataNodeReplica = dataNodeReplica;
            return this;
        }
        public Integer getDataNodeReplica() {
            return this.dataNodeReplica;
        }

        public GetInstanceDetailResponseBodyDataMeasureConfig setIndexNodeCuNum(Integer indexNodeCuNum) {
            this.indexNodeCuNum = indexNodeCuNum;
            return this;
        }
        public Integer getIndexNodeCuNum() {
            return this.indexNodeCuNum;
        }

        public GetInstanceDetailResponseBodyDataMeasureConfig setIndexNodeReplica(Integer indexNodeReplica) {
            this.indexNodeReplica = indexNodeReplica;
            return this;
        }
        public Integer getIndexNodeReplica() {
            return this.indexNodeReplica;
        }

        public GetInstanceDetailResponseBodyDataMeasureConfig setMixCoodinatorNodeCuNum(Integer mixCoodinatorNodeCuNum) {
            this.mixCoodinatorNodeCuNum = mixCoodinatorNodeCuNum;
            return this;
        }
        public Integer getMixCoodinatorNodeCuNum() {
            return this.mixCoodinatorNodeCuNum;
        }

        public GetInstanceDetailResponseBodyDataMeasureConfig setMixCoodinatorNodeReplica(Integer mixCoodinatorNodeReplica) {
            this.mixCoodinatorNodeReplica = mixCoodinatorNodeReplica;
            return this;
        }
        public Integer getMixCoodinatorNodeReplica() {
            return this.mixCoodinatorNodeReplica;
        }

        public GetInstanceDetailResponseBodyDataMeasureConfig setProxyNodeCuNum(Integer proxyNodeCuNum) {
            this.proxyNodeCuNum = proxyNodeCuNum;
            return this;
        }
        public Integer getProxyNodeCuNum() {
            return this.proxyNodeCuNum;
        }

        public GetInstanceDetailResponseBodyDataMeasureConfig setProxyNodeReplica(Integer proxyNodeReplica) {
            this.proxyNodeReplica = proxyNodeReplica;
            return this;
        }
        public Integer getProxyNodeReplica() {
            return this.proxyNodeReplica;
        }

        public GetInstanceDetailResponseBodyDataMeasureConfig setQueryNodeCuNum(Integer queryNodeCuNum) {
            this.queryNodeCuNum = queryNodeCuNum;
            return this;
        }
        public Integer getQueryNodeCuNum() {
            return this.queryNodeCuNum;
        }

        public GetInstanceDetailResponseBodyDataMeasureConfig setQueryNodeReplica(Integer queryNodeReplica) {
            this.queryNodeReplica = queryNodeReplica;
            return this;
        }
        public Integer getQueryNodeReplica() {
            return this.queryNodeReplica;
        }

    }

    public static class GetInstanceDetailResponseBodyDataTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetInstanceDetailResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDetailResponseBodyDataTags self = new GetInstanceDetailResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceDetailResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceDetailResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceDetailResponseBodyDataVSwitches extends TeaModel {
        @NameInMap("VswId")
        public String vswId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetInstanceDetailResponseBodyDataVSwitches build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDetailResponseBodyDataVSwitches self = new GetInstanceDetailResponseBodyDataVSwitches();
            return TeaModel.build(map, self);
        }

        public GetInstanceDetailResponseBodyDataVSwitches setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public GetInstanceDetailResponseBodyDataVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetInstanceDetailResponseBodyData extends TeaModel {
        /**
         * <p>AclId for Public Network Access Control.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-123xxx</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1716863508000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>milvus-test</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The address of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss.console.aliyun.com/bucket/oss-cn-beijing/xxxx/object?spm=a2cug.25127996.0.0.577990370Ebsqt&path=milvus-c-123xxxx">https://oss.console.aliyun.com/bucket/oss-cn-beijing/xxxx/object?spm=a2cug.25127996.0.0.577990370Ebsqt&amp;path=milvus-c-123xxxx</a></p>
         */
        @NameInMap("BucketPath")
        public String bucketPath;

        /**
         * <p>The instance details.</p>
         */
        @NameInMap("ClusterInfo")
        public GetInstanceDetailResponseBodyDataClusterInfo clusterInfo;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableHa")
        public Boolean enableHa;

        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1721664000000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("HighAvailability")
        public GetInstanceDetailResponseBodyDataHighAvailability highAvailability;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c-123xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li>creating.</li>
         * <li>running.</li>
         * <li>updating. Cluster scaling (up/down), configuration changes, and enabling/disabling public network access.</li>
         * <li>disable. The cluster has expired and needs to be renewed for activation.</li>
         * <li>deleting.</li>
         * <li>deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        @NameInMap("MeasureConfig")
        public GetInstanceDetailResponseBodyDataMeasureConfig measureConfig;

        @NameInMap("MultiZoneMode")
        public String multiZoneMode;

        /**
         * <strong>example:</strong>
         * <p>perf</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>Indicates whether Internet access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpenPublicNet")
        public Boolean openPublicNet;

        /**
         * <p>The specification details. Valid values:</p>
         * <ul>
         * <li>trial.</li>
         * <li>standard.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>0: pay-as-you-go</li>
         * <li>1: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PayType")
        public Integer payType;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>milvus_milvuspre_public_cn</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-123xxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>1743679</p>
         */
        @NameInMap("RunningTime")
        public Long runningTime;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-123xxx</p>
         */
        @NameInMap("SgId")
        public String sgId;

        @NameInMap("Tags")
        public java.util.List<GetInstanceDetailResponseBodyDataTags> tags;

        /**
         * <p>The version of the software stack.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4.1-1.0-0.0.1</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>User-defined configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>dataCoord:\n  segment:\n    maxSize: 1024</p>
         */
        @NameInMap("UserConfig")
        public String userConfig;

        @NameInMap("VSwitches")
        public java.util.List<GetInstanceDetailResponseBodyDataVSwitches> vSwitches;

        /**
         * <p>The kernel version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-123xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-123xxx</p>
         */
        @NameInMap("VswId")
        public String vswId;

        /**
         * <p>The zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetInstanceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDetailResponseBodyData self = new GetInstanceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceDetailResponseBodyData setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public GetInstanceDetailResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public GetInstanceDetailResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetInstanceDetailResponseBodyData setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public GetInstanceDetailResponseBodyData setClusterInfo(GetInstanceDetailResponseBodyDataClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }
        public GetInstanceDetailResponseBodyDataClusterInfo getClusterInfo() {
            return this.clusterInfo;
        }

        public GetInstanceDetailResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetInstanceDetailResponseBodyData setEnableHa(Boolean enableHa) {
            this.enableHa = enableHa;
            return this;
        }
        public Boolean getEnableHa() {
            return this.enableHa;
        }

        public GetInstanceDetailResponseBodyData setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public GetInstanceDetailResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetInstanceDetailResponseBodyData setHighAvailability(GetInstanceDetailResponseBodyDataHighAvailability highAvailability) {
            this.highAvailability = highAvailability;
            return this;
        }
        public GetInstanceDetailResponseBodyDataHighAvailability getHighAvailability() {
            return this.highAvailability;
        }

        public GetInstanceDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceDetailResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetInstanceDetailResponseBodyData setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public GetInstanceDetailResponseBodyData setMeasureConfig(GetInstanceDetailResponseBodyDataMeasureConfig measureConfig) {
            this.measureConfig = measureConfig;
            return this;
        }
        public GetInstanceDetailResponseBodyDataMeasureConfig getMeasureConfig() {
            return this.measureConfig;
        }

        public GetInstanceDetailResponseBodyData setMultiZoneMode(String multiZoneMode) {
            this.multiZoneMode = multiZoneMode;
            return this;
        }
        public String getMultiZoneMode() {
            return this.multiZoneMode;
        }

        public GetInstanceDetailResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetInstanceDetailResponseBodyData setOpenPublicNet(Boolean openPublicNet) {
            this.openPublicNet = openPublicNet;
            return this;
        }
        public Boolean getOpenPublicNet() {
            return this.openPublicNet;
        }

        public GetInstanceDetailResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetInstanceDetailResponseBodyData setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public GetInstanceDetailResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetInstanceDetailResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceDetailResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetInstanceDetailResponseBodyData setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public GetInstanceDetailResponseBodyData setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public GetInstanceDetailResponseBodyData setTags(java.util.List<GetInstanceDetailResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetInstanceDetailResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetInstanceDetailResponseBodyData setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public GetInstanceDetailResponseBodyData setUserConfig(String userConfig) {
            this.userConfig = userConfig;
            return this;
        }
        public String getUserConfig() {
            return this.userConfig;
        }

        public GetInstanceDetailResponseBodyData setVSwitches(java.util.List<GetInstanceDetailResponseBodyDataVSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<GetInstanceDetailResponseBodyDataVSwitches> getVSwitches() {
            return this.vSwitches;
        }

        public GetInstanceDetailResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetInstanceDetailResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetInstanceDetailResponseBodyData setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public GetInstanceDetailResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}

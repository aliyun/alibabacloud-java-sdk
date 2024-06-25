// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class GetInstanceDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;milvus:xxxx&quot; }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public GetInstanceDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Instance.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Failed to find instance c-123xxx</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>ABCD-1234-5678-EFGH</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>QueryNode</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CuNum")
        public Integer cuNum;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <strong>example:</strong>
         * <p>essd</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Replica")
        public Integer replica;

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

    }

    public static class GetInstanceDetailResponseBodyDataClusterInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("AttuPort")
        public Integer attuPort;

        /**
         * <strong>example:</strong>
         * <p>c-123xxx-.milvus.aliyuncs.com</p>
         */
        @NameInMap("InternetUrl")
        public String internetUrl;

        /**
         * <strong>example:</strong>
         * <p>c-123xxx-internal.milvus.aliyuncs.com</p>
         */
        @NameInMap("IntranetUrl")
        public String intranetUrl;

        @NameInMap("MilvusResourceInfoList")
        public java.util.List<GetInstanceDetailResponseBodyDataClusterInfoMilvusResourceInfoList> milvusResourceInfoList;

        /**
         * <strong>example:</strong>
         * <p>125.15 GB</p>
         */
        @NameInMap("OssStorageSize")
        public String ossStorageSize;

        /**
         * <strong>example:</strong>
         * <p>1718604000000</p>
         */
        @NameInMap("OssStorageTimestamp")
        public Long ossStorageTimestamp;

        /**
         * <strong>example:</strong>
         * <p>19530</p>
         */
        @NameInMap("ProxyPort")
        public Integer proxyPort;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("TotalCuNum")
        public Integer totalCuNum;

        /**
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

    public static class GetInstanceDetailResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acl-123xxx</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <strong>example:</strong>
         * <p>1716863508000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <strong>example:</strong>
         * <p>milvus-test</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss.console.aliyun.com/bucket/oss-cn-beijing/xxxx/object?spm=a2cug.25127996.0.0.577990370Ebsqt&path=milvus-c-123xxxx">https://oss.console.aliyun.com/bucket/oss-cn-beijing/xxxx/object?spm=a2cug.25127996.0.0.577990370Ebsqt&amp;path=milvus-c-123xxxx</a></p>
         */
        @NameInMap("BucketPath")
        public String bucketPath;

        @NameInMap("ClusterInfo")
        public GetInstanceDetailResponseBodyDataClusterInfo clusterInfo;

        /**
         * <strong>example:</strong>
         * <p>aliyun-test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>1721664000000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>c-123xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpenPublicNet")
        public Boolean openPublicNet;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PayType")
        public Integer payType;

        /**
         * <strong>example:</strong>
         * <p>milvus_milvuspre_public_cn</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>1743679</p>
         */
        @NameInMap("RunningTime")
        public Long runningTime;

        /**
         * <strong>example:</strong>
         * <p>sg-123xxx</p>
         */
        @NameInMap("SgId")
        public String sgId;

        /**
         * <strong>example:</strong>
         * <p>2.4.1-1.0-0.0.1</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <strong>example:</strong>
         * <p>dataCoord:\n  segment:\n    maxSize: 1024</p>
         */
        @NameInMap("UserConfig")
        public String userConfig;

        /**
         * <strong>example:</strong>
         * <p>2.4</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>vpc-123xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vsw-123xxx</p>
         */
        @NameInMap("VswId")
        public String vswId;

        /**
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

        public GetInstanceDetailResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
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

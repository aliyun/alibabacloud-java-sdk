// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;milvus:xxxx&quot; }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public java.util.List<ListInstancesResponseBodyData> data;

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

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListInstancesResponseBody setData(java.util.List<ListInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListInstancesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListInstancesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListInstancesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>standalone</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <strong>example:</strong>
         * <p>16</p>
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
         * <p>1</p>
         */
        @NameInMap("Replica")
        public Integer replica;

        public static ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList self = new ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList setCuNum(Integer cuNum) {
            this.cuNum = cuNum;
            return this;
        }
        public Integer getCuNum() {
            return this.cuNum;
        }

        public ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

    }

    public static class ListInstancesResponseBodyDataClusterInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("AttuPort")
        public Integer attuPort;

        /**
         * <strong>example:</strong>
         * <p>c-123xxx.milvus.aliyuncs.com</p>
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
        public java.util.List<ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList> milvusResourceInfoList;

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

        public static ListInstancesResponseBodyDataClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataClusterInfo self = new ListInstancesResponseBodyDataClusterInfo();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataClusterInfo setAttuPort(Integer attuPort) {
            this.attuPort = attuPort;
            return this;
        }
        public Integer getAttuPort() {
            return this.attuPort;
        }

        public ListInstancesResponseBodyDataClusterInfo setInternetUrl(String internetUrl) {
            this.internetUrl = internetUrl;
            return this;
        }
        public String getInternetUrl() {
            return this.internetUrl;
        }

        public ListInstancesResponseBodyDataClusterInfo setIntranetUrl(String intranetUrl) {
            this.intranetUrl = intranetUrl;
            return this;
        }
        public String getIntranetUrl() {
            return this.intranetUrl;
        }

        public ListInstancesResponseBodyDataClusterInfo setMilvusResourceInfoList(java.util.List<ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList> milvusResourceInfoList) {
            this.milvusResourceInfoList = milvusResourceInfoList;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataClusterInfoMilvusResourceInfoList> getMilvusResourceInfoList() {
            return this.milvusResourceInfoList;
        }

        public ListInstancesResponseBodyDataClusterInfo setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
            return this;
        }
        public Integer getProxyPort() {
            return this.proxyPort;
        }

        public ListInstancesResponseBodyDataClusterInfo setTotalCuNum(Integer totalCuNum) {
            this.totalCuNum = totalCuNum;
            return this;
        }
        public Integer getTotalCuNum() {
            return this.totalCuNum;
        }

        public ListInstancesResponseBodyDataClusterInfo setTotalDiskSize(Integer totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Integer getTotalDiskSize() {
            return this.totalDiskSize;
        }

    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1718608505000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("ClusterInfo")
        public ListInstancesResponseBodyDataClusterInfo clusterInfo;

        /**
         * <strong>example:</strong>
         * <p>milvus-test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>1721232000000</p>
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
         * <p>trial</p>
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
         * <p>536611</p>
         */
        @NameInMap("RunningTime")
        public Integer runningTime;

        /**
         * <strong>example:</strong>
         * <p>sg-123xxx</p>
         */
        @NameInMap("SgId")
        public String sgId;

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

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ListInstancesResponseBodyData setClusterInfo(ListInstancesResponseBodyDataClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }
        public ListInstancesResponseBodyDataClusterInfo getClusterInfo() {
            return this.clusterInfo;
        }

        public ListInstancesResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListInstancesResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListInstancesResponseBodyData setOpenPublicNet(Boolean openPublicNet) {
            this.openPublicNet = openPublicNet;
            return this;
        }
        public Boolean getOpenPublicNet() {
            return this.openPublicNet;
        }

        public ListInstancesResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public ListInstancesResponseBodyData setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public ListInstancesResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListInstancesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyData setRunningTime(Integer runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Integer getRunningTime() {
            return this.runningTime;
        }

        public ListInstancesResponseBodyData setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public ListInstancesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListInstancesResponseBodyData setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public ListInstancesResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}

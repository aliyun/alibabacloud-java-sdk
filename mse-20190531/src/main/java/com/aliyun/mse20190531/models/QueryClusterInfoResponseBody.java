// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryClusterInfoResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>system error</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryClusterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterInfoResponseBody self = new QueryClusterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClusterInfoResponseBody setData(QueryClusterInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryClusterInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryClusterInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryClusterInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryClusterInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClusterInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterInfoResponseBodyDataInstanceModels extends TeaModel {
        @NameInMap("CreationTimestamp")
        public String creationTimestamp;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("Role")
        public String role;

        @NameInMap("SingleTunnelVip")
        public String singleTunnelVip;

        @NameInMap("Zone")
        public String zone;

        public static QueryClusterInfoResponseBodyDataInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterInfoResponseBodyDataInstanceModels self = new QueryClusterInfoResponseBodyDataInstanceModels();
            return TeaModel.build(map, self);
        }

        public QueryClusterInfoResponseBodyDataInstanceModels setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public String getCreationTimestamp() {
            return this.creationTimestamp;
        }

        public QueryClusterInfoResponseBodyDataInstanceModels setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public QueryClusterInfoResponseBodyDataInstanceModels setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public QueryClusterInfoResponseBodyDataInstanceModels setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryClusterInfoResponseBodyDataInstanceModels setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public QueryClusterInfoResponseBodyDataInstanceModels setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryClusterInfoResponseBodyDataInstanceModels setSingleTunnelVip(String singleTunnelVip) {
            this.singleTunnelVip = singleTunnelVip;
            return this;
        }
        public String getSingleTunnelVip() {
            return this.singleTunnelVip;
        }

        public QueryClusterInfoResponseBodyDataInstanceModels setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QueryClusterInfoResponseBodyData extends TeaModel {
        @NameInMap("AclEntryList")
        public String aclEntryList;

        @NameInMap("AclId")
        public String aclId;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ClusterAliasName")
        public String clusterAliasName;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterSpecification")
        public String clusterSpecification;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("ClusterVersion")
        public String clusterVersion;

        @NameInMap("ConnectionType")
        public String connectionType;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DiskCapacity")
        public Long diskCapacity;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("InitCostTime")
        public Long initCostTime;

        @NameInMap("InitStatus")
        public String initStatus;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceModels")
        public java.util.List<QueryClusterInfoResponseBodyDataInstanceModels> instanceModels;

        @NameInMap("InternetAddress")
        public String internetAddress;

        @NameInMap("InternetDomain")
        public String internetDomain;

        @NameInMap("InternetPort")
        public String internetPort;

        @NameInMap("IntranetAddress")
        public String intranetAddress;

        @NameInMap("IntranetDomain")
        public String intranetDomain;

        @NameInMap("IntranetPort")
        public String intranetPort;

        @NameInMap("MemoryCapacity")
        public Long memoryCapacity;

        @NameInMap("MseVersion")
        public String mseVersion;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("PayInfo")
        public String payInfo;

        @NameInMap("PubNetworkFlow")
        public String pubNetworkFlow;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static QueryClusterInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterInfoResponseBodyData self = new QueryClusterInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClusterInfoResponseBodyData setAclEntryList(String aclEntryList) {
            this.aclEntryList = aclEntryList;
            return this;
        }
        public String getAclEntryList() {
            return this.aclEntryList;
        }

        public QueryClusterInfoResponseBodyData setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public QueryClusterInfoResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public QueryClusterInfoResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public QueryClusterInfoResponseBodyData setClusterAliasName(String clusterAliasName) {
            this.clusterAliasName = clusterAliasName;
            return this;
        }
        public String getClusterAliasName() {
            return this.clusterAliasName;
        }

        public QueryClusterInfoResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryClusterInfoResponseBodyData setClusterSpecification(String clusterSpecification) {
            this.clusterSpecification = clusterSpecification;
            return this;
        }
        public String getClusterSpecification() {
            return this.clusterSpecification;
        }

        public QueryClusterInfoResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public QueryClusterInfoResponseBodyData setClusterVersion(String clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }
        public String getClusterVersion() {
            return this.clusterVersion;
        }

        public QueryClusterInfoResponseBodyData setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

        public QueryClusterInfoResponseBodyData setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryClusterInfoResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryClusterInfoResponseBodyData setDiskCapacity(Long diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Long getDiskCapacity() {
            return this.diskCapacity;
        }

        public QueryClusterInfoResponseBodyData setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public QueryClusterInfoResponseBodyData setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public QueryClusterInfoResponseBodyData setInitCostTime(Long initCostTime) {
            this.initCostTime = initCostTime;
            return this;
        }
        public Long getInitCostTime() {
            return this.initCostTime;
        }

        public QueryClusterInfoResponseBodyData setInitStatus(String initStatus) {
            this.initStatus = initStatus;
            return this;
        }
        public String getInitStatus() {
            return this.initStatus;
        }

        public QueryClusterInfoResponseBodyData setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public QueryClusterInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryClusterInfoResponseBodyData setInstanceModels(java.util.List<QueryClusterInfoResponseBodyDataInstanceModels> instanceModels) {
            this.instanceModels = instanceModels;
            return this;
        }
        public java.util.List<QueryClusterInfoResponseBodyDataInstanceModels> getInstanceModels() {
            return this.instanceModels;
        }

        public QueryClusterInfoResponseBodyData setInternetAddress(String internetAddress) {
            this.internetAddress = internetAddress;
            return this;
        }
        public String getInternetAddress() {
            return this.internetAddress;
        }

        public QueryClusterInfoResponseBodyData setInternetDomain(String internetDomain) {
            this.internetDomain = internetDomain;
            return this;
        }
        public String getInternetDomain() {
            return this.internetDomain;
        }

        public QueryClusterInfoResponseBodyData setInternetPort(String internetPort) {
            this.internetPort = internetPort;
            return this;
        }
        public String getInternetPort() {
            return this.internetPort;
        }

        public QueryClusterInfoResponseBodyData setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public QueryClusterInfoResponseBodyData setIntranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        public QueryClusterInfoResponseBodyData setIntranetPort(String intranetPort) {
            this.intranetPort = intranetPort;
            return this;
        }
        public String getIntranetPort() {
            return this.intranetPort;
        }

        public QueryClusterInfoResponseBodyData setMemoryCapacity(Long memoryCapacity) {
            this.memoryCapacity = memoryCapacity;
            return this;
        }
        public Long getMemoryCapacity() {
            return this.memoryCapacity;
        }

        public QueryClusterInfoResponseBodyData setMseVersion(String mseVersion) {
            this.mseVersion = mseVersion;
            return this;
        }
        public String getMseVersion() {
            return this.mseVersion;
        }

        public QueryClusterInfoResponseBodyData setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryClusterInfoResponseBodyData setPayInfo(String payInfo) {
            this.payInfo = payInfo;
            return this;
        }
        public String getPayInfo() {
            return this.payInfo;
        }

        public QueryClusterInfoResponseBodyData setPubNetworkFlow(String pubNetworkFlow) {
            this.pubNetworkFlow = pubNetworkFlow;
            return this;
        }
        public String getPubNetworkFlow() {
            return this.pubNetworkFlow;
        }

        public QueryClusterInfoResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryClusterInfoResponseBodyData setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public QueryClusterInfoResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public QueryClusterInfoResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

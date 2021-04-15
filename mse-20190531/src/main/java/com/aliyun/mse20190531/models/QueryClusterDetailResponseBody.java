// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDetailResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryClusterDetailResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static QueryClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDetailResponseBody self = new QueryClusterDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClusterDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryClusterDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClusterDetailResponseBody setData(QueryClusterDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryClusterDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryClusterDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryClusterDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterDetailResponseBodyDataInstanceModels extends TeaModel {
        @NameInMap("PodName")
        public String podName;

        @NameInMap("SingleTunnelVip")
        public String singleTunnelVip;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Role")
        public String role;

        @NameInMap("HealthStatus")
        public String healthStatus;

        public static QueryClusterDetailResponseBodyDataInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyDataInstanceModels self = new QueryClusterDetailResponseBodyDataInstanceModels();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setSingleTunnelVip(String singleTunnelVip) {
            this.singleTunnelVip = singleTunnelVip;
            return this;
        }
        public String getSingleTunnelVip() {
            return this.singleTunnelVip;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

    }

    public static class QueryClusterDetailResponseBodyData extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IntranetAddress")
        public String intranetAddress;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("PubNetworkFlow")
        public String pubNetworkFlow;

        @NameInMap("DiskCapacity")
        public Long diskCapacity;

        @NameInMap("MemoryCapacity")
        public Long memoryCapacity;

        @NameInMap("ClusterAliasName")
        public String clusterAliasName;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("IntranetPort")
        public String intranetPort;

        @NameInMap("InstanceModels")
        public java.util.List<QueryClusterDetailResponseBodyDataInstanceModels> instanceModels;

        @NameInMap("IntranetDomain")
        public String intranetDomain;

        @NameInMap("InternetDomain")
        public String internetDomain;

        @NameInMap("PayInfo")
        public String payInfo;

        @NameInMap("InternetAddress")
        public String internetAddress;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("AclEntryList")
        public String aclEntryList;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("InitCostTime")
        public Long initCostTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AclId")
        public String aclId;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("InitStatus")
        public String initStatus;

        @NameInMap("InternetPort")
        public String internetPort;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ClusterVersion")
        public String clusterVersion;

        @NameInMap("ClusterSpecification")
        public String clusterSpecification;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ConnectionType")
        public String connectionType;

        public static QueryClusterDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyData self = new QueryClusterDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryClusterDetailResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryClusterDetailResponseBodyData setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public QueryClusterDetailResponseBodyData setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public QueryClusterDetailResponseBodyData setPubNetworkFlow(String pubNetworkFlow) {
            this.pubNetworkFlow = pubNetworkFlow;
            return this;
        }
        public String getPubNetworkFlow() {
            return this.pubNetworkFlow;
        }

        public QueryClusterDetailResponseBodyData setDiskCapacity(Long diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Long getDiskCapacity() {
            return this.diskCapacity;
        }

        public QueryClusterDetailResponseBodyData setMemoryCapacity(Long memoryCapacity) {
            this.memoryCapacity = memoryCapacity;
            return this;
        }
        public Long getMemoryCapacity() {
            return this.memoryCapacity;
        }

        public QueryClusterDetailResponseBodyData setClusterAliasName(String clusterAliasName) {
            this.clusterAliasName = clusterAliasName;
            return this;
        }
        public String getClusterAliasName() {
            return this.clusterAliasName;
        }

        public QueryClusterDetailResponseBodyData setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public QueryClusterDetailResponseBodyData setIntranetPort(String intranetPort) {
            this.intranetPort = intranetPort;
            return this;
        }
        public String getIntranetPort() {
            return this.intranetPort;
        }

        public QueryClusterDetailResponseBodyData setInstanceModels(java.util.List<QueryClusterDetailResponseBodyDataInstanceModels> instanceModels) {
            this.instanceModels = instanceModels;
            return this;
        }
        public java.util.List<QueryClusterDetailResponseBodyDataInstanceModels> getInstanceModels() {
            return this.instanceModels;
        }

        public QueryClusterDetailResponseBodyData setIntranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        public QueryClusterDetailResponseBodyData setInternetDomain(String internetDomain) {
            this.internetDomain = internetDomain;
            return this;
        }
        public String getInternetDomain() {
            return this.internetDomain;
        }

        public QueryClusterDetailResponseBodyData setPayInfo(String payInfo) {
            this.payInfo = payInfo;
            return this;
        }
        public String getPayInfo() {
            return this.payInfo;
        }

        public QueryClusterDetailResponseBodyData setInternetAddress(String internetAddress) {
            this.internetAddress = internetAddress;
            return this;
        }
        public String getInternetAddress() {
            return this.internetAddress;
        }

        public QueryClusterDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryClusterDetailResponseBodyData setAclEntryList(String aclEntryList) {
            this.aclEntryList = aclEntryList;
            return this;
        }
        public String getAclEntryList() {
            return this.aclEntryList;
        }

        public QueryClusterDetailResponseBodyData setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public QueryClusterDetailResponseBodyData setInitCostTime(Long initCostTime) {
            this.initCostTime = initCostTime;
            return this;
        }
        public Long getInitCostTime() {
            return this.initCostTime;
        }

        public QueryClusterDetailResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryClusterDetailResponseBodyData setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public QueryClusterDetailResponseBodyData setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryClusterDetailResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public QueryClusterDetailResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryClusterDetailResponseBodyData setInitStatus(String initStatus) {
            this.initStatus = initStatus;
            return this;
        }
        public String getInitStatus() {
            return this.initStatus;
        }

        public QueryClusterDetailResponseBodyData setInternetPort(String internetPort) {
            this.internetPort = internetPort;
            return this;
        }
        public String getInternetPort() {
            return this.internetPort;
        }

        public QueryClusterDetailResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public QueryClusterDetailResponseBodyData setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryClusterDetailResponseBodyData setClusterVersion(String clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }
        public String getClusterVersion() {
            return this.clusterVersion;
        }

        public QueryClusterDetailResponseBodyData setClusterSpecification(String clusterSpecification) {
            this.clusterSpecification = clusterSpecification;
            return this;
        }
        public String getClusterSpecification() {
            return this.clusterSpecification;
        }

        public QueryClusterDetailResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public QueryClusterDetailResponseBodyData setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

    }

}

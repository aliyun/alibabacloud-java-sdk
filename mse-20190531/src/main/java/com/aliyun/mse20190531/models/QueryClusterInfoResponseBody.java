// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterInfoResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public QueryClusterInfoResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     * <br>
     * <p>*   If the request is successful, a success message is returned.</p>
     * <p>*   If the request fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
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
        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("CreationTimestamp")
        public String creationTimestamp;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("PodName")
        public String podName;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("SingleTunnelVip")
        public String singleTunnelVip;

        /**
         * <p>A reserved parameter.</p>
         */
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

    public static class QueryClusterInfoResponseBodyDataMaintenancePeriod extends TeaModel {
        /**
         * <p>The start time of the O\&M time window.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The end time of the O\&M time window.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryClusterInfoResponseBodyDataMaintenancePeriod build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterInfoResponseBodyDataMaintenancePeriod self = new QueryClusterInfoResponseBodyDataMaintenancePeriod();
            return TeaModel.build(map, self);
        }

        public QueryClusterInfoResponseBodyDataMaintenancePeriod setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryClusterInfoResponseBodyDataMaintenancePeriod setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryClusterInfoResponseBodyData extends TeaModel {
        /**
         * <p>The public IP address whitelist.</p>
         */
        @NameInMap("AclEntryList")
        public String aclEntryList;

        /**
         * <p>The ID of the instance in the public IP address whitelist.</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The version of the instance.</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("CanUpdate")
        public Boolean canUpdate;

        /**
         * <p>The billing method, such as subscription or pay-as-you-go.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The alias of the instance.</p>
         */
        @NameInMap("ClusterAliasName")
        public String clusterAliasName;

        /**
         * <p>The full name of the instance.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The engine specifications.</p>
         */
        @NameInMap("ClusterSpecification")
        public String clusterSpecification;

        /**
         * <p>The type of the instance. Valid values: ZooKeeper, Nacos-Ans, and Eureka.</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The version of the order.</p>
         */
        @NameInMap("ClusterVersion")
        public String clusterVersion;

        /**
         * <p>A deprecated parameter.</p>
         */
        @NameInMap("ConnectionType")
        public String connectionType;

        /**
         * <p>A deprecated parameter.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>A deprecated parameter.</p>
         */
        @NameInMap("DiskCapacity")
        public Long diskCapacity;

        /**
         * <p>A deprecated parameter.</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The ID of the instance that is associated with the Elastic IP Address (EIP).</p>
         */
        @NameInMap("EipInstanceId")
        public String eipInstanceId;

        /**
         * <p>The time when the subscription instance expires.</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The zones to which the current cluster can be distributed.</p>
         */
        @NameInMap("ExpectZones")
        public java.util.List<String> expectZones;

        /**
         * <p>The status of the instance.</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The time that is required to initialize the instance. Unit: milliseconds.</p>
         */
        @NameInMap("InitCostTime")
        public Long initCostTime;

        /**
         * <p>The initial status of the instance.</p>
         */
        @NameInMap("InitStatus")
        public String initStatus;

        /**
         * <p>The number of instance nodes.</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The ID of the instance</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The reserved structure.</p>
         */
        @NameInMap("InstanceModels")
        public java.util.List<QueryClusterInfoResponseBodyDataInstanceModels> instanceModels;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("InternetAddress")
        public String internetAddress;

        /**
         * <p>The public endpoint.</p>
         */
        @NameInMap("InternetDomain")
        public String internetDomain;

        /**
         * <p>The instance ports that are accessible over the Internet.</p>
         */
        @NameInMap("InternetPort")
        public String internetPort;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The internal endpoint.</p>
         */
        @NameInMap("IntranetDomain")
        public String intranetDomain;

        /**
         * <p>The instance ports that are accessible over an internal network.</p>
         */
        @NameInMap("IntranetPort")
        public String intranetPort;

        /**
         * <p>The O\&M time window.</p>
         */
        @NameInMap("MaintenancePeriod")
        public QueryClusterInfoResponseBodyDataMaintenancePeriod maintenancePeriod;

        /**
         * <p>A deprecated parameter.</p>
         */
        @NameInMap("MemoryCapacity")
        public Long memoryCapacity;

        /**
         * <p>The version of the instance.</p>
         */
        @NameInMap("MseVersion")
        public String mseVersion;

        /**
         * <p>The network connection type of the instance.</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The billing method.</p>
         */
        @NameInMap("PayInfo")
        public String payInfo;

        /**
         * <p>The public bandwidth. Unit: Mbit/s.\</p>
         * <p>Valid values: 0 to 5000. The value 0 indicates no access to the Internet.</p>
         */
        @NameInMap("PubNetworkFlow")
        public String pubNetworkFlow;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group to which the elastic network interface (ENI) is connected.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The type of the security group to which the ENI is connected.</p>
         */
        @NameInMap("SecurityGroupType")
        public String securityGroupType;

        /**
         * <p>The tag.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VersionCode")
        public String versionCode;

        /**
         * <p>The ID of the VPC where the instance resides.</p>
         */
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

        public QueryClusterInfoResponseBodyData setCanUpdate(Boolean canUpdate) {
            this.canUpdate = canUpdate;
            return this;
        }
        public Boolean getCanUpdate() {
            return this.canUpdate;
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

        public QueryClusterInfoResponseBodyData setEipInstanceId(String eipInstanceId) {
            this.eipInstanceId = eipInstanceId;
            return this;
        }
        public String getEipInstanceId() {
            return this.eipInstanceId;
        }

        public QueryClusterInfoResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryClusterInfoResponseBodyData setExpectZones(java.util.List<String> expectZones) {
            this.expectZones = expectZones;
            return this;
        }
        public java.util.List<String> getExpectZones() {
            return this.expectZones;
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

        public QueryClusterInfoResponseBodyData setMaintenancePeriod(QueryClusterInfoResponseBodyDataMaintenancePeriod maintenancePeriod) {
            this.maintenancePeriod = maintenancePeriod;
            return this;
        }
        public QueryClusterInfoResponseBodyDataMaintenancePeriod getMaintenancePeriod() {
            return this.maintenancePeriod;
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

        public QueryClusterInfoResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public QueryClusterInfoResponseBodyData setSecurityGroupType(String securityGroupType) {
            this.securityGroupType = securityGroupType;
            return this;
        }
        public String getSecurityGroupType() {
            return this.securityGroupType;
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

        public QueryClusterInfoResponseBodyData setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
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

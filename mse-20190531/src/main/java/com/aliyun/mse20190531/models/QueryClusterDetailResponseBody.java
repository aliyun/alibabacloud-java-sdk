// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public QueryClusterDetailResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9515ACA4-E94D-440D-989E-C379FCED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDetailResponseBody self = new QueryClusterDetailResponseBody();
        return TeaModel.build(map, self);
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

    public QueryClusterDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterDetailResponseBodyDataInstanceModels extends TeaModel {
        /**
         * <p>The timestamp when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1578575377732</p>
         */
        @NameInMap("CreationTimestamp")
        public String creationTimestamp;

        /**
         * <p>The health status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.98.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.12.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The name of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-7413****-159616656****-reg-center-0-0</p>
         */
        @NameInMap("PodName")
        public String podName;

        /**
         * <p>The role.</p>
         * 
         * <strong>example:</strong>
         * <p>Peer</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The single-thread IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("SingleTunnelVip")
        public String singleTunnelVip;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-f</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static QueryClusterDetailResponseBodyDataInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyDataInstanceModels self = new QueryClusterDetailResponseBodyDataInstanceModels();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public String getCreationTimestamp() {
            return this.creationTimestamp;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
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

        public QueryClusterDetailResponseBodyDataInstanceModels setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setSingleTunnelVip(String singleTunnelVip) {
            this.singleTunnelVip = singleTunnelVip;
            return this;
        }
        public String getSingleTunnelVip() {
            return this.singleTunnelVip;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QueryClusterDetailResponseBodyData extends TeaModel {
        /**
         * <p>The whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("AclEntryList")
        public String aclEntryList;

        /**
         * <p>The ID of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-bp17020kiqvzutwwj****</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.1</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The billing method, such as subscription or pay-as-you-go.</p>
         * 
         * <strong>example:</strong>
         * <p>Pay-as-you-go</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The alias of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-7413****</p>
         */
        @NameInMap("ClusterAliasName")
        public String clusterAliasName;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-bc1a29b0-160230875****</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The engine specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE_SC_1_2_200_c</p>
         */
        @NameInMap("ClusterSpecification")
        public String clusterSpecification;

        /**
         * <p>The type of the instance. Valid values: ZooKeeper, Nacos-Ans, and Eureka.</p>
         * 
         * <strong>example:</strong>
         * <p>Nacos-Ans</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.1</p>
         */
        @NameInMap("ClusterVersion")
        public String clusterVersion;

        /**
         * <p>The network connection type. Valid values:</p>
         * <ul>
         * <li>slb</li>
         * <li>eni</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("ConnectionType")
        public String connectionType;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-31 11:36:08</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The capacity of the disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DiskCapacity")
        public Long diskCapacity;

        /**
         * <p>The type of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud-disk-ssd-multi-zone</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The health status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RESTART_SUCCESS</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The amount of time taken to create the instance. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>98408</p>
         */
        @NameInMap("InitCostTime")
        public Long initCostTime;

        /**
         * <p>The creation status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RESTART_SUCCESS</p>
         */
        @NameInMap("InitStatus")
        public String initStatus;

        /**
         * <p>The number of instance nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-st21ri2****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The list of instance nodes.</p>
         */
        @NameInMap("InstanceModels")
        public java.util.List<QueryClusterDetailResponseBodyDataInstanceModels> instanceModels;

        /**
         * <p>The public IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>47.98.XX.XX</p>
         */
        @NameInMap("InternetAddress")
        public String internetAddress;

        /**
         * <p>The public endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-7413****-p.eureka.mse.aliyuncs.com</p>
         */
        @NameInMap("InternetDomain")
        public String internetDomain;

        /**
         * <p>The private port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8761</p>
         */
        @NameInMap("InternetPort")
        public String internetPort;

        /**
         * <p>The internal IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-7413****-eureka.mse.aliyuncs.com</p>
         */
        @NameInMap("IntranetDomain")
        public String intranetDomain;

        /**
         * <p>The private port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8761</p>
         */
        @NameInMap("IntranetPort")
        public String intranetPort;

        /**
         * <p>The size of the memory. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MemoryCapacity")
        public Long memoryCapacity;

        /**
         * <p>The edition of Microservices Engine (MSE).</p>
         * 
         * <strong>example:</strong>
         * <p>mse_basic</p>
         */
        @NameInMap("MseVersion")
        public String mseVersion;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><code>privatenet</code>: VPC</li>
         * <li><code>pubnet</code>: Internet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>privatenet</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The version number of the original order.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.0</p>
         */
        @NameInMap("OrderClusterVersion")
        public String orderClusterVersion;

        /**
         * <p>The billing method, such as subscription or pay-as-you-go.</p>
         * 
         * <strong>example:</strong>
         * <p>Pay-as-you-go</p>
         */
        @NameInMap("PayInfo")
        public String payInfo;

        /**
         * <p>The public bandwidth. Unit: Mbit/s.\
         * Valid values: 0 to 5000. The value 0 indicates no access to the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PubNetworkFlow")
        public String pubNetworkFlow;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2dhgysj*****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags that are attached to the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx-xxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1hcg467ekqsv0zr****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static QueryClusterDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyData self = new QueryClusterDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyData setAclEntryList(String aclEntryList) {
            this.aclEntryList = aclEntryList;
            return this;
        }
        public String getAclEntryList() {
            return this.aclEntryList;
        }

        public QueryClusterDetailResponseBodyData setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public QueryClusterDetailResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public QueryClusterDetailResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public QueryClusterDetailResponseBodyData setClusterAliasName(String clusterAliasName) {
            this.clusterAliasName = clusterAliasName;
            return this;
        }
        public String getClusterAliasName() {
            return this.clusterAliasName;
        }

        public QueryClusterDetailResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryClusterDetailResponseBodyData setClusterSpecification(String clusterSpecification) {
            this.clusterSpecification = clusterSpecification;
            return this;
        }
        public String getClusterSpecification() {
            return this.clusterSpecification;
        }

        public QueryClusterDetailResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public QueryClusterDetailResponseBodyData setClusterVersion(String clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }
        public String getClusterVersion() {
            return this.clusterVersion;
        }

        public QueryClusterDetailResponseBodyData setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

        public QueryClusterDetailResponseBodyData setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryClusterDetailResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryClusterDetailResponseBodyData setDiskCapacity(Long diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Long getDiskCapacity() {
            return this.diskCapacity;
        }

        public QueryClusterDetailResponseBodyData setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
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

        public QueryClusterDetailResponseBodyData setInitStatus(String initStatus) {
            this.initStatus = initStatus;
            return this;
        }
        public String getInitStatus() {
            return this.initStatus;
        }

        public QueryClusterDetailResponseBodyData setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public QueryClusterDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryClusterDetailResponseBodyData setInstanceModels(java.util.List<QueryClusterDetailResponseBodyDataInstanceModels> instanceModels) {
            this.instanceModels = instanceModels;
            return this;
        }
        public java.util.List<QueryClusterDetailResponseBodyDataInstanceModels> getInstanceModels() {
            return this.instanceModels;
        }

        public QueryClusterDetailResponseBodyData setInternetAddress(String internetAddress) {
            this.internetAddress = internetAddress;
            return this;
        }
        public String getInternetAddress() {
            return this.internetAddress;
        }

        public QueryClusterDetailResponseBodyData setInternetDomain(String internetDomain) {
            this.internetDomain = internetDomain;
            return this;
        }
        public String getInternetDomain() {
            return this.internetDomain;
        }

        public QueryClusterDetailResponseBodyData setInternetPort(String internetPort) {
            this.internetPort = internetPort;
            return this;
        }
        public String getInternetPort() {
            return this.internetPort;
        }

        public QueryClusterDetailResponseBodyData setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public QueryClusterDetailResponseBodyData setIntranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        public QueryClusterDetailResponseBodyData setIntranetPort(String intranetPort) {
            this.intranetPort = intranetPort;
            return this;
        }
        public String getIntranetPort() {
            return this.intranetPort;
        }

        public QueryClusterDetailResponseBodyData setMemoryCapacity(Long memoryCapacity) {
            this.memoryCapacity = memoryCapacity;
            return this;
        }
        public Long getMemoryCapacity() {
            return this.memoryCapacity;
        }

        public QueryClusterDetailResponseBodyData setMseVersion(String mseVersion) {
            this.mseVersion = mseVersion;
            return this;
        }
        public String getMseVersion() {
            return this.mseVersion;
        }

        public QueryClusterDetailResponseBodyData setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryClusterDetailResponseBodyData setOrderClusterVersion(String orderClusterVersion) {
            this.orderClusterVersion = orderClusterVersion;
            return this;
        }
        public String getOrderClusterVersion() {
            return this.orderClusterVersion;
        }

        public QueryClusterDetailResponseBodyData setPayInfo(String payInfo) {
            this.payInfo = payInfo;
            return this;
        }
        public String getPayInfo() {
            return this.payInfo;
        }

        public QueryClusterDetailResponseBodyData setPubNetworkFlow(String pubNetworkFlow) {
            this.pubNetworkFlow = pubNetworkFlow;
            return this;
        }
        public String getPubNetworkFlow() {
            return this.pubNetworkFlow;
        }

        public QueryClusterDetailResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryClusterDetailResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public QueryClusterDetailResponseBodyData setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public QueryClusterDetailResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public QueryClusterDetailResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    /**
     * <p>The E-HPC Util version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.31</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li>Standard</li>
     * <li>Serverless</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ClusterCategory")
    public String clusterCategory;

    /**
     * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-06T12:43:01.000Z</p>
     */
    @NameInMap("ClusterCreateTime")
    public String clusterCreateTime;

    /**
     * <p>The post-processing script of the cluster.</p>
     */
    @NameInMap("ClusterCustomConfiguration")
    public GetClusterResponseBodyClusterCustomConfiguration clusterCustomConfiguration;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The deployment type of the cluster. Valid values:</p>
     * <ul>
     * <li>Integrated: The cluster is deployed on a public cloud.</li>
     * <li>Hybrid: The cluster is deployed on a hybrid cloud.</li>
     * <li>Custom: The cluster is a custom cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Integrated</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>The time when the cluster was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-06T12:43:01.000Z</p>
     */
    @NameInMap("ClusterModifyTime")
    public String clusterModifyTime;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240614</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The cluster state. Valid values:</p>
     * <ul>
     * <li>uninit: The cluster is being installed.</li>
     * <li>creating: The cluster is being created.</li>
     * <li>initing: The cluster is being initialized.</li>
     * <li>running: The cluster is running.</li>
     * <li>exception: The cluster has run into an exception.</li>
     * <li>raleasing: The cluster is being released.</li>
     * <li>stopping: The cluster is being stopped.</li>
     * <li>stopped: The cluster is stopped.</li>
     * <li>pending: The cluster is waiting to be configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("ClusterStatus")
    public String clusterStatus;

    /**
     * <p>The ID of the vSwitch used by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1p2uugqsjppno******</p>
     */
    @NameInMap("ClusterVSwitchId")
    public String clusterVSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) used by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6u3lk1pjy28eg*****</p>
     */
    @NameInMap("ClusterVpcId")
    public String clusterVpcId;

    /**
     * <p>Indicates whether deletion protection is enabled for the cluster. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteProtection")
    public String deleteProtection;

    /**
     * <p>The E-HPC version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    /**
     * <p>Indicates whether automatic scale-in is enabled for the cluster. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleIn")
    public Boolean enableScaleIn;

    /**
     * <p>Indicates whether automatic scale-out is enabled for the cluster. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleOut")
    public Boolean enableScaleOut;

    /**
     * <p>The interval at which the cluster is automatically scaled out.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GrowInterval")
    public Integer growInterval;

    /**
     * <p>The idle duration of the compute nodes allowed by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IdleInterval")
    public Integer idleInterval;

    /**
     * <p>The management node configurations.</p>
     */
    @NameInMap("Manager")
    public GetClusterResponseBodyManager manager;

    /**
     * <p>The maximum total number of vCPUs that can be used by all compute nodes managed by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxCoreCount")
    public String maxCoreCount;

    /**
     * <p>The maximum number of compute nodes that the cluster can manage.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxCount")
    public String maxCount;

    /**
     * <p>The monitoring details of the cluster.</p>
     */
    @NameInMap("MonitorSpec")
    public GetClusterResponseBodyMonitorSpec monitorSpec;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The scheduler specifications of the cluster.</p>
     */
    @NameInMap("SchedulerSpec")
    public GetClusterResponseBodySchedulerSpec schedulerSpec;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-f8z9vb2zaezpkr69a21k</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static GetClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterResponseBody self = new GetClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterResponseBody setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetClusterResponseBody setClusterCategory(String clusterCategory) {
        this.clusterCategory = clusterCategory;
        return this;
    }
    public String getClusterCategory() {
        return this.clusterCategory;
    }

    public GetClusterResponseBody setClusterCreateTime(String clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
        return this;
    }
    public String getClusterCreateTime() {
        return this.clusterCreateTime;
    }

    public GetClusterResponseBody setClusterCustomConfiguration(GetClusterResponseBodyClusterCustomConfiguration clusterCustomConfiguration) {
        this.clusterCustomConfiguration = clusterCustomConfiguration;
        return this;
    }
    public GetClusterResponseBodyClusterCustomConfiguration getClusterCustomConfiguration() {
        return this.clusterCustomConfiguration;
    }

    public GetClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterResponseBody setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public GetClusterResponseBody setClusterModifyTime(String clusterModifyTime) {
        this.clusterModifyTime = clusterModifyTime;
        return this;
    }
    public String getClusterModifyTime() {
        return this.clusterModifyTime;
    }

    public GetClusterResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetClusterResponseBody setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    public GetClusterResponseBody setClusterVSwitchId(String clusterVSwitchId) {
        this.clusterVSwitchId = clusterVSwitchId;
        return this;
    }
    public String getClusterVSwitchId() {
        return this.clusterVSwitchId;
    }

    public GetClusterResponseBody setClusterVpcId(String clusterVpcId) {
        this.clusterVpcId = clusterVpcId;
        return this;
    }
    public String getClusterVpcId() {
        return this.clusterVpcId;
    }

    public GetClusterResponseBody setDeleteProtection(String deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }
    public String getDeleteProtection() {
        return this.deleteProtection;
    }

    public GetClusterResponseBody setEhpcVersion(String ehpcVersion) {
        this.ehpcVersion = ehpcVersion;
        return this;
    }
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    public GetClusterResponseBody setEnableScaleIn(Boolean enableScaleIn) {
        this.enableScaleIn = enableScaleIn;
        return this;
    }
    public Boolean getEnableScaleIn() {
        return this.enableScaleIn;
    }

    public GetClusterResponseBody setEnableScaleOut(Boolean enableScaleOut) {
        this.enableScaleOut = enableScaleOut;
        return this;
    }
    public Boolean getEnableScaleOut() {
        return this.enableScaleOut;
    }

    public GetClusterResponseBody setGrowInterval(Integer growInterval) {
        this.growInterval = growInterval;
        return this;
    }
    public Integer getGrowInterval() {
        return this.growInterval;
    }

    public GetClusterResponseBody setIdleInterval(Integer idleInterval) {
        this.idleInterval = idleInterval;
        return this;
    }
    public Integer getIdleInterval() {
        return this.idleInterval;
    }

    public GetClusterResponseBody setManager(GetClusterResponseBodyManager manager) {
        this.manager = manager;
        return this;
    }
    public GetClusterResponseBodyManager getManager() {
        return this.manager;
    }

    public GetClusterResponseBody setMaxCoreCount(String maxCoreCount) {
        this.maxCoreCount = maxCoreCount;
        return this;
    }
    public String getMaxCoreCount() {
        return this.maxCoreCount;
    }

    public GetClusterResponseBody setMaxCount(String maxCount) {
        this.maxCount = maxCount;
        return this;
    }
    public String getMaxCount() {
        return this.maxCount;
    }

    public GetClusterResponseBody setMonitorSpec(GetClusterResponseBodyMonitorSpec monitorSpec) {
        this.monitorSpec = monitorSpec;
        return this;
    }
    public GetClusterResponseBodyMonitorSpec getMonitorSpec() {
        return this.monitorSpec;
    }

    public GetClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetClusterResponseBody setSchedulerSpec(GetClusterResponseBodySchedulerSpec schedulerSpec) {
        this.schedulerSpec = schedulerSpec;
        return this;
    }
    public GetClusterResponseBodySchedulerSpec getSchedulerSpec() {
        return this.schedulerSpec;
    }

    public GetClusterResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static class GetClusterResponseBodyClusterCustomConfiguration extends TeaModel {
        /**
         * <p>The arguments that are used to run the script after the scrip is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>E-HPC cn-hangzhou</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The URL that is used to download the post-processing script.</p>
         * 
         * <strong>example:</strong>
         * <p>http://*****</p>
         */
        @NameInMap("Script")
        public String script;

        public static GetClusterResponseBodyClusterCustomConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyClusterCustomConfiguration self = new GetClusterResponseBodyClusterCustomConfiguration();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyClusterCustomConfiguration setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public GetClusterResponseBodyClusterCustomConfiguration setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class GetClusterResponseBodyManagerDNS extends TeaModel {
        /**
         * <p>The state of the domain name resolution service. Valid values:</p>
         * <ul>
         * <li>uninit: The service is being installed.</li>
         * <li>initing: The service is being initialized.</li>
         * <li>running: The service is running.</li>
         * <li>exception: The service has run into an exception.</li>
         * <li>releasing: The service is being released.</li>
         * <li>stopped: The service is stopped.</li>
         * <li>pending: The service is waiting to be configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The resolution type.</p>
         * 
         * <strong>example:</strong>
         * <p>nis</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the resolution service.</p>
         * 
         * <strong>example:</strong>
         * <p>2.31</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetClusterResponseBodyManagerDNS build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyManagerDNS self = new GetClusterResponseBodyManagerDNS();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyManagerDNS setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetClusterResponseBodyManagerDNS setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetClusterResponseBodyManagerDNS setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetClusterResponseBodyManagerDirectoryService extends TeaModel {
        /**
         * <p>The state of the domain account service. Valid values:</p>
         * <ul>
         * <li>uninit: The service is being installed.</li>
         * <li>initing: The service is being initialized.</li>
         * <li>running: The service is running.</li>
         * <li>exception: The service has run into an exception.</li>
         * <li>releasing: The service is being released.</li>
         * <li>stopped: The service is stopped.</li>
         * <li>pending: The service is waiting to be configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the domain account.</p>
         * 
         * <strong>example:</strong>
         * <p>nis</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the domain account service.</p>
         * 
         * <strong>example:</strong>
         * <p>2.31</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetClusterResponseBodyManagerDirectoryService build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyManagerDirectoryService self = new GetClusterResponseBodyManagerDirectoryService();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyManagerDirectoryService setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetClusterResponseBodyManagerDirectoryService setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetClusterResponseBodyManagerDirectoryService setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetClusterResponseBodyManagerManagerNodeSystemDisk extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Long size;

        public static GetClusterResponseBodyManagerManagerNodeSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyManagerManagerNodeSystemDisk self = new GetClusterResponseBodyManagerManagerNodeSystemDisk();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyManagerManagerNodeSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetClusterResponseBodyManagerManagerNodeSystemDisk setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetClusterResponseBodyManagerManagerNodeSystemDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class GetClusterResponseBodyManagerManagerNode extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("AutoRenewPeriod")
        public Long autoRenewPeriod;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EnableHt")
        public Boolean enableHt;

        /**
         * <p>The expiration time of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>2099-12-31T15:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>aliyun_2_1903_x64_20G_alibase_20200324.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance billing method of the management node. Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go</li>
         * <li>PrePaid: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance ID of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1a170jgea1vl******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance type of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.4xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Long period;

        /**
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("SystemDisk")
        public GetClusterResponseBodyManagerManagerNodeSystemDisk systemDisk;

        public static GetClusterResponseBodyManagerManagerNode build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyManagerManagerNode self = new GetClusterResponseBodyManagerManagerNode();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyManagerManagerNode setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public GetClusterResponseBodyManagerManagerNode setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public GetClusterResponseBodyManagerManagerNode setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetClusterResponseBodyManagerManagerNode setEnableHt(Boolean enableHt) {
            this.enableHt = enableHt;
            return this;
        }
        public Boolean getEnableHt() {
            return this.enableHt;
        }

        public GetClusterResponseBodyManagerManagerNode setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public GetClusterResponseBodyManagerManagerNode setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetClusterResponseBodyManagerManagerNode setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public GetClusterResponseBodyManagerManagerNode setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetClusterResponseBodyManagerManagerNode setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetClusterResponseBodyManagerManagerNode setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public GetClusterResponseBodyManagerManagerNode setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public GetClusterResponseBodyManagerManagerNode setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public GetClusterResponseBodyManagerManagerNode setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public GetClusterResponseBodyManagerManagerNode setSystemDisk(GetClusterResponseBodyManagerManagerNodeSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public GetClusterResponseBodyManagerManagerNodeSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

    }

    public static class GetClusterResponseBodyManagerScheduler extends TeaModel {
        /**
         * <p>The scheduler state. Valid values:</p>
         * <ul>
         * <li>uninit: The scheduler is being installed.</li>
         * <li>initing: The scheduler is being initialized.</li>
         * <li>running: The scheduler is running.</li>
         * <li>exception: The scheduler has run into an exception.</li>
         * <li>releasing: The scheduler is being released.</li>
         * <li>stopped: The scheduler is stopped.</li>
         * <li>pending: The scheduler is waiting to be configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The scheduler type. Valid values:</p>
         * <ul>
         * <li>SLURM</li>
         * <li>PBS</li>
         * <li>OPENGRIDSCHEDULER</li>
         * <li>LSF_PLUGIN</li>
         * <li>PBS_PLUGIN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLURM</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The scheduler version.</p>
         * 
         * <strong>example:</strong>
         * <p>22.05.8</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetClusterResponseBodyManagerScheduler build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyManagerScheduler self = new GetClusterResponseBodyManagerScheduler();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyManagerScheduler setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetClusterResponseBodyManagerScheduler setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetClusterResponseBodyManagerScheduler setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetClusterResponseBodyManager extends TeaModel {
        /**
         * <p>The configurations of the domain name resolution service.</p>
         */
        @NameInMap("DNS")
        public GetClusterResponseBodyManagerDNS DNS;

        /**
         * <p>The information about the domain account service.</p>
         */
        @NameInMap("DirectoryService")
        public GetClusterResponseBodyManagerDirectoryService directoryService;

        /**
         * <p>The configurations of the management node.</p>
         */
        @NameInMap("ManagerNode")
        public GetClusterResponseBodyManagerManagerNode managerNode;

        /**
         * <p>The information about the scheduler.</p>
         */
        @NameInMap("Scheduler")
        public GetClusterResponseBodyManagerScheduler scheduler;

        public static GetClusterResponseBodyManager build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyManager self = new GetClusterResponseBodyManager();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyManager setDNS(GetClusterResponseBodyManagerDNS DNS) {
            this.DNS = DNS;
            return this;
        }
        public GetClusterResponseBodyManagerDNS getDNS() {
            return this.DNS;
        }

        public GetClusterResponseBodyManager setDirectoryService(GetClusterResponseBodyManagerDirectoryService directoryService) {
            this.directoryService = directoryService;
            return this;
        }
        public GetClusterResponseBodyManagerDirectoryService getDirectoryService() {
            return this.directoryService;
        }

        public GetClusterResponseBodyManager setManagerNode(GetClusterResponseBodyManagerManagerNode managerNode) {
            this.managerNode = managerNode;
            return this;
        }
        public GetClusterResponseBodyManagerManagerNode getManagerNode() {
            return this.managerNode;
        }

        public GetClusterResponseBodyManager setScheduler(GetClusterResponseBodyManagerScheduler scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public GetClusterResponseBodyManagerScheduler getScheduler() {
            return this.scheduler;
        }

    }

    public static class GetClusterResponseBodyMonitorSpec extends TeaModel {
        /**
         * <p>Indicates whether the monitoring component of compute nodes is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableComputeLoadMonitor")
        public Boolean enableComputeLoadMonitor;

        public static GetClusterResponseBodyMonitorSpec build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyMonitorSpec self = new GetClusterResponseBodyMonitorSpec();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyMonitorSpec setEnableComputeLoadMonitor(Boolean enableComputeLoadMonitor) {
            this.enableComputeLoadMonitor = enableComputeLoadMonitor;
            return this;
        }
        public Boolean getEnableComputeLoadMonitor() {
            return this.enableComputeLoadMonitor;
        }

    }

    public static class GetClusterResponseBodySchedulerSpec extends TeaModel {
        @NameInMap("EnablePowerSaving")
        public Boolean enablePowerSaving;

        /**
         * <p>Indicates whether the topology awareness feature is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTopologyAwareness")
        public Boolean enableTopologyAwareness;

        public static GetClusterResponseBodySchedulerSpec build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodySchedulerSpec self = new GetClusterResponseBodySchedulerSpec();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodySchedulerSpec setEnablePowerSaving(Boolean enablePowerSaving) {
            this.enablePowerSaving = enablePowerSaving;
            return this;
        }
        public Boolean getEnablePowerSaving() {
            return this.enablePowerSaving;
        }

        public GetClusterResponseBodySchedulerSpec setEnableTopologyAwareness(Boolean enableTopologyAwareness) {
            this.enableTopologyAwareness = enableTopologyAwareness;
            return this;
        }
        public Boolean getEnableTopologyAwareness() {
            return this.enableTopologyAwareness;
        }

    }

}

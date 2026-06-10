// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    /**
     * <p>The E-HPC Util version used by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.31</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The cluster series. Valid values:</p>
     * <ul>
     * <li><p>Standard</p>
     * </li>
     * <li><p>Serverless</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ClusterCategory")
    public String clusterCategory;

    /**
     * <p>The cluster creation time. The time follows the ISO 8601 standard and is in UTC+0. The format is yyyy-MM-ddTHH:mmZ. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-06T12:43:01.000Z</p>
     */
    @NameInMap("ClusterCreateTime")
    public String clusterCreateTime;

    /**
     * <p>The cluster post-processing script.</p>
     */
    @NameInMap("ClusterCustomConfiguration")
    public GetClusterResponseBodyClusterCustomConfiguration clusterCustomConfiguration;

    /**
     * <p>The E-HPC cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The deployment type of the cluster. Valid values:</p>
     * <ul>
     * <li><p>Integrated: Public cloud</p>
     * </li>
     * <li><p>Hybrid: Hybrid cloud</p>
     * </li>
     * <li><p>Custom: Custom cluster</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Integrated</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>The cluster modification time. The time follows the ISO 8601 standard and is in UTC+0. The format is yyyy-MM-ddTHH:mmZ. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-06T12:43:01.000Z</p>
     */
    @NameInMap("ClusterModifyTime")
    public String clusterModifyTime;

    /**
     * <p>The E-HPC cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240614</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The cluster status. Valid values:</p>
     * <ul>
     * <li><p>uninit: Installing</p>
     * </li>
     * <li><p>creating: Creating</p>
     * </li>
     * <li><p>initing: Initializing</p>
     * </li>
     * <li><p>running: Running</p>
     * </li>
     * <li><p>exception: Abnormal</p>
     * </li>
     * <li><p>releasing: Releasing</p>
     * </li>
     * <li><p>stopping: Stopping</p>
     * </li>
     * <li><p>stopped: Stopped</p>
     * </li>
     * <li><p>pending: Pending configuration</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("ClusterStatus")
    public String clusterStatus;

    /**
     * <p>The virtual switch ID used by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1p2uugqsjppno******</p>
     */
    @NameInMap("ClusterVSwitchId")
    public String clusterVSwitchId;

    /**
     * <p>The Virtual Private Cloud (VPC) ID used by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6u3lk1pjy28eg*****</p>
     */
    @NameInMap("ClusterVpcId")
    public String clusterVpcId;

    /**
     * <p>Indicates whether delete protection is enabled for the cluster. Valid values:</p>
     * <ul>
     * <li><p>true: Enable delete protection.</p>
     * </li>
     * <li><p>false: Do not enable delete protection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteProtection")
    public String deleteProtection;

    /**
     * <p>The E-HPC product version number.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    /**
     * <p>Indicates whether auto scale-in is enabled for the cluster. Valid values:</p>
     * <ul>
     * <li><p>true: Enable</p>
     * </li>
     * <li><p>false: Disable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleIn")
    public Boolean enableScaleIn;

    /**
     * <p>Indicates whether auto scale-out is enabled for the cluster. Valid values:</p>
     * <ul>
     * <li><p>true: Enable</p>
     * </li>
     * <li><p>false: Disable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleOut")
    public Boolean enableScaleOut;

    /**
     * <p>The interval for cluster auto scale-out.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GrowInterval")
    public Integer growInterval;

    /**
     * <p>The idle time of the cluster\&quot;s compute nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IdleInterval")
    public Integer idleInterval;

    /**
     * <p>The cluster control plane node configuration.</p>
     */
    @NameInMap("Manager")
    public GetClusterResponseBodyManager manager;

    /**
     * <p>The total number of cores of compute nodes the cluster can manage.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxCoreCount")
    public String maxCoreCount;

    /**
     * <p>The number of compute nodes the cluster can manage.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxCount")
    public String maxCount;

    /**
     * <p>The cluster monitoring details.</p>
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
     * <p>The cluster scheduling details.</p>
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
         * <p>The runtime parameters of the post-installation script.</p>
         * 
         * <strong>example:</strong>
         * <p>E-HPC cn-hangzhou</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The download URL of the post-processing script.</p>
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
         * <p>The domain name resolution service status. Valid values:</p>
         * <ul>
         * <li><p>uninit: Installing</p>
         * </li>
         * <li><p>initing: Initializing</p>
         * </li>
         * <li><p>running: Running</p>
         * </li>
         * <li><p>exception: Abnormal</p>
         * </li>
         * <li><p>releasing: Releasing</p>
         * </li>
         * <li><p>stopped: Stopped</p>
         * </li>
         * <li><p>pending: Pending configuration</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The domain name resolution type.</p>
         * 
         * <strong>example:</strong>
         * <p>nis</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The domain name resolution version.</p>
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
         * <p>The domain account service status. Valid values:</p>
         * <ul>
         * <li><p>uninit: Installing</p>
         * </li>
         * <li><p>initing: Initializing</p>
         * </li>
         * <li><p>running: Running</p>
         * </li>
         * <li><p>exception: Abnormal</p>
         * </li>
         * <li><p>releasing: Releasing</p>
         * </li>
         * <li><p>stopped: Stopped</p>
         * </li>
         * <li><p>pending: Pending configuration</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The domain account type.</p>
         * 
         * <strong>example:</strong>
         * <p>nis</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The domain account version.</p>
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
         * <p>The expiration time of the control plane node.</p>
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
         * <p>The billing method of the control plane node instance. Valid values:</p>
         * <ul>
         * <li><p>PostPaid: Pay-as-you-go</p>
         * </li>
         * <li><p>PrePaid: Subscription</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The control plane node instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1a170jgea1vl******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The control plane node instance type.</p>
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
         * <p>The scheduler service status. Valid values:</p>
         * <ul>
         * <li><p>uninit: Installing</p>
         * </li>
         * <li><p>initing: Initializing</p>
         * </li>
         * <li><p>running: Running</p>
         * </li>
         * <li><p>exception: Abnormal</p>
         * </li>
         * <li><p>releasing: Releasing</p>
         * </li>
         * <li><p>stopped: Stopped</p>
         * </li>
         * <li><p>pending: Pending configuration</p>
         * </li>
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
         * <li><p>SLURM</p>
         * </li>
         * <li><p>PBS</p>
         * </li>
         * <li><p>OPENGRIDSCHEDULER</p>
         * </li>
         * <li><p>LSF_PLUGIN</p>
         * </li>
         * <li><p>PBS_PLUGIN</p>
         * </li>
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
         * <p>The domain name resolution service configuration.</p>
         */
        @NameInMap("DNS")
        public GetClusterResponseBodyManagerDNS DNS;

        /**
         * <p>The domain account service information.</p>
         */
        @NameInMap("DirectoryService")
        public GetClusterResponseBodyManagerDirectoryService directoryService;

        /**
         * <p>The control plane node configuration.</p>
         */
        @NameInMap("ManagerNode")
        public GetClusterResponseBodyManagerManagerNode managerNode;

        /**
         * <p>The scheduler service information.</p>
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
         * <p>Indicates whether the monitoring component for compute nodes is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li><p>true: Enable</p>
         * </li>
         * <li><p>false: Disable</p>
         * </li>
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
         * <li><p>true: Enable</p>
         * </li>
         * <li><p>false: Disable</p>
         * </li>
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

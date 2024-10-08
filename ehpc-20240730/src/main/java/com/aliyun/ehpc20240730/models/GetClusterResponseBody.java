// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2.0.31</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ClusterCategory")
    public String clusterCategory;

    /**
     * <strong>example:</strong>
     * <p>2024-08-06T12:43:01.000Z</p>
     */
    @NameInMap("ClusterCreateTime")
    public String clusterCreateTime;

    @NameInMap("ClusterCustomConfiguration")
    public GetClusterResponseBodyClusterCustomConfiguration clusterCustomConfiguration;

    /**
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>Integrated</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <strong>example:</strong>
     * <p>2024-08-06T12:43:01.000Z</p>
     */
    @NameInMap("ClusterModifyTime")
    public String clusterModifyTime;

    /**
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240614</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("ClusterStatus")
    public String clusterStatus;

    /**
     * <strong>example:</strong>
     * <p>vsw-bp1p2uugqsjppno******</p>
     */
    @NameInMap("ClusterVSwitchId")
    public String clusterVSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-uf6u3lk1pjy28eg*****</p>
     */
    @NameInMap("ClusterVpcId")
    public String clusterVpcId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteProtection")
    public String deleteProtection;

    /**
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleIn")
    public Boolean enableScaleIn;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleOut")
    public Boolean enableScaleOut;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GrowInterval")
    public Integer growInterval;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IdleInterval")
    public Integer idleInterval;

    @NameInMap("Manager")
    public GetClusterResponseBodyManager manager;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxCoreCount")
    public String maxCoreCount;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxCount")
    public String maxCount;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
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

    public GetClusterResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static class GetClusterResponseBodyClusterCustomConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>E-HPC cn-hangzhou</p>
         */
        @NameInMap("Args")
        public String args;

        /**
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
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>nis</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>nis</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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

    public static class GetClusterResponseBodyManagerManagerNode extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2099-12-31T15:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <strong>example:</strong>
         * <p>i-bp1a170jgea1vl******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>ecs.g6.4xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        public static GetClusterResponseBodyManagerManagerNode build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyManagerManagerNode self = new GetClusterResponseBodyManagerManagerNode();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyManagerManagerNode setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
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

    }

    public static class GetClusterResponseBodyManagerScheduler extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>SLURM</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
        @NameInMap("DNS")
        public GetClusterResponseBodyManagerDNS DNS;

        @NameInMap("DirectoryService")
        public GetClusterResponseBodyManagerDirectoryService directoryService;

        @NameInMap("ManagerNode")
        public GetClusterResponseBodyManagerManagerNode managerNode;

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

}

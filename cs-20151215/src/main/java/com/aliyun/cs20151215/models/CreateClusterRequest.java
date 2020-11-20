// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    // 组件信息。
    @NameInMap("addons")
    public java.util.List<CreateClusterRequestAddons> addons;

    // 是否安装云监控插件。
    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    // 集群类型
    @NameInMap("cluster_type")
    public String clusterType;

    // POD网络地址段。
    @NameInMap("container_cidr")
    public String containerCidr;

    // CPU管理策略。
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    // 集群是否开启删除保护。
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    // 集群创建失败后是否回滚。
    @NameInMap("disable_rollback")
    public Boolean disableRollback;

    // 集群是否运行公网访问。
    @NameInMap("endpoint_public_access")
    public Boolean endpointPublicAccess;

    // 是否进行数据盘挂载
    @NameInMap("format_disk")
    public Boolean formatDisk;

    // 自定义镜像ID。
    @NameInMap("image_id")
    public String imageId;

    // 已有实例列表。
    @NameInMap("instances")
    public java.util.List<String> instances;

    // 是否自动创建企业安全组，与security_group_id二选一。
    @NameInMap("is_enterprise_security_group")
    public Boolean isEnterpriseSecurityGroup;

    // 是否保留实例名称。
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    // key_pair名称，和login_password二选一。
    @NameInMap("key_pair")
    public String keyPair;

    // 集群版本好。
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    // SSH登录密码，与key_pair二选一。
    @NameInMap("login_password")
    public String loginPassword;

    // Master节点是否自动续费。
    @NameInMap("master_auto_renew")
    public Boolean masterAutoRenew;

    // Master节点自动续费周期。
    @NameInMap("master_auto_renew_period")
    public Long masterAutoRenewPeriod;

    // Master节点数量。
    @NameInMap("master_count")
    public Long masterCount;

    // Master节点付费类型。
    @NameInMap("master_instance_charge_type")
    public String masterInstanceChargeType;

    // Master节点ECS规格类型。
    @NameInMap("master_instance_types")
    public java.util.List<String> masterInstanceTypes;

    // Master节点包年包月时长，当master_instance_charge_type取值为PrePaid时才生效且为必选值。
    @NameInMap("master_period")
    public Long masterPeriod;

    // Master节点包年包月周期。
    @NameInMap("master_period_unit")
    public String masterPeriodUnit;

    // Master节点系统盘类型。
    @NameInMap("master_system_disk_category")
    public String masterSystemDiskCategory;

    // Master节点系统盘大小。
    @NameInMap("master_system_disk_size")
    public Long masterSystemDiskSize;

    // Master节点交换机ID列表。
    @NameInMap("master_vswitch_ids")
    public java.util.List<String> masterVswitchIds;

    // 集群名称。
    @NameInMap("name")
    public String name;

    // 节点IP数量，这里通过CIDR来指定。
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    // 节点服务端口范围。
    @NameInMap("node_port_range")
    public String nodePortRange;

    // Worker节点数量。
    @NameInMap("num_of_nodes")
    public Long numOfNodes;

    // 操作系统。
    @NameInMap("os_type")
    public String osType;

    // 操作系统发行版。
    @NameInMap("platform")
    public String platform;

    // Pod的虚拟交换机列表，在ENI多网卡模式下，需要传额外的VSwitch ID给addon。
    @NameInMap("pod_vswitch_ids")
    public java.util.List<String> podVswitchIds;

    // 是否开启PrivateZone用于服务发现。
    @NameInMap("private_zone")
    public Boolean privateZone;

    // 边缘集群标识。
    @NameInMap("profile")
    public String profile;

    // kube-proxy代理模式。
    @NameInMap("proxy_mode")
    public String proxyMode;

    // RDS列表，将该ECS加入到选择的RDS实例的白名单中。。
    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    // 集群所属地域ID。
    @NameInMap("region_id")
    public String regionId;

    // 容器运行时。
    @NameInMap("runtime")
    public CreateClusterRequestRuntime runtime;

    // 自定义安全组ID。
    @NameInMap("security_group_id")
    public String securityGroupId;

    // Service网络地址段。
    @NameInMap("service_cidr")
    public String serviceCidr;

    // 集群是否配置SNAT。
    @NameInMap("snat_entry")
    public Boolean snatEntry;

    // 集群是否开启公网SSH登录。
    @NameInMap("ssh_flags")
    public Boolean sshFlags;

    // 集群标签。
    @NameInMap("tags")
    public java.util.List<CreateClusterRequestTags> tags;

    // 污点信息。
    @NameInMap("taints")
    public java.util.List<CreateClusterRequestTaints> taints;

    // 集群创建超时时间。
    @NameInMap("timeout_mins")
    public Long timeoutMins;

    // 节点用户自定义数据。
    @NameInMap("user_data")
    public String userData;

    // 集群使用的VPC。
    @NameInMap("vpcid")
    public String vpcid;

    // 虚拟交换机列表。List长度范围为[1，3]。当集群类型为托管版或标准serverless集群时，该参数必填。
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    // Worker节点是否自动续费。
    @NameInMap("worker_auto_renew")
    public Boolean workerAutoRenew;

    // Worker节点自动续费周期。
    @NameInMap("worker_auto_renew_period")
    public Long workerAutoRenewPeriod;

    // Worker节点数据盘配置。
    @NameInMap("worker_data_disks")
    public java.util.List<CreateClusterRequestWorkerDataDisks> workerDataDisks;

    // Worker节点付费类型。
    @NameInMap("worker_instance_charge_type")
    public String workerInstanceChargeType;

    // Worker节点ECS实例类型。
    @NameInMap("worker_instance_types")
    public java.util.List<String> workerInstanceTypes;

    // Worker节点包年包月时长。
    @NameInMap("worker_period")
    public Long workerPeriod;

    // Worker节点包年包月周期。
    @NameInMap("worker_period_unit")
    public String workerPeriodUnit;

    // Worker节点系统盘类型。
    @NameInMap("worker_system_disk_category")
    public String workerSystemDiskCategory;

    // Worker节点系统盘大小。
    @NameInMap("worker_system_disk_size")
    public Long workerSystemDiskSize;

    // 集群使用的虚拟交换机。
    @NameInMap("worker_vswitch_ids")
    public java.util.List<String> workerVswitchIds;

    // 集群所属地域内的可用区ID。
    @NameInMap("zone_id")
    public String zoneId;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setAddons(java.util.List<CreateClusterRequestAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<CreateClusterRequestAddons> getAddons() {
        return this.addons;
    }

    public CreateClusterRequest setCloudMonitorFlags(Boolean cloudMonitorFlags) {
        this.cloudMonitorFlags = cloudMonitorFlags;
        return this;
    }
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    public CreateClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterRequest setContainerCidr(String containerCidr) {
        this.containerCidr = containerCidr;
        return this;
    }
    public String getContainerCidr() {
        return this.containerCidr;
    }

    public CreateClusterRequest setCpuPolicy(String cpuPolicy) {
        this.cpuPolicy = cpuPolicy;
        return this;
    }
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    public CreateClusterRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateClusterRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public CreateClusterRequest setEndpointPublicAccess(Boolean endpointPublicAccess) {
        this.endpointPublicAccess = endpointPublicAccess;
        return this;
    }
    public Boolean getEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    public CreateClusterRequest setFormatDisk(Boolean formatDisk) {
        this.formatDisk = formatDisk;
        return this;
    }
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    public CreateClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateClusterRequest setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public CreateClusterRequest setIsEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
        this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
        return this;
    }
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    public CreateClusterRequest setKeepInstanceName(Boolean keepInstanceName) {
        this.keepInstanceName = keepInstanceName;
        return this;
    }
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    public CreateClusterRequest setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public CreateClusterRequest setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public CreateClusterRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public CreateClusterRequest setMasterAutoRenew(Boolean masterAutoRenew) {
        this.masterAutoRenew = masterAutoRenew;
        return this;
    }
    public Boolean getMasterAutoRenew() {
        return this.masterAutoRenew;
    }

    public CreateClusterRequest setMasterAutoRenewPeriod(Long masterAutoRenewPeriod) {
        this.masterAutoRenewPeriod = masterAutoRenewPeriod;
        return this;
    }
    public Long getMasterAutoRenewPeriod() {
        return this.masterAutoRenewPeriod;
    }

    public CreateClusterRequest setMasterCount(Long masterCount) {
        this.masterCount = masterCount;
        return this;
    }
    public Long getMasterCount() {
        return this.masterCount;
    }

    public CreateClusterRequest setMasterInstanceChargeType(String masterInstanceChargeType) {
        this.masterInstanceChargeType = masterInstanceChargeType;
        return this;
    }
    public String getMasterInstanceChargeType() {
        return this.masterInstanceChargeType;
    }

    public CreateClusterRequest setMasterInstanceTypes(java.util.List<String> masterInstanceTypes) {
        this.masterInstanceTypes = masterInstanceTypes;
        return this;
    }
    public java.util.List<String> getMasterInstanceTypes() {
        return this.masterInstanceTypes;
    }

    public CreateClusterRequest setMasterPeriod(Long masterPeriod) {
        this.masterPeriod = masterPeriod;
        return this;
    }
    public Long getMasterPeriod() {
        return this.masterPeriod;
    }

    public CreateClusterRequest setMasterPeriodUnit(String masterPeriodUnit) {
        this.masterPeriodUnit = masterPeriodUnit;
        return this;
    }
    public String getMasterPeriodUnit() {
        return this.masterPeriodUnit;
    }

    public CreateClusterRequest setMasterSystemDiskCategory(String masterSystemDiskCategory) {
        this.masterSystemDiskCategory = masterSystemDiskCategory;
        return this;
    }
    public String getMasterSystemDiskCategory() {
        return this.masterSystemDiskCategory;
    }

    public CreateClusterRequest setMasterSystemDiskSize(Long masterSystemDiskSize) {
        this.masterSystemDiskSize = masterSystemDiskSize;
        return this;
    }
    public Long getMasterSystemDiskSize() {
        return this.masterSystemDiskSize;
    }

    public CreateClusterRequest setMasterVswitchIds(java.util.List<String> masterVswitchIds) {
        this.masterVswitchIds = masterVswitchIds;
        return this;
    }
    public java.util.List<String> getMasterVswitchIds() {
        return this.masterVswitchIds;
    }

    public CreateClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClusterRequest setNodeCidrMask(String nodeCidrMask) {
        this.nodeCidrMask = nodeCidrMask;
        return this;
    }
    public String getNodeCidrMask() {
        return this.nodeCidrMask;
    }

    public CreateClusterRequest setNodePortRange(String nodePortRange) {
        this.nodePortRange = nodePortRange;
        return this;
    }
    public String getNodePortRange() {
        return this.nodePortRange;
    }

    public CreateClusterRequest setNumOfNodes(Long numOfNodes) {
        this.numOfNodes = numOfNodes;
        return this;
    }
    public Long getNumOfNodes() {
        return this.numOfNodes;
    }

    public CreateClusterRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateClusterRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateClusterRequest setPodVswitchIds(java.util.List<String> podVswitchIds) {
        this.podVswitchIds = podVswitchIds;
        return this;
    }
    public java.util.List<String> getPodVswitchIds() {
        return this.podVswitchIds;
    }

    public CreateClusterRequest setPrivateZone(Boolean privateZone) {
        this.privateZone = privateZone;
        return this;
    }
    public Boolean getPrivateZone() {
        return this.privateZone;
    }

    public CreateClusterRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public CreateClusterRequest setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }
    public String getProxyMode() {
        return this.proxyMode;
    }

    public CreateClusterRequest setRdsInstances(java.util.List<String> rdsInstances) {
        this.rdsInstances = rdsInstances;
        return this;
    }
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
    }

    public CreateClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterRequest setRuntime(CreateClusterRequestRuntime runtime) {
        this.runtime = runtime;
        return this;
    }
    public CreateClusterRequestRuntime getRuntime() {
        return this.runtime;
    }

    public CreateClusterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateClusterRequest setServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    public CreateClusterRequest setSnatEntry(Boolean snatEntry) {
        this.snatEntry = snatEntry;
        return this;
    }
    public Boolean getSnatEntry() {
        return this.snatEntry;
    }

    public CreateClusterRequest setSshFlags(Boolean sshFlags) {
        this.sshFlags = sshFlags;
        return this;
    }
    public Boolean getSshFlags() {
        return this.sshFlags;
    }

    public CreateClusterRequest setTags(java.util.List<CreateClusterRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateClusterRequestTags> getTags() {
        return this.tags;
    }

    public CreateClusterRequest setTaints(java.util.List<CreateClusterRequestTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<CreateClusterRequestTaints> getTaints() {
        return this.taints;
    }

    public CreateClusterRequest setTimeoutMins(Long timeoutMins) {
        this.timeoutMins = timeoutMins;
        return this;
    }
    public Long getTimeoutMins() {
        return this.timeoutMins;
    }

    public CreateClusterRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateClusterRequest setVpcid(String vpcid) {
        this.vpcid = vpcid;
        return this;
    }
    public String getVpcid() {
        return this.vpcid;
    }

    public CreateClusterRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public CreateClusterRequest setWorkerAutoRenew(Boolean workerAutoRenew) {
        this.workerAutoRenew = workerAutoRenew;
        return this;
    }
    public Boolean getWorkerAutoRenew() {
        return this.workerAutoRenew;
    }

    public CreateClusterRequest setWorkerAutoRenewPeriod(Long workerAutoRenewPeriod) {
        this.workerAutoRenewPeriod = workerAutoRenewPeriod;
        return this;
    }
    public Long getWorkerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }

    public CreateClusterRequest setWorkerDataDisks(java.util.List<CreateClusterRequestWorkerDataDisks> workerDataDisks) {
        this.workerDataDisks = workerDataDisks;
        return this;
    }
    public java.util.List<CreateClusterRequestWorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    public CreateClusterRequest setWorkerInstanceChargeType(String workerInstanceChargeType) {
        this.workerInstanceChargeType = workerInstanceChargeType;
        return this;
    }
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    public CreateClusterRequest setWorkerInstanceTypes(java.util.List<String> workerInstanceTypes) {
        this.workerInstanceTypes = workerInstanceTypes;
        return this;
    }
    public java.util.List<String> getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    public CreateClusterRequest setWorkerPeriod(Long workerPeriod) {
        this.workerPeriod = workerPeriod;
        return this;
    }
    public Long getWorkerPeriod() {
        return this.workerPeriod;
    }

    public CreateClusterRequest setWorkerPeriodUnit(String workerPeriodUnit) {
        this.workerPeriodUnit = workerPeriodUnit;
        return this;
    }
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    public CreateClusterRequest setWorkerSystemDiskCategory(String workerSystemDiskCategory) {
        this.workerSystemDiskCategory = workerSystemDiskCategory;
        return this;
    }
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
    }

    public CreateClusterRequest setWorkerSystemDiskSize(Long workerSystemDiskSize) {
        this.workerSystemDiskSize = workerSystemDiskSize;
        return this;
    }
    public Long getWorkerSystemDiskSize() {
        return this.workerSystemDiskSize;
    }

    public CreateClusterRequest setWorkerVswitchIds(java.util.List<String> workerVswitchIds) {
        this.workerVswitchIds = workerVswitchIds;
        return this;
    }
    public java.util.List<String> getWorkerVswitchIds() {
        return this.workerVswitchIds;
    }

    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateClusterRequestAddons extends TeaModel {
        // 组件需要的配置。
        @NameInMap("config")
        public String config;

        // 组件名称。
        @NameInMap("name")
        public String name;

        public static CreateClusterRequestAddons build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestAddons self = new CreateClusterRequestAddons();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestAddons setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public CreateClusterRequestAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateClusterRequestRuntime extends TeaModel {
        // 容器运行时名称。
        @NameInMap("name")
        public String name;

        // 容器运行时版本。
        @NameInMap("version")
        public String version;

        public static CreateClusterRequestRuntime build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestRuntime self = new CreateClusterRequestRuntime();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestRuntime setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterRequestRuntime setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateClusterRequestTags extends TeaModel {
        // 标签key。
        @NameInMap("key")
        public String key;

        // 标签值。
        @NameInMap("value")
        public String value;

        public static CreateClusterRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestTags self = new CreateClusterRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateClusterRequestTaints extends TeaModel {
        // 调度策略。
        @NameInMap("effect")
        public String effect;

        // 污点key。
        @NameInMap("key")
        public String key;

        // 污点值。
        @NameInMap("value")
        public String value;

        public static CreateClusterRequestTaints build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestTaints self = new CreateClusterRequestTaints();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public CreateClusterRequestTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterRequestTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateClusterRequestWorkerDataDisks extends TeaModel {
        // 数据盘是否开启云盘备份。
        @NameInMap("auto_snapshot_policy_id")
        public String autoSnapshotPolicyId;

        // 数据盘类型。
        @NameInMap("category")
        public String category;

        // 数据盘是否加密。
        @NameInMap("encrypted")
        public String encrypted;

        // 数据盘大小。
        @NameInMap("size")
        public String size;

        public static CreateClusterRequestWorkerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestWorkerDataDisks self = new CreateClusterRequestWorkerDataDisks();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestWorkerDataDisks setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateClusterRequestWorkerDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateClusterRequestWorkerDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateClusterRequestWorkerDataDisks setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}

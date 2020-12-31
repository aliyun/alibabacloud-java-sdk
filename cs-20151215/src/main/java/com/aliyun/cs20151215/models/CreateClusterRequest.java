// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    // 集群名称。
    @NameInMap("name")
    public String name;

    // 地域ID
    @NameInMap("region_id")
    public String regionId;

    // 集群类型
    @NameInMap("cluster_type")
    public String clusterType;

    // 托管版集群类型
    @NameInMap("cluster_spec")
    public String clusterSpec;

    // 集群版本
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    @NameInMap("runtime")
    public Runtime runtime;

    // 集群专有网络ID。
    @NameInMap("vpcid")
    public String vpcid;

    // 创建Terway网络类型的集群时，需要为pod指定单独的虚拟交换机
    @NameInMap("pod_vswitch_ids")
    public java.util.List<String> podVswitchIds;

    // POD网络网段
    @NameInMap("container_cidr")
    public String containerCidr;

    // 服务网络网段
    @NameInMap("service_cidr")
    public String serviceCidr;

    // 安全组ID，和is_enterprise_security_group二选一
    @NameInMap("security_group_id")
    public String securityGroupId;

    // 自动创建企业安全组
    @NameInMap("is_enterprise_security_group")
    public Boolean isEnterpriseSecurityGroup;

    // 若您集群内的节点、应用等需要访问公网，勾选该项后我们将为您创建 NAT 网关并自动配置 SNAT 规则
    @NameInMap("snat_entry")
    public Boolean snatEntry;

    // 使用EIP暴露apiServer
    @NameInMap("endpoint_public_access")
    public Boolean endpointPublicAccess;

    // 允许公网ssh登录
    @NameInMap("ssh_flags")
    public Boolean sshFlags;

    // 时区
    @NameInMap("timezone")
    public String timezone;

    // 节点IP数量
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    // 自定义集群CA
    @NameInMap("user_ca")
    public String userCa;

    // 节点自定义数据
    @NameInMap("user_data")
    public String userData;

    // 集群本地域名
    @NameInMap("cluster_domain")
    public String clusterDomain;

    // 自定义节点名称
    @NameInMap("node_name_mode")
    public String nodeNameMode;

    // 自定义证书SAN
    @NameInMap("custom_san")
    public String customSan;

    // Secret落盘加密
    @NameInMap("encryption_provider_key")
    public String encryptionProviderKey;

    // serviceaccount token中的签发身份，即token payload中的iss字段。
    @NameInMap("service_account_issuer")
    public String serviceAccountIssuer;

    // 合法的请求token身份，用于apiserver服务端认证请求token是否合法。
    @NameInMap("api_audiences")
    public String apiAudiences;

    // 自定义镜像
    @NameInMap("image_id")
    public String imageId;

    // RDS白名单
    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    // 集群标签
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    // 集群组件配置
    @NameInMap("addons")
    public java.util.List<Addon> addons;

    // 节点污点信息
    @NameInMap("taints")
    public java.util.List<Taint> taints;

    // 为ECS安装云监控
    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    // 操作系统发行版
    @NameInMap("platform")
    public String platform;

    // 操作系统平台类型
    @NameInMap("os_type")
    public String osType;

    // CPU策略
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    // Proxy代理模式，ipvs|iptables
    @NameInMap("proxy_mode")
    public String proxyMode;

    // 节点服务端口范围
    @NameInMap("node_port_range")
    public String nodePortRange;

    // 密钥对名称，和login_password二选一。
    @NameInMap("key_pair")
    public String keyPair;

    // SSH登录密码。密码规则为8~30 个字符，且至少同时包含三项（大小写字母、数字和特殊符号），和key_pair二选一。
    @NameInMap("login_password")
    public String loginPassword;

    // 集群Master节点数量
    @NameInMap("master_count")
    public Long masterCount;

    // 集群Master节点使用的虚拟交换机
    @NameInMap("master_vswitch_ids")
    public java.util.List<String> masterVswitchIds;

    // 集群Master节点类型
    @NameInMap("master_instance_types")
    public java.util.List<String> masterInstanceTypes;

    // 集群Master节点系统盘类型
    @NameInMap("master_system_disk_category")
    public String masterSystemDiskCategory;

    // 集群Master节点系统盘大小，至少40
    @NameInMap("master_system_disk_size")
    public Long masterSystemDiskSize;

    // 集群Master节点自动快照备份策略
    @NameInMap("master_system_disk_snapshot_policy_id")
    public String masterSystemDiskSnapshotPolicyId;

    // 集群Master节点付费类型
    @NameInMap("master_instance_charge_type")
    public String masterInstanceChargeType;

    // 集群Master节点包年包月周期
    @NameInMap("master_period_unit")
    public String masterPeriodUnit;

    // 集群Master节点包年包月时长
    @NameInMap("master_period")
    public Long masterPeriod;

    // 集群Master节点是否自动续费
    @NameInMap("master_auto_renew")
    public Boolean masterAutoRenew;

    // 集群Master节点自动续费时长
    @NameInMap("master_auto_renew_period")
    public Long masterAutoRenewPeriod;

    // 集群Worker节点数量
    @NameInMap("num_of_nodes")
    public Long numOfNodes;

    // 集群节点所在虚拟交换机。
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    // 集群Worker节点所在虚拟交换机
    @NameInMap("worker_vswitch_ids")
    public java.util.List<String> workerVswitchIds;

    // 集群Worker节点类型
    @NameInMap("worker_instance_types")
    public java.util.List<String> workerInstanceTypes;

    // 集群Worker节点系统盘类型
    @NameInMap("worker_system_disk_category")
    public String workerSystemDiskCategory;

    // 集群Worker节点系统盘大小
    @NameInMap("worker_system_disk_size")
    public Long workerSystemDiskSize;

    // 集群Worker节点系统盘快照备份策略
    @NameInMap("worker_system_disk_snapshot_policy_id")
    public String workerSystemDiskSnapshotPolicyId;

    // 集群Worker节点数据盘配置
    @NameInMap("worker_data_disks")
    public java.util.List<DataDisk> workerDataDisks;

    // 集群Worker节点付费类型
    @NameInMap("worker_instance_charge_type")
    public String workerInstanceChargeType;

    // 集群Worker节点包年包月周期
    @NameInMap("worker_period_unit")
    public String workerPeriodUnit;

    // 集群Worker节点包年包月时长
    @NameInMap("worker_period")
    public Long workerPeriod;

    // 集群Worker节点到期是否自动续费
    @NameInMap("worker_auto_renew")
    public Boolean workerAutoRenew;

    // 集群Worker节点自动续费时长
    @NameInMap("worker_auto_renew_period")
    public Long workerAutoRenewPeriod;

    // 使用已有节点创建集群时，已有实例列表
    @NameInMap("instances")
    public java.util.List<String> instances;

    // 使用已有节点创建集群时，是否格式化已有实例的磁盘
    @NameInMap("format_disk")
    public Boolean formatDisk;

    // 使用已有节点创建集群时，是否保留实例名称。
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    // 创建ASK集群时，服务发现类型
    @NameInMap("service_discovery_types")
    public java.util.List<String> serviceDiscoveryTypes;

    // 使用自动创建专有网络创建ASK集群时，是否在vpc中创建Nat网关并配置SNAT规则。
    @NameInMap("nat_gateway")
    public Boolean natGateway;

    // 使用自动创建专有网络创建ASK集群时，需要指定专有网络的可用区
    @NameInMap("zone_id")
    public String zoneId;

    // 面向场景时的集群类型。  Default：非边缘场景集群。 Edge：边缘场景集群。
    @NameInMap("profile")
    public String profile;

    // 集群删除保护
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    // 失败回滚
    @NameInMap("disable_rollback")
    public Boolean disableRollback;

    // 集群创建超时时间
    @NameInMap("timeout_mins")
    public Long timeoutMins;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public CreateClusterRequest setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public CreateClusterRequest setRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }
    public Runtime getRuntime() {
        return this.runtime;
    }

    public CreateClusterRequest setVpcid(String vpcid) {
        this.vpcid = vpcid;
        return this;
    }
    public String getVpcid() {
        return this.vpcid;
    }

    public CreateClusterRequest setPodVswitchIds(java.util.List<String> podVswitchIds) {
        this.podVswitchIds = podVswitchIds;
        return this;
    }
    public java.util.List<String> getPodVswitchIds() {
        return this.podVswitchIds;
    }

    public CreateClusterRequest setContainerCidr(String containerCidr) {
        this.containerCidr = containerCidr;
        return this;
    }
    public String getContainerCidr() {
        return this.containerCidr;
    }

    public CreateClusterRequest setServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    public CreateClusterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateClusterRequest setIsEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
        this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
        return this;
    }
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    public CreateClusterRequest setSnatEntry(Boolean snatEntry) {
        this.snatEntry = snatEntry;
        return this;
    }
    public Boolean getSnatEntry() {
        return this.snatEntry;
    }

    public CreateClusterRequest setEndpointPublicAccess(Boolean endpointPublicAccess) {
        this.endpointPublicAccess = endpointPublicAccess;
        return this;
    }
    public Boolean getEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    public CreateClusterRequest setSshFlags(Boolean sshFlags) {
        this.sshFlags = sshFlags;
        return this;
    }
    public Boolean getSshFlags() {
        return this.sshFlags;
    }

    public CreateClusterRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public CreateClusterRequest setNodeCidrMask(String nodeCidrMask) {
        this.nodeCidrMask = nodeCidrMask;
        return this;
    }
    public String getNodeCidrMask() {
        return this.nodeCidrMask;
    }

    public CreateClusterRequest setUserCa(String userCa) {
        this.userCa = userCa;
        return this;
    }
    public String getUserCa() {
        return this.userCa;
    }

    public CreateClusterRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateClusterRequest setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
        return this;
    }
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    public CreateClusterRequest setNodeNameMode(String nodeNameMode) {
        this.nodeNameMode = nodeNameMode;
        return this;
    }
    public String getNodeNameMode() {
        return this.nodeNameMode;
    }

    public CreateClusterRequest setCustomSan(String customSan) {
        this.customSan = customSan;
        return this;
    }
    public String getCustomSan() {
        return this.customSan;
    }

    public CreateClusterRequest setEncryptionProviderKey(String encryptionProviderKey) {
        this.encryptionProviderKey = encryptionProviderKey;
        return this;
    }
    public String getEncryptionProviderKey() {
        return this.encryptionProviderKey;
    }

    public CreateClusterRequest setServiceAccountIssuer(String serviceAccountIssuer) {
        this.serviceAccountIssuer = serviceAccountIssuer;
        return this;
    }
    public String getServiceAccountIssuer() {
        return this.serviceAccountIssuer;
    }

    public CreateClusterRequest setApiAudiences(String apiAudiences) {
        this.apiAudiences = apiAudiences;
        return this;
    }
    public String getApiAudiences() {
        return this.apiAudiences;
    }

    public CreateClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateClusterRequest setRdsInstances(java.util.List<String> rdsInstances) {
        this.rdsInstances = rdsInstances;
        return this;
    }
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
    }

    public CreateClusterRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public CreateClusterRequest setAddons(java.util.List<Addon> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<Addon> getAddons() {
        return this.addons;
    }

    public CreateClusterRequest setTaints(java.util.List<Taint> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<Taint> getTaints() {
        return this.taints;
    }

    public CreateClusterRequest setCloudMonitorFlags(Boolean cloudMonitorFlags) {
        this.cloudMonitorFlags = cloudMonitorFlags;
        return this;
    }
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    public CreateClusterRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateClusterRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateClusterRequest setCpuPolicy(String cpuPolicy) {
        this.cpuPolicy = cpuPolicy;
        return this;
    }
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    public CreateClusterRequest setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }
    public String getProxyMode() {
        return this.proxyMode;
    }

    public CreateClusterRequest setNodePortRange(String nodePortRange) {
        this.nodePortRange = nodePortRange;
        return this;
    }
    public String getNodePortRange() {
        return this.nodePortRange;
    }

    public CreateClusterRequest setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public CreateClusterRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public CreateClusterRequest setMasterCount(Long masterCount) {
        this.masterCount = masterCount;
        return this;
    }
    public Long getMasterCount() {
        return this.masterCount;
    }

    public CreateClusterRequest setMasterVswitchIds(java.util.List<String> masterVswitchIds) {
        this.masterVswitchIds = masterVswitchIds;
        return this;
    }
    public java.util.List<String> getMasterVswitchIds() {
        return this.masterVswitchIds;
    }

    public CreateClusterRequest setMasterInstanceTypes(java.util.List<String> masterInstanceTypes) {
        this.masterInstanceTypes = masterInstanceTypes;
        return this;
    }
    public java.util.List<String> getMasterInstanceTypes() {
        return this.masterInstanceTypes;
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

    public CreateClusterRequest setMasterSystemDiskSnapshotPolicyId(String masterSystemDiskSnapshotPolicyId) {
        this.masterSystemDiskSnapshotPolicyId = masterSystemDiskSnapshotPolicyId;
        return this;
    }
    public String getMasterSystemDiskSnapshotPolicyId() {
        return this.masterSystemDiskSnapshotPolicyId;
    }

    public CreateClusterRequest setMasterInstanceChargeType(String masterInstanceChargeType) {
        this.masterInstanceChargeType = masterInstanceChargeType;
        return this;
    }
    public String getMasterInstanceChargeType() {
        return this.masterInstanceChargeType;
    }

    public CreateClusterRequest setMasterPeriodUnit(String masterPeriodUnit) {
        this.masterPeriodUnit = masterPeriodUnit;
        return this;
    }
    public String getMasterPeriodUnit() {
        return this.masterPeriodUnit;
    }

    public CreateClusterRequest setMasterPeriod(Long masterPeriod) {
        this.masterPeriod = masterPeriod;
        return this;
    }
    public Long getMasterPeriod() {
        return this.masterPeriod;
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

    public CreateClusterRequest setNumOfNodes(Long numOfNodes) {
        this.numOfNodes = numOfNodes;
        return this;
    }
    public Long getNumOfNodes() {
        return this.numOfNodes;
    }

    public CreateClusterRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public CreateClusterRequest setWorkerVswitchIds(java.util.List<String> workerVswitchIds) {
        this.workerVswitchIds = workerVswitchIds;
        return this;
    }
    public java.util.List<String> getWorkerVswitchIds() {
        return this.workerVswitchIds;
    }

    public CreateClusterRequest setWorkerInstanceTypes(java.util.List<String> workerInstanceTypes) {
        this.workerInstanceTypes = workerInstanceTypes;
        return this;
    }
    public java.util.List<String> getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
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

    public CreateClusterRequest setWorkerSystemDiskSnapshotPolicyId(String workerSystemDiskSnapshotPolicyId) {
        this.workerSystemDiskSnapshotPolicyId = workerSystemDiskSnapshotPolicyId;
        return this;
    }
    public String getWorkerSystemDiskSnapshotPolicyId() {
        return this.workerSystemDiskSnapshotPolicyId;
    }

    public CreateClusterRequest setWorkerDataDisks(java.util.List<DataDisk> workerDataDisks) {
        this.workerDataDisks = workerDataDisks;
        return this;
    }
    public java.util.List<DataDisk> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    public CreateClusterRequest setWorkerInstanceChargeType(String workerInstanceChargeType) {
        this.workerInstanceChargeType = workerInstanceChargeType;
        return this;
    }
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    public CreateClusterRequest setWorkerPeriodUnit(String workerPeriodUnit) {
        this.workerPeriodUnit = workerPeriodUnit;
        return this;
    }
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    public CreateClusterRequest setWorkerPeriod(Long workerPeriod) {
        this.workerPeriod = workerPeriod;
        return this;
    }
    public Long getWorkerPeriod() {
        return this.workerPeriod;
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

    public CreateClusterRequest setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public CreateClusterRequest setFormatDisk(Boolean formatDisk) {
        this.formatDisk = formatDisk;
        return this;
    }
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    public CreateClusterRequest setKeepInstanceName(Boolean keepInstanceName) {
        this.keepInstanceName = keepInstanceName;
        return this;
    }
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    public CreateClusterRequest setServiceDiscoveryTypes(java.util.List<String> serviceDiscoveryTypes) {
        this.serviceDiscoveryTypes = serviceDiscoveryTypes;
        return this;
    }
    public java.util.List<String> getServiceDiscoveryTypes() {
        return this.serviceDiscoveryTypes;
    }

    public CreateClusterRequest setNatGateway(Boolean natGateway) {
        this.natGateway = natGateway;
        return this;
    }
    public Boolean getNatGateway() {
        return this.natGateway;
    }

    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateClusterRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
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

    public CreateClusterRequest setTimeoutMins(Long timeoutMins) {
        this.timeoutMins = timeoutMins;
        return this;
    }
    public Long getTimeoutMins() {
        return this.timeoutMins;
    }

}

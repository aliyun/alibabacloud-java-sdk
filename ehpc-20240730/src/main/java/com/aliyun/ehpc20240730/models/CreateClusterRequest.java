// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("AdditionalPackages")
    public java.util.List<CreateClusterRequestAdditionalPackages> additionalPackages;

    @NameInMap("Addons")
    public java.util.List<CreateClusterRequestAddons> addons;

    /**
     * <strong>example:</strong>
     * <p>2.1.0</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ClusterCategory")
    public String clusterCategory;

    @NameInMap("ClusterCredentials")
    public CreateClusterRequestClusterCredentials clusterCredentials;

    @NameInMap("ClusterCustomConfiguration")
    public CreateClusterRequestClusterCustomConfiguration clusterCustomConfiguration;

    /**
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <strong>example:</strong>
     * <p>Integrated</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <strong>example:</strong>
     * <p>vsw-f8za5p0mwzgdu3wgx****</p>
     */
    @NameInMap("ClusterVSwitchId")
    public String clusterVSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-m5efjevmclc0xdmys****</p>
     */
    @NameInMap("ClusterVpcId")
    public String clusterVpcId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    @NameInMap("Manager")
    public CreateClusterRequestManager manager;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxCoreCount")
    public Integer maxCoreCount;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxCount")
    public Integer maxCount;

    @NameInMap("Queues")
    public java.util.List<QueueTemplate> queues;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxazb4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>sg-bp13n61xsydodfyg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SharedStorages")
    public java.util.List<SharedStorageTemplate> sharedStorages;

    @NameInMap("Tags")
    public java.util.List<CreateClusterRequestTags> tags;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setAdditionalPackages(java.util.List<CreateClusterRequestAdditionalPackages> additionalPackages) {
        this.additionalPackages = additionalPackages;
        return this;
    }
    public java.util.List<CreateClusterRequestAdditionalPackages> getAdditionalPackages() {
        return this.additionalPackages;
    }

    public CreateClusterRequest setAddons(java.util.List<CreateClusterRequestAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<CreateClusterRequestAddons> getAddons() {
        return this.addons;
    }

    public CreateClusterRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public CreateClusterRequest setClusterCategory(String clusterCategory) {
        this.clusterCategory = clusterCategory;
        return this;
    }
    public String getClusterCategory() {
        return this.clusterCategory;
    }

    public CreateClusterRequest setClusterCredentials(CreateClusterRequestClusterCredentials clusterCredentials) {
        this.clusterCredentials = clusterCredentials;
        return this;
    }
    public CreateClusterRequestClusterCredentials getClusterCredentials() {
        return this.clusterCredentials;
    }

    public CreateClusterRequest setClusterCustomConfiguration(CreateClusterRequestClusterCustomConfiguration clusterCustomConfiguration) {
        this.clusterCustomConfiguration = clusterCustomConfiguration;
        return this;
    }
    public CreateClusterRequestClusterCustomConfiguration getClusterCustomConfiguration() {
        return this.clusterCustomConfiguration;
    }

    public CreateClusterRequest setClusterDescription(String clusterDescription) {
        this.clusterDescription = clusterDescription;
        return this;
    }
    public String getClusterDescription() {
        return this.clusterDescription;
    }

    public CreateClusterRequest setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public CreateClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterRequest setClusterVSwitchId(String clusterVSwitchId) {
        this.clusterVSwitchId = clusterVSwitchId;
        return this;
    }
    public String getClusterVSwitchId() {
        return this.clusterVSwitchId;
    }

    public CreateClusterRequest setClusterVpcId(String clusterVpcId) {
        this.clusterVpcId = clusterVpcId;
        return this;
    }
    public String getClusterVpcId() {
        return this.clusterVpcId;
    }

    public CreateClusterRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateClusterRequest setIsEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
        this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
        return this;
    }
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    public CreateClusterRequest setManager(CreateClusterRequestManager manager) {
        this.manager = manager;
        return this;
    }
    public CreateClusterRequestManager getManager() {
        return this.manager;
    }

    public CreateClusterRequest setMaxCoreCount(Integer maxCoreCount) {
        this.maxCoreCount = maxCoreCount;
        return this;
    }
    public Integer getMaxCoreCount() {
        return this.maxCoreCount;
    }

    public CreateClusterRequest setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }
    public Integer getMaxCount() {
        return this.maxCount;
    }

    public CreateClusterRequest setQueues(java.util.List<QueueTemplate> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<QueueTemplate> getQueues() {
        return this.queues;
    }

    public CreateClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateClusterRequest setSharedStorages(java.util.List<SharedStorageTemplate> sharedStorages) {
        this.sharedStorages = sharedStorages;
        return this;
    }
    public java.util.List<SharedStorageTemplate> getSharedStorages() {
        return this.sharedStorages;
    }

    public CreateClusterRequest setTags(java.util.List<CreateClusterRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateClusterRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateClusterRequestAdditionalPackages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mpich</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>4.0.3</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateClusterRequestAdditionalPackages build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestAdditionalPackages self = new CreateClusterRequestAdditionalPackages();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestAdditionalPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterRequestAdditionalPackages setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateClusterRequestAddons extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Login</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>&quot;{\\&quot;EipResource\\&quot;: {\\&quot;AutoCreate\\&quot;: true}, \\&quot;EcsResources\\&quot;: [{\\&quot;InstanceType\\&quot;: \\&quot;ecs.c7.xlarge\\&quot;, \\&quot;ImageId\\&quot;: \\&quot;centos_7_6_x64_20G_alibase_20211130.vhd\\&quot;, \\&quot;SystemDisk\\&quot;: {\\&quot;Category\\&quot;: \\&quot;cloud_essd\\&quot;, \\&quot;Size\\&quot;: 40, \\&quot;Level\\&quot;: \\&quot;PL0\\&quot;}, \\&quot;EnableHT\\&quot;: true, \\&quot;InstanceChargeType\\&quot;: \\&quot;PostPaid\\&quot;, \\&quot;SpotStrategy\\&quot;: \\&quot;NoSpot\\&quot;}]}&quot;</p>
         */
        @NameInMap("ResourcesSpec")
        public String resourcesSpec;

        /**
         * <strong>example:</strong>
         * <p>&quot;[{\\&quot;ServiceName\\&quot;: \\&quot;SSH\\&quot;, \\&quot;ServiceAccessType\\&quot;: null, \\&quot;ServiceAccessUrl\\&quot;: null, \\&quot;NetworkACL\\&quot;: [{\\&quot;IpProtocol\\&quot;: \\&quot;TCP\\&quot;, \\&quot;Port\\&quot;: 22, \\&quot;SourceCidrIp\\&quot;: \\&quot;0.0.0.0/0\\&quot;}]}, {\\&quot;ServiceName\\&quot;: \\&quot;VNC\\&quot;, \\&quot;ServiceAccessType\\&quot;: null, \\&quot;ServiceAccessUrl\\&quot;: null, \\&quot;NetworkACL\\&quot;: [{\\&quot;IpProtocol\\&quot;: \\&quot;TCP\\&quot;, \\&quot;Port\\&quot;: 12016, \\&quot;SourceCidrIp\\&quot;: \\&quot;0.0.0.0/0\\&quot;}]}, {\\&quot;ServiceName\\&quot;: \\&quot;CLIENT\\&quot;, \\&quot;ServiceAccessType\\&quot;: \\&quot;URL\\&quot;, \\&quot;ServiceAccessUrl\\&quot;: \\&quot;\\&quot;, \\&quot;NetworkACL\\&quot;: [{\\&quot;IpProtocol\\&quot;: \\&quot;TCP\\&quot;, \\&quot;Port\\&quot;: 12011, \\&quot;SourceCidrIp\\&quot;: \\&quot;0.0.0.0/0\\&quot;}]}]&quot;</p>
         */
        @NameInMap("ServicesSpec")
        public String servicesSpec;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateClusterRequestAddons build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestAddons self = new CreateClusterRequestAddons();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterRequestAddons setResourcesSpec(String resourcesSpec) {
            this.resourcesSpec = resourcesSpec;
            return this;
        }
        public String getResourcesSpec() {
            return this.resourcesSpec;
        }

        public CreateClusterRequestAddons setServicesSpec(String servicesSpec) {
            this.servicesSpec = servicesSpec;
            return this;
        }
        public String getServicesSpec() {
            return this.servicesSpec;
        }

        public CreateClusterRequestAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateClusterRequestClusterCredentials extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ali0824</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        public static CreateClusterRequestClusterCredentials build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestClusterCredentials self = new CreateClusterRequestClusterCredentials();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestClusterCredentials setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public CreateClusterRequestClusterCredentials setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

    public static class CreateClusterRequestClusterCustomConfiguration extends TeaModel {
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

        public static CreateClusterRequestClusterCustomConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestClusterCustomConfiguration self = new CreateClusterRequestClusterCustomConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestClusterCustomConfiguration setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public CreateClusterRequestClusterCustomConfiguration setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class CreateClusterRequestManagerDNS extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NIS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2.31</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateClusterRequestManagerDNS build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestManagerDNS self = new CreateClusterRequestManagerDNS();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestManagerDNS setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateClusterRequestManagerDNS setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateClusterRequestManagerDirectoryService extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NIS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2.31</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateClusterRequestManagerDirectoryService build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestManagerDirectoryService self = new CreateClusterRequestManagerDirectoryService();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestManagerDirectoryService setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateClusterRequestManagerDirectoryService setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateClusterRequestManagerScheduler extends TeaModel {
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

        public static CreateClusterRequestManagerScheduler build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestManagerScheduler self = new CreateClusterRequestManagerScheduler();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestManagerScheduler setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateClusterRequestManagerScheduler setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateClusterRequestManager extends TeaModel {
        @NameInMap("DNS")
        public CreateClusterRequestManagerDNS DNS;

        @NameInMap("DirectoryService")
        public CreateClusterRequestManagerDirectoryService directoryService;

        @NameInMap("ManagerNode")
        public NodeTemplate managerNode;

        @NameInMap("Scheduler")
        public CreateClusterRequestManagerScheduler scheduler;

        public static CreateClusterRequestManager build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestManager self = new CreateClusterRequestManager();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestManager setDNS(CreateClusterRequestManagerDNS DNS) {
            this.DNS = DNS;
            return this;
        }
        public CreateClusterRequestManagerDNS getDNS() {
            return this.DNS;
        }

        public CreateClusterRequestManager setDirectoryService(CreateClusterRequestManagerDirectoryService directoryService) {
            this.directoryService = directoryService;
            return this;
        }
        public CreateClusterRequestManagerDirectoryService getDirectoryService() {
            return this.directoryService;
        }

        public CreateClusterRequestManager setManagerNode(NodeTemplate managerNode) {
            this.managerNode = managerNode;
            return this;
        }
        public NodeTemplate getManagerNode() {
            return this.managerNode;
        }

        public CreateClusterRequestManager setScheduler(CreateClusterRequestManagerScheduler scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public CreateClusterRequestManagerScheduler getScheduler() {
            return this.scheduler;
        }

    }

    public static class CreateClusterRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ClusterId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>ehpc-hz-******</p>
         */
        @NameInMap("Value")
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

}

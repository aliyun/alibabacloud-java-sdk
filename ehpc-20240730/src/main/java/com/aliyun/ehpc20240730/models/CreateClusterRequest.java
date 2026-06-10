// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>A list of software to install in the cluster. You can specify up to 10 packages.</p>
     */
    @NameInMap("AdditionalPackages")
    public java.util.List<CreateClusterRequestAdditionalPackages> additionalPackages;

    /**
     * <p>The configuration of the custom service component for the cluster. Only one component is supported.</p>
     */
    @NameInMap("Addons")
    public java.util.List<CreateClusterRequestAddons> addons;

    /**
     * <p>The version of the E-HPC client. By default, the latest version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2.1.0</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The edition of the cluster. Valid values:</p>
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
     * <p>The security credentials for the cluster.</p>
     */
    @NameInMap("ClusterCredentials")
    public CreateClusterRequestClusterCredentials clusterCredentials;

    /**
     * <p>The post-processing script for the cluster.</p>
     */
    @NameInMap("ClusterCustomConfiguration")
    public CreateClusterRequestClusterCustomConfiguration clusterCustomConfiguration;

    /**
     * <p>The description of the cluster. The description must be 2 to 128 characters long and can contain letters, Chinese characters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <p>The cluster\&quot;s deployment type. Valid values:</p>
     * <ul>
     * <li><p>Integrated: An integrated cluster.</p>
     * </li>
     * <li><p>Hybrid: A hybrid cloud cluster.</p>
     * </li>
     * <li><p>Custom: A custom cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Integrated</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>The name of the cluster. The name must be 2 to 128 characters long and can contain letters, Chinese characters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The ID of the VSwitch for the cluster. The VSwitch must be in the VPC specified by <code>ClusterVpcId</code>.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/448581.html">DescribeVpcs</a> operation to find available VPCs and VSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-f8za5p0mwzgdu3wgx****</p>
     */
    @NameInMap("ClusterVSwitchId")
    public String clusterVSwitchId;

    /**
     * <p>The ID of the VPC for the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5efjevmclc0xdmys****</p>
     */
    @NameInMap("ClusterVpcId")
    public String clusterVpcId;

    /**
     * <p>Specifies whether to enable deletion protection for the cluster. This feature prevents the cluster from being deleted via the console or the <a href="https://help.aliyun.com/document_detail/424406.html">DeleteCluster</a> operation.</p>
     * <ul>
     * <li><p>true: Enables deletion protection.</p>
     * </li>
     * <li><p>false: Disables deletion protection.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("GrowInterval")
    public Integer growInterval;

    @NameInMap("IdleInterval")
    public Integer idleInterval;

    /**
     * <p>Specifies whether to use an enterprise security group. Valid values:</p>
     * <ul>
     * <li><p>true: The system automatically creates and uses an enterprise security group.</p>
     * </li>
     * <li><p>false: The system automatically creates and uses a security group.</p>
     * </li>
     * </ul>
     * <p>For more information about how to select a security group type, see <a href="https://help.aliyun.com/document_detail/605897.html">Security groups and enterprise security groups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p>Configuration for the cluster manager node.</p>
     */
    @NameInMap("Manager")
    public CreateClusterRequestManager manager;

    /**
     * <p>The maximum number of CPU cores that the cluster can manage across all compute nodes. Valid values: 0 to 100,000.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxCoreCount")
    public Integer maxCoreCount;

    /**
     * <p>The maximum number of compute nodes that the cluster can manage. Valid values: 0 to 5,000.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxCount")
    public Integer maxCount;

    /**
     * <p>Configuration for the cluster queues. You can specify up to 8 queues.</p>
     */
    @NameInMap("Queues")
    public java.util.List<QueueTemplate> queues;

    /**
     * <p>The ID of the resource group.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to find resource group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group for the cluster.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/25556.html">DescribeSecurityGroups</a> operation to find available security groups in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp13n61xsydodfyg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Configuration for the cluster\&quot;s shared storage.</p>
     */
    @NameInMap("SharedStorages")
    public java.util.List<SharedStorageTemplate> sharedStorages;

    /**
     * <p>The list of tags to add to the cluster. You can add up to 20 tags.</p>
     */
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

    public CreateClusterRequest setGrowInterval(Integer growInterval) {
        this.growInterval = growInterval;
        return this;
    }
    public Integer getGrowInterval() {
        return this.growInterval;
    }

    public CreateClusterRequest setIdleInterval(Integer idleInterval) {
        this.idleInterval = idleInterval;
        return this;
    }
    public Integer getIdleInterval() {
        return this.idleInterval;
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
         * <p>The name of the software.</p>
         * 
         * <strong>example:</strong>
         * <p>mpich</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version of the software.</p>
         * 
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
         * <p>The name of the custom service component.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Login</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The resource configuration of the custom service component.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\\&quot;EipResource\\&quot;: {\\&quot;AutoCreate\\&quot;: true}, \\&quot;EcsResources\\&quot;: [{\\&quot;InstanceType\\&quot;: \\&quot;ecs.c7.xlarge\\&quot;, \\&quot;ImageId\\&quot;: \\&quot;centos_7_6_x64_20G_alibase_20211130.vhd\\&quot;, \\&quot;SystemDisk\\&quot;: {\\&quot;Category\\&quot;: \\&quot;cloud_essd\\&quot;, \\&quot;Size\\&quot;: 40, \\&quot;Level\\&quot;: \\&quot;PL0\\&quot;}, \\&quot;EnableHT\\&quot;: true, \\&quot;InstanceChargeType\\&quot;: \\&quot;PostPaid\\&quot;, \\&quot;SpotStrategy\\&quot;: \\&quot;NoSpot\\&quot;}]}&quot;</p>
         */
        @NameInMap("ResourcesSpec")
        public String resourcesSpec;

        /**
         * <p>The service configuration of the custom service component.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[{\\&quot;ServiceName\\&quot;: \\&quot;SSH\\&quot;, \\&quot;ServiceAccessType\\&quot;: null, \\&quot;ServiceAccessUrl\\&quot;: null, \\&quot;NetworkACL\\&quot;: [{\\&quot;IpProtocol\\&quot;: \\&quot;TCP\\&quot;, \\&quot;Port\\&quot;: 22, \\&quot;SourceCidrIp\\&quot;: \\&quot;0.0.0.0/0\\&quot;}]}, {\\&quot;ServiceName\\&quot;: \\&quot;VNC\\&quot;, \\&quot;ServiceAccessType\\&quot;: null, \\&quot;ServiceAccessUrl\\&quot;: null, \\&quot;NetworkACL\\&quot;: [{\\&quot;IpProtocol\\&quot;: \\&quot;TCP\\&quot;, \\&quot;Port\\&quot;: 12016, \\&quot;SourceCidrIp\\&quot;: \\&quot;0.0.0.0/0\\&quot;}]}, {\\&quot;ServiceName\\&quot;: \\&quot;CLIENT\\&quot;, \\&quot;ServiceAccessType\\&quot;: \\&quot;URL\\&quot;, \\&quot;ServiceAccessUrl\\&quot;: \\&quot;\\&quot;, \\&quot;NetworkACL\\&quot;: [{\\&quot;IpProtocol\\&quot;: \\&quot;TCP\\&quot;, \\&quot;Port\\&quot;: 12011, \\&quot;SourceCidrIp\\&quot;: \\&quot;0.0.0.0/0\\&quot;}]}]&quot;</p>
         */
        @NameInMap("ServicesSpec")
        public String servicesSpec;

        /**
         * <p>The version of the custom service component.</p>
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
         * <p>The key pair name. The name must be 2 to 128 characters long, start with a letter or a Chinese character, and not start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * <blockquote>
         * <p>To use an ECS key pair, see <a href="https://help.aliyun.com/document_detail/51793.html">Create a key pair</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ali0824</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The root password of the login node. The password must be 8 to 20 characters long and include characters from at least three of the following categories: uppercase letters, lowercase letters, digits, and special characters. The supported special characters are: <code>() ~ ! @ # $ % ^ &amp; * - = + { } [ ] : ; ‘ &lt; &gt; , . ? /</code></p>
         * <blockquote>
         * <p>Use HTTPS when calling the API to prevent password exposure.</p>
         * </blockquote>
         * 
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
         * <p>The execution parameters for the post-processing script.</p>
         * 
         * <strong>example:</strong>
         * <p>E-HPC cn-hangzhou</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The download URL for the post-processing script.</p>
         * 
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
         * <p>The DNS service type.</p>
         * 
         * <strong>example:</strong>
         * <p>NIS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The DNS service version.</p>
         * 
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
         * <p>The directory service type.</p>
         * 
         * <strong>example:</strong>
         * <p>NIS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The directory service version.</p>
         * 
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
        /**
         * <p>Configuration for the DNS service.</p>
         */
        @NameInMap("DNS")
        public CreateClusterRequestManagerDNS DNS;

        /**
         * <p>Configuration for the directory service.</p>
         */
        @NameInMap("DirectoryService")
        public CreateClusterRequestManagerDirectoryService directoryService;

        /**
         * <p>Hardware configuration for the manager node.</p>
         */
        @NameInMap("ManagerNode")
        public NodeTemplate managerNode;

        /**
         * <p>Configuration for the scheduler.</p>
         */
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
         * <p>The tag key. The key cannot be an empty string. The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be an empty string. The value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
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

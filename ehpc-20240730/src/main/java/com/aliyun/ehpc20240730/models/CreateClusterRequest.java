// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The list of software that you want to install in the cluster. Valid values of N: 0 to 10.</p>
     */
    @NameInMap("AdditionalPackages")
    public java.util.List<CreateClusterRequestAdditionalPackages> additionalPackages;

    /**
     * <p>The configurations of the custom addons in the cluster. Only one addon is supported.</p>
     */
    @NameInMap("Addons")
    public java.util.List<CreateClusterRequestAddons> addons;

    /**
     * <p>The client version. By default, the latest version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2.1.0</p>
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
     * <p>The access credentials of the cluster.</p>
     */
    @NameInMap("ClusterCredentials")
    public CreateClusterRequestClusterCredentials clusterCredentials;

    /**
     * <p>The post-processing script of the cluster.</p>
     */
    @NameInMap("ClusterCustomConfiguration")
    public CreateClusterRequestClusterCustomConfiguration clusterCustomConfiguration;

    /**
     * <p>The cluster description. The description must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <p>The deployment mode of the cluster. Valid values:</p>
     * <ul>
     * <li>Integrated</li>
     * <li>Hybrid</li>
     * <li>Custom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Integrated</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>The cluster name. The name must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-cluster-20240718</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The ID of the vSwitch that you want the cluster to use. The vSwitch must reside in the VPC that is specified by the <code>ClusterVpcId</code> parameter.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/448581.html">DescribeVpcs</a> operation to query information about the created VPCs and vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-f8za5p0mwzgdu3wgx****</p>
     */
    @NameInMap("ClusterVSwitchId")
    public String clusterVSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5efjevmclc0xdmys****</p>
     */
    @NameInMap("ClusterVpcId")
    public String clusterVpcId;

    /**
     * <p>Specifies whether to enable deletion protection for the cluster. Deletion protection decides whether the cluster can be deleted in the console or by calling the <a href="https://help.aliyun.com/document_detail/424406.html">DeleteCluster</a> operation. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to use an advanced security group. Valid values:</p>
     * <ul>
     * <li>true: automatically creates and uses an advanced security group.</li>
     * <li>false: automatically creates and uses a basic security group.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/605897.html">Basic security groups and advanced security groups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsEnterpriseSecurityGroup")
    public Boolean isEnterpriseSecurityGroup;

    /**
     * <p>The configurations of the cluster management node.</p>
     */
    @NameInMap("Manager")
    public CreateClusterRequestManager manager;

    /**
     * <p>The maximum number of vCPUs that can be used by compute nodes in the cluster. Valid values: 0 to 100,000.</p>
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
     * <p>The queues in the cluster. The number of queues can be 0 to 8.</p>
     */
    @NameInMap("Queues")
    public java.util.List<QueueTemplate> queues;

    /**
     * <p>The ID of the resource group to which the cluster belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to obtain the IDs of the resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group to which the cluster belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/25556.html">DescribeSecurityGroups</a> operation to query available security groups in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp13n61xsydodfyg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The shared storage resources of the cluster.</p>
     */
    @NameInMap("SharedStorages")
    public java.util.List<SharedStorageTemplate> sharedStorages;

    /**
     * <p>The tags of the cluster.</p>
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
         * <p>The name of the software that you want to install in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>mpich</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version of the software that you want to install in the cluster.</p>
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
         * <p>The addon name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Login</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The resource configurations of the addon.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\\&quot;EipResource\\&quot;: {\\&quot;AutoCreate\\&quot;: true}, \\&quot;EcsResources\\&quot;: [{\\&quot;InstanceType\\&quot;: \\&quot;ecs.c7.xlarge\\&quot;, \\&quot;ImageId\\&quot;: \\&quot;centos_7_6_x64_20G_alibase_20211130.vhd\\&quot;, \\&quot;SystemDisk\\&quot;: {\\&quot;Category\\&quot;: \\&quot;cloud_essd\\&quot;, \\&quot;Size\\&quot;: 40, \\&quot;Level\\&quot;: \\&quot;PL0\\&quot;}, \\&quot;EnableHT\\&quot;: true, \\&quot;InstanceChargeType\\&quot;: \\&quot;PostPaid\\&quot;, \\&quot;SpotStrategy\\&quot;: \\&quot;NoSpot\\&quot;}]}&quot;</p>
         */
        @NameInMap("ResourcesSpec")
        public String resourcesSpec;

        /**
         * <p>The service configurations of the addon.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[{\\&quot;ServiceName\\&quot;: \\&quot;SSH\\&quot;, \\&quot;ServiceAccessType\\&quot;: null, \\&quot;ServiceAccessUrl\\&quot;: null, \\&quot;NetworkACL\\&quot;: [{\\&quot;IpProtocol\\&quot;: \\&quot;TCP\\&quot;, \\&quot;Port\\&quot;: 22, \\&quot;SourceCidrIp\\&quot;: \\&quot;0.0.0.0/0\\&quot;}]}, {\\&quot;ServiceName\\&quot;: \\&quot;VNC\\&quot;, \\&quot;ServiceAccessType\\&quot;: null, \\&quot;ServiceAccessUrl\\&quot;: null, \\&quot;NetworkACL\\&quot;: [{\\&quot;IpProtocol\\&quot;: \\&quot;TCP\\&quot;, \\&quot;Port\\&quot;: 12016, \\&quot;SourceCidrIp\\&quot;: \\&quot;0.0.0.0/0\\&quot;}]}, {\\&quot;ServiceName\\&quot;: \\&quot;CLIENT\\&quot;, \\&quot;ServiceAccessType\\&quot;: \\&quot;URL\\&quot;, \\&quot;ServiceAccessUrl\\&quot;: \\&quot;\\&quot;, \\&quot;NetworkACL\\&quot;: [{\\&quot;IpProtocol\\&quot;: \\&quot;TCP\\&quot;, \\&quot;Port\\&quot;: 12011, \\&quot;SourceCidrIp\\&quot;: \\&quot;0.0.0.0/0\\&quot;}]}]&quot;</p>
         */
        @NameInMap("ServicesSpec")
        public String servicesSpec;

        /**
         * <p>The addon version.</p>
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
         * <p>The name of the key pair. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, letters, colons (:), underscores (_), and hyphens (-).</p>
         * <blockquote>
         * <p> For more information, see <a href="https://help.aliyun.com/document_detail/51793.html">Create a key pair</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ali0824</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The password for the root user to log on to the node. The password must be 8 to 20 characters in length, and must contain at least 3 of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: <code>() ~ ! @ # $ % ^ &amp; * - = + { } [ ] : ; \\&quot; &lt; &gt; , . ? /</code></p>
         * <blockquote>
         * <p> We recommend that you use HTTPS to call the API operation to prevent password leakage.</p>
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
         * <p>The runtime parameters of the script after the cluster is created.</p>
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
         * <p>The domain name resolution type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NIS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NIS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the domain name resolution service.</p>
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
         * <p>The type of the domain account.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NIS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NIS</p>
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
         * <p>The configurations of the domain name resolution service.</p>
         */
        @NameInMap("DNS")
        public CreateClusterRequestManagerDNS DNS;

        /**
         * <p>The configurations of the domain account service.</p>
         */
        @NameInMap("DirectoryService")
        public CreateClusterRequestManagerDirectoryService directoryService;

        /**
         * <p>The hardware configurations of the management node.</p>
         */
        @NameInMap("ManagerNode")
        public NodeTemplate managerNode;

        /**
         * <p>The configurations of the scheduler service.</p>
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
         * <p>The tag key. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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

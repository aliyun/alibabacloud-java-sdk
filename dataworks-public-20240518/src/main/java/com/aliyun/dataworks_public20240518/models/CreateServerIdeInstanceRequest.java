// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateServerIdeInstanceRequest extends TeaModel {
    /**
     * <p>The credential injection configuration for the instance. After this feature is enabled, you can use the default RAM role chain or specify a custom RAM role.</p>
     */
    @NameInMap("CredentialConfig")
    public CreateServerIdeInstanceRequestCredentialConfig credentialConfig;

    /**
     * <p>The number of CUs used by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Cu")
    public Integer cu;

    /**
     * <p>The list of datasets mounted to the instance.</p>
     */
    @NameInMap("Datasets")
    public java.util.List<CreateServerIdeInstanceRequestDatasets> datasets;

    /**
     * <p>The image ID. You can call ListServerIdeImages to obtain the image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>System_serveride_notebook_20240822</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image URL. This parameter is required when you use a non-official DataWorks image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/example/serveride:latest</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The name of the personal development environment instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>notebook_dev</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The Alibaba Cloud account ID of the user who owns the instance. If this parameter is not specified, the current caller is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>20933221576142****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The DataWorks resource group identifier. You can specify the numeric ID of the resource group or the full identifier in the Serverless_res_group_{tenantId}_{resgId} format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_123456789012345_9876543210****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The user command configuration to be executed when the instance starts.</p>
     */
    @NameInMap("UserCommand")
    public CreateServerIdeInstanceRequestUserCommand userCommand;

    /**
     * <p>The Virtual Private Cloud (VPC) configuration used by the instance.</p>
     */
    @NameInMap("UserVpc")
    public CreateServerIdeInstanceRequestUserVpc userVpc;

    public static CreateServerIdeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServerIdeInstanceRequest self = new CreateServerIdeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServerIdeInstanceRequest setCredentialConfig(CreateServerIdeInstanceRequestCredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CreateServerIdeInstanceRequestCredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateServerIdeInstanceRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public CreateServerIdeInstanceRequest setDatasets(java.util.List<CreateServerIdeInstanceRequestDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<CreateServerIdeInstanceRequestDatasets> getDatasets() {
        return this.datasets;
    }

    public CreateServerIdeInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateServerIdeInstanceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateServerIdeInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateServerIdeInstanceRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateServerIdeInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateServerIdeInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServerIdeInstanceRequest setUserCommand(CreateServerIdeInstanceRequestUserCommand userCommand) {
        this.userCommand = userCommand;
        return this;
    }
    public CreateServerIdeInstanceRequestUserCommand getUserCommand() {
        return this.userCommand;
    }

    public CreateServerIdeInstanceRequest setUserVpc(CreateServerIdeInstanceRequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public CreateServerIdeInstanceRequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public static class CreateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo extends TeaModel {
        /**
         * <p>The account ID of the proxied user.</p>
         * 
         * <strong>example:</strong>
         * <p>20933221576142****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The user type. Valid values:</p>
         * <ul>
         * <li>customer: Alibaba Cloud account.</li>
         * <li>sub: RAM user.</li>
         * <li>AssumedRoleUser: RAM role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sub</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo self = new CreateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo();
            return TeaModel.build(map, self);
        }

        public CreateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateServerIdeInstanceRequestCredentialConfigConfigsRoles extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the principal that owns the role to be assumed.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012****</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <p>The policy used to further restrict the permissions of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/DataWorksRole</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The role assumption type. Valid values:</p>
         * <ul>
         * <li>service: assumed by a service.</li>
         * <li>user: assumed by a user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>The information about the proxied user.</p>
         */
        @NameInMap("UserInfo")
        public CreateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo userInfo;

        public static CreateServerIdeInstanceRequestCredentialConfigConfigsRoles build(java.util.Map<String, ?> map) throws Exception {
            CreateServerIdeInstanceRequestCredentialConfigConfigsRoles self = new CreateServerIdeInstanceRequestCredentialConfigConfigsRoles();
            return TeaModel.build(map, self);
        }

        public CreateServerIdeInstanceRequestCredentialConfigConfigsRoles setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CreateServerIdeInstanceRequestCredentialConfigConfigsRoles setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateServerIdeInstanceRequestCredentialConfigConfigsRoles setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CreateServerIdeInstanceRequestCredentialConfigConfigsRoles setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CreateServerIdeInstanceRequestCredentialConfigConfigsRoles setUserInfo(CreateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public CreateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

    public static class CreateServerIdeInstanceRequestCredentialConfigConfigs extends TeaModel {
        /**
         * <p>The identifier key of the credential configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of roles in the credential configuration.</p>
         */
        @NameInMap("Roles")
        public java.util.List<CreateServerIdeInstanceRequestCredentialConfigConfigsRoles> roles;

        /**
         * <p>The credential configuration type. Valid values:</p>
         * <ul>
         * <li>Role: single role assumption.</li>
         * <li>RoleChain: role chain assumption.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RoleChain</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateServerIdeInstanceRequestCredentialConfigConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateServerIdeInstanceRequestCredentialConfigConfigs self = new CreateServerIdeInstanceRequestCredentialConfigConfigs();
            return TeaModel.build(map, self);
        }

        public CreateServerIdeInstanceRequestCredentialConfigConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServerIdeInstanceRequestCredentialConfigConfigs setRoles(java.util.List<CreateServerIdeInstanceRequestCredentialConfigConfigsRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<CreateServerIdeInstanceRequestCredentialConfigConfigsRoles> getRoles() {
            return this.roles;
        }

        public CreateServerIdeInstanceRequestCredentialConfigConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateServerIdeInstanceRequestCredentialConfig extends TeaModel {
        /**
         * <p>The environment variable role key.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AliyunEnvRoleKey")
        public String aliyunEnvRoleKey;

        /**
         * <p>The list of credential configurations.</p>
         */
        @NameInMap("Configs")
        public java.util.List<CreateServerIdeInstanceRequestCredentialConfigConfigs> configs;

        /**
         * <p>Specifies whether to enable credential injection.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static CreateServerIdeInstanceRequestCredentialConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServerIdeInstanceRequestCredentialConfig self = new CreateServerIdeInstanceRequestCredentialConfig();
            return TeaModel.build(map, self);
        }

        public CreateServerIdeInstanceRequestCredentialConfig setAliyunEnvRoleKey(String aliyunEnvRoleKey) {
            this.aliyunEnvRoleKey = aliyunEnvRoleKey;
            return this;
        }
        public String getAliyunEnvRoleKey() {
            return this.aliyunEnvRoleKey;
        }

        public CreateServerIdeInstanceRequestCredentialConfig setConfigs(java.util.List<CreateServerIdeInstanceRequestCredentialConfigConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<CreateServerIdeInstanceRequestCredentialConfigConfigs> getConfigs() {
            return this.configs;
        }

        public CreateServerIdeInstanceRequestCredentialConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class CreateServerIdeInstanceRequestDatasets extends TeaModel {
        /**
         * <p>The custom mount properties of the dataset. The content is passed as mount options.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fs.oss.download.thread.concurrency&quot;:&quot;10&quot;}</p>
         */
        @NameInMap("ExtOptions")
        public String extOptions;

        /**
         * <p>The dataset identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>d-vsqjvs****rp5l206u</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The mount path of the dataset in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>Specifies whether to mount the dataset in read-only mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The URI of the storage service directory for direct mounting.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://example-bucket/data/</p>
         */
        @NameInMap("Uri")
        public String uri;

        /**
         * <p>The dataset version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static CreateServerIdeInstanceRequestDatasets build(java.util.Map<String, ?> map) throws Exception {
            CreateServerIdeInstanceRequestDatasets self = new CreateServerIdeInstanceRequestDatasets();
            return TeaModel.build(map, self);
        }

        public CreateServerIdeInstanceRequestDatasets setExtOptions(String extOptions) {
            this.extOptions = extOptions;
            return this;
        }
        public String getExtOptions() {
            return this.extOptions;
        }

        public CreateServerIdeInstanceRequestDatasets setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateServerIdeInstanceRequestDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateServerIdeInstanceRequestDatasets setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateServerIdeInstanceRequestDatasets setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public CreateServerIdeInstanceRequestDatasets setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class CreateServerIdeInstanceRequestUserCommandOnStart extends TeaModel {
        /**
         * <p>The command content to be executed after the instance starts. The maximum length is 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>echo &quot;serveride ready&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        public static CreateServerIdeInstanceRequestUserCommandOnStart build(java.util.Map<String, ?> map) throws Exception {
            CreateServerIdeInstanceRequestUserCommandOnStart self = new CreateServerIdeInstanceRequestUserCommandOnStart();
            return TeaModel.build(map, self);
        }

        public CreateServerIdeInstanceRequestUserCommandOnStart setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateServerIdeInstanceRequestUserCommand extends TeaModel {
        /**
         * <p>The command configuration to be executed after the instance starts.</p>
         */
        @NameInMap("OnStart")
        public CreateServerIdeInstanceRequestUserCommandOnStart onStart;

        public static CreateServerIdeInstanceRequestUserCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateServerIdeInstanceRequestUserCommand self = new CreateServerIdeInstanceRequestUserCommand();
            return TeaModel.build(map, self);
        }

        public CreateServerIdeInstanceRequestUserCommand setOnStart(CreateServerIdeInstanceRequestUserCommandOnStart onStart) {
            this.onStart = onStart;
            return this;
        }
        public CreateServerIdeInstanceRequestUserCommandOnStart getOnStart() {
            return this.onStart;
        }

    }

    public static class CreateServerIdeInstanceRequestUserVpcForwardInfos extends TeaModel {
        /**
         * <p>The list of access types.</p>
         */
        @NameInMap("AccessType")
        public java.util.List<String> accessType;

        /**
         * <p>The name of the target container.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-notebook</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The instance ID of the public Elastic IP Address (EIP).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1****</p>
         */
        @NameInMap("EipAllocationId")
        public String eipAllocationId;

        /**
         * <p>Specifies whether to enable this port forwarding configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The mapped public port.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <p>The target port in the instance container.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ForwardPort")
        public String forwardPort;

        /**
         * <p>The name of the port forwarding configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The NAT gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The public key used for SSH access.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQ****</p>
         */
        @NameInMap("SSHPublicKey")
        public String SSHPublicKey;

        public static CreateServerIdeInstanceRequestUserVpcForwardInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateServerIdeInstanceRequestUserVpcForwardInfos self = new CreateServerIdeInstanceRequestUserVpcForwardInfos();
            return TeaModel.build(map, self);
        }

        public CreateServerIdeInstanceRequestUserVpcForwardInfos setAccessType(java.util.List<String> accessType) {
            this.accessType = accessType;
            return this;
        }
        public java.util.List<String> getAccessType() {
            return this.accessType;
        }

        public CreateServerIdeInstanceRequestUserVpcForwardInfos setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public CreateServerIdeInstanceRequestUserVpcForwardInfos setEipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }
        public String getEipAllocationId() {
            return this.eipAllocationId;
        }

        public CreateServerIdeInstanceRequestUserVpcForwardInfos setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateServerIdeInstanceRequestUserVpcForwardInfos setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public CreateServerIdeInstanceRequestUserVpcForwardInfos setForwardPort(String forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }
        public String getForwardPort() {
            return this.forwardPort;
        }

        public CreateServerIdeInstanceRequestUserVpcForwardInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateServerIdeInstanceRequestUserVpcForwardInfos setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public CreateServerIdeInstanceRequestUserVpcForwardInfos setSSHPublicKey(String SSHPublicKey) {
            this.SSHPublicKey = SSHPublicKey;
            return this;
        }
        public String getSSHPublicKey() {
            return this.SSHPublicKey;
        }

    }

    public static class CreateServerIdeInstanceRequestUserVpc extends TeaModel {
        /**
         * <p>The list of port forwarding configurations.</p>
         */
        @NameInMap("ForwardInfos")
        public java.util.List<CreateServerIdeInstanceRequestUserVpcForwardInfos> forwardInfos;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateServerIdeInstanceRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateServerIdeInstanceRequestUserVpc self = new CreateServerIdeInstanceRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public CreateServerIdeInstanceRequestUserVpc setForwardInfos(java.util.List<CreateServerIdeInstanceRequestUserVpcForwardInfos> forwardInfos) {
            this.forwardInfos = forwardInfos;
            return this;
        }
        public java.util.List<CreateServerIdeInstanceRequestUserVpcForwardInfos> getForwardInfos() {
            return this.forwardInfos;
        }

        public CreateServerIdeInstanceRequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateServerIdeInstanceRequestUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateServerIdeInstanceRequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

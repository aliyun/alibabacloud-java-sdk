// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateServerIdeInstanceRequest extends TeaModel {
    /**
     * <p>The credential injection configuration for the instance. After this feature is enabled, you can use the default RAM role chain or specify a custom RAM role.</p>
     */
    @NameInMap("CredentialConfig")
    public UpdateServerIdeInstanceRequestCredentialConfig credentialConfig;

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
    public java.util.List<UpdateServerIdeInstanceRequestDatasets> datasets;

    /**
     * <p>The image ID. You can call ListServerIdeImages to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>System_serveride_notebook_20240822</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image URL. This parameter is required when you use a non-DataWorks official image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/example/serveride:latest</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The personal development environment instance ID. You can call ListServerIdeInstances to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>699573</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the personal development environment instance.</p>
     * 
     * <strong>example:</strong>
     * <p>notebook_dev</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The VPC configuration used by the instance.</p>
     */
    @NameInMap("UserVpc")
    public UpdateServerIdeInstanceRequestUserVpc userVpc;

    public static UpdateServerIdeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerIdeInstanceRequest self = new UpdateServerIdeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServerIdeInstanceRequest setCredentialConfig(UpdateServerIdeInstanceRequestCredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public UpdateServerIdeInstanceRequestCredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public UpdateServerIdeInstanceRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public UpdateServerIdeInstanceRequest setDatasets(java.util.List<UpdateServerIdeInstanceRequestDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<UpdateServerIdeInstanceRequestDatasets> getDatasets() {
        return this.datasets;
    }

    public UpdateServerIdeInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateServerIdeInstanceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public UpdateServerIdeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateServerIdeInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateServerIdeInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateServerIdeInstanceRequest setUserVpc(UpdateServerIdeInstanceRequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UpdateServerIdeInstanceRequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public static class UpdateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo extends TeaModel {
        /**
         * <p>The account ID of the delegated user.</p>
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

        public static UpdateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo self = new UpdateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo();
            return TeaModel.build(map, self);
        }

        public UpdateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the principal that assumes the role.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012****</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <p>The policy used to further restrict the role permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The ARN of the RAM role.</p>
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
         * <p>The information of the delegated user.</p>
         */
        @NameInMap("UserInfo")
        public UpdateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo userInfo;

        public static UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles self = new UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles();
            return TeaModel.build(map, self);
        }

        public UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles setUserInfo(UpdateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public UpdateServerIdeInstanceRequestCredentialConfigConfigsRolesUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

    public static class UpdateServerIdeInstanceRequestCredentialConfigConfigs extends TeaModel {
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
        public java.util.List<UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles> roles;

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

        public static UpdateServerIdeInstanceRequestCredentialConfigConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerIdeInstanceRequestCredentialConfigConfigs self = new UpdateServerIdeInstanceRequestCredentialConfigConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateServerIdeInstanceRequestCredentialConfigConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateServerIdeInstanceRequestCredentialConfigConfigs setRoles(java.util.List<UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<UpdateServerIdeInstanceRequestCredentialConfigConfigsRoles> getRoles() {
            return this.roles;
        }

        public UpdateServerIdeInstanceRequestCredentialConfigConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateServerIdeInstanceRequestCredentialConfig extends TeaModel {
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
        public java.util.List<UpdateServerIdeInstanceRequestCredentialConfigConfigs> configs;

        /**
         * <p>Specifies whether to enable credential injection.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static UpdateServerIdeInstanceRequestCredentialConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerIdeInstanceRequestCredentialConfig self = new UpdateServerIdeInstanceRequestCredentialConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServerIdeInstanceRequestCredentialConfig setAliyunEnvRoleKey(String aliyunEnvRoleKey) {
            this.aliyunEnvRoleKey = aliyunEnvRoleKey;
            return this;
        }
        public String getAliyunEnvRoleKey() {
            return this.aliyunEnvRoleKey;
        }

        public UpdateServerIdeInstanceRequestCredentialConfig setConfigs(java.util.List<UpdateServerIdeInstanceRequestCredentialConfigConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<UpdateServerIdeInstanceRequestCredentialConfigConfigs> getConfigs() {
            return this.configs;
        }

        public UpdateServerIdeInstanceRequestCredentialConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class UpdateServerIdeInstanceRequestDatasets extends TeaModel {
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
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The storage service directory URI for direct mounting.</p>
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

        public static UpdateServerIdeInstanceRequestDatasets build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerIdeInstanceRequestDatasets self = new UpdateServerIdeInstanceRequestDatasets();
            return TeaModel.build(map, self);
        }

        public UpdateServerIdeInstanceRequestDatasets setExtOptions(String extOptions) {
            this.extOptions = extOptions;
            return this;
        }
        public String getExtOptions() {
            return this.extOptions;
        }

        public UpdateServerIdeInstanceRequestDatasets setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public UpdateServerIdeInstanceRequestDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateServerIdeInstanceRequestDatasets setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public UpdateServerIdeInstanceRequestDatasets setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public UpdateServerIdeInstanceRequestDatasets setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class UpdateServerIdeInstanceRequestUserVpcForwardInfos extends TeaModel {
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
         * <p>The instance ID of the public EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1****</p>
         */
        @NameInMap("EipAllocationId")
        public String eipAllocationId;

        /**
         * <p>Specifies whether to enable the port forwarding configuration.</p>
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

        public static UpdateServerIdeInstanceRequestUserVpcForwardInfos build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerIdeInstanceRequestUserVpcForwardInfos self = new UpdateServerIdeInstanceRequestUserVpcForwardInfos();
            return TeaModel.build(map, self);
        }

        public UpdateServerIdeInstanceRequestUserVpcForwardInfos setAccessType(java.util.List<String> accessType) {
            this.accessType = accessType;
            return this;
        }
        public java.util.List<String> getAccessType() {
            return this.accessType;
        }

        public UpdateServerIdeInstanceRequestUserVpcForwardInfos setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public UpdateServerIdeInstanceRequestUserVpcForwardInfos setEipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }
        public String getEipAllocationId() {
            return this.eipAllocationId;
        }

        public UpdateServerIdeInstanceRequestUserVpcForwardInfos setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateServerIdeInstanceRequestUserVpcForwardInfos setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public UpdateServerIdeInstanceRequestUserVpcForwardInfos setForwardPort(String forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }
        public String getForwardPort() {
            return this.forwardPort;
        }

        public UpdateServerIdeInstanceRequestUserVpcForwardInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServerIdeInstanceRequestUserVpcForwardInfos setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public UpdateServerIdeInstanceRequestUserVpcForwardInfos setSSHPublicKey(String SSHPublicKey) {
            this.SSHPublicKey = SSHPublicKey;
            return this;
        }
        public String getSSHPublicKey() {
            return this.SSHPublicKey;
        }

    }

    public static class UpdateServerIdeInstanceRequestUserVpc extends TeaModel {
        /**
         * <p>The list of port forwarding configurations.</p>
         */
        @NameInMap("ForwardInfos")
        public java.util.List<UpdateServerIdeInstanceRequestUserVpcForwardInfos> forwardInfos;

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

        public static UpdateServerIdeInstanceRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerIdeInstanceRequestUserVpc self = new UpdateServerIdeInstanceRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public UpdateServerIdeInstanceRequestUserVpc setForwardInfos(java.util.List<UpdateServerIdeInstanceRequestUserVpcForwardInfos> forwardInfos) {
            this.forwardInfos = forwardInfos;
            return this;
        }
        public java.util.List<UpdateServerIdeInstanceRequestUserVpcForwardInfos> getForwardInfos() {
            return this.forwardInfos;
        }

        public UpdateServerIdeInstanceRequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateServerIdeInstanceRequestUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateServerIdeInstanceRequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

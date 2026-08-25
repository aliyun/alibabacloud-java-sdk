// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetServerIdeInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the personal development environment instance.</p>
     */
    @NameInMap("Instance")
    public GetServerIdeInstanceResponseBodyInstance instance;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetServerIdeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServerIdeInstanceResponseBody self = new GetServerIdeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServerIdeInstanceResponseBody setInstance(GetServerIdeInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public GetServerIdeInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public GetServerIdeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo extends TeaModel {
        /**
         * <p>The temporary AccessKey ID used for credential injection.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.N*********7</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The account ID of the proxied user.</p>
         * 
         * <strong>example:</strong>
         * <p>20933221576142****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The temporary security token used for credential injection.</p>
         * 
         * <strong>example:</strong>
         * <p>DFE32G*******</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>The user type. Valid values: customer (Alibaba Cloud account), sub (RAM user), and AssumedRoleUser (RAM role).</p>
         * 
         * <strong>example:</strong>
         * <p>sub</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo self = new GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo();
            return TeaModel.build(map, self);
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the principal that owns the assumed role.</p>
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
         * <p>The ARN of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/DataWorksRole</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The role assumption type. Valid values: service (assumed by a service) and user (assumed by a user).</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>The information of the proxied user.</p>
         */
        @NameInMap("UserInfo")
        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo userInfo;

        public static GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles build(java.util.Map<String, ?> map) throws Exception {
            GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles self = new GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles();
            return TeaModel.build(map, self);
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles setUserInfo(GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRolesUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

    public static class GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigs extends TeaModel {
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
        public java.util.List<GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles> roles;

        /**
         * <p>The credential configuration type. Valid values: Role (single role assumption) and RoleChain (role chain assumption).</p>
         * 
         * <strong>example:</strong>
         * <p>RoleChain</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigs self = new GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigs();
            return TeaModel.build(map, self);
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigs setRoles(java.util.List<GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigsRoles> getRoles() {
            return this.roles;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServerIdeInstanceResponseBodyInstanceCredentialConfig extends TeaModel {
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
        public java.util.List<GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigs> configs;

        /**
         * <p>Indicates whether credential injection is enabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static GetServerIdeInstanceResponseBodyInstanceCredentialConfig build(java.util.Map<String, ?> map) throws Exception {
            GetServerIdeInstanceResponseBodyInstanceCredentialConfig self = new GetServerIdeInstanceResponseBodyInstanceCredentialConfig();
            return TeaModel.build(map, self);
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfig setAliyunEnvRoleKey(String aliyunEnvRoleKey) {
            this.aliyunEnvRoleKey = aliyunEnvRoleKey;
            return this;
        }
        public String getAliyunEnvRoleKey() {
            return this.aliyunEnvRoleKey;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfig setConfigs(java.util.List<GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<GetServerIdeInstanceResponseBodyInstanceCredentialConfigConfigs> getConfigs() {
            return this.configs;
        }

        public GetServerIdeInstanceResponseBodyInstanceCredentialConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class GetServerIdeInstanceResponseBodyInstanceDatasets extends TeaModel {
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
         * <p>Indicates whether the dataset is mounted in read-only mode.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The URI of the storage service directory used for direct mounting.</p>
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

        public static GetServerIdeInstanceResponseBodyInstanceDatasets build(java.util.Map<String, ?> map) throws Exception {
            GetServerIdeInstanceResponseBodyInstanceDatasets self = new GetServerIdeInstanceResponseBodyInstanceDatasets();
            return TeaModel.build(map, self);
        }

        public GetServerIdeInstanceResponseBodyInstanceDatasets setExtOptions(String extOptions) {
            this.extOptions = extOptions;
            return this;
        }
        public String getExtOptions() {
            return this.extOptions;
        }

        public GetServerIdeInstanceResponseBodyInstanceDatasets setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetServerIdeInstanceResponseBodyInstanceDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetServerIdeInstanceResponseBodyInstanceDatasets setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public GetServerIdeInstanceResponseBodyInstanceDatasets setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public GetServerIdeInstanceResponseBodyInstanceDatasets setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos extends TeaModel {
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
         * <p>Indicates whether this port forwarding configuration is enabled.</p>
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
         * <p>The target port inside the instance container.</p>
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

        public static GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos self = new GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos();
            return TeaModel.build(map, self);
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos setAccessType(java.util.List<String> accessType) {
            this.accessType = accessType;
            return this;
        }
        public java.util.List<String> getAccessType() {
            return this.accessType;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos setEipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }
        public String getEipAllocationId() {
            return this.eipAllocationId;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos setForwardPort(String forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }
        public String getForwardPort() {
            return this.forwardPort;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos setSSHPublicKey(String SSHPublicKey) {
            this.SSHPublicKey = SSHPublicKey;
            return this;
        }
        public String getSSHPublicKey() {
            return this.SSHPublicKey;
        }

    }

    public static class GetServerIdeInstanceResponseBodyInstanceUserVpc extends TeaModel {
        /**
         * <p>The list of port forwarding configurations.</p>
         */
        @NameInMap("ForwardInfos")
        public java.util.List<GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos> forwardInfos;

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

        public static GetServerIdeInstanceResponseBodyInstanceUserVpc build(java.util.Map<String, ?> map) throws Exception {
            GetServerIdeInstanceResponseBodyInstanceUserVpc self = new GetServerIdeInstanceResponseBodyInstanceUserVpc();
            return TeaModel.build(map, self);
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpc setForwardInfos(java.util.List<GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos> forwardInfos) {
            this.forwardInfos = forwardInfos;
            return this;
        }
        public java.util.List<GetServerIdeInstanceResponseBodyInstanceUserVpcForwardInfos> getForwardInfos() {
            return this.forwardInfos;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetServerIdeInstanceResponseBodyInstanceUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetServerIdeInstanceResponseBodyInstance extends TeaModel {
        /**
         * <p>The time when the instance was created. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1756000000000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The credential injection configuration of the instance. After this feature is enabled, you can use the default RAM role chain or specify a custom RAM role.</p>
         */
        @NameInMap("CredentialConfig")
        public GetServerIdeInstanceResponseBodyInstanceCredentialConfig credentialConfig;

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
        public java.util.List<GetServerIdeInstanceResponseBodyInstanceDatasets> datasets;

        /**
         * <p>The reason why the instance entered the failed state.</p>
         * 
         * <strong>example:</strong>
         * <p>ImagePullBackOff</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <p>The ID of the image used by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>System_serveride_notebook_20240822</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>serveride_notebook</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/example/serveride:latest</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The personal development environment instance ID.</p>
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
         * <p>The account ID of the user who owns the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20933221576142****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The DataWorks workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>example_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The internal numeric ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>9876543210</p>
         */
        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        /**
         * <p>The resource group name.</p>
         * 
         * <strong>example:</strong>
         * <p>serverless_group</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The instance status. Valid values: Creating, Starting, Running, Stopping, Stopped, Updating, Deleting, DELETED, Failed, Arrearage, Saving, SaveFailed, and Saved.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the instance was last updated. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1756003600000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The VPC configuration used by the instance.</p>
         */
        @NameInMap("UserVpc")
        public GetServerIdeInstanceResponseBodyInstanceUserVpc userVpc;

        public static GetServerIdeInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            GetServerIdeInstanceResponseBodyInstance self = new GetServerIdeInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public GetServerIdeInstanceResponseBodyInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetServerIdeInstanceResponseBodyInstance setCredentialConfig(GetServerIdeInstanceResponseBodyInstanceCredentialConfig credentialConfig) {
            this.credentialConfig = credentialConfig;
            return this;
        }
        public GetServerIdeInstanceResponseBodyInstanceCredentialConfig getCredentialConfig() {
            return this.credentialConfig;
        }

        public GetServerIdeInstanceResponseBodyInstance setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public GetServerIdeInstanceResponseBodyInstance setDatasets(java.util.List<GetServerIdeInstanceResponseBodyInstanceDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<GetServerIdeInstanceResponseBodyInstanceDatasets> getDatasets() {
            return this.datasets;
        }

        public GetServerIdeInstanceResponseBodyInstance setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public GetServerIdeInstanceResponseBodyInstance setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetServerIdeInstanceResponseBodyInstance setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetServerIdeInstanceResponseBodyInstance setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetServerIdeInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetServerIdeInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetServerIdeInstanceResponseBodyInstance setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetServerIdeInstanceResponseBodyInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetServerIdeInstanceResponseBodyInstance setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetServerIdeInstanceResponseBodyInstance setResourceGroupId(Long resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetServerIdeInstanceResponseBodyInstance setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public GetServerIdeInstanceResponseBodyInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServerIdeInstanceResponseBodyInstance setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetServerIdeInstanceResponseBodyInstance setUserVpc(GetServerIdeInstanceResponseBodyInstanceUserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }
        public GetServerIdeInstanceResponseBodyInstanceUserVpc getUserVpc() {
            return this.userVpc;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListServerIdeInstancesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records returned in this response.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESG****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListServerIdeInstancesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListServerIdeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerIdeInstancesResponseBody self = new ListServerIdeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerIdeInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerIdeInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerIdeInstancesResponseBody setPagingInfo(ListServerIdeInstancesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListServerIdeInstancesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListServerIdeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo extends TeaModel {
        /**
         * <p>The temporary AccessKey ID used for credential injection.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.N*********7</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The account ID of the delegated user.</p>
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

        public static ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo self = new ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo();
            return TeaModel.build(map, self);
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the entity that owns the role to be assumed.</p>
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
         * <p>The information about the delegated user.</p>
         */
        @NameInMap("UserInfo")
        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo userInfo;

        public static ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles self = new ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles();
            return TeaModel.build(map, self);
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles setUserInfo(ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRolesUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

    public static class ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigs extends TeaModel {
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
        public java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles> roles;

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

        public static ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigs self = new ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigs();
            return TeaModel.build(map, self);
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigs setRoles(java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigsRoles> getRoles() {
            return this.roles;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfig extends TeaModel {
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
        public java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigs> configs;

        /**
         * <p>Indicates whether credential injection is enabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfig build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfig self = new ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfig();
            return TeaModel.build(map, self);
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfig setAliyunEnvRoleKey(String aliyunEnvRoleKey) {
            this.aliyunEnvRoleKey = aliyunEnvRoleKey;
            return this;
        }
        public String getAliyunEnvRoleKey() {
            return this.aliyunEnvRoleKey;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfig setConfigs(java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfigConfigs> getConfigs() {
            return this.configs;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets extends TeaModel {
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

        public static ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets self = new ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets();
            return TeaModel.build(map, self);
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets setExtOptions(String extOptions) {
            this.extOptions = extOptions;
            return this;
        }
        public String getExtOptions() {
            return this.extOptions;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos extends TeaModel {
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
         * <p>The instance ID of the elastic IP address (EIP).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1****</p>
         */
        @NameInMap("EipAllocationId")
        public String eipAllocationId;

        /**
         * <p>Indicates whether the port forwarding configuration is enabled.</p>
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

        public static ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos self = new ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos();
            return TeaModel.build(map, self);
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos setAccessType(java.util.List<String> accessType) {
            this.accessType = accessType;
            return this;
        }
        public java.util.List<String> getAccessType() {
            return this.accessType;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos setEipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }
        public String getEipAllocationId() {
            return this.eipAllocationId;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos setForwardPort(String forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }
        public String getForwardPort() {
            return this.forwardPort;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos setSSHPublicKey(String SSHPublicKey) {
            this.SSHPublicKey = SSHPublicKey;
            return this;
        }
        public String getSSHPublicKey() {
            return this.SSHPublicKey;
        }

    }

    public static class ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc extends TeaModel {
        /**
         * <p>The list of port forwarding configurations.</p>
         */
        @NameInMap("ForwardInfos")
        public java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos> forwardInfos;

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

        public static ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc self = new ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc();
            return TeaModel.build(map, self);
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc setForwardInfos(java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos> forwardInfos) {
            this.forwardInfos = forwardInfos;
            return this;
        }
        public java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpcForwardInfos> getForwardInfos() {
            return this.forwardInfos;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListServerIdeInstancesResponseBodyPagingInfoInstances extends TeaModel {
        /**
         * <p>The time when the instance was created. The value is a UNIX timestamp in milliseconds.</p>
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
        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfig credentialConfig;

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
        public java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets> datasets;

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
         * <p>The personal development environment instance name.</p>
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
         * <p>The time when the instance was last updated. The value is a UNIX timestamp in milliseconds.</p>
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
        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc userVpc;

        public static ListServerIdeInstancesResponseBodyPagingInfoInstances build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeInstancesResponseBodyPagingInfoInstances self = new ListServerIdeInstancesResponseBodyPagingInfoInstances();
            return TeaModel.build(map, self);
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setCredentialConfig(ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfig credentialConfig) {
            this.credentialConfig = credentialConfig;
            return this;
        }
        public ListServerIdeInstancesResponseBodyPagingInfoInstancesCredentialConfig getCredentialConfig() {
            return this.credentialConfig;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setDatasets(java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstancesDatasets> getDatasets() {
            return this.datasets;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setResourceGroupId(Long resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListServerIdeInstancesResponseBodyPagingInfoInstances setUserVpc(ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }
        public ListServerIdeInstancesResponseBodyPagingInfoInstancesUserVpc getUserVpc() {
            return this.userVpc;
        }

    }

    public static class ListServerIdeInstancesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The list of personal development environment instances.</p>
         */
        @NameInMap("Instances")
        public java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstances> instances;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListServerIdeInstancesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeInstancesResponseBodyPagingInfo self = new ListServerIdeInstancesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListServerIdeInstancesResponseBodyPagingInfo setInstances(java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListServerIdeInstancesResponseBodyPagingInfoInstances> getInstances() {
            return this.instances;
        }

        public ListServerIdeInstancesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListServerIdeInstancesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListServerIdeInstancesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

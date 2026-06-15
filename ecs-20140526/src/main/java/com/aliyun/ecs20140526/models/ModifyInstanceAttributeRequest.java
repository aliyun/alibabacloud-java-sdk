// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeRequest extends TeaModel {
    @NameInMap("CpuOptions")
    public ModifyInstanceAttributeRequestCpuOptions cpuOptions;

    /**
     * <p>The performance mode of the burstable performance instance. Valid values:</p>
     * <ul>
     * <li><p>Standard: standard mode.</p>
     * </li>
     * <li><p>Unlimited: unlimited mode.</p>
     * </li>
     * </ul>
     * <p>For more information about the performance modes of burstable performance instances, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable performance instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>Specifies whether to enable deletion protection for the instance. This setting prevents the instance from being released from the console or by calling the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation.</p>
     * <blockquote>
     * <p>This feature applies only to pay-as-you-go instances and protects instances only from manual release operations. It does not affect system-initiated release operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The instance description. The description must be 2 to 256 characters long and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testInstanceDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable jumbo frames. When jumbo frames are enabled, the MTU of the instance is 8500. When jumbo frames are disabled, the MTU of the instance is 1500. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <p>Note the following when you use this parameter:</p>
     * <ul>
     * <li><p>The instance must be in the <code>Running</code> or <code>Stopped</code> state.</p>
     * </li>
     * <li><p>The instance must be in a VPC.</p>
     * </li>
     * <li><p>Only some instance types support jumbo frames. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">ECS instance MTU</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableJumboFrame")
    public Boolean enableJumboFrame;

    /**
     * <p>Specifies whether to enable VPC network traffic encryption. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is in invitation-only preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNetworkEncryption")
    public Boolean enableNetworkEncryption;

    /**
     * <p>The hostname of the operating system. Note the following when you use this parameter:</p>
     * <ul>
     * <li><p>The instance cannot be in the <code>Pending</code> or <code>Starting</code> state. Otherwise, the specified hostname and the <code>/etc/hosts</code> configuration may not take effect. You can call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to query the current state of the instance.</p>
     * </li>
     * <li><p>The new hostname takes effect after you restart the instance from the ECS console (see <a href="https://help.aliyun.com/document_detail/25440.html">Restart an instance</a>) or by calling the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation. Restarting the instance from within its operating system does not apply the change.</p>
     * </li>
     * </ul>
     * <p>The hostname must meet the following requirements for different operating systems:</p>
     * <ul>
     * <li><p>For Windows Server instances: The hostname must be 2 to 15 characters long and contain letters, digits, and hyphens (-). It cannot start or end with a hyphen, contain consecutive hyphens, or consist of only digits.</p>
     * </li>
     * <li><p>For other types of instances (such as Linux): The hostname must be 2 to 64 characters long. You can use periods (.) to separate the hostname into segments. Each segment can contain letters, digits, and hyphens (-). The hostname cannot start or end with a period or hyphen, and cannot contain consecutive periods or hyphens.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testHostName</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name. The name must be 2 to 128 characters long. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testInstanceName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of queues for the primary network interface. Note the following when you use this parameter:</p>
     * <ul>
     * <li><p>The instance must be in the <code>Stopped</code> state.</p>
     * </li>
     * <li><p>The value cannot exceed the maximum number of queues that the instance type supports for a single network interface. The total number of queues across all network interfaces of the instance cannot exceed the total queue quota that the instance type supports. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the maximum number of queues per network interface and the total queue quota for an instance type.</p>
     * </li>
     * <li><p>If you set this parameter to -1, the number of queues for the primary network interface is reset to the default value for the instance type. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the default number of queues for an elastic network interface of an instance type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("NetworkInterfaceQueueNumber")
    public Integer networkInterfaceQueueNumber;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the instance. The password must be 8 to 30 characters long and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The supported special characters are <strong>()\~!@#$%^&amp;\*-_+=|{}[]:;\&quot;&lt;&gt;,.?/</strong>. For a Windows instance, the password cannot start with a forward slash (/). Note the following when you use this parameter:</p>
     * <ul>
     * <li><p>The instance cannot be in the <code>Starting</code> state.</p>
     * </li>
     * <li><p>The new password takes effect after you restart the instance from the ECS console (see <a href="https://help.aliyun.com/document_detail/25440.html">Restart an instance</a>) or by calling the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation. Restarting the instance from within its operating system does not apply the change.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To prevent password exposure, send requests that include the <code>Password</code> parameter over HTTPS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test123456&amp;$</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The private DNS name settings for the instance.</p>
     * <p>For more information about private DNS name resolution, see <a href="https://help.aliyun.com/document_detail/2844797.html">ECS private DNS resolution
     * </a>.</p>
     */
    @NameInMap("PrivateDnsNameOptions")
    public ModifyInstanceAttributeRequestPrivateDnsNameOptions privateDnsNameOptions;

    /**
     * <blockquote>
     * <p>This parameter is in invitation-only preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Recyclable")
    public Boolean recyclable;

    /**
     * <blockquote>
     * <p>This parameter is in invitation-only preview and is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("RemoteConnectionOptions")
    public ModifyInstanceAttributeRequestRemoteConnectionOptions remoteConnectionOptions;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of security groups to assign to the instance. Note the following when you use this parameter:</p>
     * <ul>
     * <li><p>The security group IDs in the array must be unique. The number of security groups that an instance can join is limited. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Limits</a>.</p>
     * </li>
     * <li><p>Specifying this parameter removes the instance from its current security groups. To retain existing security group associations, you must include their IDs in this array.</p>
     * </li>
     * <li><p>You can switch the security group type. However, the specified security groups cannot include both basic and enterprise security groups.</p>
     * </li>
     * <li><p>The security groups must belong to the same VPC as the instance.</p>
     * </li>
     * <li><p>This parameter is not supported for instances in the classic network.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The change takes effect on the instance after a short delay.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg7o****</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The user data of the instance. User data should be Base64-encoded before it is passed. Note the following when you use this parameter:</p>
     * <ul>
     * <li><p>The user data must comply with the limits described in <a href="https://help.aliyun.com/document_detail/49121.html">Generate user data</a>.</p>
     * </li>
     * <li><p>After you restart the instance, the new user data is available on the instance but is not executed.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The raw data cannot exceed 32 KB before being encoded. Do not pass confidential information, such as passwords and private keys, in plaintext. If you must pass confidential information, encrypt and then Base64-encode it. On the instance, decrypt the information by using the corresponding decryption method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static ModifyInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeRequest self = new ModifyInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeRequest setCpuOptions(ModifyInstanceAttributeRequestCpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }
    public ModifyInstanceAttributeRequestCpuOptions getCpuOptions() {
        return this.cpuOptions;
    }

    public ModifyInstanceAttributeRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public ModifyInstanceAttributeRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ModifyInstanceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyInstanceAttributeRequest setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    public ModifyInstanceAttributeRequest setEnableNetworkEncryption(Boolean enableNetworkEncryption) {
        this.enableNetworkEncryption = enableNetworkEncryption;
        return this;
    }
    public Boolean getEnableNetworkEncryption() {
        return this.enableNetworkEncryption;
    }

    public ModifyInstanceAttributeRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAttributeRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceAttributeRequest setNetworkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
        this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
        return this;
    }
    public Integer getNetworkInterfaceQueueNumber() {
        return this.networkInterfaceQueueNumber;
    }

    public ModifyInstanceAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceAttributeRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyInstanceAttributeRequest setPrivateDnsNameOptions(ModifyInstanceAttributeRequestPrivateDnsNameOptions privateDnsNameOptions) {
        this.privateDnsNameOptions = privateDnsNameOptions;
        return this;
    }
    public ModifyInstanceAttributeRequestPrivateDnsNameOptions getPrivateDnsNameOptions() {
        return this.privateDnsNameOptions;
    }

    public ModifyInstanceAttributeRequest setRecyclable(Boolean recyclable) {
        this.recyclable = recyclable;
        return this;
    }
    public Boolean getRecyclable() {
        return this.recyclable;
    }

    public ModifyInstanceAttributeRequest setRemoteConnectionOptions(ModifyInstanceAttributeRequestRemoteConnectionOptions remoteConnectionOptions) {
        this.remoteConnectionOptions = remoteConnectionOptions;
        return this;
    }
    public ModifyInstanceAttributeRequestRemoteConnectionOptions getRemoteConnectionOptions() {
        return this.remoteConnectionOptions;
    }

    public ModifyInstanceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceAttributeRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public ModifyInstanceAttributeRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class ModifyInstanceAttributeRequestCpuOptions extends TeaModel {
        /**
         * <p>The number of CPU cores. This parameter is not customizable and uses a default value.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>For information about the default value, see <a href="https://help.aliyun.com/document_detail/145895.html">Custom CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Core")
        public Integer core;

        /**
         * <p>The number of threads per core. The total number of vCPUs for an ECS instance is the value of <code>CpuOptions.Core</code> multiplied by the value of <code>CpuOptions.ThreadsPerCore</code>.</p>
         * <ul>
         * <li><p>Setting <code>CpuOptions.ThreadsPerCore</code> to 1 disables hyper-threading.</p>
         * </li>
         * <li><p>Only some instance types support specifying the number of threads per core.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>For information about the valid values and default value, see <a href="https://help.aliyun.com/document_detail/145895.html">Custom CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        /**
         * <p>The CPU topology type of the instance. Valid values:</p>
         * <ul>
         * <li><p>ContinuousCoreToHTMapping: The hyper-threads of the same core are contiguous.</p>
         * </li>
         * <li><p>DiscreteCoreToHTMapping: The hyper-threads of the same core are discrete.</p>
         * </li>
         * </ul>
         * <p>Default value: None.</p>
         * <p>Note the following when you use this parameter:</p>
         * <ul>
         * <li>The instance must be in the <code>Stopped</code> state.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported by only some instance families. See <a href="https://help.aliyun.com/document_detail/2636059.html">View and modify the CPU topology</a> for a list of supported families.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DiscreteCoreToHTMapping</p>
         */
        @NameInMap("TopologyType")
        public String topologyType;

        /**
         * <blockquote>
         * <p>This parameter is in invitation-only preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("NestedVirtualization")
        public String nestedVirtualization;

        public static ModifyInstanceAttributeRequestCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAttributeRequestCpuOptions self = new ModifyInstanceAttributeRequestCpuOptions();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAttributeRequestCpuOptions setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public ModifyInstanceAttributeRequestCpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        public ModifyInstanceAttributeRequestCpuOptions setTopologyType(String topologyType) {
            this.topologyType = topologyType;
            return this;
        }
        public String getTopologyType() {
            return this.topologyType;
        }

        public ModifyInstanceAttributeRequestCpuOptions setNestedVirtualization(String nestedVirtualization) {
            this.nestedVirtualization = nestedVirtualization;
            return this;
        }
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
        }

    }

    public static class ModifyInstanceAttributeRequestPrivateDnsNameOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable resolution of the instance ID-based domain name to an IPv6 address. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInstanceIdDnsAAAARecord")
        public Boolean enableInstanceIdDnsAAAARecord;

        /**
         * <p>Specifies whether to enable resolution of the instance ID-based domain name to an IPv4 address. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInstanceIdDnsARecord")
        public Boolean enableInstanceIdDnsARecord;

        /**
         * <p>Specifies whether to enable resolution of the IP address-based domain name to an IPv4 address. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIpDnsARecord")
        public Boolean enableIpDnsARecord;

        /**
         * <p>Specifies whether to enable reverse DNS resolution of an IPv4 address to an IP address-based domain name. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIpDnsPtrRecord")
        public Boolean enableIpDnsPtrRecord;

        /**
         * <p>The hostname type. Valid values:</p>
         * <ul>
         * <li><p>Custom: a custom hostname.</p>
         * </li>
         * <li><p>IpBased: an IP address-based hostname.</p>
         * </li>
         * <li><p>InstanceIdBased: an instance ID-based hostname.</p>
         * </li>
         * </ul>
         * <p>Default value: Custom.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("HostnameType")
        public String hostnameType;

        public static ModifyInstanceAttributeRequestPrivateDnsNameOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAttributeRequestPrivateDnsNameOptions self = new ModifyInstanceAttributeRequestPrivateDnsNameOptions();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAttributeRequestPrivateDnsNameOptions setEnableInstanceIdDnsAAAARecord(Boolean enableInstanceIdDnsAAAARecord) {
            this.enableInstanceIdDnsAAAARecord = enableInstanceIdDnsAAAARecord;
            return this;
        }
        public Boolean getEnableInstanceIdDnsAAAARecord() {
            return this.enableInstanceIdDnsAAAARecord;
        }

        public ModifyInstanceAttributeRequestPrivateDnsNameOptions setEnableInstanceIdDnsARecord(Boolean enableInstanceIdDnsARecord) {
            this.enableInstanceIdDnsARecord = enableInstanceIdDnsARecord;
            return this;
        }
        public Boolean getEnableInstanceIdDnsARecord() {
            return this.enableInstanceIdDnsARecord;
        }

        public ModifyInstanceAttributeRequestPrivateDnsNameOptions setEnableIpDnsARecord(Boolean enableIpDnsARecord) {
            this.enableIpDnsARecord = enableIpDnsARecord;
            return this;
        }
        public Boolean getEnableIpDnsARecord() {
            return this.enableIpDnsARecord;
        }

        public ModifyInstanceAttributeRequestPrivateDnsNameOptions setEnableIpDnsPtrRecord(Boolean enableIpDnsPtrRecord) {
            this.enableIpDnsPtrRecord = enableIpDnsPtrRecord;
            return this;
        }
        public Boolean getEnableIpDnsPtrRecord() {
            return this.enableIpDnsPtrRecord;
        }

        public ModifyInstanceAttributeRequestPrivateDnsNameOptions setHostnameType(String hostnameType) {
            this.hostnameType = hostnameType;
            return this;
        }
        public String getHostnameType() {
            return this.hostnameType;
        }

    }

    public static class ModifyInstanceAttributeRequestRemoteConnectionOptions extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitation-only preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <blockquote>
         * <p>This parameter is in invitation-only preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyInstanceAttributeRequestRemoteConnectionOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAttributeRequestRemoteConnectionOptions self = new ModifyInstanceAttributeRequestRemoteConnectionOptions();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAttributeRequestRemoteConnectionOptions setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ModifyInstanceAttributeRequestRemoteConnectionOptions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

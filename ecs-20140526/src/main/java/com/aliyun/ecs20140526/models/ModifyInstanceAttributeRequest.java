// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeRequest extends TeaModel {
    @NameInMap("CpuOptions")
    public ModifyInstanceAttributeRequestCpuOptions cpuOptions;

    /**
     * <p>The running mode of the burstable instance. Valid values:</p>
     * <ul>
     * <li>Standard: standard mode.</li>
     * <li>Unlimited: unlimited mode.</li>
     * </ul>
     * <p>For more information about the running modes of burstable instances, see <a href="https://help.aliyun.com/document_detail/59977.html">What are burstable instances?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The release protection attribute of the instance. Specifies whether the instance can be released from the console or by calling <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a>.</p>
     * <blockquote>
     * <p>This attribute applies only to pay-as-you-go instances and only prevents manual release operations. It does not apply to system-initiated release operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The description of the instance. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testInstanceDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the Jumbo Frame feature for the instance MTU. Valid values:</p>
     * <ul>
     * <li>true: enables the feature.</li>
     * <li>false: does not enable the feature.</li>
     * </ul>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The instance must be in the Running or Stopped state.</li>
     * <li>The instance must be a VPC-connected instance.</li>
     * <li>After the Jumbo Frame feature is enabled, the MTU value of the instance changes to 8500. After the feature is disabled, the MTU value reverts to 1500.
     * Only some instance types support the Jumbo Frame feature. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">ECS instance MTU</a>.</li>
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
     * <li>true: enables the encryption.</li>
     * <li>false: disables the encryption.<blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNetworkEncryption")
    public Boolean enableNetworkEncryption;

    /**
     * <p>The hostname of the operating system. Take note of the following items:</p>
     * <ul>
     * <li><p>The instance cannot be in the Pending or Starting state. Otherwise, the hostname and <code>/etc/hosts</code> configuration may not take effect. You can call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> to query the current status of the instance.</p>
     * </li>
     * <li><p>The new hostname takes effect after you restart the instance. You can restart the instance in the ECS console (for more information, see <a href="https://help.aliyun.com/document_detail/25440.html">Restart an instance</a>) or by calling <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>. Restarting the instance from within the operating system does not take effect.</p>
     * </li>
     * </ul>
     * <p>The hostname has the following limits for different operating systems:</p>
     * <ul>
     * <li><p>Windows Server: The hostname must be 2 to 15 characters in length and can contain uppercase letters, lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-), cannot contain consecutive hyphens (-), and cannot contain only digits.</p>
     * </li>
     * <li><p>Other instances (such as Linux): The hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain uppercase letters, lowercase letters, digits, and hyphens (-), but cannot contain consecutive periods (.) or hyphens (-). The hostname cannot start or end with a period (.) or hyphen (-).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testHostName</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the instance. The name must be 2 to 128 characters in length. It must start with an uppercase letter, lowercase letter, or Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testInstanceName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of queues for the primary network interface controller (NIC). Take note of the following items:</p>
     * <ul>
     * <li>The instance must be in the Stopped state.</li>
     * <li>The value cannot exceed the maximum number of queues per NIC allowed by the instance type. The total number of queues for all NICs on the instance cannot exceed the total queue quota allowed by the instance type. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the maximum number of queues per NIC and the total queue quota for an instance type.</li>
     * <li>If you set this parameter to -1, the number of queues for the primary NIC is reset to the default value for the instance type. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the default number of Elastic Network Interface (ENI) queues for an instance type.</li>
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
     * <p>The password of the instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: <strong>()`~!@#$%^&amp;*-_+=|{}[]:;\&quot;&lt;&gt;,.?/</strong>
     * . For Windows instances, the password cannot start with a forward slash (/). Take note of the following items:</p>
     * <ul>
     * <li>The instance cannot be in the Starting state.</li>
     * <li>The new password takes effect after you restart the instance. You can restart the instance in the ECS console (for more information, see <a href="https://help.aliyun.com/document_detail/25440.html">Restart an instance</a>) or by calling <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>. Restarting the instance from within the operating system does not take effect.</li>
     * </ul>
     * <blockquote>
     * <p>If you specify the Password parameter, use HTTPS to send the request to avoid password leaks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test123456&amp;$</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The private domain name configuration of the instance.</p>
     * <p>For more information about private private domain resolution, see <a href="https://help.aliyun.com/document_detail/2844797.html">ECS private private domain resolution</a>.</p>
     */
    @NameInMap("PrivateDnsNameOptions")
    public ModifyInstanceAttributeRequestPrivateDnsNameOptions privateDnsNameOptions;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Recyclable")
    public Boolean recyclable;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("RemoteConnectionOptions")
    public ModifyInstanceAttributeRequestRemoteConnectionOptions remoteConnectionOptions;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of the security groups to which the instance is reassigned. Take note of the following items:</p>
     * <ul>
     * <li>Security group IDs in the array cannot be duplicated. The maximum length of the array depends on the maximum number of security groups to which the instance can belong. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Limits</a>.</li>
     * <li>The instance leaves its current security groups. To retain the current security groups, add their IDs to the array.</li>
     * <li>You can switch between security group types, but the list cannot contain both basic security groups and advanced security groups at the same time.</li>
     * <li>The security groups must belong to the same VPC as the instance.</li>
     * </ul>
     * <blockquote>
     * <p>Changes to security groups take effect on the instance shortly after the modification, but a slight delay may occur.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg7o****</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The instance user data. We recommend that you Base64-encode the data before you pass it in. Take note of the following items:</p>
     * <ul>
     * <li>The instance must meet the usage limits for instance user data. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Create instance user data</a>.</li>
     * <li>After you restart the instance, the new user data is displayed on the instance but is not run.</li>
     * </ul>
     * <blockquote>
     * <p>Before Base64 encoding, the raw data cannot exceed 32 KB. Do not pass in sensitive information such as passwords and private keys in plaintext. If you must pass in sensitive information, encrypt the information, Base64-encode it, and then decrypt it in the same way within the instance.</p>
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
         * <p>The number of CPU cores. This parameter does not support custom values and can only use the default value.</p>
         * <p>&lt;props=&quot;china&quot;&gt;Default value: see <a href="https://help.aliyun.com/document_detail/145895.html">Customize CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Core")
        public Integer core;

        /**
         * <p>The number of threads per CPU core. The number of vCPUs of the ECS instance = CpuOptions.Core value × CpuOptions.ThreadsPerCore value.</p>
         * <ul>
         * <li><p>CpuOptions.ThreadsPerCore=1 indicates that hyper-threading is disabled.</p>
         * </li>
         * <li><p>Only some instance types support custom thread counts.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;Valid values and default value: see <a href="https://help.aliyun.com/document_detail/145895.html">Customize CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        /**
         * <p>The CPU topology type of the instance. Valid values:</p>
         * <ul>
         * <li>ContinuousCoreToHTMapping: the hyper-threads of the same core in the CPU topology are continuous.</li>
         * <li>DiscreteCoreToHTMapping: the hyper-threads of the same core are discrete.</li>
         * </ul>
         * <p>Default value: none.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The instance must be in the Stopped state.</li>
         * </ul>
         * <blockquote>
         * <p>Only some instance families support this parameter. For information about the supported instance families, see <a href="https://help.aliyun.com/document_detail/2636059.html">View and modify the CPU topology structure</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DiscreteCoreToHTMapping</p>
         */
        @NameInMap("TopologyType")
        public String topologyType;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
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
         * <p>Specifies whether to enable DNS resolution from the instance ID-based domain name to the IPv6 address. Valid values:</p>
         * <ul>
         * <li>true: enables the resolution.</li>
         * <li>false: disables the resolution.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInstanceIdDnsAAAARecord")
        public Boolean enableInstanceIdDnsAAAARecord;

        /**
         * <p>Specifies whether to enable DNS resolution from the instance ID-based domain name to the IPv4 address. Valid values:</p>
         * <ul>
         * <li>true: enables the resolution.</li>
         * <li>false: disables the resolution.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInstanceIdDnsARecord")
        public Boolean enableInstanceIdDnsARecord;

        /**
         * <p>Specifies whether to enable DNS resolution from the IP-based domain name to the IPv4 address. Valid values:</p>
         * <ul>
         * <li>true: enables the resolution.</li>
         * <li>false: disables the resolution.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIpDnsARecord")
        public Boolean enableIpDnsARecord;

        /**
         * <p>Specifies whether to enable reverse DNS resolution from the IPv4 address to the IP-based domain name. Valid values:</p>
         * <ul>
         * <li>true: enables the resolution.</li>
         * <li>false: disables the resolution.</li>
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
         * <li>Custom: custom.</li>
         * <li>IpBased: IP-based hostname.</li>
         * <li>InstanceIdBased: instance ID-based hostname.</li>
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
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
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

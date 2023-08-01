// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <br>
     * <p>*   Standard: standard mode</p>
     * <p>*   Unlimited: unlimited mode</p>
     * <br>
     * <p>For more information about the performance modes of burstable instances, see [Burstable instances](~~59977~~).</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The release protection attribute of the instance. This parameter specifies whether you can use the ECS console or call the [DeleteInstance](~~25507~~) operation to release the instance.</p>
     * <br>
     * <p>> This parameter is applicable to only pay-as-you-go instances. It can protect instances against manual releases, but not against automatic releases.</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The instance description. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>实例MTU是否开启Jumbo frame通信模式，取值范围：</p>
     * <br>
     * <p>-true：开启。</p>
     * <br>
     * <p>-false：不开启。</p>
     * <br>
     * <p>目前仅部分规格支持开启Jumbo frame，更多详情，请参见[ECS实例MTU](~~200512~~)。</p>
     */
    @NameInMap("EnableJumboFrame")
    public Boolean enableJumboFrame;

    /**
     * <p>The hostname of the instance. Take note of the following items:</p>
     * <br>
     * <p>*   When you modify the hostname of an instance, the instance must not be in the Creating (Pending) or Starting (Starting) state. Otherwise, the new hostname and the configurations in `/etc/hosts` cannot take effect. You can call the [DescribeInstances](~~25506~~) operation to query the state of the instance.</p>
     * <p>*   After the hostname is modified, you must call the [RebootInstance](~~25502~~) operation for the new hostname to take effect.</p>
     * <br>
     * <p>The following limits apply to the hostnames of instances that run different operating systems:</p>
     * <br>
     * <p>*   For Windows Server, the hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). It cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</p>
     * <p>*   For other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-). The hostname cannot contain consecutive periods (.) or hyphens (-). It cannot start or end with a period (.) or a hyphen (-).</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of queues supported by the primary ENI.</p>
     */
    @NameInMap("NetworkInterfaceQueueNumber")
    public Integer networkInterfaceQueueNumber;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
     * <br>
     * <p>    ()`~!@#$%^&*-_+=|{}[]:;\"<>,.?/</p>
     * <br>
     * <p>For Windows instances, passwords cannot start with a forward slash (/).</p>
     * <br>
     * <p>> If the `Password` parameter is specified, we recommend that you send requests over HTTPS to prevent password leaks.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>> This parameter is in invitational preview and is not publicly available.</p>
     */
    @NameInMap("Recyclable")
    public Boolean recyclable;

    /**
     * <p>> This parameter is in invitational preview and is not publicly available.</p>
     */
    @NameInMap("RemoteConnectionOptions")
    public ModifyInstanceAttributeRequestRemoteConnectionOptions remoteConnectionOptions;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of replacement security groups.</p>
     * <br>
     * <p>*   All security group IDs must be unique.</p>
     * <p>*   The instance is moved from the current security groups to the replacement security groups. If you want the instance to remain in the current security groups, you must add the IDs of the current security groups to the list.</p>
     * <p>*   You can move the instance to security groups of a different type. However, the list cannot contain the IDs of both basic and advanced security groups.</p>
     * <p>*   The specified security group and instance must belong to the same virtual private cloud (VPC).</p>
     * <p>*   The valid values of N are based on the maximum number of security groups to which the instance can belong. For more information, see [Limits](~~25412#SecurityGroupQuota1~~).</p>
     * <p>*   New security groups become valid for corresponding instances after a short latency.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The user data of the instance. User data must be encoded in Base64.</p>
     * <br>
     * <p>The size of the user data must be no greater than 16 KB before it is encoded in Base64. We recommend that you do not pass in confidential information such as passwords and private keys in the plaintext format. If you must pass in confidential information, we recommend that you encrypt and Base64-encode the information before you pass it in. Then you can decode and decrypt the information in the same way within the instance.</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static ModifyInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeRequest self = new ModifyInstanceAttributeRequest();
        return TeaModel.build(map, self);
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

    public static class ModifyInstanceAttributeRequestRemoteConnectionOptions extends TeaModel {
        /**
         * <p>> This parameter is in invitational preview and is not publicly available.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>> This parameter is in invitational preview and is not publicly available.</p>
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

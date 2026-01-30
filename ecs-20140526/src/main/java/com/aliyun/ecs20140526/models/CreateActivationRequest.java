// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the activation code. The description must be 1 to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum number of times that you can use the activation code to register managed instances. Valid values: 1 to 1000.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The default instance name prefix. The prefix must be 2 to 50 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and colons (:). The prefix must start with a letter and cannot start with a digit, a special character, <code>http://</code>, or <code>https://</code>.</p>
     * <p>If you use the activation code that is created by calling the CreateActivation operation to register managed instances, the instances are assigned sequential names that include the value of this parameter as a prefix. You can also specify a new instance name to replace the assigned sequential name when you register a managed instance.</p>
     * <p>If you specify InstanceName when you register a managed instance, an instance name in the <code>&lt;InstanceName&gt;-&lt;Number&gt;</code> format is generated. The number of digits in the \<Number> value varies based on the number of digits in the <code>InstanceCount</code> value. Example: <code>001</code>. If you do not specify InstanceName, the hostname (Hostname) is used as the instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-InstanceName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The IP addresses of hosts that can use the activation code. The value can be IPv4 addresses, IPv6 addresses, or CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("IpAddressRange")
    public String ipAddressRange;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. Supported regions: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Ulanqab), China (Hangzhou), China (Shanghai), China (Shenzhen), China (Heyuan), China (Guangzhou), China (Chengdu), China (Hong Kong), Singapore, Japan (Tokyo), US (Silicon Valley), and US (Virginia). You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the activation code.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-123******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags to add to the activation code.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateActivationRequestTag> tag;

    /**
     * <p>The validity period of the activation code. After the validity period ends, you can no longer use the activation code to register managed instances. Unit: hours.</p>
     * <p>Default value: 4.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TimeToLiveInHours")
    public Long timeToLiveInHours;

    public static CreateActivationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationRequest self = new CreateActivationRequest();
        return TeaModel.build(map, self);
    }

    public CreateActivationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateActivationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateActivationRequest setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public CreateActivationRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateActivationRequest setIpAddressRange(String ipAddressRange) {
        this.ipAddressRange = ipAddressRange;
        return this;
    }
    public String getIpAddressRange() {
        return this.ipAddressRange;
    }

    public CreateActivationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateActivationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateActivationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateActivationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateActivationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateActivationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateActivationRequest setTag(java.util.List<CreateActivationRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateActivationRequestTag> getTag() {
        return this.tag;
    }

    public CreateActivationRequest setTimeToLiveInHours(Long timeToLiveInHours) {
        this.timeToLiveInHours = timeToLiveInHours;
        return this;
    }
    public Long getTimeToLiveInHours() {
        return this.timeToLiveInHours;
    }

    public static class CreateActivationRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the activation code. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags, call <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a>.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the activation code. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <p>It can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateActivationRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateActivationRequestTag self = new CreateActivationRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateActivationRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateActivationRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

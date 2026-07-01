// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the activation code. The value can be 1 to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum number of times that the activation code can be used to register managed instances. Valid values: 1 to 1000.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The default instance name prefix. The value must be 2 to 50 characters in length and must start with a letter. It cannot start with a special character or digit. It can contain only periods (.), underscores (_), hyphens (-), and colons (:). It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Instances registered with the activation code created by this operation use this value as the prefix to generate sequential instance names. You can also specify a new instance name when you register a managed instance to override this default value.</p>
     * <p>When you register a managed instance, if you specify a value for InstanceName, a name in the format of <code>&lt;InstanceName&gt;-001</code> is generated. The number of digits in <code>001</code> depends on the number of digits in the <code>InstanceCount</code> value. If you do not specify a value for InstanceName, the hostname of the host is used as the instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-InstanceName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The IP addresses of hosts that are allowed to use the activation code. The value can be an IPv4 address, an IPv6 address, or a CIDR block.</p>
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
     * <p>The region ID. Currently supported regions include China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Ulanqab), China (Hangzhou), China (Shanghai), China (Shenzhen), China (Heyuan), China (Guangzhou), China (Chengdu), Hong Kong (China), Singapore, Japan (Tokyo), US (Silicon Valley), and US (Virginia).
     * You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query region IDs and other information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the activation code belongs.</p>
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
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateActivationRequestTag> tag;

    /**
     * <p>The validity period of the activation code. After the validity period expires, the activation code cannot be used to register new instances. Unit: hours. Valid values: 1 to 4.</p>
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
         * <p>The tag key of the managed instance activation code. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the resource count with the tag cannot exceed 1000. If you use multiple tags to filter resources, the resource count with all the specified tags attached cannot exceed 1000. If the resource count exceeds 1000, use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the managed instance activation code. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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

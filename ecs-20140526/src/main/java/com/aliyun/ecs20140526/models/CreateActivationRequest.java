// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The ClientToken parameter can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
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
     * <p>The maximum number of times that the activation code can be used to register managed instances. Valid values: 1 to 1000.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The default prefix of the instance name. The prefix must be 2 to 50 characters in length. It must start with a letter and cannot start with a special character or a digit. It can contain only periods (.), underscores (_), hyphens (-), and colons (:). It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Instances registered by using the activation code created by this operation use this name as a prefix to generate sequential instance names. You can also specify a new instance name to override this default value when you register a managed instance.</p>
     * <p>When you register a managed instance, if you specify the InstanceName parameter, an instance name in the <InstanceName>-001 format is generated. The number of digits in the serial number 001 depends on the number of digits in the value of the InstanceCount parameter. If you do not specify the InstanceName parameter, the hostname of the host is used as the instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-InstanceName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The IP addresses of the hosts that are allowed to use the activation code. Set the value to an IPv4 address, an IPv6 address, or a CIDR block.</p>
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
     * <p>The region ID. Supported regions: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Ulanqab), China (Hangzhou), China (Shanghai), China (Shenzhen), China (Heyuan), China (Guangzhou), China (Chengdu), Hong Kong (China), Singapore, Japan (Tokyo), US (Silicon Valley), and US (Virginia).
     * You can invoke the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateActivationRequestTag> tag;

    /**
     * <p>The validity period of the activation code. After the activation code expires, it cannot be used to register new instances. Unit: hours. Valid values: 1 to 4.</p>
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
         * <p>The key of tag N of the managed instance activation code (dynamic code). Valid values of N: 1 to 20. If you specify this parameter, it cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the resource count returned cannot exceed 1,000. If you use multiple tags to filter resources, the resource count of resources that are attached to all the specified tags cannot exceed 1,000. If the resource count exceeds 1,000, you must invoke the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query the resources.</p>
         * <p>The tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the managed instance activation code. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
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

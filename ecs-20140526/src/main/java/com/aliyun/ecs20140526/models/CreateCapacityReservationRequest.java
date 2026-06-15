// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public CreateCapacityReservationRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>A client-generated token that ensures the request is idempotent. You can use the same token to retry a request. The <code>ClientToken</code> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the capacity reservation. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Default value: empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The end time of the capacity reservation. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-30T06:32:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The release mode of the capacity reservation. Valid values:</p>
     * <ul>
     * <li><p>Limited: The capacity reservation is automatically released at a specific time. You must also specify the <code>EndTime</code> parameter.</p>
     * </li>
     * <li><p>Unlimited: The capacity reservation must be released manually.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unlimited</p>
     */
    @NameInMap("EndTimeType")
    public String endTimeType;

    /**
     * <p>The number of instances of the specified instance type for which to reserve capacity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type for which to reserve capacity. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to view the instance types that ECS provides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operating system of the image used by the instance. This parameter corresponds to the <code>Platform</code> parameter of a regional reserved instance. If this platform matches the platform of a regional reserved instance, the regional reserved instance can be used to offset the costs of unused capacity in the reservation. Valid values:</p>
     * <ul>
     * <li><p>Windows: Windows Server operating systems.</p>
     * </li>
     * <li><p>Linux: Linux and Unix-like operating systems.</p>
     * </li>
     * </ul>
     * <p>Default value: Linux.</p>
     * <blockquote>
     * <p>This parameter is not yet available for use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The ID of the region in which to create the capacity reservation. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the capacity reservation belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time when the capacity reservation takes effect. The capacity reservation takes effect immediately after it is created.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the capacity reservation takes effect immediately.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-10-30T05:32:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The tags to add to the capacity reservation.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCapacityReservationRequestTag> tag;

    /**
     * <p>The ID of the zone in which you want to create the capacity reservation. A capacity reservation can reserve resources within only one zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public java.util.List<String> zoneId;

    public static CreateCapacityReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCapacityReservationRequest self = new CreateCapacityReservationRequest();
        return TeaModel.build(map, self);
    }

    public CreateCapacityReservationRequest setPrivatePoolOptions(CreateCapacityReservationRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public CreateCapacityReservationRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateCapacityReservationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCapacityReservationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCapacityReservationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateCapacityReservationRequest setEndTimeType(String endTimeType) {
        this.endTimeType = endTimeType;
        return this;
    }
    public String getEndTimeType() {
        return this.endTimeType;
    }

    public CreateCapacityReservationRequest setInstanceAmount(Integer instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public CreateCapacityReservationRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateCapacityReservationRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateCapacityReservationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCapacityReservationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCapacityReservationRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateCapacityReservationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCapacityReservationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCapacityReservationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCapacityReservationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCapacityReservationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateCapacityReservationRequest setTag(java.util.List<CreateCapacityReservationRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCapacityReservationRequestTag> getTag() {
        return this.tag;
    }

    public CreateCapacityReservationRequest setZoneId(java.util.List<String> zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public java.util.List<String> getZoneId() {
        return this.zoneId;
    }

    public static class CreateCapacityReservationRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The type of the private pool that is generated after the capacity reservation takes effect. Valid values:</p>
         * <ul>
         * <li><p>Open: open mode. When you launch an instance, it is automatically matched with the capacity of an open private pool. If no suitable private pool capacity is available, the instance is launched by using public pool resources.</p>
         * </li>
         * <li><p>Target: targeted mode. The instance is launched by using the capacity of a specified private pool. If the capacity is unavailable, the instance fails to launch.</p>
         * </li>
         * </ul>
         * <p>Default value: Open.</p>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        /**
         * <p>The name of the capacity reservation. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>crpTestName</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateCapacityReservationRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateCapacityReservationRequestPrivatePoolOptions self = new CreateCapacityReservationRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateCapacityReservationRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public CreateCapacityReservationRequestPrivatePoolOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateCapacityReservationRequestTag extends TeaModel {
        /**
         * <p>The tag key of the capacity reservation. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the capacity reservation. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCapacityReservationRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCapacityReservationRequestTag self = new CreateCapacityReservationRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCapacityReservationRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCapacityReservationRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

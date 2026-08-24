// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class CreateKVCacheStoreRequest extends TeaModel {
    /**
     * <p>The storage capacity in GiB. The minimum capacity is 300 TiB (307200 GiB), and the capacity is scaled in increments of 300 TiB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2395</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The client token used to ensure idempotence of the request. The token can be up to 64 characters in length. Use a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>YOUR_CLIENT_TOKEN</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The KVCacheStore description. The description must be 2 to 256 characters in length and cannot start with http:// or https://. Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>No description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The HPN cluster ID, which is used to create an affinity scheduling relationship between the KVCacheStore and the specified HPN cluster. After creation, the KVCacheStore may have affinity relationships with multiple HPN clusters based on network topology. You can call GetKVCacheStore to query the available HPN clusters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>B6</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <p>The KVCacheStore name. The name must be 2 to 128 characters in length and can contain characters from the Unicode letter category (including English and Chinese characters) and digits. The name can contain colons (:), underscores (_), periods (.), and hyphens (-). If this parameter is not specified, the default value is the KVCacheStore ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sc-data-warehouse-server</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The billing method. Valid values: POSTPAY (pay-as-you-go). Default value: POSTPAY.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The region ID in which to create the KVCacheStore. You can call DescribeRegions to query the list of available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzafsjd7i4qaq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of resource tag key-value pairs. A maximum of 20 tags are supported. This overrides the parent TagDTO type and uses the same Tag type as the Get/List response.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateKVCacheStoreRequestTag> tag;

    /**
     * <p>The zone ID. You can call DescribeZones to query the list of zones in the specified region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateKVCacheStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKVCacheStoreRequest self = new CreateKVCacheStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateKVCacheStoreRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public CreateKVCacheStoreRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateKVCacheStoreRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKVCacheStoreRequest setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public CreateKVCacheStoreRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKVCacheStoreRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateKVCacheStoreRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateKVCacheStoreRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateKVCacheStoreRequest setTag(java.util.List<CreateKVCacheStoreRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateKVCacheStoreRequestTag> getTag() {
        return this.tag;
    }

    public CreateKVCacheStoreRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateKVCacheStoreRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>000098da1005a3df</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>000088aabb0023f7</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateKVCacheStoreRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateKVCacheStoreRequestTag self = new CreateKVCacheStoreRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateKVCacheStoreRequestTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateKVCacheStoreRequestTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}

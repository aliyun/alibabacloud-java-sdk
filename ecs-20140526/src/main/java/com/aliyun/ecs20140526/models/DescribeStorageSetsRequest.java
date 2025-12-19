// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The value of <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * <p>Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the storage set. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of storage sets. The value is a JSON array that consists of up to 100 storage set IDs. Separate the IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ss-bp1d6tsvznfghy7y****&quot;, &quot;ss-bp1ippxbaql9zet7****&quot;, … &quot;ss-bp1ib7bcz07l****&quot;]</p>
     */
    @NameInMap("StorageSetIds")
    public String storageSetIds;

    /**
     * <p>The name of the storage set.</p>
     * 
     * <strong>example:</strong>
     * <p>storageSetTest</p>
     */
    @NameInMap("StorageSetName")
    public String storageSetName;

    @NameInMap("Tag")
    public java.util.List<DescribeStorageSetsRequestTag> tag;

    /**
     * <p>The zone ID of the storage set. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeStorageSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetsRequest self = new DescribeStorageSetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStorageSetsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeStorageSetsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeStorageSetsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStorageSetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageSetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeStorageSetsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeStorageSetsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeStorageSetsRequest setStorageSetIds(String storageSetIds) {
        this.storageSetIds = storageSetIds;
        return this;
    }
    public String getStorageSetIds() {
        return this.storageSetIds;
    }

    public DescribeStorageSetsRequest setStorageSetName(String storageSetName) {
        this.storageSetName = storageSetName;
        return this;
    }
    public String getStorageSetName() {
        return this.storageSetName;
    }

    public DescribeStorageSetsRequest setTag(java.util.List<DescribeStorageSetsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeStorageSetsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeStorageSetsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeStorageSetsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeStorageSetsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsRequestTag self = new DescribeStorageSetsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeStorageSetsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

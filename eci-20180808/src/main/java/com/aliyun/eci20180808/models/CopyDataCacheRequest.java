// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CopyDataCacheRequest extends TeaModel {
    /**
     * <p>The bucket in which the DataCache is stored.</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the DataCache in the source region.</p>
     */
    @NameInMap("DataCacheId")
    public String dataCacheId;

    /**
     * <p>The destination region of the DataCache.</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    /**
     * <p>The DataCache name.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The storage path of the data.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The source region of the DataCache.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group to which the DataCache belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of days for which the DataCache is retained.</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The tags of the DataCache.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CopyDataCacheRequestTag> tag;

    public static CopyDataCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyDataCacheRequest self = new CopyDataCacheRequest();
        return TeaModel.build(map, self);
    }

    public CopyDataCacheRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public CopyDataCacheRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CopyDataCacheRequest setDataCacheId(String dataCacheId) {
        this.dataCacheId = dataCacheId;
        return this;
    }
    public String getDataCacheId() {
        return this.dataCacheId;
    }

    public CopyDataCacheRequest setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        return this;
    }
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    public CopyDataCacheRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopyDataCacheRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CopyDataCacheRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopyDataCacheRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CopyDataCacheRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CopyDataCacheRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CopyDataCacheRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CopyDataCacheRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CopyDataCacheRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CopyDataCacheRequest setTag(java.util.List<CopyDataCacheRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CopyDataCacheRequestTag> getTag() {
        return this.tag;
    }

    public static class CopyDataCacheRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CopyDataCacheRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CopyDataCacheRequestTag self = new CopyDataCacheRequestTag();
            return TeaModel.build(map, self);
        }

        public CopyDataCacheRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CopyDataCacheRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

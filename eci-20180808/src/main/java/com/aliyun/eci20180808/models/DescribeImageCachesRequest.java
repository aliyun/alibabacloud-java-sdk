// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeImageCachesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ImageCacheId")
    public String imageCacheId;

    @NameInMap("ImageCacheName")
    public String imageCacheName;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("Image")
    public String image;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<DescribeImageCachesRequestTag> tag;

    public static DescribeImageCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCachesRequest self = new DescribeImageCachesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImageCachesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeImageCachesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeImageCachesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeImageCachesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageCachesRequest setImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }
    public String getImageCacheId() {
        return this.imageCacheId;
    }

    public DescribeImageCachesRequest setImageCacheName(String imageCacheName) {
        this.imageCacheName = imageCacheName;
        return this;
    }
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    public DescribeImageCachesRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public DescribeImageCachesRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public DescribeImageCachesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeImageCachesRequest setTag(java.util.List<DescribeImageCachesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeImageCachesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeImageCachesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeImageCachesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCachesRequestTag self = new DescribeImageCachesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeImageCachesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImageCachesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeImageCachesRequest extends TeaModel {
    /**
     * <p>The container images.</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The IDs of the image caches.</p>
     */
    @NameInMap("ImageCacheId")
    public String imageCacheId;

    /**
     * <p>The names of the image caches.</p>
     */
    @NameInMap("ImageCacheName")
    public String imageCacheName;

    /**
     * <p>Specifies whether the image layers of the image caches must contain all image layers of the container image.\</p>
     * <p>If you configure MatchImage, you can configure this parameter to further filter query results.</p>
     */
    @NameInMap("ImageFullMatch")
    public Boolean imageFullMatch;

    /**
     * <p>The quantity of image caches whose image layers contain all image layers of the container image.\</p>
     * <p>If you configure MatchImage, you can configure this parameter to further filter query results.</p>
     */
    @NameInMap("ImageMatchCountRequest")
    public Integer imageMatchCountRequest;

    /**
     * <p>The maximum entries of query results that are allowed to be displayed.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The container images used to match the image caches that you want to query. You can specify a maximum of 100 container images.</p>
     */
    @NameInMap("MatchImage")
    public java.util.List<String> matchImage;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the image caches.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the image caches belong.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of the snapshots that correspond to the image caches.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The tags to add to the image caches.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeImageCachesRequestTag> tag;

    public static DescribeImageCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCachesRequest self = new DescribeImageCachesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageCachesRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
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

    public DescribeImageCachesRequest setImageFullMatch(Boolean imageFullMatch) {
        this.imageFullMatch = imageFullMatch;
        return this;
    }
    public Boolean getImageFullMatch() {
        return this.imageFullMatch;
    }

    public DescribeImageCachesRequest setImageMatchCountRequest(Integer imageMatchCountRequest) {
        this.imageMatchCountRequest = imageMatchCountRequest;
        return this;
    }
    public Integer getImageMatchCountRequest() {
        return this.imageMatchCountRequest;
    }

    public DescribeImageCachesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeImageCachesRequest setMatchImage(java.util.List<String> matchImage) {
        this.matchImage = matchImage;
        return this;
    }
    public java.util.List<String> getMatchImage() {
        return this.matchImage;
    }

    public DescribeImageCachesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageCachesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeImageCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImageCachesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageCachesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public DescribeImageCachesRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public DescribeImageCachesRequest setTag(java.util.List<DescribeImageCachesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeImageCachesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeImageCachesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the image cache.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the image cache.</p>
         */
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

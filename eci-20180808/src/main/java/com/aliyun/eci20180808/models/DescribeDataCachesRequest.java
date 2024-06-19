// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeDataCachesRequest extends TeaModel {
    /**
     * <p>The bucket that stores the data cache. Default value: default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The data cache IDs.</p>
     */
    @NameInMap("DataCacheId")
    public java.util.List<String> dataCacheId;

    /**
     * <p>The maximum entries of query results that are allowed to be displayed. Valid values: 1 to 20. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The query token. Set the value to the NextToken value that is returned in the previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>d78f2dd8-5979-42fe-****-b16db43be5bc</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The virtual host (vHost) directory in which the data cache resides.</p>
     * 
     * <strong>example:</strong>
     * <p>/data/models/</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The region ID of the data caches that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the data cache belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzw2jz2z****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags that are attached to the data cache.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDataCachesRequestTag> tag;

    public static DescribeDataCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCachesRequest self = new DescribeDataCachesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataCachesRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public DescribeDataCachesRequest setDataCacheId(java.util.List<String> dataCacheId) {
        this.dataCacheId = dataCacheId;
        return this;
    }
    public java.util.List<String> getDataCacheId() {
        return this.dataCacheId;
    }

    public DescribeDataCachesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeDataCachesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDataCachesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDataCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDataCachesRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeDataCachesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDataCachesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDataCachesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDataCachesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDataCachesRequest setTag(java.util.List<DescribeDataCachesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDataCachesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDataCachesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDataCachesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataCachesRequestTag self = new DescribeDataCachesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDataCachesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDataCachesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

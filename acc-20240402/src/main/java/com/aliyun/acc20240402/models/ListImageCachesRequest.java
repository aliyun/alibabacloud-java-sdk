// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class ListImageCachesRequest extends TeaModel {
    /**
     * <p>The container image.</p>
     * 
     * <strong>example:</strong>
     * <p>egs-registry.cn-hangzhou.cr.aliyuncs.com/egs/vllm:0.9.0.1-pytorch2.7-cu128-20250612</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The name of the image cache.</p>
     * 
     * <strong>example:</strong>
     * <p>my-imc</p>
     */
    @NameInMap("ImageCacheName")
    public String imageCacheName;

    /**
     * <p>The maximum number of results to return for a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set the value to the NextToken value returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzh43v*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The cache status of the image cache.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the image cache. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListImageCachesRequestTags> tags;

    public static ListImageCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageCachesRequest self = new ListImageCachesRequest();
        return TeaModel.build(map, self);
    }

    public ListImageCachesRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ListImageCachesRequest setImageCacheName(String imageCacheName) {
        this.imageCacheName = imageCacheName;
        return this;
    }
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    public ListImageCachesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListImageCachesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListImageCachesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListImageCachesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListImageCachesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListImageCachesRequest setTags(java.util.List<ListImageCachesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListImageCachesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListImageCachesRequestTags extends TeaModel {
        /**
         * <p>The tag key of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>imc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListImageCachesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListImageCachesRequestTags self = new ListImageCachesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListImageCachesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListImageCachesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

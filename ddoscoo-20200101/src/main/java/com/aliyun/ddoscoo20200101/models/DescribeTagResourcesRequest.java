// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTagResourcesRequest extends TeaModel {
    /**
     * <p>The query token. Set the value to the value of <strong>NextToken</strong> that is returned in the last call.</p>
     * <blockquote>
     * <p>You do not need to configure this parameter if you call this operation for the first time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RGuYpqDdKhzXb8C3.D1BwQgc1tMBsoxdGiEKHHUUCf****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the instance. Set the value to <strong>cn-hangzhou</strong>, which indicates an Anti-DDoS Proxy (Chinese Mainland) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IDs of the Anti-DDoS Proxy (Chinese Mainland) instances that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of the resource to which the tag belongs. Set the value to <strong>INSTANCE</strong>, which indicates an Anti-DDoS Pro instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>An array consisting of tags that you want to query. Each tag consists of a tag <strong>key</strong> and a tag <strong>value</strong>.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeTagResourcesRequestTags> tags;

    public static DescribeTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagResourcesRequest self = new DescribeTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTagResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeTagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeTagResourcesRequest setTags(java.util.List<DescribeTagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeTagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeTagResourcesRequestTags extends TeaModel {
        /**
         * <p>The key of the tag that you want to query.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You must specify at least one of the <strong>ResourceIds.N</strong> and <strong>Tags.N.Key</strong> parameters.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/159785.html">DescribeTagKeys</a> operation to query all tag keys.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeTagResourcesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagResourcesRequestTags self = new DescribeTagResourcesRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeTagResourcesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTagResourcesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

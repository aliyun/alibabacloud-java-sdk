// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <blockquote>
     * <p> If the call does not return all result entries, the value of the NextToken parameter is returned. By default, 200 rows are returned. You can call this operation again and set the value of the parameter to the value of the parameter that is returned in the last call to implement paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the resource.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/601478.html">DescribeRegions</a> to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A list of resource IDs for which you want to query tags. You can enter a maximum of 50 resource IDs.</p>
     * <p>Enter multiple resource IDs in the <code>[&quot;ResourceId. 1&quot;,&quot;ResourceId. 2&quot;,...]</code> format.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of resource whose tags you want to query. Valid value:</p>
     * <ul>
     * <li>key</li>
     * <li>secret</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>A list of tags that you want to query. Valid values of N: 1 to 20.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTag(java.util.List<ListTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListTagResourcesRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. A tag consists of a key-value pair.</p>
         * <p>You can enter up to 20 tags. Enter multiple tags in the <code>[{&quot;Key&quot;:&quot;key1&quot;,&quot;Value&quot;:&quot;value1&quot;},{&quot;Key&quot;:&quot;key2&quot;,&quot;Value&quot;:&quot;value2&quot;},..]</code> format.</p>
         * <blockquote>
         * <p> The key cannot start with aliyun or acs:.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>disk-encryption</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. A tag consists of a key-value pair.</p>
         * <p>You can enter up to 20 tags. Enter multiple tags in the <code>[{&quot;Key&quot;:&quot;key1&quot;,&quot;Value&quot;:&quot;value1&quot;},{&quot;Key&quot;:&quot;key2&quot;,&quot;Value&quot;:&quot;value2&quot;},..]</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTag self = new ListTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

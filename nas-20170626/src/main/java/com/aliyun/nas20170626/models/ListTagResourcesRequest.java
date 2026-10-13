// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of resource IDs.</p>
     * <p>The ID of the target resource. Valid values of N: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>03e08484f0</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>filesystem: file system.</li>
     * <li>accesspoint: access point.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>filesystem</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags. Array length: 1 to 20. If the array contains multiple tag objects, the tag key (Key) must be unique.</p>
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
         * <p>The tag key.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>Cannot be empty or an empty string. </li>
         * <li>Can be up to 128 characters in length.</li>
         * <li>Cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
         * <li>Cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nastest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>Can be up to 128 characters in length.</li>
         * <li>Cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>filetest</p>
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

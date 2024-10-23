// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The ID of resource N.</p>
     * <p>Valid values of N: 1 to 50. If ResourceType is set to user, the resource ID is the ID of the RAM user.</p>
     * <blockquote>
     * <p>You must specify only one of the following parameters: ResourceId and ResourcePrincipalName.</p>
     * </blockquote>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The name of resource N.</p>
     * <p>Valid values of N: 1 to 50. If ResourceType is set to user, the resource name is the name of the RAM user.</p>
     * <blockquote>
     * <p>You must specify only one of the following parameters: ResourceId and ResourcePrincipalName.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TagResources</p>
     */
    @NameInMap("ResourcePrincipalName")
    public java.util.List<String> resourcePrincipalName;

    /**
     * <p>The type of the resource. Valid value:</p>
     * <ul>
     * <li>user: a RAM user</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag value.</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourcePrincipalName(java.util.List<String> resourcePrincipalName) {
        this.resourcePrincipalName = resourcePrincipalName;
        return this;
    }
    public java.util.List<String> getResourcePrincipalName() {
        return this.resourcePrincipalName;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(java.util.List<TagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagResourcesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * <p>Valid values of N: 1 to 20. You cannot specify empty strings as tag keys. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>operator</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <p>Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be a up to128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UnTagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the specified resource. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The IDs of the resources from which you want to remove tags.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-123</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li><strong>acl</strong>: an access control list (ACL)</li>
     * <li><strong>loadbalancer</strong>: an Application Load Balancer (ALB) instance</li>
     * <li><strong>securitypolicy</strong>: a security policy</li>
     * <li><strong>servergroup</strong>: a server group</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>loadbalancer</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags that you want to remove.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Tag")
    public java.util.List<UnTagResourcesRequestTag> tag;

    /**
     * <p>The keys of the tags that you want to remove.</p>
     */
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UnTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesRequest self = new UnTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UnTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UnTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UnTagResourcesRequest setTag(java.util.List<UnTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UnTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public UnTagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

    public static class UnTagResourcesRequestTag extends TeaModel {
        /**
         * <p>The key of the tag that you want to remove. The key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that you want to remove. The value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static UnTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UnTagResourcesRequestTag self = new UnTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public UnTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UnTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

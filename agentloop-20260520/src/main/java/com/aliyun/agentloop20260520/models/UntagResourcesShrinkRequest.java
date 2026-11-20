// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UntagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all custom tags. Valid values: true, false, and an empty string. If this parameter is not specified or is set to an empty string, the value is treated as false. The value true takes effect only when the tagKey parameter is not specified or is an empty array.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("all")
    public String all;

    /**
     * <p>The list of resource IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;space-a&quot;,&quot;space-b&quot;]</p>
     */
    @NameInMap("resourceId")
    public String resourceIdShrink;

    /**
     * <p>The resource type. Set the value to agentspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentspace</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The list of tag keys to remove. You can specify up to 20 tag keys. The tag keys must be unique. If this parameter is not empty, it takes precedence over the all parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;key1&quot;, &quot;key2&quot;, &quot;key3&quot;]</p>
     */
    @NameInMap("tagKey")
    public String tagKeyShrink;

    public static UntagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesShrinkRequest self = new UntagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesShrinkRequest setAll(String all) {
        this.all = all;
        return this;
    }
    public String getAll() {
        return this.all;
    }

    public UntagResourcesShrinkRequest setResourceIdShrink(String resourceIdShrink) {
        this.resourceIdShrink = resourceIdShrink;
        return this;
    }
    public String getResourceIdShrink() {
        return this.resourceIdShrink;
    }

    public UntagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesShrinkRequest setTagKeyShrink(String tagKeyShrink) {
        this.tagKeyShrink = tagKeyShrink;
        return this;
    }
    public String getTagKeyShrink() {
        return this.tagKeyShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
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
    public java.util.List<String> resourceId;

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
    public java.util.List<String> tagKey;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(String all) {
        this.all = all;
        return this;
    }
    public String getAll() {
        return this.all;
    }

    public UntagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}

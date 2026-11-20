// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListTagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The pagination token. An empty value indicates that no additional pages exist.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJuZXh0IjoiNDAifQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of resource IDs.</p>
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
     * <p>The tag filter conditions. Multiple conditions are combined with the AND operator. At least one of resourceId and tag must be specified.</p>
     */
    @NameInMap("tag")
    public String tagShrink;

    public static ListTagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesShrinkRequest self = new ListTagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesShrinkRequest setResourceIdShrink(String resourceIdShrink) {
        this.resourceIdShrink = resourceIdShrink;
        return this;
    }
    public String getResourceIdShrink() {
        return this.resourceIdShrink;
    }

    public ListTagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}

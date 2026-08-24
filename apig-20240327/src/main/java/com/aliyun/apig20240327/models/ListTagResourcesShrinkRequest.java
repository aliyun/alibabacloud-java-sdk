// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListTagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The token for the next query start position.</p>
     * 
     * <strong>example:</strong>
     * <p>caeb235b-xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource ID. Up to 50 subkeys are supported. At least one of ResourceId and Tag must be provided. If both are empty, the API returns InvalidParameter.BothEmpty (400).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;gw-xxx&quot;,&quot;gw-yyy&quot;]</p>
     */
    @NameInMap("ResourceId")
    public String resourceIdShrink;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>Gateway</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The label list. Up to 20 subkeys are supported. At least one of ResourceId and Tag must be provided. If both are empty, the API returns InvalidParameter.BothEmpty (400).</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;prod&quot;}]</p>
     */
    @NameInMap("Tag")
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TagResource extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:****:functions/demo</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the resource type.</p>
     * <p>The function type in Function Compute 3.0 is ALIYUN::FC::FUNCTION, which is abbreviated as &quot;function&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>function</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("TagKey")
    public String tagKey;

    /**
     * <p>The tag value.</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("TagValue")
    public String tagValue;

    public static TagResource build(java.util.Map<String, ?> map) throws Exception {
        TagResource self = new TagResource();
        return TeaModel.build(map, self);
    }

    public TagResource setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public TagResource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResource setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public TagResource setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}

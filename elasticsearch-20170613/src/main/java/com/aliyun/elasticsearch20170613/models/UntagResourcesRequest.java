// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all tags. Default value: <strong>false</strong>. This parameter is valid only when <strong>TagKeys</strong> is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The list of resources to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;es-cn-09k1rocex0006****&quot;,&quot;es-cn-oew1rgiev0009****&quot;]</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The resource type. Set this to <strong>INSTANCE</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tags to delete. A maximum of 20 items can be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;tagKey1&quot;,&quot;tagKey2&quot;]</p>
     */
    @NameInMap("TagKeys")
    public String tagKeys;

    @NameInMap("body")
    public String body;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKeys(String tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public String getTagKeys() {
        return this.tagKeys;
    }

    public UntagResourcesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}

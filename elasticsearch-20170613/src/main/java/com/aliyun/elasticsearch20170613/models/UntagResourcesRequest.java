// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all parts. Default value: **false** . This parameter is valid only when **TagKeys** is not specified.</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The resource list that you want to delete.</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The type of the resource. Fixed to **INSTANCE** .</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tags that you want to delete. The list can contain up to 20 subitems.</p>
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

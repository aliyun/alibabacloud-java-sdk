// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RelatedResource extends TeaModel {
    @NameInMap("resourceId")
    public String resourceId;

    @NameInMap("resourceName")
    public String resourceName;

    @NameInMap("resourceType")
    public String resourceType;

    public static RelatedResource build(java.util.Map<String, ?> map) throws Exception {
        RelatedResource self = new RelatedResource();
        return TeaModel.build(map, self);
    }

    public RelatedResource setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public RelatedResource setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public RelatedResource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

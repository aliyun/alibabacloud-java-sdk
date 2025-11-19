// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RelatedWorkload extends TeaModel {
    @NameInMap("resourceId")
    public String resourceId;

    @NameInMap("resourceName")
    public String resourceName;

    @NameInMap("resourceType")
    public String resourceType;

    public static RelatedWorkload build(java.util.Map<String, ?> map) throws Exception {
        RelatedWorkload self = new RelatedWorkload();
        return TeaModel.build(map, self);
    }

    public RelatedWorkload setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public RelatedWorkload setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public RelatedWorkload setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

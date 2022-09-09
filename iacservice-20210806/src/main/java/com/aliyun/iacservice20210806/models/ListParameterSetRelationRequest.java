// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListParameterSetRelationRequest extends TeaModel {
    @NameInMap("resourceId")
    public String resourceId;

    @NameInMap("resourceType")
    public String resourceType;

    public static ListParameterSetRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListParameterSetRelationRequest self = new ListParameterSetRelationRequest();
        return TeaModel.build(map, self);
    }

    public ListParameterSetRelationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListParameterSetRelationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

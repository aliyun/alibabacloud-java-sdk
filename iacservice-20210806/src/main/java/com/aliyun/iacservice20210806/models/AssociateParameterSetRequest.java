// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateParameterSetRequest extends TeaModel {
    @NameInMap("parameterSetIds")
    public java.util.List<String> parameterSetIds;

    @NameInMap("resourceId")
    public String resourceId;

    @NameInMap("resourceType")
    public String resourceType;

    public static AssociateParameterSetRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateParameterSetRequest self = new AssociateParameterSetRequest();
        return TeaModel.build(map, self);
    }

    public AssociateParameterSetRequest setParameterSetIds(java.util.List<String> parameterSetIds) {
        this.parameterSetIds = parameterSetIds;
        return this;
    }
    public java.util.List<String> getParameterSetIds() {
        return this.parameterSetIds;
    }

    public AssociateParameterSetRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AssociateParameterSetRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

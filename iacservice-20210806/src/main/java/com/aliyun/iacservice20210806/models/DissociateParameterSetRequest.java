// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateParameterSetRequest extends TeaModel {
    @NameInMap("parameterSetIds")
    public java.util.List<String> parameterSetIds;

    @NameInMap("resourceId")
    public String resourceId;

    @NameInMap("resourceType")
    public String resourceType;

    public static DissociateParameterSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateParameterSetRequest self = new DissociateParameterSetRequest();
        return TeaModel.build(map, self);
    }

    public DissociateParameterSetRequest setParameterSetIds(java.util.List<String> parameterSetIds) {
        this.parameterSetIds = parameterSetIds;
        return this;
    }
    public java.util.List<String> getParameterSetIds() {
        return this.parameterSetIds;
    }

    public DissociateParameterSetRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DissociateParameterSetRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

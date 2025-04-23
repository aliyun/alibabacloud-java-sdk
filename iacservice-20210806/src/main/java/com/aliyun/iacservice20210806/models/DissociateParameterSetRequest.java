// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateParameterSetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("parameterSetIds")
    public java.util.List<String> parameterSetIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-39cd1e5e58c50e79dd8cd901cd</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Module</p>
     */
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

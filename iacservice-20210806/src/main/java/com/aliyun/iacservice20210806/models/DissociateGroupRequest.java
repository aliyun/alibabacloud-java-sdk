// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2daf4227f747cbf11a5501f18cc5e004</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <strong>example:</strong>
     * <p>Task</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static DissociateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateGroupRequest self = new DissociateGroupRequest();
        return TeaModel.build(map, self);
    }

    public DissociateGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DissociateGroupRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DissociateGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

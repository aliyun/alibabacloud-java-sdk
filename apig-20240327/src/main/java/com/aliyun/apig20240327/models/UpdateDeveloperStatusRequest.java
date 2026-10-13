// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateDeveloperStatusRequest extends TeaModel {
    /**
     * <p>The ID of the portal to which the developer belongs, which is the primary ID of the portal resource. You can obtain this ID from the portalId field in the CreatePortal response or from the portalId field of an item in the ListPortals response.</p>
     * 
     * <strong>example:</strong>
     * <p>portal-xxxxxxxx</p>
     */
    @NameInMap("portalId")
    public String portalId;

    /**
     * <p>The target status of the developer. Valid values: PENDING, APPROVED, and REJECTED.</p>
     * 
     * <strong>example:</strong>
     * <p>APPROVED</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateDeveloperStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeveloperStatusRequest self = new UpdateDeveloperStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeveloperStatusRequest setPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }
    public String getPortalId() {
        return this.portalId;
    }

    public UpdateDeveloperStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

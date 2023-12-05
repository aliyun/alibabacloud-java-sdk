// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class MTRSOCRServiceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ImageRaw")
    public String imageRaw;

    @NameInMap("Mask")
    public Boolean mask;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static MTRSOCRServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        MTRSOCRServiceRequest self = new MTRSOCRServiceRequest();
        return TeaModel.build(map, self);
    }

    public MTRSOCRServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MTRSOCRServiceRequest setImageRaw(String imageRaw) {
        this.imageRaw = imageRaw;
        return this;
    }
    public String getImageRaw() {
        return this.imageRaw;
    }

    public MTRSOCRServiceRequest setMask(Boolean mask) {
        this.mask = mask;
        return this;
    }
    public Boolean getMask() {
        return this.mask;
    }

    public MTRSOCRServiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MTRSOCRServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MTRSOCRServiceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

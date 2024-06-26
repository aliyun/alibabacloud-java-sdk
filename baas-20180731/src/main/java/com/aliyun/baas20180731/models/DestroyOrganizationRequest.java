// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DestroyOrganizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DestroyOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DestroyOrganizationRequest self = new DestroyOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public DestroyOrganizationRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

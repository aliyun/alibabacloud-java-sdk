// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class UpdatePidOrganizationRequest extends TeaModel {
    @NameInMap("OrganizationId")
    @Validation(required = true)
    public String organizationId;

    @NameInMap("OrganizationName")
    @Validation(required = true)
    public String organizationName;

    public static UpdatePidOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePidOrganizationRequest self = new UpdatePidOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePidOrganizationRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public UpdatePidOrganizationRequest setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

}

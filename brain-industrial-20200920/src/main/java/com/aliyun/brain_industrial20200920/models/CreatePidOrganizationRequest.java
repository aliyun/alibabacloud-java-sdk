// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePidOrganizationRequest extends TeaModel {
    @NameInMap("OrganizationName")
    @Validation(required = true)
    public String organizationName;

    @NameInMap("ParentOrganizationId")
    public String parentOrganizationId;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    public static CreatePidOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePidOrganizationRequest self = new CreatePidOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public CreatePidOrganizationRequest setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public CreatePidOrganizationRequest setParentOrganizationId(String parentOrganizationId) {
        this.parentOrganizationId = parentOrganizationId;
        return this;
    }
    public String getParentOrganizationId() {
        return this.parentOrganizationId;
    }

    public CreatePidOrganizationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

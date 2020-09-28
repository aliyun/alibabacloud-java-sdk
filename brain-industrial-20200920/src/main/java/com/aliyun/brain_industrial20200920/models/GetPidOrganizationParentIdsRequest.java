// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPidOrganizationParentIdsRequest extends TeaModel {
    @NameInMap("OrganizationId")
    @Validation(required = true)
    public String organizationId;

    public static GetPidOrganizationParentIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPidOrganizationParentIdsRequest self = new GetPidOrganizationParentIdsRequest();
        return TeaModel.build(map, self);
    }

    public GetPidOrganizationParentIdsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

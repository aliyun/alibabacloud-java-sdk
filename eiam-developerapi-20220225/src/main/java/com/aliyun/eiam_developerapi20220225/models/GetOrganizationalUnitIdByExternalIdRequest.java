// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitIdByExternalIdRequest extends TeaModel {
    // 机构外部ID
    @NameInMap("organizationalUnitExternalId")
    public String organizationalUnitExternalId;

    public static GetOrganizationalUnitIdByExternalIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationalUnitIdByExternalIdRequest self = new GetOrganizationalUnitIdByExternalIdRequest();
        return TeaModel.build(map, self);
    }

    public GetOrganizationalUnitIdByExternalIdRequest setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
        this.organizationalUnitExternalId = organizationalUnitExternalId;
        return this;
    }
    public String getOrganizationalUnitExternalId() {
        return this.organizationalUnitExternalId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitIdByExternalIdRequest extends TeaModel {
    @NameInMap("organizationalUnitExternalId")
    public String organizationalUnitExternalId;

    @NameInMap("organizationalUnitSourceId")
    public String organizationalUnitSourceId;

    @NameInMap("organizationalUnitSourceType")
    public String organizationalUnitSourceType;

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

    public GetOrganizationalUnitIdByExternalIdRequest setOrganizationalUnitSourceId(String organizationalUnitSourceId) {
        this.organizationalUnitSourceId = organizationalUnitSourceId;
        return this;
    }
    public String getOrganizationalUnitSourceId() {
        return this.organizationalUnitSourceId;
    }

    public GetOrganizationalUnitIdByExternalIdRequest setOrganizationalUnitSourceType(String organizationalUnitSourceType) {
        this.organizationalUnitSourceType = organizationalUnitSourceType;
        return this;
    }
    public String getOrganizationalUnitSourceType() {
        return this.organizationalUnitSourceType;
    }

}

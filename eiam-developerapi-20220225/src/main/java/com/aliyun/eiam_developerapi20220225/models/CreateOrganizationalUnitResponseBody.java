// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class CreateOrganizationalUnitResponseBody extends TeaModel {
    // 机构ID
    @NameInMap("organizationalUnitId")
    public String organizationalUnitId;

    public static CreateOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationalUnitResponseBody self = new CreateOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrganizationalUnitResponseBody setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

}

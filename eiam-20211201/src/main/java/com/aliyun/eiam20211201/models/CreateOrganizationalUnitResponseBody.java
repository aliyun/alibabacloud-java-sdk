// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    @NameInMap("RequestId")
    public String requestId;

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

    public CreateOrganizationalUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrganizationalUnitResponseBody self = new DeleteOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOrganizationalUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

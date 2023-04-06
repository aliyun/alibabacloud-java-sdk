// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateOrganizationalUnitDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOrganizationalUnitDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationalUnitDescriptionResponseBody self = new UpdateOrganizationalUnitDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationalUnitDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

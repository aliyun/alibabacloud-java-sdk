// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateOrganizationalUnitResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationalUnitResponseBody self = new UpdateOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationalUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

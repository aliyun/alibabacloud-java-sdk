// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeApplicationFromOrganizationalUnitsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeApplicationFromOrganizationalUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeApplicationFromOrganizationalUnitsResponseBody self = new RevokeApplicationFromOrganizationalUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeApplicationFromOrganizationalUnitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

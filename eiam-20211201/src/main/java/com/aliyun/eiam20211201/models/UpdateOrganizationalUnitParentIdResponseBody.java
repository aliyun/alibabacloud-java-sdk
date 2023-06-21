// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateOrganizationalUnitParentIdResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOrganizationalUnitParentIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationalUnitParentIdResponseBody self = new UpdateOrganizationalUnitParentIdResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationalUnitParentIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

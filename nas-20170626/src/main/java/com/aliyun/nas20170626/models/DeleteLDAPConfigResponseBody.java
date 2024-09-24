// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteLDAPConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5B4511A7-C99E-4071-AA8C-32E2529DA963</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLDAPConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDAPConfigResponseBody self = new DeleteLDAPConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLDAPConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

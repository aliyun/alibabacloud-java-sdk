// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLDAPConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5B4511A7-C99E-4071-AA8C-32E2529D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLDAPConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLDAPConfigResponseBody self = new CreateLDAPConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLDAPConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

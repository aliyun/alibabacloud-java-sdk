// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToGroupsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeApplicationToGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationToGroupsResponseBody self = new AuthorizeApplicationToGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationToGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

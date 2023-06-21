// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToUsersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeApplicationToUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationToUsersResponseBody self = new AuthorizeApplicationToUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationToUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateAuthorizationResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>arres_01kgh3jvt7pk093rv6giu0c0qxxxx</p>
     */
    @NameInMap("AuthorizationResourceId")
    public String authorizationResourceId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAuthorizationResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationResourceResponseBody self = new CreateAuthorizationResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationResourceResponseBody setAuthorizationResourceId(String authorizationResourceId) {
        this.authorizationResourceId = authorizationResourceId;
        return this;
    }
    public String getAuthorizationResourceId() {
        return this.authorizationResourceId;
    }

    public CreateAuthorizationResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

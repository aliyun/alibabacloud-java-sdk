// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateAuthorizationResponseBody extends TeaModel {
    @NameInMap("authorizationId")
    public String authorizationId;

    @NameInMap("requestId")
    public String requestId;

    public static CreateAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationResponseBody self = new CreateAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationResponseBody setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public String getAuthorizationId() {
        return this.authorizationId;
    }

    public CreateAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

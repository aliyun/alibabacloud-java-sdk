// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateAuthorizationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>auth-14e80de4866bf7171264a9b40661</p>
     */
    @NameInMap("authorizationId")
    public String authorizationId;

    /**
     * <strong>example:</strong>
     * <p>5FE84246-BB17-54BF-9F7A-F496270AC6DA</p>
     */
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

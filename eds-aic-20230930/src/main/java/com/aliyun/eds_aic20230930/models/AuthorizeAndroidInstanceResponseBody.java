// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class AuthorizeAndroidInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeAndroidInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAndroidInstanceResponseBody self = new AuthorizeAndroidInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeAndroidInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

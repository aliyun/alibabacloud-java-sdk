// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class AuthorizeAndroidInstanceResponseBody extends TeaModel {
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class VerifyIdTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserId")
    public String userId;

    public static VerifyIdTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyIdTokenResponseBody self = new VerifyIdTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyIdTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyIdTokenResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

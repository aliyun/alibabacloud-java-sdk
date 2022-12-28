// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class DisableAccessTokenResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DisableAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAccessTokenResponseBody self = new DisableAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

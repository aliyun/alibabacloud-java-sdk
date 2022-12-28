// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class EnableAccessTokenResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static EnableAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAccessTokenResponseBody self = new EnableAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

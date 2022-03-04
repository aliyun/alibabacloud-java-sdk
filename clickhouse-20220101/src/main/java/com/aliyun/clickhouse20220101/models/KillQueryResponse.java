// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class KillQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public KillQueryResponseBody body;

    public static KillQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        KillQueryResponse self = new KillQueryResponse();
        return TeaModel.build(map, self);
    }

    public KillQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillQueryResponse setBody(KillQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public KillQueryResponseBody getBody() {
        return this.body;
    }

}

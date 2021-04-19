// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class KillProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public KillProcessResponseBody body;

    public static KillProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        KillProcessResponse self = new KillProcessResponse();
        return TeaModel.build(map, self);
    }

    public KillProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillProcessResponse setBody(KillProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public KillProcessResponseBody getBody() {
        return this.body;
    }

}

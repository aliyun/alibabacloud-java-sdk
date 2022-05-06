// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class TsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TsResponseBody body;

    public static TsResponse build(java.util.Map<String, ?> map) throws Exception {
        TsResponse self = new TsResponse();
        return TeaModel.build(map, self);
    }

    public TsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TsResponse setBody(TsResponseBody body) {
        this.body = body;
        return this;
    }
    public TsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DelBimDrawingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DelBimDrawingResponseBody body;

    public static DelBimDrawingResponse build(java.util.Map<String, ?> map) throws Exception {
        DelBimDrawingResponse self = new DelBimDrawingResponse();
        return TeaModel.build(map, self);
    }

    public DelBimDrawingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelBimDrawingResponse setBody(DelBimDrawingResponseBody body) {
        this.body = body;
        return this;
    }
    public DelBimDrawingResponseBody getBody() {
        return this.body;
    }

}

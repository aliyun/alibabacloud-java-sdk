// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetEventMistakeDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEventMistakeDatasResponseBody body;

    public static GetEventMistakeDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventMistakeDatasResponse self = new GetEventMistakeDatasResponse();
        return TeaModel.build(map, self);
    }

    public GetEventMistakeDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventMistakeDatasResponse setBody(GetEventMistakeDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventMistakeDatasResponseBody getBody() {
        return this.body;
    }

}

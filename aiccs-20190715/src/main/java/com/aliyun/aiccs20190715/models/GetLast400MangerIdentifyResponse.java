// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class GetLast400MangerIdentifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLast400MangerIdentifyResponseBody body;

    public static GetLast400MangerIdentifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLast400MangerIdentifyResponse self = new GetLast400MangerIdentifyResponse();
        return TeaModel.build(map, self);
    }

    public GetLast400MangerIdentifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLast400MangerIdentifyResponse setBody(GetLast400MangerIdentifyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLast400MangerIdentifyResponseBody getBody() {
        return this.body;
    }

}

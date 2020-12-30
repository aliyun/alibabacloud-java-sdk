// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class GetMultimodeCmsUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMultimodeCmsUrlResponseBody body;

    public static GetMultimodeCmsUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultimodeCmsUrlResponse self = new GetMultimodeCmsUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetMultimodeCmsUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultimodeCmsUrlResponse setBody(GetMultimodeCmsUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultimodeCmsUrlResponseBody getBody() {
        return this.body;
    }

}

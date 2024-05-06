// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class GetMultimodeCmsUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetMultimodeCmsUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultimodeCmsUrlResponse setBody(GetMultimodeCmsUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultimodeCmsUrlResponseBody getBody() {
        return this.body;
    }

}

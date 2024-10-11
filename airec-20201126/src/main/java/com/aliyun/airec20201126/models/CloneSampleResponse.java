// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CloneSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneSampleResponseBody body;

    public static CloneSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneSampleResponse self = new CloneSampleResponse();
        return TeaModel.build(map, self);
    }

    public CloneSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneSampleResponse setBody(CloneSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneSampleResponseBody getBody() {
        return this.body;
    }

}

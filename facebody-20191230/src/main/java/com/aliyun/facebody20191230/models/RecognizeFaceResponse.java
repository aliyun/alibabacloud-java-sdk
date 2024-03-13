// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeFaceResponseBody body;

    public static RecognizeFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceResponse self = new RecognizeFaceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeFaceResponse setBody(RecognizeFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeFaceResponseBody getBody() {
        return this.body;
    }

}

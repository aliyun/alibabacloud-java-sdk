// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeActionResponseBody body;

    public static RecognizeActionResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeActionResponse self = new RecognizeActionResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeActionResponse setBody(RecognizeActionResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeActionResponseBody getBody() {
        return this.body;
    }

}

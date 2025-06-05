// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListRecognitionLibsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecognitionLibsResponseBody body;

    public static ListRecognitionLibsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecognitionLibsResponse self = new ListRecognitionLibsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecognitionLibsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecognitionLibsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecognitionLibsResponse setBody(ListRecognitionLibsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecognitionLibsResponseBody getBody() {
        return this.body;
    }

}

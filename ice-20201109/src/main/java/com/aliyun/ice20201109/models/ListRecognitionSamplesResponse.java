// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListRecognitionSamplesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecognitionSamplesResponseBody body;

    public static ListRecognitionSamplesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecognitionSamplesResponse self = new ListRecognitionSamplesResponse();
        return TeaModel.build(map, self);
    }

    public ListRecognitionSamplesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecognitionSamplesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecognitionSamplesResponse setBody(ListRecognitionSamplesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecognitionSamplesResponseBody getBody() {
        return this.body;
    }

}

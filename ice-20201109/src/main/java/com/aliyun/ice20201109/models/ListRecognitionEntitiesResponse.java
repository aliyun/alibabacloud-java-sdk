// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListRecognitionEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecognitionEntitiesResponseBody body;

    public static ListRecognitionEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecognitionEntitiesResponse self = new ListRecognitionEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListRecognitionEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecognitionEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecognitionEntitiesResponse setBody(ListRecognitionEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecognitionEntitiesResponseBody getBody() {
        return this.body;
    }

}

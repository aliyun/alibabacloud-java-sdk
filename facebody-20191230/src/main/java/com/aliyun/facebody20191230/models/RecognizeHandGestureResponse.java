// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeHandGestureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeHandGestureResponseBody body;

    public static RecognizeHandGestureResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHandGestureResponse self = new RecognizeHandGestureResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeHandGestureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeHandGestureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeHandGestureResponse setBody(RecognizeHandGestureResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeHandGestureResponseBody getBody() {
        return this.body;
    }

}

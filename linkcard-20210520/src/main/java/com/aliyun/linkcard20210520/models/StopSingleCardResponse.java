// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class StopSingleCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopSingleCardResponseBody body;

    public static StopSingleCardResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSingleCardResponse self = new StopSingleCardResponse();
        return TeaModel.build(map, self);
    }

    public StopSingleCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSingleCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopSingleCardResponse setBody(StopSingleCardResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSingleCardResponseBody getBody() {
        return this.body;
    }

}

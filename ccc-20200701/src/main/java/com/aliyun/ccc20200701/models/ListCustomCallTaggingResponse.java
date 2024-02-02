// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCustomCallTaggingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomCallTaggingResponseBody body;

    public static ListCustomCallTaggingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomCallTaggingResponse self = new ListCustomCallTaggingResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomCallTaggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomCallTaggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomCallTaggingResponse setBody(ListCustomCallTaggingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDetectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDetectionsResponseBody body;

    public static ListDetectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionsResponse self = new ListDetectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDetectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDetectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDetectionsResponse setBody(ListDetectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDetectionsResponseBody getBody() {
        return this.body;
    }

}

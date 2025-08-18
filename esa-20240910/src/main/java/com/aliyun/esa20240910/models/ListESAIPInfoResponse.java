// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListESAIPInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListESAIPInfoResponseBody body;

    public static ListESAIPInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListESAIPInfoResponse self = new ListESAIPInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListESAIPInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListESAIPInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListESAIPInfoResponse setBody(ListESAIPInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListESAIPInfoResponseBody getBody() {
        return this.body;
    }

}

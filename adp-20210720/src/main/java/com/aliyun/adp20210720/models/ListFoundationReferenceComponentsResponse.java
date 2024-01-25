// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListFoundationReferenceComponentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFoundationReferenceComponentsResponseBody body;

    public static ListFoundationReferenceComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationReferenceComponentsResponse self = new ListFoundationReferenceComponentsResponse();
        return TeaModel.build(map, self);
    }

    public ListFoundationReferenceComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFoundationReferenceComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFoundationReferenceComponentsResponse setBody(ListFoundationReferenceComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFoundationReferenceComponentsResponseBody getBody() {
        return this.body;
    }

}

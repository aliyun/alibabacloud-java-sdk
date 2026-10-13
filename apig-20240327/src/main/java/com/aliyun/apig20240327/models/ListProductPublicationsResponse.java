// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductPublicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductPublicationsResponseBody body;

    public static ListProductPublicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductPublicationsResponse self = new ListProductPublicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductPublicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductPublicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductPublicationsResponse setBody(ListProductPublicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductPublicationsResponseBody getBody() {
        return this.body;
    }

}

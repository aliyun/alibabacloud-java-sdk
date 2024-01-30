// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorityResponseBody body;

    public static ListAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorityResponse self = new ListAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorityResponse setBody(ListAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorityResponseBody getBody() {
        return this.body;
    }

}

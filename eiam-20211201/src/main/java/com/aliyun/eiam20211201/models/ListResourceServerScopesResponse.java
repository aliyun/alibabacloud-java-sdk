// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListResourceServerScopesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceServerScopesResponseBody body;

    public static ListResourceServerScopesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceServerScopesResponse self = new ListResourceServerScopesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceServerScopesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceServerScopesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceServerScopesResponse setBody(ListResourceServerScopesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceServerScopesResponseBody getBody() {
        return this.body;
    }

}

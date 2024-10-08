// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSitesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSitesResponseBody body;

    public static ListSitesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSitesResponse self = new ListSitesResponse();
        return TeaModel.build(map, self);
    }

    public ListSitesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSitesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSitesResponse setBody(ListSitesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSitesResponseBody getBody() {
        return this.body;
    }

}

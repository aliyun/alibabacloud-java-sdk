// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSiteFunctionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSiteFunctionsResponseBody body;

    public static ListSiteFunctionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSiteFunctionsResponse self = new ListSiteFunctionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSiteFunctionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSiteFunctionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSiteFunctionsResponse setBody(ListSiteFunctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSiteFunctionsResponseBody getBody() {
        return this.body;
    }

}

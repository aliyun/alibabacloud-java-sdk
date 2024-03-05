// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListDocsGroupByYearResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDocsGroupByYearResponseBody body;

    public static ListDocsGroupByYearResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDocsGroupByYearResponse self = new ListDocsGroupByYearResponse();
        return TeaModel.build(map, self);
    }

    public ListDocsGroupByYearResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDocsGroupByYearResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDocsGroupByYearResponse setBody(ListDocsGroupByYearResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDocsGroupByYearResponseBody getBody() {
        return this.body;
    }

}

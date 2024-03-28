// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBusiRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBusiRegionsResponseBody body;

    public static ListBusiRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusiRegionsResponse self = new ListBusiRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListBusiRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBusiRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBusiRegionsResponse setBody(ListBusiRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBusiRegionsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAvailableBusiRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableBusiRegionsResponseBody body;

    public static ListAvailableBusiRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableBusiRegionsResponse self = new ListAvailableBusiRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableBusiRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableBusiRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableBusiRegionsResponse setBody(ListAvailableBusiRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableBusiRegionsResponseBody getBody() {
        return this.body;
    }

}

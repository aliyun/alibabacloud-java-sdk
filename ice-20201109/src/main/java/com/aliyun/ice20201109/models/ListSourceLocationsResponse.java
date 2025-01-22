// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSourceLocationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSourceLocationsResponseBody body;

    public static ListSourceLocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSourceLocationsResponse self = new ListSourceLocationsResponse();
        return TeaModel.build(map, self);
    }

    public ListSourceLocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSourceLocationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSourceLocationsResponse setBody(ListSourceLocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSourceLocationsResponseBody getBody() {
        return this.body;
    }

}

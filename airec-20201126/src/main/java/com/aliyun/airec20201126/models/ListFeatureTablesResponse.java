// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFeatureTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFeatureTablesResponseBody body;

    public static ListFeatureTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureTablesResponse self = new ListFeatureTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListFeatureTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeatureTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeatureTablesResponse setBody(ListFeatureTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeatureTablesResponseBody getBody() {
        return this.body;
    }

}

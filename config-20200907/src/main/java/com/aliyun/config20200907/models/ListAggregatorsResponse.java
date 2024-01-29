// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregatorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAggregatorsResponseBody body;

    public static ListAggregatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregatorsResponse self = new ListAggregatorsResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregatorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregatorsResponse setBody(ListAggregatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregatorsResponseBody getBody() {
        return this.body;
    }

}

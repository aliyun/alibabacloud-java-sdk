// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListUnassignedNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUnassignedNumbersResponseBody body;

    public static ListUnassignedNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnassignedNumbersResponse self = new ListUnassignedNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ListUnassignedNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnassignedNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUnassignedNumbersResponse setBody(ListUnassignedNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnassignedNumbersResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListConnectorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConnectorsResponseBody body;

    public static ListConnectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsResponse self = new ListConnectorsResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnectorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConnectorsResponse setBody(ListConnectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnectorsResponseBody getBody() {
        return this.body;
    }

}

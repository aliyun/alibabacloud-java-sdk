// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListOpenSourcePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOpenSourcePermissionsResponseBody body;

    public static ListOpenSourcePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpenSourcePermissionsResponse self = new ListOpenSourcePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListOpenSourcePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOpenSourcePermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOpenSourcePermissionsResponse setBody(ListOpenSourcePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpenSourcePermissionsResponseBody getBody() {
        return this.body;
    }

}

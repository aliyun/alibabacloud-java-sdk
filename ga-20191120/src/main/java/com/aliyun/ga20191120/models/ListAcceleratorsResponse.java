// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAcceleratorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAcceleratorsResponseBody body;

    public static ListAcceleratorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAcceleratorsResponse self = new ListAcceleratorsResponse();
        return TeaModel.build(map, self);
    }

    public ListAcceleratorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAcceleratorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAcceleratorsResponse setBody(ListAcceleratorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAcceleratorsResponseBody getBody() {
        return this.body;
    }

}

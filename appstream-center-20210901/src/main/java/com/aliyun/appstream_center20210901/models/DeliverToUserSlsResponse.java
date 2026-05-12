// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeliverToUserSlsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeliverToUserSlsResponseBody body;

    public static DeliverToUserSlsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeliverToUserSlsResponse self = new DeliverToUserSlsResponse();
        return TeaModel.build(map, self);
    }

    public DeliverToUserSlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeliverToUserSlsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeliverToUserSlsResponse setBody(DeliverToUserSlsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeliverToUserSlsResponseBody getBody() {
        return this.body;
    }

}

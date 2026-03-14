// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GrayPublishResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrayPublishResponseBody body;

    public static GrayPublishResponse build(java.util.Map<String, ?> map) throws Exception {
        GrayPublishResponse self = new GrayPublishResponse();
        return TeaModel.build(map, self);
    }

    public GrayPublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrayPublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrayPublishResponse setBody(GrayPublishResponseBody body) {
        this.body = body;
        return this;
    }
    public GrayPublishResponseBody getBody() {
        return this.body;
    }

}

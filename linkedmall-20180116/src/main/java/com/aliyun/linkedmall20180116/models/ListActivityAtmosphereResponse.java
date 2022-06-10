// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListActivityAtmosphereResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListActivityAtmosphereResponseBody body;

    public static ListActivityAtmosphereResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActivityAtmosphereResponse self = new ListActivityAtmosphereResponse();
        return TeaModel.build(map, self);
    }

    public ListActivityAtmosphereResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActivityAtmosphereResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActivityAtmosphereResponse setBody(ListActivityAtmosphereResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActivityAtmosphereResponseBody getBody() {
        return this.body;
    }

}

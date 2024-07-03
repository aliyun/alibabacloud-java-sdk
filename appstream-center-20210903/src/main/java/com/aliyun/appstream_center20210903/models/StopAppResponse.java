// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class StopAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAppResponseBody body;

    public static StopAppResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAppResponse self = new StopAppResponse();
        return TeaModel.build(map, self);
    }

    public StopAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAppResponse setBody(StopAppResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAppResponseBody getBody() {
        return this.body;
    }

}

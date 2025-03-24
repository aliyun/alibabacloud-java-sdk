// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class StopAppResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAppResourcesResponseBody body;

    public static StopAppResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAppResourcesResponse self = new StopAppResourcesResponse();
        return TeaModel.build(map, self);
    }

    public StopAppResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAppResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAppResourcesResponse setBody(StopAppResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAppResourcesResponseBody getBody() {
        return this.body;
    }

}

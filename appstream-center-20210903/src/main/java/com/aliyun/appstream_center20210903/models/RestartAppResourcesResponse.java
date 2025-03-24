// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class RestartAppResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartAppResourcesResponseBody body;

    public static RestartAppResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartAppResourcesResponse self = new RestartAppResourcesResponse();
        return TeaModel.build(map, self);
    }

    public RestartAppResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartAppResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartAppResourcesResponse setBody(RestartAppResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartAppResourcesResponseBody getBody() {
        return this.body;
    }

}

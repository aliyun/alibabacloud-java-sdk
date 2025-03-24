// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class StartAppResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAppResourcesResponseBody body;

    public static StartAppResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAppResourcesResponse self = new StartAppResourcesResponse();
        return TeaModel.build(map, self);
    }

    public StartAppResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAppResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAppResourcesResponse setBody(StartAppResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAppResourcesResponseBody getBody() {
        return this.body;
    }

}

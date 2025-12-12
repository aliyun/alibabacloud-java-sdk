// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class RestartInstanceNodeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartInstanceNodeListResponseBody body;

    public static RestartInstanceNodeListResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartInstanceNodeListResponse self = new RestartInstanceNodeListResponse();
        return TeaModel.build(map, self);
    }

    public RestartInstanceNodeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartInstanceNodeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartInstanceNodeListResponse setBody(RestartInstanceNodeListResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartInstanceNodeListResponseBody getBody() {
        return this.body;
    }

}

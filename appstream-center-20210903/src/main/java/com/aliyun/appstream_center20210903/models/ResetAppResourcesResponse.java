// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ResetAppResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAppResourcesResponseBody body;

    public static ResetAppResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAppResourcesResponse self = new ResetAppResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ResetAppResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAppResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAppResourcesResponse setBody(ResetAppResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAppResourcesResponseBody getBody() {
        return this.body;
    }

}

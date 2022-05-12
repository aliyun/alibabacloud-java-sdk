// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ReloadResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReloadResourcesResponseBody body;

    public static ReloadResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReloadResourcesResponse self = new ReloadResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ReloadResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReloadResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReloadResourcesResponse setBody(ReloadResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReloadResourcesResponseBody getBody() {
        return this.body;
    }

}

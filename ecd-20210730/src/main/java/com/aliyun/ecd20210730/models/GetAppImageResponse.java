// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppImageResponseBody body;

    public static GetAppImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppImageResponse self = new GetAppImageResponse();
        return TeaModel.build(map, self);
    }

    public GetAppImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppImageResponse setBody(GetAppImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppImageResponseBody getBody() {
        return this.body;
    }

}

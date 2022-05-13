// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetApplicationListResponseBody body;

    public static GetApplicationListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationListResponse self = new GetApplicationListResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationListResponse setBody(GetApplicationListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationListResponseBody getBody() {
        return this.body;
    }

}

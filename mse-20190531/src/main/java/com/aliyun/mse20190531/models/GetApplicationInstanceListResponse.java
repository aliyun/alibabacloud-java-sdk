// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetApplicationInstanceListResponseBody body;

    public static GetApplicationInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationInstanceListResponse self = new GetApplicationInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationInstanceListResponse setBody(GetApplicationInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationInstanceListResponseBody getBody() {
        return this.body;
    }

}

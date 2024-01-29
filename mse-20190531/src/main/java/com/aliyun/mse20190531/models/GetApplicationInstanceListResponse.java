// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

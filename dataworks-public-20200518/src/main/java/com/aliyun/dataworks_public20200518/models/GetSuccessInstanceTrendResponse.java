// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSuccessInstanceTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSuccessInstanceTrendResponseBody body;

    public static GetSuccessInstanceTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSuccessInstanceTrendResponse self = new GetSuccessInstanceTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetSuccessInstanceTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSuccessInstanceTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSuccessInstanceTrendResponse setBody(GetSuccessInstanceTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSuccessInstanceTrendResponseBody getBody() {
        return this.body;
    }

}

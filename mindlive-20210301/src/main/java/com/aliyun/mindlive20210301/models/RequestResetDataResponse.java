// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestResetDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestResetDataResponseBody body;

    public static RequestResetDataResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestResetDataResponse self = new RequestResetDataResponse();
        return TeaModel.build(map, self);
    }

    public RequestResetDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestResetDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestResetDataResponse setBody(RequestResetDataResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestResetDataResponseBody getBody() {
        return this.body;
    }

}

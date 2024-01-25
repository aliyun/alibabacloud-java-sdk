// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestAuthorizationDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestAuthorizationDataResponseBody body;

    public static RequestAuthorizationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestAuthorizationDataResponse self = new RequestAuthorizationDataResponse();
        return TeaModel.build(map, self);
    }

    public RequestAuthorizationDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestAuthorizationDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestAuthorizationDataResponse setBody(RequestAuthorizationDataResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestAuthorizationDataResponseBody getBody() {
        return this.body;
    }

}

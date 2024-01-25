// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestBindDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestBindDataResponseBody body;

    public static RequestBindDataResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestBindDataResponse self = new RequestBindDataResponse();
        return TeaModel.build(map, self);
    }

    public RequestBindDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestBindDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestBindDataResponse setBody(RequestBindDataResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestBindDataResponseBody getBody() {
        return this.body;
    }

}

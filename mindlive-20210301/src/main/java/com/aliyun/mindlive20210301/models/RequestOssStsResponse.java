// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestOssStsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestOssStsResponseBody body;

    public static RequestOssStsResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestOssStsResponse self = new RequestOssStsResponse();
        return TeaModel.build(map, self);
    }

    public RequestOssStsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestOssStsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestOssStsResponse setBody(RequestOssStsResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestOssStsResponseBody getBody() {
        return this.body;
    }

}

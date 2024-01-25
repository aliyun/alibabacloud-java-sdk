// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestUserConfigResponseBody body;

    public static RequestUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestUserConfigResponse self = new RequestUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public RequestUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestUserConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestUserConfigResponse setBody(RequestUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestUserConfigResponseBody getBody() {
        return this.body;
    }

}

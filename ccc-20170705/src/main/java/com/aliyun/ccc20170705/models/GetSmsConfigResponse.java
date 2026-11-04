// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetSmsConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmsConfigResponseBody body;

    public static GetSmsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmsConfigResponse self = new GetSmsConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetSmsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmsConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmsConfigResponse setBody(GetSmsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmsConfigResponseBody getBody() {
        return this.body;
    }

}

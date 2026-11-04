// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetUserByExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserByExtensionResponseBody body;

    public static GetUserByExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserByExtensionResponse self = new GetUserByExtensionResponse();
        return TeaModel.build(map, self);
    }

    public GetUserByExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserByExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserByExtensionResponse setBody(GetUserByExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserByExtensionResponseBody getBody() {
        return this.body;
    }

}

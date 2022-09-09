// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetModuleVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetModuleVersionResponseBody body;

    public static GetModuleVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModuleVersionResponse self = new GetModuleVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetModuleVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModuleVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModuleVersionResponse setBody(GetModuleVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModuleVersionResponseBody getBody() {
        return this.body;
    }

}

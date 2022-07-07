// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetMallConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMallConfigResponseBody body;

    public static GetMallConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMallConfigResponse self = new GetMallConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetMallConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMallConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMallConfigResponse setBody(GetMallConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMallConfigResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetSmsCodeLimitConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmsCodeLimitConfigResponseBody body;

    public static GetSmsCodeLimitConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmsCodeLimitConfigResponse self = new GetSmsCodeLimitConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetSmsCodeLimitConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmsCodeLimitConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmsCodeLimitConfigResponse setBody(GetSmsCodeLimitConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmsCodeLimitConfigResponseBody getBody() {
        return this.body;
    }

}

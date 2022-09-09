// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetModuleMarketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetModuleMarketResponseBody body;

    public static GetModuleMarketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModuleMarketResponse self = new GetModuleMarketResponse();
        return TeaModel.build(map, self);
    }

    public GetModuleMarketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModuleMarketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModuleMarketResponse setBody(GetModuleMarketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModuleMarketResponseBody getBody() {
        return this.body;
    }

}

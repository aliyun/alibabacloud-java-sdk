// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetRumSymbolFileParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRumSymbolFileParamsResponseBody body;

    public static GetRumSymbolFileParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRumSymbolFileParamsResponse self = new GetRumSymbolFileParamsResponse();
        return TeaModel.build(map, self);
    }

    public GetRumSymbolFileParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRumSymbolFileParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRumSymbolFileParamsResponse setBody(GetRumSymbolFileParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRumSymbolFileParamsResponseBody getBody() {
        return this.body;
    }

}

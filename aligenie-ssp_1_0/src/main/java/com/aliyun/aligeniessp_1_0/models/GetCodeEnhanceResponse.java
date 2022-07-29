// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCodeEnhanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCodeEnhanceResponseBody body;

    public static GetCodeEnhanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCodeEnhanceResponse self = new GetCodeEnhanceResponse();
        return TeaModel.build(map, self);
    }

    public GetCodeEnhanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCodeEnhanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCodeEnhanceResponse setBody(GetCodeEnhanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCodeEnhanceResponseBody getBody() {
        return this.body;
    }

}

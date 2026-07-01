// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetRCSSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRCSSignatureResponseBody body;

    public static GetRCSSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRCSSignatureResponse self = new GetRCSSignatureResponse();
        return TeaModel.build(map, self);
    }

    public GetRCSSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRCSSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRCSSignatureResponse setBody(GetRCSSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRCSSignatureResponseBody getBody() {
        return this.body;
    }

}

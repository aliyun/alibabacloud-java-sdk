// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCallMediaTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCallMediaTypeResponseBody body;

    public static GetCallMediaTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallMediaTypeResponse self = new GetCallMediaTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetCallMediaTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallMediaTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCallMediaTypeResponse setBody(GetCallMediaTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallMediaTypeResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetVccResponseBody body;

    public static GetVccResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVccResponse self = new GetVccResponse();
        return TeaModel.build(map, self);
    }

    public GetVccResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVccResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVccResponse setBody(GetVccResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVccResponseBody getBody() {
        return this.body;
    }

}

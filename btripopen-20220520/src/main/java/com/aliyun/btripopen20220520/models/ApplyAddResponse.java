// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyAddResponseBody body;

    public static ApplyAddResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAddResponse self = new ApplyAddResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyAddResponse setBody(ApplyAddResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAddResponseBody getBody() {
        return this.body;
    }

}

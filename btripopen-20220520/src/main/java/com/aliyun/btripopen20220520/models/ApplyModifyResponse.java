// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyModifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyModifyResponseBody body;

    public static ApplyModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyModifyResponse self = new ApplyModifyResponse();
        return TeaModel.build(map, self);
    }

    public ApplyModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyModifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyModifyResponse setBody(ApplyModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyModifyResponseBody getBody() {
        return this.body;
    }

}

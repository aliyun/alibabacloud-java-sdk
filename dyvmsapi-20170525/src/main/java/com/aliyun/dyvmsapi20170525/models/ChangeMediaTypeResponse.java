// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ChangeMediaTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeMediaTypeResponseBody body;

    public static ChangeMediaTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeMediaTypeResponse self = new ChangeMediaTypeResponse();
        return TeaModel.build(map, self);
    }

    public ChangeMediaTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeMediaTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeMediaTypeResponse setBody(ChangeMediaTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeMediaTypeResponseBody getBody() {
        return this.body;
    }

}

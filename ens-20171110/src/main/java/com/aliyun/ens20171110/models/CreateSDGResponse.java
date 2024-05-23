// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSDGResponseBody body;

    public static CreateSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSDGResponse self = new CreateSDGResponse();
        return TeaModel.build(map, self);
    }

    public CreateSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSDGResponse setBody(CreateSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSDGResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEipInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEipInstanceResponseBody body;

    public static CreateEipInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEipInstanceResponse self = new CreateEipInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEipInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEipInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEipInstanceResponse setBody(CreateEipInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEipInstanceResponseBody getBody() {
        return this.body;
    }

}

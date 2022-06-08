// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProxyResponseBody body;

    public static CreateProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProxyResponse self = new CreateProxyResponse();
        return TeaModel.build(map, self);
    }

    public CreateProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProxyResponse setBody(CreateProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProxyResponseBody getBody() {
        return this.body;
    }

}

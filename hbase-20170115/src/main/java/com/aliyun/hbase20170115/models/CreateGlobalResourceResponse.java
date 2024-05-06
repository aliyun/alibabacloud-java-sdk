// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CreateGlobalResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGlobalResourceResponseBody body;

    public static CreateGlobalResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalResourceResponse self = new CreateGlobalResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGlobalResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGlobalResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGlobalResourceResponse setBody(CreateGlobalResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGlobalResourceResponseBody getBody() {
        return this.body;
    }

}

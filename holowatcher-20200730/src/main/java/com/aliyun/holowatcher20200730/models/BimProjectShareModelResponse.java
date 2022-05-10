// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimProjectShareModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BimProjectShareModelResponseBody body;

    public static BimProjectShareModelResponse build(java.util.Map<String, ?> map) throws Exception {
        BimProjectShareModelResponse self = new BimProjectShareModelResponse();
        return TeaModel.build(map, self);
    }

    public BimProjectShareModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimProjectShareModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BimProjectShareModelResponse setBody(BimProjectShareModelResponseBody body) {
        this.body = body;
        return this;
    }
    public BimProjectShareModelResponseBody getBody() {
        return this.body;
    }

}

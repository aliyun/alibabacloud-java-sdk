// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAlgorithmResponseBody body;

    public static AddAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAlgorithmResponse self = new AddAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public AddAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAlgorithmResponse setBody(AddAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAlgorithmResponseBody getBody() {
        return this.body;
    }

}

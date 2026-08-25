// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSoftwarelibDistributeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSoftwarelibDistributeTaskResponseBody body;

    public static CreateSoftwarelibDistributeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSoftwarelibDistributeTaskResponse self = new CreateSoftwarelibDistributeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSoftwarelibDistributeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSoftwarelibDistributeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSoftwarelibDistributeTaskResponse setBody(CreateSoftwarelibDistributeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSoftwarelibDistributeTaskResponseBody getBody() {
        return this.body;
    }

}

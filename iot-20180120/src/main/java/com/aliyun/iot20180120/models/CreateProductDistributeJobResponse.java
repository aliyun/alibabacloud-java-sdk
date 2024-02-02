// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductDistributeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProductDistributeJobResponseBody body;

    public static CreateProductDistributeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductDistributeJobResponse self = new CreateProductDistributeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductDistributeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductDistributeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductDistributeJobResponse setBody(CreateProductDistributeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductDistributeJobResponseBody getBody() {
        return this.body;
    }

}

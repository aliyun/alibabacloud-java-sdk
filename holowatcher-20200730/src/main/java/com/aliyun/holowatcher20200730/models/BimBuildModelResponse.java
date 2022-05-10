// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimBuildModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BimBuildModelResponseBody body;

    public static BimBuildModelResponse build(java.util.Map<String, ?> map) throws Exception {
        BimBuildModelResponse self = new BimBuildModelResponse();
        return TeaModel.build(map, self);
    }

    public BimBuildModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimBuildModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BimBuildModelResponse setBody(BimBuildModelResponseBody body) {
        this.body = body;
        return this;
    }
    public BimBuildModelResponseBody getBody() {
        return this.body;
    }

}

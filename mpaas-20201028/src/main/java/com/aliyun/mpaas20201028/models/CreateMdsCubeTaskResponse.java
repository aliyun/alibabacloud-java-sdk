// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsCubeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMdsCubeTaskResponseBody body;

    public static CreateMdsCubeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsCubeTaskResponse self = new CreateMdsCubeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMdsCubeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMdsCubeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMdsCubeTaskResponse setBody(CreateMdsCubeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMdsCubeTaskResponseBody getBody() {
        return this.body;
    }

}

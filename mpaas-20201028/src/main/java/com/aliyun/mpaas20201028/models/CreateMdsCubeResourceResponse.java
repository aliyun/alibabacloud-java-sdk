// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsCubeResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMdsCubeResourceResponseBody body;

    public static CreateMdsCubeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsCubeResourceResponse self = new CreateMdsCubeResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateMdsCubeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMdsCubeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMdsCubeResourceResponse setBody(CreateMdsCubeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMdsCubeResourceResponseBody getBody() {
        return this.body;
    }

}

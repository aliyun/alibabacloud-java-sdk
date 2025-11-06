// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsCubeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMdsCubeTemplateResponseBody body;

    public static CreateMdsCubeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsCubeTemplateResponse self = new CreateMdsCubeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateMdsCubeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMdsCubeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMdsCubeTemplateResponse setBody(CreateMdsCubeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMdsCubeTemplateResponseBody getBody() {
        return this.body;
    }

}

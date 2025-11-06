// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMdsCubeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMdsCubeTemplateResponseBody body;

    public static DeleteMdsCubeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMdsCubeTemplateResponse self = new DeleteMdsCubeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMdsCubeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMdsCubeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMdsCubeTemplateResponse setBody(DeleteMdsCubeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMdsCubeTemplateResponseBody getBody() {
        return this.body;
    }

}

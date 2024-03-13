// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceImageTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaceImageTemplateResponseBody body;

    public static DeleteFaceImageTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceImageTemplateResponse self = new DeleteFaceImageTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceImageTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceImageTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceImageTemplateResponse setBody(DeleteFaceImageTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceImageTemplateResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceImageTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteFaceImageTemplateResponse setBody(DeleteFaceImageTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceImageTemplateResponseBody getBody() {
        return this.body;
    }

}

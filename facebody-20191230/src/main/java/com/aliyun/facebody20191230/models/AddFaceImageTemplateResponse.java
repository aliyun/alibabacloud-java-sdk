// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceImageTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFaceImageTemplateResponseBody body;

    public static AddFaceImageTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceImageTemplateResponse self = new AddFaceImageTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceImageTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceImageTemplateResponse setBody(AddFaceImageTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceImageTemplateResponseBody getBody() {
        return this.body;
    }

}

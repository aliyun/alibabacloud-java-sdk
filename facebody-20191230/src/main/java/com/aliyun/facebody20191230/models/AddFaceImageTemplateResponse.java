// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceImageTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddFaceImageTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFaceImageTemplateResponse setBody(AddFaceImageTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceImageTemplateResponseBody getBody() {
        return this.body;
    }

}

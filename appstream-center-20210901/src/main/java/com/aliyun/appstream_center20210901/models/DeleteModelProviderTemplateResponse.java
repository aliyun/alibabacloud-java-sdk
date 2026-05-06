// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteModelProviderTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelProviderTemplateResponseBody body;

    public static DeleteModelProviderTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelProviderTemplateResponse self = new DeleteModelProviderTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelProviderTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelProviderTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelProviderTemplateResponse setBody(DeleteModelProviderTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelProviderTemplateResponseBody getBody() {
        return this.body;
    }

}

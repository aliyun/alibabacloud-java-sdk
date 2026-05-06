// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelTemplateResponseBody body;

    public static DeleteModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelTemplateResponse self = new DeleteModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelTemplateResponse setBody(DeleteModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelTemplateResponseBody getBody() {
        return this.body;
    }

}

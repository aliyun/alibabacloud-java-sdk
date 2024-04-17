// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeleteApiTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApiTemplateResponseBody body;

    public static DeleteApiTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiTemplateResponse self = new DeleteApiTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApiTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApiTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApiTemplateResponse setBody(DeleteApiTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApiTemplateResponseBody getBody() {
        return this.body;
    }

}

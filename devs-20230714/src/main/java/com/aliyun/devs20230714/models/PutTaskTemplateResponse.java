// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutTaskTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TaskTemplate body;

    public static PutTaskTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        PutTaskTemplateResponse self = new PutTaskTemplateResponse();
        return TeaModel.build(map, self);
    }

    public PutTaskTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutTaskTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutTaskTemplateResponse setBody(TaskTemplate body) {
        this.body = body;
        return this;
    }
    public TaskTemplate getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GetTaskTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TaskTemplate body;

    public static GetTaskTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskTemplateResponse self = new GetTaskTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskTemplateResponse setBody(TaskTemplate body) {
        this.body = body;
        return this;
    }
    public TaskTemplate getBody() {
        return this.body;
    }

}

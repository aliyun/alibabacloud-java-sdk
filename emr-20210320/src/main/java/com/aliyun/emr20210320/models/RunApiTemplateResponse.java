// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunApiTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunApiTemplateResponseBody body;

    public static RunApiTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        RunApiTemplateResponse self = new RunApiTemplateResponse();
        return TeaModel.build(map, self);
    }

    public RunApiTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunApiTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunApiTemplateResponse setBody(RunApiTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public RunApiTemplateResponseBody getBody() {
        return this.body;
    }

}

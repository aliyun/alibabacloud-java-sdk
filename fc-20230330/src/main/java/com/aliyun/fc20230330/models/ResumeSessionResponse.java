// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ResumeSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Session body;

    public static ResumeSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeSessionResponse self = new ResumeSessionResponse();
        return TeaModel.build(map, self);
    }

    public ResumeSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeSessionResponse setBody(Session body) {
        this.body = body;
        return this;
    }
    public Session getBody() {
        return this.body;
    }

}

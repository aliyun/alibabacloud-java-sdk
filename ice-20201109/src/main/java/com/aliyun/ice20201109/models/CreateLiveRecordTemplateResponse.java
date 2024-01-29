// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLiveRecordTemplateResponseBody body;

    public static CreateLiveRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRecordTemplateResponse self = new CreateLiveRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveRecordTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveRecordTemplateResponse setBody(CreateLiveRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveRecordTemplateResponseBody getBody() {
        return this.body;
    }

}

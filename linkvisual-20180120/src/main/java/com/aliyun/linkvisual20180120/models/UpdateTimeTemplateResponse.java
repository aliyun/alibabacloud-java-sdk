// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateTimeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTimeTemplateResponseBody body;

    public static UpdateTimeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTimeTemplateResponse self = new UpdateTimeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTimeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTimeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTimeTemplateResponse setBody(UpdateTimeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTimeTemplateResponseBody getBody() {
        return this.body;
    }

}

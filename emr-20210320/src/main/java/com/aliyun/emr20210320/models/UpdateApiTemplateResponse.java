// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApiTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApiTemplateResponseBody body;

    public static UpdateApiTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiTemplateResponse self = new UpdateApiTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApiTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApiTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApiTemplateResponse setBody(UpdateApiTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApiTemplateResponseBody getBody() {
        return this.body;
    }

}

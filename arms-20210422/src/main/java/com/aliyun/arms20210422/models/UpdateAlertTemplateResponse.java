// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class UpdateAlertTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertTemplateResponseBody body;

    public static UpdateAlertTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertTemplateResponse self = new UpdateAlertTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertTemplateResponse setBody(UpdateAlertTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertTemplateResponseBody getBody() {
        return this.body;
    }

}

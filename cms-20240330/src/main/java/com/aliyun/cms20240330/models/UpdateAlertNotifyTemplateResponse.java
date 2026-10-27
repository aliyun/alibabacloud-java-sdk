// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAlertNotifyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertNotifyTemplateResponseBody body;

    public static UpdateAlertNotifyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertNotifyTemplateResponse self = new UpdateAlertNotifyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertNotifyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertNotifyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertNotifyTemplateResponse setBody(UpdateAlertNotifyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertNotifyTemplateResponseBody getBody() {
        return this.body;
    }

}

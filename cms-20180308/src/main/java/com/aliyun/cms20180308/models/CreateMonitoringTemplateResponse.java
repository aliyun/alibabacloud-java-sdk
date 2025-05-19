// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class CreateMonitoringTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMonitoringTemplateResponseBody body;

    public static CreateMonitoringTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitoringTemplateResponse self = new CreateMonitoringTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitoringTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitoringTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitoringTemplateResponse setBody(CreateMonitoringTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitoringTemplateResponseBody getBody() {
        return this.body;
    }

}

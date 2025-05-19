// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetMonitoringTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMonitoringTemplateResponseBody body;

    public static GetMonitoringTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonitoringTemplateResponse self = new GetMonitoringTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetMonitoringTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonitoringTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMonitoringTemplateResponse setBody(GetMonitoringTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMonitoringTemplateResponseBody getBody() {
        return this.body;
    }

}

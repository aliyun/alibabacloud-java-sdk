// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ActivateTemplateMCPResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TemplateResult body;

    public static ActivateTemplateMCPResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateTemplateMCPResponse self = new ActivateTemplateMCPResponse();
        return TeaModel.build(map, self);
    }

    public ActivateTemplateMCPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateTemplateMCPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateTemplateMCPResponse setBody(TemplateResult body) {
        this.body = body;
        return this;
    }
    public TemplateResult getBody() {
        return this.body;
    }

}

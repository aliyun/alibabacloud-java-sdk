// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class StopTemplateMCPResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TemplateResult body;

    public static StopTemplateMCPResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTemplateMCPResponse self = new StopTemplateMCPResponse();
        return TeaModel.build(map, self);
    }

    public StopTemplateMCPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTemplateMCPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTemplateMCPResponse setBody(TemplateResult body) {
        this.body = body;
        return this;
    }
    public TemplateResult getBody() {
        return this.body;
    }

}

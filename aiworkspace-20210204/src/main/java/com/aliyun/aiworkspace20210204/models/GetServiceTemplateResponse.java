// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetServiceTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceTemplateResponseBody body;

    public static GetServiceTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTemplateResponse self = new GetServiceTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceTemplateResponse setBody(GetServiceTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceTemplateResponseBody getBody() {
        return this.body;
    }

}

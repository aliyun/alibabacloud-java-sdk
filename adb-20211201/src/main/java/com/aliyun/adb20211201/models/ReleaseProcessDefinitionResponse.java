// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ReleaseProcessDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseProcessDefinitionResponseBody body;

    public static ReleaseProcessDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseProcessDefinitionResponse self = new ReleaseProcessDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseProcessDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseProcessDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseProcessDefinitionResponse setBody(ReleaseProcessDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseProcessDefinitionResponseBody getBody() {
        return this.body;
    }

}

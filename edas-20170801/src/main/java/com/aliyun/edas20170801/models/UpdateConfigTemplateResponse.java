// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateConfigTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConfigTemplateResponseBody body;

    public static UpdateConfigTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigTemplateResponse self = new UpdateConfigTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConfigTemplateResponse setBody(UpdateConfigTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigTemplateResponseBody getBody() {
        return this.body;
    }

}

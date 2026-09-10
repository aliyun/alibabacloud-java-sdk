// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class UpdateDataCheckTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataCheckTemplateResponseBody body;

    public static UpdateDataCheckTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataCheckTemplateResponse self = new UpdateDataCheckTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataCheckTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataCheckTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataCheckTemplateResponse setBody(UpdateDataCheckTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataCheckTemplateResponseBody getBody() {
        return this.body;
    }

}

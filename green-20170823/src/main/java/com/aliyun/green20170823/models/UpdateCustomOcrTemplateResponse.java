// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateCustomOcrTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomOcrTemplateResponseBody body;

    public static UpdateCustomOcrTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomOcrTemplateResponse self = new UpdateCustomOcrTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomOcrTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomOcrTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomOcrTemplateResponse setBody(UpdateCustomOcrTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomOcrTemplateResponseBody getBody() {
        return this.body;
    }

}

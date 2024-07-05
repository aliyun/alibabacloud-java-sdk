// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateSmarttagTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSmarttagTemplateResponseBody body;

    public static UpdateSmarttagTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmarttagTemplateResponse self = new UpdateSmarttagTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmarttagTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmarttagTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmarttagTemplateResponse setBody(UpdateSmarttagTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmarttagTemplateResponseBody getBody() {
        return this.body;
    }

}

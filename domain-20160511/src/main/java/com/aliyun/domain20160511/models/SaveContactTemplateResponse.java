// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveContactTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveContactTemplateResponseBody body;

    public static SaveContactTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveContactTemplateResponse self = new SaveContactTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SaveContactTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveContactTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveContactTemplateResponse setBody(SaveContactTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveContactTemplateResponseBody getBody() {
        return this.body;
    }

}

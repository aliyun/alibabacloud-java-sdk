// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveContactTemplateCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveContactTemplateCredentialResponseBody body;

    public static SaveContactTemplateCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveContactTemplateCredentialResponse self = new SaveContactTemplateCredentialResponse();
        return TeaModel.build(map, self);
    }

    public SaveContactTemplateCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveContactTemplateCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveContactTemplateCredentialResponse setBody(SaveContactTemplateCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveContactTemplateCredentialResponseBody getBody() {
        return this.body;
    }

}

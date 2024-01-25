// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class AddCompanyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCompanyTemplateResponseBody body;

    public static AddCompanyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCompanyTemplateResponse self = new AddCompanyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddCompanyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCompanyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCompanyTemplateResponse setBody(AddCompanyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCompanyTemplateResponseBody getBody() {
        return this.body;
    }

}

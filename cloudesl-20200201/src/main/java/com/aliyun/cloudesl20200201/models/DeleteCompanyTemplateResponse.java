// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DeleteCompanyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCompanyTemplateResponseBody body;

    public static DeleteCompanyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompanyTemplateResponse self = new DeleteCompanyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCompanyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCompanyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCompanyTemplateResponse setBody(DeleteCompanyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCompanyTemplateResponseBody getBody() {
        return this.body;
    }

}

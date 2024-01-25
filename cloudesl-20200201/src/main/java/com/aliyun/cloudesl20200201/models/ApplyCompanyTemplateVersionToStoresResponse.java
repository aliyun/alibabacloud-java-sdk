// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class ApplyCompanyTemplateVersionToStoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyCompanyTemplateVersionToStoresResponseBody body;

    public static ApplyCompanyTemplateVersionToStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCompanyTemplateVersionToStoresResponse self = new ApplyCompanyTemplateVersionToStoresResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCompanyTemplateVersionToStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyCompanyTemplateVersionToStoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyCompanyTemplateVersionToStoresResponse setBody(ApplyCompanyTemplateVersionToStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyCompanyTemplateVersionToStoresResponseBody getBody() {
        return this.body;
    }

}

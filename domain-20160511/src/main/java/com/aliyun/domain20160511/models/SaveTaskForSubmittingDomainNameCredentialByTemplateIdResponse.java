// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponseBody body;

    public static SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse self = new SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse setBody(SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponseBody getBody() {
        return this.body;
    }

}

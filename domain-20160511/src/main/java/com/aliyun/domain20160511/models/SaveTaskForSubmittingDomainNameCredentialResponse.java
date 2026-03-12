// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainNameCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTaskForSubmittingDomainNameCredentialResponseBody body;

    public static SaveTaskForSubmittingDomainNameCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainNameCredentialResponse self = new SaveTaskForSubmittingDomainNameCredentialResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainNameCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForSubmittingDomainNameCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTaskForSubmittingDomainNameCredentialResponse setBody(SaveTaskForSubmittingDomainNameCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForSubmittingDomainNameCredentialResponseBody getBody() {
        return this.body;
    }

}

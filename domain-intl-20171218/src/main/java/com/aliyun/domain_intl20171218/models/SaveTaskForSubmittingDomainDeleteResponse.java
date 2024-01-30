// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTaskForSubmittingDomainDeleteResponseBody body;

    public static SaveTaskForSubmittingDomainDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainDeleteResponse self = new SaveTaskForSubmittingDomainDeleteResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForSubmittingDomainDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTaskForSubmittingDomainDeleteResponse setBody(SaveTaskForSubmittingDomainDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForSubmittingDomainDeleteResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountQueryAccountsInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountQueryAccountsInfoResponseBody body;

    public static EnterpriseAccountQueryAccountsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountQueryAccountsInfoResponse self = new EnterpriseAccountQueryAccountsInfoResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountQueryAccountsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountQueryAccountsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountQueryAccountsInfoResponse setBody(EnterpriseAccountQueryAccountsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountQueryAccountsInfoResponseBody getBody() {
        return this.body;
    }

}

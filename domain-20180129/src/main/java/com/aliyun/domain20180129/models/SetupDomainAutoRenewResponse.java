// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SetupDomainAutoRenewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetupDomainAutoRenewResponseBody body;

    public static SetupDomainAutoRenewResponse build(java.util.Map<String, ?> map) throws Exception {
        SetupDomainAutoRenewResponse self = new SetupDomainAutoRenewResponse();
        return TeaModel.build(map, self);
    }

    public SetupDomainAutoRenewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetupDomainAutoRenewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetupDomainAutoRenewResponse setBody(SetupDomainAutoRenewResponseBody body) {
        this.body = body;
        return this;
    }
    public SetupDomainAutoRenewResponseBody getBody() {
        return this.body;
    }

}

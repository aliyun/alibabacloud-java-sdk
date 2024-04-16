// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class SetEnvironmentDefaultDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetEnvironmentDefaultDomainResponseBody body;

    public static SetEnvironmentDefaultDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEnvironmentDefaultDomainResponse self = new SetEnvironmentDefaultDomainResponse();
        return TeaModel.build(map, self);
    }

    public SetEnvironmentDefaultDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetEnvironmentDefaultDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetEnvironmentDefaultDomainResponse setBody(SetEnvironmentDefaultDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEnvironmentDefaultDomainResponseBody getBody() {
        return this.body;
    }

}

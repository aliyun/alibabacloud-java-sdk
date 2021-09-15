// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class SetEnvironmentDefaultDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetEnvironmentDefaultDomainResponse setBody(SetEnvironmentDefaultDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEnvironmentDefaultDomainResponseBody getBody() {
        return this.body;
    }

}

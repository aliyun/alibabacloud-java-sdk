// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetWildcardDomainPatternsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetWildcardDomainPatternsResponseBody body;

    public static SetWildcardDomainPatternsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetWildcardDomainPatternsResponse self = new SetWildcardDomainPatternsResponse();
        return TeaModel.build(map, self);
    }

    public SetWildcardDomainPatternsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetWildcardDomainPatternsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetWildcardDomainPatternsResponse setBody(SetWildcardDomainPatternsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetWildcardDomainPatternsResponseBody getBody() {
        return this.body;
    }

}

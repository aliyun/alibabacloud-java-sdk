// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetDomainDnsChallengeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDomainDnsChallengeResponseBody body;

    public static GetDomainDnsChallengeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainDnsChallengeResponse self = new GetDomainDnsChallengeResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainDnsChallengeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainDnsChallengeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDomainDnsChallengeResponse setBody(GetDomainDnsChallengeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainDnsChallengeResponseBody getBody() {
        return this.body;
    }

}

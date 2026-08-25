// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetChallengeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChallengeResponseBody body;

    public static GetChallengeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChallengeResponse self = new GetChallengeResponse();
        return TeaModel.build(map, self);
    }

    public GetChallengeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChallengeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChallengeResponse setBody(GetChallengeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChallengeResponseBody getBody() {
        return this.body;
    }

}

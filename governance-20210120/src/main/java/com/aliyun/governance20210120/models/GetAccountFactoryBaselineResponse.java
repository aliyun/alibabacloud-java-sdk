// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetAccountFactoryBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountFactoryBaselineResponseBody body;

    public static GetAccountFactoryBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountFactoryBaselineResponse self = new GetAccountFactoryBaselineResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountFactoryBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountFactoryBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountFactoryBaselineResponse setBody(GetAccountFactoryBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountFactoryBaselineResponseBody getBody() {
        return this.body;
    }

}

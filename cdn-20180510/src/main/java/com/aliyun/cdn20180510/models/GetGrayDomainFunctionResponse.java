// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class GetGrayDomainFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGrayDomainFunctionResponseBody body;

    public static GetGrayDomainFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGrayDomainFunctionResponse self = new GetGrayDomainFunctionResponse();
        return TeaModel.build(map, self);
    }

    public GetGrayDomainFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGrayDomainFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGrayDomainFunctionResponse setBody(GetGrayDomainFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGrayDomainFunctionResponseBody getBody() {
        return this.body;
    }

}

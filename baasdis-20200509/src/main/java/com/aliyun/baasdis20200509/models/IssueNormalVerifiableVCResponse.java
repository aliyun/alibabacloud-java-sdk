// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class IssueNormalVerifiableVCResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IssueNormalVerifiableVCResponseBody body;

    public static IssueNormalVerifiableVCResponse build(java.util.Map<String, ?> map) throws Exception {
        IssueNormalVerifiableVCResponse self = new IssueNormalVerifiableVCResponse();
        return TeaModel.build(map, self);
    }

    public IssueNormalVerifiableVCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IssueNormalVerifiableVCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IssueNormalVerifiableVCResponse setBody(IssueNormalVerifiableVCResponseBody body) {
        this.body = body;
        return this;
    }
    public IssueNormalVerifiableVCResponseBody getBody() {
        return this.body;
    }

}

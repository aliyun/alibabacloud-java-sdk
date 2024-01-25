// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CommitServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CommitServiceResponseBody body;

    public static CommitServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CommitServiceResponse self = new CommitServiceResponse();
        return TeaModel.build(map, self);
    }

    public CommitServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommitServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommitServiceResponse setBody(CommitServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitServiceResponseBody getBody() {
        return this.body;
    }

}

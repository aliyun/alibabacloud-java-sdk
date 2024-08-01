// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExternalUserQueryResponseBody body;

    public static ExternalUserQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ExternalUserQueryResponse self = new ExternalUserQueryResponse();
        return TeaModel.build(map, self);
    }

    public ExternalUserQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExternalUserQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExternalUserQueryResponse setBody(ExternalUserQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ExternalUserQueryResponseBody getBody() {
        return this.body;
    }

}

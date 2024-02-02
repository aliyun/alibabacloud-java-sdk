// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RetrieveCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetrieveCallResponseBody body;

    public static RetrieveCallResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveCallResponse self = new RetrieveCallResponse();
        return TeaModel.build(map, self);
    }

    public RetrieveCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrieveCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetrieveCallResponse setBody(RetrieveCallResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrieveCallResponseBody getBody() {
        return this.body;
    }

}

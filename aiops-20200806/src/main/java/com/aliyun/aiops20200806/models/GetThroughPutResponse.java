// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetThroughPutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetThroughPutResponseBody body;

    public static GetThroughPutResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThroughPutResponse self = new GetThroughPutResponse();
        return TeaModel.build(map, self);
    }

    public GetThroughPutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThroughPutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetThroughPutResponse setBody(GetThroughPutResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThroughPutResponseBody getBody() {
        return this.body;
    }

}

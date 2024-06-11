// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class FetchFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FetchFileResponseBody body;

    public static FetchFileResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchFileResponse self = new FetchFileResponse();
        return TeaModel.build(map, self);
    }

    public FetchFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchFileResponse setBody(FetchFileResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchFileResponseBody getBody() {
        return this.body;
    }

}

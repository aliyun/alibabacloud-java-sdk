// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadlockHistogramResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeadlockHistogramResponseBody body;

    public static GetDeadlockHistogramResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeadlockHistogramResponse self = new GetDeadlockHistogramResponse();
        return TeaModel.build(map, self);
    }

    public GetDeadlockHistogramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeadlockHistogramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeadlockHistogramResponse setBody(GetDeadlockHistogramResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeadlockHistogramResponseBody getBody() {
        return this.body;
    }

}

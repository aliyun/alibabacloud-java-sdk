// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UnloadSampleDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnloadSampleDataResponseBody body;

    public static UnloadSampleDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UnloadSampleDataResponse self = new UnloadSampleDataResponse();
        return TeaModel.build(map, self);
    }

    public UnloadSampleDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnloadSampleDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnloadSampleDataResponse setBody(UnloadSampleDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UnloadSampleDataResponseBody getBody() {
        return this.body;
    }

}

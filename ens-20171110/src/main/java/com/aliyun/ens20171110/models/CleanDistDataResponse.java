// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CleanDistDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CleanDistDataResponseBody body;

    public static CleanDistDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CleanDistDataResponse self = new CleanDistDataResponse();
        return TeaModel.build(map, self);
    }

    public CleanDistDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CleanDistDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CleanDistDataResponse setBody(CleanDistDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CleanDistDataResponseBody getBody() {
        return this.body;
    }

}

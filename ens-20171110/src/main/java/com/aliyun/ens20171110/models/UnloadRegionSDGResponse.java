// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnloadRegionSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnloadRegionSDGResponseBody body;

    public static UnloadRegionSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        UnloadRegionSDGResponse self = new UnloadRegionSDGResponse();
        return TeaModel.build(map, self);
    }

    public UnloadRegionSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnloadRegionSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnloadRegionSDGResponse setBody(UnloadRegionSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public UnloadRegionSDGResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class WhiteIpListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WhiteIpListResponseBody body;

    public static WhiteIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        WhiteIpListResponse self = new WhiteIpListResponse();
        return TeaModel.build(map, self);
    }

    public WhiteIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WhiteIpListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WhiteIpListResponse setBody(WhiteIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public WhiteIpListResponseBody getBody() {
        return this.body;
    }

}

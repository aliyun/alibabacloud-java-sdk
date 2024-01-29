// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDohUserInfoResponseBody body;

    public static DescribeDohUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohUserInfoResponse self = new DescribeDohUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDohUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDohUserInfoResponse setBody(DescribeDohUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohUserInfoResponseBody getBody() {
        return this.body;
    }

}

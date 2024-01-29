// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePdnsUserInfoResponseBody body;

    public static DescribePdnsUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsUserInfoResponse self = new DescribePdnsUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribePdnsUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePdnsUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePdnsUserInfoResponse setBody(DescribePdnsUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePdnsUserInfoResponseBody getBody() {
        return this.body;
    }

}

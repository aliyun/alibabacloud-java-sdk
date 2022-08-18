// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePdnsAppKeyResponseBody body;

    public static DescribePdnsAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsAppKeyResponse self = new DescribePdnsAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribePdnsAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePdnsAppKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePdnsAppKeyResponse setBody(DescribePdnsAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePdnsAppKeyResponseBody getBody() {
        return this.body;
    }

}

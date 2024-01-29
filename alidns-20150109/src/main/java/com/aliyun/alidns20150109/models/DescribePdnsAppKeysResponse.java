// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsAppKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePdnsAppKeysResponseBody body;

    public static DescribePdnsAppKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsAppKeysResponse self = new DescribePdnsAppKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribePdnsAppKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePdnsAppKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePdnsAppKeysResponse setBody(DescribePdnsAppKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePdnsAppKeysResponseBody getBody() {
        return this.body;
    }

}

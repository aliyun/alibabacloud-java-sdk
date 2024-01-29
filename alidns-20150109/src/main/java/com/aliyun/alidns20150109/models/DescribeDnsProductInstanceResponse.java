// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsProductInstanceResponseBody body;

    public static DescribeDnsProductInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstanceResponse self = new DescribeDnsProductInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsProductInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsProductInstanceResponse setBody(DescribeDnsProductInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsProductInstanceResponseBody getBody() {
        return this.body;
    }

}

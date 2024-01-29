// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsProductInstancesResponseBody body;

    public static DescribeDnsProductInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstancesResponse self = new DescribeDnsProductInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsProductInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsProductInstancesResponse setBody(DescribeDnsProductInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsProductInstancesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmInstancesResponseBody body;

    public static DescribeDnsGtmInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstancesResponse self = new DescribeDnsGtmInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmInstancesResponse setBody(DescribeDnsGtmInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmInstancesResponseBody getBody() {
        return this.body;
    }

}

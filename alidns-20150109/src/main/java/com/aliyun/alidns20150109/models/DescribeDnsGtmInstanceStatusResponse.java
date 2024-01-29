// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmInstanceStatusResponseBody body;

    public static DescribeDnsGtmInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceStatusResponse self = new DescribeDnsGtmInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmInstanceStatusResponse setBody(DescribeDnsGtmInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmInstanceStatusResponseBody getBody() {
        return this.body;
    }

}

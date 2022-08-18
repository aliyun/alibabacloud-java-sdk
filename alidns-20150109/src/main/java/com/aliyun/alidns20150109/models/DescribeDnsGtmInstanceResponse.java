// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDnsGtmInstanceResponseBody body;

    public static DescribeDnsGtmInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceResponse self = new DescribeDnsGtmInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmInstanceResponse setBody(DescribeDnsGtmInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmInstanceResponseBody getBody() {
        return this.body;
    }

}

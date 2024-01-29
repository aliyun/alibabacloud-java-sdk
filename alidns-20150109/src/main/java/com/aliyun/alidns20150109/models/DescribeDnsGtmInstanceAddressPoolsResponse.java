// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmInstanceAddressPoolsResponseBody body;

    public static DescribeDnsGtmInstanceAddressPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceAddressPoolsResponse self = new DescribeDnsGtmInstanceAddressPoolsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse setBody(DescribeDnsGtmInstanceAddressPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmInstanceAddressPoolsResponseBody getBody() {
        return this.body;
    }

}

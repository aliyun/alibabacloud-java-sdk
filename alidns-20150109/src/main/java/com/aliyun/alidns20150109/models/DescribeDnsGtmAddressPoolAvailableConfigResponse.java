// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddressPoolAvailableConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmAddressPoolAvailableConfigResponseBody body;

    public static DescribeDnsGtmAddressPoolAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAddressPoolAvailableConfigResponse self = new DescribeDnsGtmAddressPoolAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponse setBody(DescribeDnsGtmAddressPoolAvailableConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmAddressPoolAvailableConfigResponseBody getBody() {
        return this.body;
    }

}

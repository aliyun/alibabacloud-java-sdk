// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDnsGtmAddressPoolResponseBody body;

    public static AddDnsGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmAddressPoolResponse self = new AddDnsGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDnsGtmAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDnsGtmAddressPoolResponse setBody(AddDnsGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDnsGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}

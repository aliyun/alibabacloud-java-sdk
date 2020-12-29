// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddDnsGtmAddressPoolResponse setBody(AddDnsGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDnsGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}

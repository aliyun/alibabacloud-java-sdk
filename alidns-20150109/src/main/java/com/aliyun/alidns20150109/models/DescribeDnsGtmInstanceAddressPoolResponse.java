// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDnsGtmInstanceAddressPoolResponseBody body;

    public static DescribeDnsGtmInstanceAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceAddressPoolResponse self = new DescribeDnsGtmInstanceAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setBody(DescribeDnsGtmInstanceAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmInstanceAddressPoolResponseBody getBody() {
        return this.body;
    }

}

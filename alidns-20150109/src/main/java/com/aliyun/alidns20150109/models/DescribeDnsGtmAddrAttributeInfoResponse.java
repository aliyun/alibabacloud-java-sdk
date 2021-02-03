// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddrAttributeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDnsGtmAddrAttributeInfoResponseBody body;

    public static DescribeDnsGtmAddrAttributeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAddrAttributeInfoResponse self = new DescribeDnsGtmAddrAttributeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAddrAttributeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmAddrAttributeInfoResponse setBody(DescribeDnsGtmAddrAttributeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmAddrAttributeInfoResponseBody getBody() {
        return this.body;
    }

}

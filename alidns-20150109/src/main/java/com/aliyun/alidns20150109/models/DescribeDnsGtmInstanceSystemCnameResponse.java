// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceSystemCnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDnsGtmInstanceSystemCnameResponseBody body;

    public static DescribeDnsGtmInstanceSystemCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceSystemCnameResponse self = new DescribeDnsGtmInstanceSystemCnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceSystemCnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmInstanceSystemCnameResponse setBody(DescribeDnsGtmInstanceSystemCnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmInstanceSystemCnameResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDnsGtmInstancesResponse setBody(DescribeDnsGtmInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmInstancesResponseBody getBody() {
        return this.body;
    }

}

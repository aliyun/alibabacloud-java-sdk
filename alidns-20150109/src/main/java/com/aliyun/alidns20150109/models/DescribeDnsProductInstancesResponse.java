// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDnsProductInstancesResponseBody body;

    public static DescribeDnsProductInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstancesResponse self = new DescribeDnsProductInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsProductInstancesResponse setBody(DescribeDnsProductInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsProductInstancesResponseBody getBody() {
        return this.body;
    }

}

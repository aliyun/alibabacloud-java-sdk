// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDnsProductInstanceResponseBody body;

    public static DescribeDnsProductInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstanceResponse self = new DescribeDnsProductInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsProductInstanceResponse setBody(DescribeDnsProductInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsProductInstanceResponseBody getBody() {
        return this.body;
    }

}

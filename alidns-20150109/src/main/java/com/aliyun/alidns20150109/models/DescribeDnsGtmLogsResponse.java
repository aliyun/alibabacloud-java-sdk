// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDnsGtmLogsResponseBody body;

    public static DescribeDnsGtmLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmLogsResponse self = new DescribeDnsGtmLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmLogsResponse setBody(DescribeDnsGtmLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmLogsResponseBody getBody() {
        return this.body;
    }

}

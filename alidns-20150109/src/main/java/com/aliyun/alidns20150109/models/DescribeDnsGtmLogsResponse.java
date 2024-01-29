// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDnsGtmLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmLogsResponse setBody(DescribeDnsGtmLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmLogsResponseBody getBody() {
        return this.body;
    }

}

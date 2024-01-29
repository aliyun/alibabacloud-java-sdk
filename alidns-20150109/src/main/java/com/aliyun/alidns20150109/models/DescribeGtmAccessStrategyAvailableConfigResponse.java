// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyAvailableConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGtmAccessStrategyAvailableConfigResponseBody body;

    public static DescribeGtmAccessStrategyAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyAvailableConfigResponse self = new DescribeGtmAccessStrategyAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAccessStrategyAvailableConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmAccessStrategyAvailableConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGtmAccessStrategyAvailableConfigResponse setBody(DescribeGtmAccessStrategyAvailableConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmAccessStrategyAvailableConfigResponseBody getBody() {
        return this.body;
    }

}

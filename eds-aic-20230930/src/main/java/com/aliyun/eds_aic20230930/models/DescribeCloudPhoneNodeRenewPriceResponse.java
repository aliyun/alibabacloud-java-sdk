// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCloudPhoneNodeRenewPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudPhoneNodeRenewPriceResponseBody body;

    public static DescribeCloudPhoneNodeRenewPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudPhoneNodeRenewPriceResponse self = new DescribeCloudPhoneNodeRenewPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudPhoneNodeRenewPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudPhoneNodeRenewPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudPhoneNodeRenewPriceResponse setBody(DescribeCloudPhoneNodeRenewPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudPhoneNodeRenewPriceResponseBody getBody() {
        return this.body;
    }

}

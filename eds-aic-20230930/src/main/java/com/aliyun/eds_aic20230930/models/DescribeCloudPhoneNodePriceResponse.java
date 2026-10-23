// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCloudPhoneNodePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudPhoneNodePriceResponseBody body;

    public static DescribeCloudPhoneNodePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudPhoneNodePriceResponse self = new DescribeCloudPhoneNodePriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudPhoneNodePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudPhoneNodePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudPhoneNodePriceResponse setBody(DescribeCloudPhoneNodePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudPhoneNodePriceResponseBody getBody() {
        return this.body;
    }

}

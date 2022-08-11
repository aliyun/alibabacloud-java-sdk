// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeDeliveryChannelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeliveryChannelsResponseBody body;

    public static DescribeDeliveryChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeliveryChannelsResponse self = new DescribeDeliveryChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeliveryChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeliveryChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeliveryChannelsResponse setBody(DescribeDeliveryChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeliveryChannelsResponseBody getBody() {
        return this.body;
    }

}

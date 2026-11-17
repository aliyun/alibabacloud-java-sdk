// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeSlsDeliveryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlsDeliveryConfigResponseBody body;

    public static DescribeSlsDeliveryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsDeliveryConfigResponse self = new DescribeSlsDeliveryConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsDeliveryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlsDeliveryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlsDeliveryConfigResponse setBody(DescribeSlsDeliveryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlsDeliveryConfigResponseBody getBody() {
        return this.body;
    }

}

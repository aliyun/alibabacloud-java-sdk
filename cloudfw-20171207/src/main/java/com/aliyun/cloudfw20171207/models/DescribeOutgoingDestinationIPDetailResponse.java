// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutgoingDestinationIPDetailResponseBody body;

    public static DescribeOutgoingDestinationIPDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationIPDetailResponse self = new DescribeOutgoingDestinationIPDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationIPDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingDestinationIPDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingDestinationIPDetailResponse setBody(DescribeOutgoingDestinationIPDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingDestinationIPDetailResponseBody getBody() {
        return this.body;
    }

}

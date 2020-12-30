// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRangeDataByLocateAndIspServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRangeDataByLocateAndIspServiceResponseBody body;

    public static DescribeRangeDataByLocateAndIspServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRangeDataByLocateAndIspServiceResponse self = new DescribeRangeDataByLocateAndIspServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRangeDataByLocateAndIspServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRangeDataByLocateAndIspServiceResponse setBody(DescribeRangeDataByLocateAndIspServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRangeDataByLocateAndIspServiceResponseBody getBody() {
        return this.body;
    }

}

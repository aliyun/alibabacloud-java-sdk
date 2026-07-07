// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeWafUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWafUsageDataResponseBody body;

    public static DescribeWafUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWafUsageDataResponse self = new DescribeWafUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWafUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWafUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWafUsageDataResponse setBody(DescribeWafUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWafUsageDataResponseBody getBody() {
        return this.body;
    }

}

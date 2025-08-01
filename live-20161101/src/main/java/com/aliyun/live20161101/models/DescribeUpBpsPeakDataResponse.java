// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpBpsPeakDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUpBpsPeakDataResponseBody body;

    public static DescribeUpBpsPeakDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpBpsPeakDataResponse self = new DescribeUpBpsPeakDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpBpsPeakDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpBpsPeakDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUpBpsPeakDataResponse setBody(DescribeUpBpsPeakDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpBpsPeakDataResponseBody getBody() {
        return this.body;
    }

}

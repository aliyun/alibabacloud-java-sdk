// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpBpsPeakOfLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUpBpsPeakOfLineResponseBody body;

    public static DescribeUpBpsPeakOfLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpBpsPeakOfLineResponse self = new DescribeUpBpsPeakOfLineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpBpsPeakOfLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpBpsPeakOfLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUpBpsPeakOfLineResponse setBody(DescribeUpBpsPeakOfLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpBpsPeakOfLineResponseBody getBody() {
        return this.body;
    }

}

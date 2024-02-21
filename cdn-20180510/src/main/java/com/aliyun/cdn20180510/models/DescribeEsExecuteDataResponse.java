// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExecuteDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEsExecuteDataResponseBody body;

    public static DescribeEsExecuteDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEsExecuteDataResponse self = new DescribeEsExecuteDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEsExecuteDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEsExecuteDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEsExecuteDataResponse setBody(DescribeEsExecuteDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEsExecuteDataResponseBody getBody() {
        return this.body;
    }

}

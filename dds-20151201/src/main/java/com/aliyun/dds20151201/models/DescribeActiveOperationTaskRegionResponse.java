// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeActiveOperationTaskRegionResponseBody body;

    public static DescribeActiveOperationTaskRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskRegionResponse self = new DescribeActiveOperationTaskRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveOperationTaskRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActiveOperationTaskRegionResponse setBody(DescribeActiveOperationTaskRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveOperationTaskRegionResponseBody getBody() {
        return this.body;
    }

}

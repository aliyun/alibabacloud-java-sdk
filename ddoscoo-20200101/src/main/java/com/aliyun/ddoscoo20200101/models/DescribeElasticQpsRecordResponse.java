// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticQpsRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticQpsRecordResponseBody body;

    public static DescribeElasticQpsRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticQpsRecordResponse self = new DescribeElasticQpsRecordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticQpsRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticQpsRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticQpsRecordResponse setBody(DescribeElasticQpsRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticQpsRecordResponseBody getBody() {
        return this.body;
    }

}

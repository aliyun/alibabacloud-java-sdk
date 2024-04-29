// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDefenseRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseRecordsResponseBody body;

    public static DescribeDefenseRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRecordsResponse self = new DescribeDefenseRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseRecordsResponse setBody(DescribeDefenseRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseRecordsResponseBody getBody() {
        return this.body;
    }

}

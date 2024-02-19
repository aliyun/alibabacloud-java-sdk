// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeWaitingSQLRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWaitingSQLRecordsResponseBody body;

    public static DescribeWaitingSQLRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWaitingSQLRecordsResponse self = new DescribeWaitingSQLRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWaitingSQLRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWaitingSQLRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWaitingSQLRecordsResponse setBody(DescribeWaitingSQLRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWaitingSQLRecordsResponseBody getBody() {
        return this.body;
    }

}

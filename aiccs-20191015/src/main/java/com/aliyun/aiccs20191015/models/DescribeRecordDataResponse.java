// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DescribeRecordDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecordDataResponseBody body;

    public static DescribeRecordDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordDataResponse self = new DescribeRecordDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecordDataResponse setBody(DescribeRecordDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordDataResponseBody getBody() {
        return this.body;
    }

}

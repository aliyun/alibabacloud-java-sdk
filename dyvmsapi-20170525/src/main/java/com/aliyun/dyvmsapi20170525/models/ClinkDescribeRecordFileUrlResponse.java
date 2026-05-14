// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeRecordFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkDescribeRecordFileUrlResponseBody body;

    public static ClinkDescribeRecordFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeRecordFileUrlResponse self = new ClinkDescribeRecordFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeRecordFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkDescribeRecordFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkDescribeRecordFileUrlResponse setBody(ClinkDescribeRecordFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkDescribeRecordFileUrlResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeQRCodeAccessLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQRCodeAccessLogResponseBody body;

    public static DescribeQRCodeAccessLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQRCodeAccessLogResponse self = new DescribeQRCodeAccessLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQRCodeAccessLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQRCodeAccessLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQRCodeAccessLogResponse setBody(DescribeQRCodeAccessLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQRCodeAccessLogResponseBody getBody() {
        return this.body;
    }

}

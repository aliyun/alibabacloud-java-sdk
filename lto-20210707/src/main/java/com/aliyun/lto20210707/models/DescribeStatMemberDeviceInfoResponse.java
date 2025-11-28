// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeStatMemberDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStatMemberDeviceInfoResponseBody body;

    public static DescribeStatMemberDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatMemberDeviceInfoResponse self = new DescribeStatMemberDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStatMemberDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStatMemberDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStatMemberDeviceInfoResponse setBody(DescribeStatMemberDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStatMemberDeviceInfoResponseBody getBody() {
        return this.body;
    }

}

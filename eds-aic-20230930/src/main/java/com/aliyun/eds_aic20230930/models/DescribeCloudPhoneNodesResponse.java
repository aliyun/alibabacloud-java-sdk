// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCloudPhoneNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudPhoneNodesResponseBody body;

    public static DescribeCloudPhoneNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudPhoneNodesResponse self = new DescribeCloudPhoneNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudPhoneNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudPhoneNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudPhoneNodesResponse setBody(DescribeCloudPhoneNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudPhoneNodesResponseBody getBody() {
        return this.body;
    }

}

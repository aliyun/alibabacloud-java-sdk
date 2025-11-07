// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeListFaceVerifyInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeListFaceVerifyInfosResponseBody body;

    public static DescribeListFaceVerifyInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeListFaceVerifyInfosResponse self = new DescribeListFaceVerifyInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeListFaceVerifyInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeListFaceVerifyInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeListFaceVerifyInfosResponse setBody(DescribeListFaceVerifyInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeListFaceVerifyInfosResponseBody getBody() {
        return this.body;
    }

}

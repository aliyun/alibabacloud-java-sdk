// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeListFaceVerifyDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeListFaceVerifyDataResponseBody body;

    public static DescribeListFaceVerifyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeListFaceVerifyDataResponse self = new DescribeListFaceVerifyDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeListFaceVerifyDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeListFaceVerifyDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeListFaceVerifyDataResponse setBody(DescribeListFaceVerifyDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeListFaceVerifyDataResponseBody getBody() {
        return this.body;
    }

}

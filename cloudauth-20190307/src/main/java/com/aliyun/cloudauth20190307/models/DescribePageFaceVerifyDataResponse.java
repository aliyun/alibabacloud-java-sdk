// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribePageFaceVerifyDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePageFaceVerifyDataResponseBody body;

    public static DescribePageFaceVerifyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePageFaceVerifyDataResponse self = new DescribePageFaceVerifyDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribePageFaceVerifyDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePageFaceVerifyDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePageFaceVerifyDataResponse setBody(DescribePageFaceVerifyDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePageFaceVerifyDataResponseBody getBody() {
        return this.body;
    }

}

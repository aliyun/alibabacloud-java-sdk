// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeNFSClientStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNFSClientStatusResponseBody body;

    public static DescribeNFSClientStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNFSClientStatusResponse self = new DescribeNFSClientStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNFSClientStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNFSClientStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNFSClientStatusResponse setBody(DescribeNFSClientStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNFSClientStatusResponseBody getBody() {
        return this.body;
    }

}

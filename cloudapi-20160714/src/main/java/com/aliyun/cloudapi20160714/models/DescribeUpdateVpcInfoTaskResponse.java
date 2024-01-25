// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeUpdateVpcInfoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUpdateVpcInfoTaskResponseBody body;

    public static DescribeUpdateVpcInfoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdateVpcInfoTaskResponse self = new DescribeUpdateVpcInfoTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpdateVpcInfoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpdateVpcInfoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUpdateVpcInfoTaskResponse setBody(DescribeUpdateVpcInfoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpdateVpcInfoTaskResponseBody getBody() {
        return this.body;
    }

}

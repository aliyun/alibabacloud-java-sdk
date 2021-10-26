// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeUpdateVpcInfoTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeUpdateVpcInfoTaskResponse setBody(DescribeUpdateVpcInfoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpdateVpcInfoTaskResponseBody getBody() {
        return this.body;
    }

}

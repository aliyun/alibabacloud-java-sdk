// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstDbSlsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstDbSlsInfoResponseBody body;

    public static DescribeInstDbSlsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstDbSlsInfoResponse self = new DescribeInstDbSlsInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstDbSlsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstDbSlsInfoResponse setBody(DescribeInstDbSlsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstDbSlsInfoResponseBody getBody() {
        return this.body;
    }

}

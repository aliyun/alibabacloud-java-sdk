// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeBlackListClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBlackListClientsResponseBody body;

    public static DescribeBlackListClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackListClientsResponse self = new DescribeBlackListClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlackListClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlackListClientsResponse setBody(DescribeBlackListClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlackListClientsResponseBody getBody() {
        return this.body;
    }

}

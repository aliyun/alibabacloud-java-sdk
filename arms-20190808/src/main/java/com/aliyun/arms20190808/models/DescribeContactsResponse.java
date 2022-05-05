// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContactsResponseBody body;

    public static DescribeContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactsResponse self = new DescribeContactsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContactsResponse setBody(DescribeContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContactsResponseBody getBody() {
        return this.body;
    }

}

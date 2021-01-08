// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeDataSetMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataSetMessageResponseBody body;

    public static DescribeDataSetMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSetMessageResponse self = new DescribeDataSetMessageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSetMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSetMessageResponse setBody(DescribeDataSetMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSetMessageResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSubscribeResponseBody body;

    public static DescribeSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscribeResponse self = new DescribeSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscribeResponse setBody(DescribeSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscribeResponseBody getBody() {
        return this.body;
    }

}

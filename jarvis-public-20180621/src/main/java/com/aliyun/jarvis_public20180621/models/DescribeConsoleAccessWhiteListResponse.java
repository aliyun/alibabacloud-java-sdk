// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeConsoleAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConsoleAccessWhiteListResponseBody body;

    public static DescribeConsoleAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsoleAccessWhiteListResponse self = new DescribeConsoleAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsoleAccessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsoleAccessWhiteListResponse setBody(DescribeConsoleAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsoleAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}

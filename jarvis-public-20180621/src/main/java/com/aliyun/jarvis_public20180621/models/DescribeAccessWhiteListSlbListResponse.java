// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeAccessWhiteListSlbListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccessWhiteListSlbListResponseBody body;

    public static DescribeAccessWhiteListSlbListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessWhiteListSlbListResponse self = new DescribeAccessWhiteListSlbListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessWhiteListSlbListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessWhiteListSlbListResponse setBody(DescribeAccessWhiteListSlbListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessWhiteListSlbListResponseBody getBody() {
        return this.body;
    }

}

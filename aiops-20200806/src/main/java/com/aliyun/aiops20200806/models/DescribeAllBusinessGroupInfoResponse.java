// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllBusinessGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllBusinessGroupInfoResponseBody body;

    public static DescribeAllBusinessGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllBusinessGroupInfoResponse self = new DescribeAllBusinessGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllBusinessGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllBusinessGroupInfoResponse setBody(DescribeAllBusinessGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllBusinessGroupInfoResponseBody getBody() {
        return this.body;
    }

}

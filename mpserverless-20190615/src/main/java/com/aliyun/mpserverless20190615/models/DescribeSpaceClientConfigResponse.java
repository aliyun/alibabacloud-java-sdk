// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSpaceClientConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSpaceClientConfigResponseBody body;

    public static DescribeSpaceClientConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpaceClientConfigResponse self = new DescribeSpaceClientConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpaceClientConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSpaceClientConfigResponse setBody(DescribeSpaceClientConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSpaceClientConfigResponseBody getBody() {
        return this.body;
    }

}

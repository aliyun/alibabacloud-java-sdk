// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlexConfigResponseBody body;

    public static DescribeFlexConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexConfigResponse self = new DescribeFlexConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlexConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlexConfigResponse setBody(DescribeFlexConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlexConfigResponseBody getBody() {
        return this.body;
    }

}

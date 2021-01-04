// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexAccConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlexAccConfigResponseBody body;

    public static DescribeFlexAccConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexAccConfigResponse self = new DescribeFlexAccConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlexAccConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlexAccConfigResponse setBody(DescribeFlexAccConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlexAccConfigResponseBody getBody() {
        return this.body;
    }

}

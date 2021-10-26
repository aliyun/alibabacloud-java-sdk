// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSystemParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSystemParametersResponseBody body;

    public static DescribeSystemParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemParametersResponse self = new DescribeSystemParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemParametersResponse setBody(DescribeSystemParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemParametersResponseBody getBody() {
        return this.body;
    }

}

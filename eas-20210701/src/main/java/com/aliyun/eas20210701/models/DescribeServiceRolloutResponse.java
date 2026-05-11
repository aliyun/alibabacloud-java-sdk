// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceRolloutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceRolloutResponseBody body;

    public static DescribeServiceRolloutResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceRolloutResponse self = new DescribeServiceRolloutResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceRolloutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceRolloutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceRolloutResponse setBody(DescribeServiceRolloutResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceRolloutResponseBody getBody() {
        return this.body;
    }

}

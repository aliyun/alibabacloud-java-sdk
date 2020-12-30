// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeJobResponseBody body;

    public static DescribeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobResponse self = new DescribeJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobResponse setBody(DescribeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExecuteDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEsExecuteDataResponseBody body;

    public static DescribeEsExecuteDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEsExecuteDataResponse self = new DescribeEsExecuteDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEsExecuteDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEsExecuteDataResponse setBody(DescribeEsExecuteDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEsExecuteDataResponseBody getBody() {
        return this.body;
    }

}

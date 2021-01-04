// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSourceFailureTrendGraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSourceFailureTrendGraphResponseBody body;

    public static DescribeSourceFailureTrendGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSourceFailureTrendGraphResponse self = new DescribeSourceFailureTrendGraphResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSourceFailureTrendGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSourceFailureTrendGraphResponse setBody(DescribeSourceFailureTrendGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSourceFailureTrendGraphResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetLevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEnsNetLevelResponseBody body;

    public static DescribeEnsNetLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetLevelResponse self = new DescribeEnsNetLevelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsNetLevelResponse setBody(DescribeEnsNetLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsNetLevelResponseBody getBody() {
        return this.body;
    }

}

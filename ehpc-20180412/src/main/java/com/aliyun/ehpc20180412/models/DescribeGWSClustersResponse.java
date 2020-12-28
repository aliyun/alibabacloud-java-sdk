// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGWSClustersResponseBody body;

    public static DescribeGWSClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSClustersResponse self = new DescribeGWSClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGWSClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGWSClustersResponse setBody(DescribeGWSClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGWSClustersResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreFullDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestoreFullDetailsResponseBody body;

    public static DescribeRestoreFullDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreFullDetailsResponse self = new DescribeRestoreFullDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreFullDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreFullDetailsResponse setBody(DescribeRestoreFullDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreFullDetailsResponseBody getBody() {
        return this.body;
    }

}

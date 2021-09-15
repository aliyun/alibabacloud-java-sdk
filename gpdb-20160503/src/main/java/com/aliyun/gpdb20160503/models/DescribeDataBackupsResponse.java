// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataBackupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataBackupsResponseBody body;

    public static DescribeDataBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataBackupsResponse self = new DescribeDataBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataBackupsResponse setBody(DescribeDataBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataBackupsResponseBody getBody() {
        return this.body;
    }

}

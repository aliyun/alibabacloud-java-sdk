// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeLogBackupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogBackupsResponseBody body;

    public static DescribeLogBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupsResponse self = new DescribeLogBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogBackupsResponse setBody(DescribeLogBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogBackupsResponseBody getBody() {
        return this.body;
    }

}

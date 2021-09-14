// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeCheckUserBackupFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCheckUserBackupFileResponseBody body;

    public static DescribeCheckUserBackupFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckUserBackupFileResponse self = new DescribeCheckUserBackupFileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckUserBackupFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckUserBackupFileResponse setBody(DescribeCheckUserBackupFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckUserBackupFileResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeImportFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImportFileUrlResponseBody body;

    public static DescribeImportFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportFileUrlResponse self = new DescribeImportFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImportFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImportFileUrlResponse setBody(DescribeImportFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImportFileUrlResponseBody getBody() {
        return this.body;
    }

}

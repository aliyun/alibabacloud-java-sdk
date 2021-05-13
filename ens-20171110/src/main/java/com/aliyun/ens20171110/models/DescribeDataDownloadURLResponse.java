// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDownloadURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataDownloadURLResponseBody body;

    public static DescribeDataDownloadURLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDownloadURLResponse self = new DescribeDataDownloadURLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataDownloadURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataDownloadURLResponse setBody(DescribeDataDownloadURLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataDownloadURLResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeDownloadUrlsForAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDownloadUrlsForAppKeyResponseBody body;

    public static DescribeDownloadUrlsForAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadUrlsForAppKeyResponse self = new DescribeDownloadUrlsForAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadUrlsForAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadUrlsForAppKeyResponse setBody(DescribeDownloadUrlsForAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadUrlsForAppKeyResponseBody getBody() {
        return this.body;
    }

}

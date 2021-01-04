// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeDownloadUrlsForSDKResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDownloadUrlsForSDKResponseBody body;

    public static DescribeDownloadUrlsForSDKResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadUrlsForSDKResponse self = new DescribeDownloadUrlsForSDKResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadUrlsForSDKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadUrlsForSDKResponse setBody(DescribeDownloadUrlsForSDKResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadUrlsForSDKResponseBody getBody() {
        return this.body;
    }

}

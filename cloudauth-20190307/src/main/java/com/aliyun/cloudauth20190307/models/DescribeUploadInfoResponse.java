// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUploadInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUploadInfoResponseBody body;

    public static DescribeUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadInfoResponse self = new DescribeUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUploadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUploadInfoResponse setBody(DescribeUploadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUploadInfoResponseBody getBody() {
        return this.body;
    }

}

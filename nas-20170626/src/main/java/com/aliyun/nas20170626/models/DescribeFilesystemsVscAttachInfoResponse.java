// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesystemsVscAttachInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFilesystemsVscAttachInfoResponseBody body;

    public static DescribeFilesystemsVscAttachInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesystemsVscAttachInfoResponse self = new DescribeFilesystemsVscAttachInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFilesystemsVscAttachInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFilesystemsVscAttachInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFilesystemsVscAttachInfoResponse setBody(DescribeFilesystemsVscAttachInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFilesystemsVscAttachInfoResponseBody getBody() {
        return this.body;
    }

}

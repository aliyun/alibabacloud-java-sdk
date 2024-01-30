// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeKernelReleaseNotesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKernelReleaseNotesResponseBody body;

    public static DescribeKernelReleaseNotesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKernelReleaseNotesResponse self = new DescribeKernelReleaseNotesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKernelReleaseNotesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKernelReleaseNotesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKernelReleaseNotesResponse setBody(DescribeKernelReleaseNotesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKernelReleaseNotesResponseBody getBody() {
        return this.body;
    }

}

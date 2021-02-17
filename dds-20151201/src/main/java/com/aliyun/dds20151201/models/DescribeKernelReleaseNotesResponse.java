// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeKernelReleaseNotesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeKernelReleaseNotesResponse setBody(DescribeKernelReleaseNotesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKernelReleaseNotesResponseBody getBody() {
        return this.body;
    }

}

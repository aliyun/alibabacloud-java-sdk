// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeLibraryInstallTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLibraryInstallTaskDetailResponseBody body;

    public static DescribeLibraryInstallTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLibraryInstallTaskDetailResponse self = new DescribeLibraryInstallTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLibraryInstallTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLibraryInstallTaskDetailResponse setBody(DescribeLibraryInstallTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLibraryInstallTaskDetailResponseBody getBody() {
        return this.body;
    }

}

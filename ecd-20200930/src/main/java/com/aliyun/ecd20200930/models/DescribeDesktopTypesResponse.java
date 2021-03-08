// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDesktopTypesResponseBody body;

    public static DescribeDesktopTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopTypesResponse self = new DescribeDesktopTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopTypesResponse setBody(DescribeDesktopTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopTypesResponseBody getBody() {
        return this.body;
    }

}

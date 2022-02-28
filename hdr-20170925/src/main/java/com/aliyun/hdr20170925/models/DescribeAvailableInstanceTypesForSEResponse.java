// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAvailableInstanceTypesForSEResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableInstanceTypesForSEResponseBody body;

    public static DescribeAvailableInstanceTypesForSEResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableInstanceTypesForSEResponse self = new DescribeAvailableInstanceTypesForSEResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableInstanceTypesForSEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableInstanceTypesForSEResponse setBody(DescribeAvailableInstanceTypesForSEResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableInstanceTypesForSEResponseBody getBody() {
        return this.body;
    }

}

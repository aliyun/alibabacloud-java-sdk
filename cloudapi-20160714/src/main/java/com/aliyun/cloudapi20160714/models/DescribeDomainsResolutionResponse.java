// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDomainsResolutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainsResolutionResponseBody body;

    public static DescribeDomainsResolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResolutionResponse self = new DescribeDomainsResolutionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainsResolutionResponse setBody(DescribeDomainsResolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainsResolutionResponseBody getBody() {
        return this.body;
    }

}

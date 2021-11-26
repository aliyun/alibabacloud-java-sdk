// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastPopLocationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAnycastPopLocationsResponseBody body;

    public static DescribeAnycastPopLocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastPopLocationsResponse self = new DescribeAnycastPopLocationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastPopLocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnycastPopLocationsResponse setBody(DescribeAnycastPopLocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnycastPopLocationsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHostAvailabilityListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHostAvailabilityListResponseBody body;

    public static DescribeHostAvailabilityListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAvailabilityListResponse self = new DescribeHostAvailabilityListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostAvailabilityListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHostAvailabilityListResponse setBody(DescribeHostAvailabilityListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHostAvailabilityListResponseBody getBody() {
        return this.body;
    }

}

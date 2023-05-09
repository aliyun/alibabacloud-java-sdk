// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOnDemandInstanceStatusResponseBody body;

    public static DescribeOnDemandInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceStatusResponse self = new DescribeOnDemandInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOnDemandInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOnDemandInstanceStatusResponse setBody(DescribeOnDemandInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOnDemandInstanceStatusResponseBody getBody() {
        return this.body;
    }

}

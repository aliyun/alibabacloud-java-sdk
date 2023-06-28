// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOnDemandInstanceResponseBody body;

    public static DescribeOnDemandInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceResponse self = new DescribeOnDemandInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOnDemandInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOnDemandInstanceResponse setBody(DescribeOnDemandInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOnDemandInstanceResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandDdosEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOnDemandDdosEventResponseBody body;

    public static DescribeOnDemandDdosEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandDdosEventResponse self = new DescribeOnDemandDdosEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandDdosEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOnDemandDdosEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOnDemandDdosEventResponse setBody(DescribeOnDemandDdosEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOnDemandDdosEventResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineRelatedDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRoutineRelatedDomainsResponseBody body;

    public static DescribeRoutineRelatedDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineRelatedDomainsResponse self = new DescribeRoutineRelatedDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineRelatedDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoutineRelatedDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRoutineRelatedDomainsResponse setBody(DescribeRoutineRelatedDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoutineRelatedDomainsResponseBody getBody() {
        return this.body;
    }

}

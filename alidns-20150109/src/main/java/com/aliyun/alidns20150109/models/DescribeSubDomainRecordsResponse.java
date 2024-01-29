// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSubDomainRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSubDomainRecordsResponseBody body;

    public static DescribeSubDomainRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainRecordsResponse self = new DescribeSubDomainRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubDomainRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubDomainRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubDomainRecordsResponse setBody(DescribeSubDomainRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubDomainRecordsResponseBody getBody() {
        return this.body;
    }

}

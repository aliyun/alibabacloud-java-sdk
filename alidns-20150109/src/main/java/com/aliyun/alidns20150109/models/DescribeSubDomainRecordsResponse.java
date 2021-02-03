// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSubDomainRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSubDomainRecordsResponse setBody(DescribeSubDomainRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubDomainRecordsResponseBody getBody() {
        return this.body;
    }

}

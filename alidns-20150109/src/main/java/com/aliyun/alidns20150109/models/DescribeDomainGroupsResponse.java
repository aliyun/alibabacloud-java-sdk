// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainGroupsResponseBody body;

    public static DescribeDomainGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainGroupsResponse self = new DescribeDomainGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainGroupsResponse setBody(DescribeDomainGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainGroupsResponseBody getBody() {
        return this.body;
    }

}

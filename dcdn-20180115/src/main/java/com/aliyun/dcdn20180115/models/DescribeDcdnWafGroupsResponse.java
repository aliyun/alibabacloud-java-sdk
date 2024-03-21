// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafGroupsResponseBody body;

    public static DescribeDcdnWafGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafGroupsResponse self = new DescribeDcdnWafGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafGroupsResponse setBody(DescribeDcdnWafGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafGroupsResponseBody getBody() {
        return this.body;
    }

}

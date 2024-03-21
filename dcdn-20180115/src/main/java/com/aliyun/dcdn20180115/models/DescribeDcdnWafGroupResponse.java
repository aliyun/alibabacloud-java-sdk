// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafGroupResponseBody body;

    public static DescribeDcdnWafGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafGroupResponse self = new DescribeDcdnWafGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafGroupResponse setBody(DescribeDcdnWafGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafGroupResponseBody getBody() {
        return this.body;
    }

}

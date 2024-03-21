// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnUserTagsResponseBody body;

    public static DescribeDcdnUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserTagsResponse self = new DescribeDcdnUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnUserTagsResponse setBody(DescribeDcdnUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserTagsResponseBody getBody() {
        return this.body;
    }

}

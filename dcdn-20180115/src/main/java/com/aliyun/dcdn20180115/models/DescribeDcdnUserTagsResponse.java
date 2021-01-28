// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnUserTagsResponse setBody(DescribeDcdnUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserTagsResponseBody getBody() {
        return this.body;
    }

}

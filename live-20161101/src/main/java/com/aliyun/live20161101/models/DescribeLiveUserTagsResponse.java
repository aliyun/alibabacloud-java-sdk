// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveUserTagsResponseBody body;

    public static DescribeLiveUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserTagsResponse self = new DescribeLiveUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveUserTagsResponse setBody(DescribeLiveUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveUserTagsResponseBody getBody() {
        return this.body;
    }

}

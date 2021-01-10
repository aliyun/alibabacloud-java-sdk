// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterChannelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCasterChannelsResponseBody body;

    public static DescribeCasterChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterChannelsResponse self = new DescribeCasterChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterChannelsResponse setBody(DescribeCasterChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterChannelsResponseBody getBody() {
        return this.body;
    }

}

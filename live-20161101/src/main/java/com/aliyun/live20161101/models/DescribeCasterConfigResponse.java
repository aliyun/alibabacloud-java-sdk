// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCasterConfigResponseBody body;

    public static DescribeCasterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterConfigResponse self = new DescribeCasterConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterConfigResponse setBody(DescribeCasterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterConfigResponseBody getBody() {
        return this.body;
    }

}

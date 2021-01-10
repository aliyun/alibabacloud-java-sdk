// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterScenesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCasterScenesResponseBody body;

    public static DescribeCasterScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterScenesResponse self = new DescribeCasterScenesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterScenesResponse setBody(DescribeCasterScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterScenesResponseBody getBody() {
        return this.body;
    }

}

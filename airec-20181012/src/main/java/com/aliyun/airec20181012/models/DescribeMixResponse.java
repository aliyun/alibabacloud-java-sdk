// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeMixResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMixResponseBody body;

    public static DescribeMixResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMixResponse self = new DescribeMixResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMixResponse setBody(DescribeMixResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMixResponseBody getBody() {
        return this.body;
    }

}

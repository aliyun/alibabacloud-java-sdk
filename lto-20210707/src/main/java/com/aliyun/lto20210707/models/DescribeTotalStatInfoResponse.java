// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeTotalStatInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTotalStatInfoResponseBody body;

    public static DescribeTotalStatInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTotalStatInfoResponse self = new DescribeTotalStatInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTotalStatInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTotalStatInfoResponse setBody(DescribeTotalStatInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTotalStatInfoResponseBody getBody() {
        return this.body;
    }

}

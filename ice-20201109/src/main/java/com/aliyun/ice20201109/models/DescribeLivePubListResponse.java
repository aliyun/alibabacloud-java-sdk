// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLivePubListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLivePubListResponseBody body;

    public static DescribeLivePubListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePubListResponse self = new DescribeLivePubListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePubListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePubListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePubListResponse setBody(DescribeLivePubListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePubListResponseBody getBody() {
        return this.body;
    }

}

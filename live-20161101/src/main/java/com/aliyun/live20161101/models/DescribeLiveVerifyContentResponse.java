// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveVerifyContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveVerifyContentResponseBody body;

    public static DescribeLiveVerifyContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveVerifyContentResponse self = new DescribeLiveVerifyContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveVerifyContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveVerifyContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveVerifyContentResponse setBody(DescribeLiveVerifyContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveVerifyContentResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLiveSubListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveSubListResponseBody body;

    public static DescribeLiveSubListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSubListResponse self = new DescribeLiveSubListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSubListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveSubListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveSubListResponse setBody(DescribeLiveSubListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveSubListResponseBody getBody() {
        return this.body;
    }

}

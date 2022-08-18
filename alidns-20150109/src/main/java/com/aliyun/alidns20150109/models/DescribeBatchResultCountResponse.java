// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBatchResultCountResponseBody body;

    public static DescribeBatchResultCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultCountResponse self = new DescribeBatchResultCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBatchResultCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBatchResultCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBatchResultCountResponse setBody(DescribeBatchResultCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBatchResultCountResponseBody getBody() {
        return this.body;
    }

}

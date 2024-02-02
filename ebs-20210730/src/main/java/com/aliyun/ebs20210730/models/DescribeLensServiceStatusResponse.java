// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeLensServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLensServiceStatusResponseBody body;

    public static DescribeLensServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLensServiceStatusResponse self = new DescribeLensServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLensServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLensServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLensServiceStatusResponse setBody(DescribeLensServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLensServiceStatusResponseBody getBody() {
        return this.body;
    }

}

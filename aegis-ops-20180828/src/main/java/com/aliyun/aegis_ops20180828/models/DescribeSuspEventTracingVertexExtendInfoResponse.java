// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingVertexExtendInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSuspEventTracingVertexExtendInfoResponseBody body;

    public static DescribeSuspEventTracingVertexExtendInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingVertexExtendInfoResponse self = new DescribeSuspEventTracingVertexExtendInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingVertexExtendInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventTracingVertexExtendInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspEventTracingVertexExtendInfoResponse setBody(DescribeSuspEventTracingVertexExtendInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventTracingVertexExtendInfoResponseBody getBody() {
        return this.body;
    }

}

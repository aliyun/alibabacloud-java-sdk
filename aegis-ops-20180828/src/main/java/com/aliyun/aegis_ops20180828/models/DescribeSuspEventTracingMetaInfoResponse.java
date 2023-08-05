// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingMetaInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSuspEventTracingMetaInfoResponseBody body;

    public static DescribeSuspEventTracingMetaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingMetaInfoResponse self = new DescribeSuspEventTracingMetaInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingMetaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventTracingMetaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspEventTracingMetaInfoResponse setBody(DescribeSuspEventTracingMetaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventTracingMetaInfoResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingSubNodesQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSuspEventTracingSubNodesQueryResponseBody body;

    public static DescribeSuspEventTracingSubNodesQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingSubNodesQueryResponse self = new DescribeSuspEventTracingSubNodesQueryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingSubNodesQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventTracingSubNodesQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspEventTracingSubNodesQueryResponse setBody(DescribeSuspEventTracingSubNodesQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventTracingSubNodesQueryResponseBody getBody() {
        return this.body;
    }

}

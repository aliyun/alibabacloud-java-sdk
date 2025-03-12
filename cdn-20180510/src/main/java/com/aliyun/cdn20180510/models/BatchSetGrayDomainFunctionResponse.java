// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetGrayDomainFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSetGrayDomainFunctionResponseBody body;

    public static BatchSetGrayDomainFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetGrayDomainFunctionResponse self = new BatchSetGrayDomainFunctionResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetGrayDomainFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetGrayDomainFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetGrayDomainFunctionResponse setBody(BatchSetGrayDomainFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetGrayDomainFunctionResponseBody getBody() {
        return this.body;
    }

}

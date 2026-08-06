// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableDataInsightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDataInsightResponseBody body;

    public static EnableDataInsightResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDataInsightResponse self = new EnableDataInsightResponse();
        return TeaModel.build(map, self);
    }

    public EnableDataInsightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDataInsightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDataInsightResponse setBody(EnableDataInsightResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDataInsightResponseBody getBody() {
        return this.body;
    }

}

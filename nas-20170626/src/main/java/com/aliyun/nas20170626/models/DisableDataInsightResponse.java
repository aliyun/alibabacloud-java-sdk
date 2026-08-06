// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DisableDataInsightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDataInsightResponseBody body;

    public static DisableDataInsightResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDataInsightResponse self = new DisableDataInsightResponse();
        return TeaModel.build(map, self);
    }

    public DisableDataInsightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDataInsightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDataInsightResponse setBody(DisableDataInsightResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDataInsightResponseBody getBody() {
        return this.body;
    }

}

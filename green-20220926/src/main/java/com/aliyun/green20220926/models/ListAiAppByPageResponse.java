// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAiAppByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAiAppByPageResponseBody body;

    public static ListAiAppByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiAppByPageResponse self = new ListAiAppByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListAiAppByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiAppByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiAppByPageResponse setBody(ListAiAppByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiAppByPageResponseBody getBody() {
        return this.body;
    }

}

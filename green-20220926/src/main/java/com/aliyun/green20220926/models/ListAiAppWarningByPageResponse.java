// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAiAppWarningByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAiAppWarningByPageResponseBody body;

    public static ListAiAppWarningByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiAppWarningByPageResponse self = new ListAiAppWarningByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListAiAppWarningByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiAppWarningByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiAppWarningByPageResponse setBody(ListAiAppWarningByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiAppWarningByPageResponseBody getBody() {
        return this.body;
    }

}

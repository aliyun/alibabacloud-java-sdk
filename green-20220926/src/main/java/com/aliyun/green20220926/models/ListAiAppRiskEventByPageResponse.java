// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAiAppRiskEventByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAiAppRiskEventByPageResponseBody body;

    public static ListAiAppRiskEventByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiAppRiskEventByPageResponse self = new ListAiAppRiskEventByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListAiAppRiskEventByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiAppRiskEventByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiAppRiskEventByPageResponse setBody(ListAiAppRiskEventByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiAppRiskEventByPageResponseBody getBody() {
        return this.body;
    }

}

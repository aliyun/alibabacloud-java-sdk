// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAiAppRiskEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAiAppRiskEventResponseBody body;

    public static ListAiAppRiskEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiAppRiskEventResponse self = new ListAiAppRiskEventResponse();
        return TeaModel.build(map, self);
    }

    public ListAiAppRiskEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiAppRiskEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiAppRiskEventResponse setBody(ListAiAppRiskEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiAppRiskEventResponseBody getBody() {
        return this.body;
    }

}

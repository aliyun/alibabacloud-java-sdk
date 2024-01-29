// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListFlowRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowRulesResponseBody body;

    public static ListFlowRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowRulesResponse self = new ListFlowRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowRulesResponse setBody(ListFlowRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowRulesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListWebFlowRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebFlowRulesResponseBody body;

    public static ListWebFlowRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebFlowRulesResponse self = new ListWebFlowRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListWebFlowRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebFlowRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebFlowRulesResponse setBody(ListWebFlowRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWebFlowRulesResponseBody getBody() {
        return this.body;
    }

}

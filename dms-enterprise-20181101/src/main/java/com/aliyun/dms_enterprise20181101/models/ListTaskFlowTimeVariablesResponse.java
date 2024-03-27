// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowTimeVariablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskFlowTimeVariablesResponseBody body;

    public static ListTaskFlowTimeVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowTimeVariablesResponse self = new ListTaskFlowTimeVariablesResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowTimeVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskFlowTimeVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskFlowTimeVariablesResponse setBody(ListTaskFlowTimeVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskFlowTimeVariablesResponseBody getBody() {
        return this.body;
    }

}

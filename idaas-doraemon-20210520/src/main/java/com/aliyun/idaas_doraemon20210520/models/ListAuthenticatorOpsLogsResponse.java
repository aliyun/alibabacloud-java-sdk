// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListAuthenticatorOpsLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthenticatorOpsLogsResponseBody body;

    public static ListAuthenticatorOpsLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticatorOpsLogsResponse self = new ListAuthenticatorOpsLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthenticatorOpsLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthenticatorOpsLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthenticatorOpsLogsResponse setBody(ListAuthenticatorOpsLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthenticatorOpsLogsResponseBody getBody() {
        return this.body;
    }

}

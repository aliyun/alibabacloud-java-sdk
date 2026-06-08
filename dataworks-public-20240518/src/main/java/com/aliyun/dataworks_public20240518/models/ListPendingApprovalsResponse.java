// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPendingApprovalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPendingApprovalsResponseBody body;

    public static ListPendingApprovalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPendingApprovalsResponse self = new ListPendingApprovalsResponse();
        return TeaModel.build(map, self);
    }

    public ListPendingApprovalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPendingApprovalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPendingApprovalsResponse setBody(ListPendingApprovalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPendingApprovalsResponseBody getBody() {
        return this.body;
    }

}

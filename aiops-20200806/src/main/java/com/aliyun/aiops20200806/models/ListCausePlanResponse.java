// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListCausePlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCausePlanResponseBody body;

    public static ListCausePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCausePlanResponse self = new ListCausePlanResponse();
        return TeaModel.build(map, self);
    }

    public ListCausePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCausePlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCausePlanResponse setBody(ListCausePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCausePlanResponseBody getBody() {
        return this.body;
    }

}

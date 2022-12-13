// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemDetailOperationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProblemDetailOperationsResponseBody body;

    public static ListProblemDetailOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProblemDetailOperationsResponse self = new ListProblemDetailOperationsResponse();
        return TeaModel.build(map, self);
    }

    public ListProblemDetailOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProblemDetailOperationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProblemDetailOperationsResponse setBody(ListProblemDetailOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProblemDetailOperationsResponseBody getBody() {
        return this.body;
    }

}

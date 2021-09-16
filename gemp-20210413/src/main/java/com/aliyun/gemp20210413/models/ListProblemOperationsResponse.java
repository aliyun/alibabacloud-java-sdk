// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemOperationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProblemOperationsResponseBody body;

    public static ListProblemOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProblemOperationsResponse self = new ListProblemOperationsResponse();
        return TeaModel.build(map, self);
    }

    public ListProblemOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProblemOperationsResponse setBody(ListProblemOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProblemOperationsResponseBody getBody() {
        return this.body;
    }

}

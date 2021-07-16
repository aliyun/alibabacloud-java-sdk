// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemSubtotalsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProblemSubtotalsResponseBody body;

    public static ListProblemSubtotalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProblemSubtotalsResponse self = new ListProblemSubtotalsResponse();
        return TeaModel.build(map, self);
    }

    public ListProblemSubtotalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProblemSubtotalsResponse setBody(ListProblemSubtotalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProblemSubtotalsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListCausePlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListCausePlanResponse setBody(ListCausePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCausePlanResponseBody getBody() {
        return this.body;
    }

}

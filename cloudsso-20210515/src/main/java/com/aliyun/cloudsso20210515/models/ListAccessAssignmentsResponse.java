// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessAssignmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccessAssignmentsResponseBody body;

    public static ListAccessAssignmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessAssignmentsResponse self = new ListAccessAssignmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessAssignmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessAssignmentsResponse setBody(ListAccessAssignmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessAssignmentsResponseBody getBody() {
        return this.body;
    }

}

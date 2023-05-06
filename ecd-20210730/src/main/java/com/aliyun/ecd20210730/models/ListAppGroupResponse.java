// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppGroupResponseBody body;

    public static ListAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupResponse self = new ListAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppGroupResponse setBody(ListAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppGroupResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowProjectUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowProjectUserResponseBody body;

    public static ListFlowProjectUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowProjectUserResponse self = new ListFlowProjectUserResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowProjectUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowProjectUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowProjectUserResponse setBody(ListFlowProjectUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowProjectUserResponseBody getBody() {
        return this.body;
    }

}

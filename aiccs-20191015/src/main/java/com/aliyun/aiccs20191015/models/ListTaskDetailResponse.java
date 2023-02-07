// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskDetailResponseBody body;

    public static ListTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskDetailResponse self = new ListTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskDetailResponse setBody(ListTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskDetailResponseBody getBody() {
        return this.body;
    }

}

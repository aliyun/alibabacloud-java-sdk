// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTaskStepResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskStepResponseBody body;

    public static ListTaskStepResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskStepResponse self = new ListTaskStepResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskStepResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskStepResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskStepResponse setBody(ListTaskStepResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskStepResponseBody getBody() {
        return this.body;
    }

}

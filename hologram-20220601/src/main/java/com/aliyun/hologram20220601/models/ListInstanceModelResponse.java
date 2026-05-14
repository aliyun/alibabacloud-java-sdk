// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListInstanceModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceModelResponseBody body;

    public static ListInstanceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceModelResponse self = new ListInstanceModelResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceModelResponse setBody(ListInstanceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceModelResponseBody getBody() {
        return this.body;
    }

}

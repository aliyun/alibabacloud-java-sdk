// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListOtaTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListOtaTaskResponseBody body;

    public static ListOtaTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOtaTaskResponse self = new ListOtaTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListOtaTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOtaTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOtaTaskResponse setBody(ListOtaTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOtaTaskResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListContainerStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListContainerStatusResponseBody body;

    public static ListContainerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContainerStatusResponse self = new ListContainerStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListContainerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContainerStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContainerStatusResponse setBody(ListContainerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContainerStatusResponseBody getBody() {
        return this.body;
    }

}

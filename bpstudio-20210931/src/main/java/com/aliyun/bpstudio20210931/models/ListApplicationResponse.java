// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationResponseBody body;

    public static ListApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationResponse self = new ListApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationResponse setBody(ListApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationResponseBody getBody() {
        return this.body;
    }

}

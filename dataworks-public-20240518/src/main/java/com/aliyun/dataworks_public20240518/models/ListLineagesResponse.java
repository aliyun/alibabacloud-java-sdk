// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListLineagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLineagesResponseBody body;

    public static ListLineagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLineagesResponse self = new ListLineagesResponse();
        return TeaModel.build(map, self);
    }

    public ListLineagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLineagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLineagesResponse setBody(ListLineagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLineagesResponseBody getBody() {
        return this.body;
    }

}

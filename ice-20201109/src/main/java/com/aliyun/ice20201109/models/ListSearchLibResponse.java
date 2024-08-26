// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSearchLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSearchLibResponseBody body;

    public static ListSearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchLibResponse self = new ListSearchLibResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSearchLibResponse setBody(ListSearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSearchLibResponseBody getBody() {
        return this.body;
    }

}

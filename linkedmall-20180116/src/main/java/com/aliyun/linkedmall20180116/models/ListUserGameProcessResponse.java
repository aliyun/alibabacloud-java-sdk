// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListUserGameProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserGameProcessResponseBody body;

    public static ListUserGameProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGameProcessResponse self = new ListUserGameProcessResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGameProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserGameProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserGameProcessResponse setBody(ListUserGameProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserGameProcessResponseBody getBody() {
        return this.body;
    }

}

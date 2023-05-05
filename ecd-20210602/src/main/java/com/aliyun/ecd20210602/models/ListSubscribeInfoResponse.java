// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSubscribeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubscribeInfoResponseBody body;

    public static ListSubscribeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribeInfoResponse self = new ListSubscribeInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscribeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscribeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubscribeInfoResponse setBody(ListSubscribeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscribeInfoResponseBody getBody() {
        return this.body;
    }

}

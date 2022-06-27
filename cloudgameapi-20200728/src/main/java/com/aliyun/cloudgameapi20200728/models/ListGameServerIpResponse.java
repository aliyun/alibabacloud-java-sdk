// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListGameServerIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGameServerIpResponseBody body;

    public static ListGameServerIpResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGameServerIpResponse self = new ListGameServerIpResponse();
        return TeaModel.build(map, self);
    }

    public ListGameServerIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGameServerIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGameServerIpResponse setBody(ListGameServerIpResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGameServerIpResponseBody getBody() {
        return this.body;
    }

}

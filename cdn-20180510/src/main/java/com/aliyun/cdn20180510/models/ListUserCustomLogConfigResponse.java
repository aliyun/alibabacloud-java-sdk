// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListUserCustomLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserCustomLogConfigResponseBody body;

    public static ListUserCustomLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserCustomLogConfigResponse self = new ListUserCustomLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListUserCustomLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserCustomLogConfigResponse setBody(ListUserCustomLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserCustomLogConfigResponseBody getBody() {
        return this.body;
    }

}

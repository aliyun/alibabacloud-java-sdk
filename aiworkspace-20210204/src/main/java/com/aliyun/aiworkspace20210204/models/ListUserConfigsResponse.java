// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListUserConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserConfigsResponseBody body;

    public static ListUserConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserConfigsResponse self = new ListUserConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserConfigsResponse setBody(ListUserConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserConfigsResponseBody getBody() {
        return this.body;
    }

}

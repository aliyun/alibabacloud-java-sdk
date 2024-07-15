// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListUserKubeConfigStatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserKubeConfigStatesResponseBody body;

    public static ListUserKubeConfigStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserKubeConfigStatesResponse self = new ListUserKubeConfigStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserKubeConfigStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserKubeConfigStatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserKubeConfigStatesResponse setBody(ListUserKubeConfigStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserKubeConfigStatesResponseBody getBody() {
        return this.body;
    }

}

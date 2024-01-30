// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListBuildPackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBuildPackResponseBody body;

    public static ListBuildPackResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBuildPackResponse self = new ListBuildPackResponse();
        return TeaModel.build(map, self);
    }

    public ListBuildPackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBuildPackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBuildPackResponse setBody(ListBuildPackResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBuildPackResponseBody getBody() {
        return this.body;
    }

}

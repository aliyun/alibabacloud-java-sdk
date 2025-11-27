// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListBizTracesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBizTracesResponseBody body;

    public static ListBizTracesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBizTracesResponse self = new ListBizTracesResponse();
        return TeaModel.build(map, self);
    }

    public ListBizTracesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBizTracesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBizTracesResponse setBody(ListBizTracesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBizTracesResponseBody getBody() {
        return this.body;
    }

}

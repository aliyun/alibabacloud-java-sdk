// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAclsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAclsResponseBody body;

    public static ListAclsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAclsResponse self = new ListAclsResponse();
        return TeaModel.build(map, self);
    }

    public ListAclsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAclsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAclsResponse setBody(ListAclsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAclsResponseBody getBody() {
        return this.body;
    }

}

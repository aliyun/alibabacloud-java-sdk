// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListUserClusterTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserClusterTypesResponseBody body;

    public static ListUserClusterTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserClusterTypesResponse self = new ListUserClusterTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserClusterTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserClusterTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserClusterTypesResponse setBody(ListUserClusterTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserClusterTypesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSaasPermissionGroupInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSaasPermissionGroupInfosResponseBody body;

    public static ListSaasPermissionGroupInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSaasPermissionGroupInfosResponse self = new ListSaasPermissionGroupInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListSaasPermissionGroupInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSaasPermissionGroupInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSaasPermissionGroupInfosResponse setBody(ListSaasPermissionGroupInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSaasPermissionGroupInfosResponseBody getBody() {
        return this.body;
    }

}

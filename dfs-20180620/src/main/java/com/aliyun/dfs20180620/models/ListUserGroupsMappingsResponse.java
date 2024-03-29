// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListUserGroupsMappingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserGroupsMappingsResponseBody body;

    public static ListUserGroupsMappingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsMappingsResponse self = new ListUserGroupsMappingsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsMappingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserGroupsMappingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserGroupsMappingsResponse setBody(ListUserGroupsMappingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserGroupsMappingsResponseBody getBody() {
        return this.body;
    }

}

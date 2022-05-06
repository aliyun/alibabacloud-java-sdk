// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListUserGroupsMappingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListUserGroupsMappingsResponse setBody(ListUserGroupsMappingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserGroupsMappingsResponseBody getBody() {
        return this.body;
    }

}

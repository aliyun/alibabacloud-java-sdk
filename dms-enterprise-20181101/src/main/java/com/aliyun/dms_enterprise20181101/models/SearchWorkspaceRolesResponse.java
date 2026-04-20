// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchWorkspaceRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchWorkspaceRolesResponseBody body;

    public static SearchWorkspaceRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchWorkspaceRolesResponse self = new SearchWorkspaceRolesResponse();
        return TeaModel.build(map, self);
    }

    public SearchWorkspaceRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchWorkspaceRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchWorkspaceRolesResponse setBody(SearchWorkspaceRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchWorkspaceRolesResponseBody getBody() {
        return this.body;
    }

}

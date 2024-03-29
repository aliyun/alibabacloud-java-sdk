// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class BindVscMountPointAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindVscMountPointAliasResponseBody body;

    public static BindVscMountPointAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        BindVscMountPointAliasResponse self = new BindVscMountPointAliasResponse();
        return TeaModel.build(map, self);
    }

    public BindVscMountPointAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindVscMountPointAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindVscMountPointAliasResponse setBody(BindVscMountPointAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public BindVscMountPointAliasResponseBody getBody() {
        return this.body;
    }

}

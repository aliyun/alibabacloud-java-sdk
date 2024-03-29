// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyAccessGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccessGroupResponseBody body;

    public static ModifyAccessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessGroupResponse self = new ModifyAccessGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccessGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccessGroupResponse setBody(ModifyAccessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccessGroupResponseBody getBody() {
        return this.body;
    }

}

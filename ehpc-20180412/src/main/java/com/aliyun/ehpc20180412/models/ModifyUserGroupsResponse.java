// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyUserGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserGroupsResponseBody body;

    public static ModifyUserGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserGroupsResponse self = new ModifyUserGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserGroupsResponse setBody(ModifyUserGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserGroupsResponseBody getBody() {
        return this.body;
    }

}

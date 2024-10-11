// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateUserGroupSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserGroupSwitchResponseBody body;

    public static UpdateUserGroupSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupSwitchResponse self = new UpdateUserGroupSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserGroupSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserGroupSwitchResponse setBody(UpdateUserGroupSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserGroupSwitchResponseBody getBody() {
        return this.body;
    }

}

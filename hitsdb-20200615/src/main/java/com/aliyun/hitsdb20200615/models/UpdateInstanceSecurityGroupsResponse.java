// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateInstanceSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceSecurityGroupsResponseBody body;

    public static UpdateInstanceSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSecurityGroupsResponse self = new UpdateInstanceSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceSecurityGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceSecurityGroupsResponse setBody(UpdateInstanceSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}

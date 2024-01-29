// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachServerGroupsResponseBody body;

    public static AttachServerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachServerGroupsResponse self = new AttachServerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public AttachServerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachServerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachServerGroupsResponse setBody(AttachServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachServerGroupsResponseBody getBody() {
        return this.body;
    }

}

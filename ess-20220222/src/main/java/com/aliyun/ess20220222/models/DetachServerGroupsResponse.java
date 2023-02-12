// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachServerGroupsResponseBody body;

    public static DetachServerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachServerGroupsResponse self = new DetachServerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DetachServerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachServerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachServerGroupsResponse setBody(DetachServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachServerGroupsResponseBody getBody() {
        return this.body;
    }

}

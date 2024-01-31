// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetInstanceSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceSecurityGroupsResponseBody body;

    public static GetInstanceSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSecurityGroupsResponse self = new GetInstanceSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceSecurityGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceSecurityGroupsResponse setBody(GetInstanceSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2InstanceSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormV2InstanceSecurityGroupsResponseBody body;

    public static GetLindormV2InstanceSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2InstanceSecurityGroupsResponse self = new GetLindormV2InstanceSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormV2InstanceSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormV2InstanceSecurityGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormV2InstanceSecurityGroupsResponse setBody(GetLindormV2InstanceSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormV2InstanceSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}

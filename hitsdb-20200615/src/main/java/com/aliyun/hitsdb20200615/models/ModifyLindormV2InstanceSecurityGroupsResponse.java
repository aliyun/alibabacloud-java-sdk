// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyLindormV2InstanceSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLindormV2InstanceSecurityGroupsResponseBody body;

    public static ModifyLindormV2InstanceSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLindormV2InstanceSecurityGroupsResponse self = new ModifyLindormV2InstanceSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLindormV2InstanceSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLindormV2InstanceSecurityGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLindormV2InstanceSecurityGroupsResponse setBody(ModifyLindormV2InstanceSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLindormV2InstanceSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}

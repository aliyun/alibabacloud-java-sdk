// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySecurityGroupsResponseBody body;

    public static ModifySecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupsResponse self = new ModifySecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityGroupsResponse setBody(ModifySecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityGroupsResponseBody getBody() {
        return this.body;
    }

}

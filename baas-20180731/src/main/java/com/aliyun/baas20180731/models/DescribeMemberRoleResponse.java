// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMemberRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMemberRoleResponseBody body;

    public static DescribeMemberRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberRoleResponse self = new DescribeMemberRoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMemberRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMemberRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMemberRoleResponse setBody(DescribeMemberRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMemberRoleResponseBody getBody() {
        return this.body;
    }

}

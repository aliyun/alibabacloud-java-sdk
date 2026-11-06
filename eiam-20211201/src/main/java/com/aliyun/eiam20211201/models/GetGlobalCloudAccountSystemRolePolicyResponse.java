// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetGlobalCloudAccountSystemRolePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGlobalCloudAccountSystemRolePolicyResponseBody body;

    public static GetGlobalCloudAccountSystemRolePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalCloudAccountSystemRolePolicyResponse self = new GetGlobalCloudAccountSystemRolePolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetGlobalCloudAccountSystemRolePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGlobalCloudAccountSystemRolePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGlobalCloudAccountSystemRolePolicyResponse setBody(GetGlobalCloudAccountSystemRolePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGlobalCloudAccountSystemRolePolicyResponseBody getBody() {
        return this.body;
    }

}

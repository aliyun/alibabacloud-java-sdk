// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetDBResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDBResourceGroupResponseBody body;

    public static GetDBResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDBResourceGroupResponse self = new GetDBResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetDBResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDBResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDBResourceGroupResponse setBody(GetDBResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDBResourceGroupResponseBody getBody() {
        return this.body;
    }

}

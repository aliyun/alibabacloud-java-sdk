// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyConfigGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyConfigGroupResponseBody body;

    public static ModifyConfigGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyConfigGroupResponse self = new ModifyConfigGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyConfigGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyConfigGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyConfigGroupResponse setBody(ModifyConfigGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConfigGroupResponseBody getBody() {
        return this.body;
    }

}

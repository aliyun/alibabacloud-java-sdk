// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class ModifyFaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFaceGroupResponseBody body;

    public static ModifyFaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFaceGroupResponse self = new ModifyFaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFaceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFaceGroupResponse setBody(ModifyFaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFaceGroupResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetStudentsDesktopGroupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetStudentsDesktopGroupPolicyResponseBody body;

    public static SetStudentsDesktopGroupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetStudentsDesktopGroupPolicyResponse self = new SetStudentsDesktopGroupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetStudentsDesktopGroupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetStudentsDesktopGroupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetStudentsDesktopGroupPolicyResponse setBody(SetStudentsDesktopGroupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetStudentsDesktopGroupPolicyResponseBody getBody() {
        return this.body;
    }

}

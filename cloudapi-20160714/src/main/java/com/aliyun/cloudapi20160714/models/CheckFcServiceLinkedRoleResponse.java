// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CheckFcServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckFcServiceLinkedRoleResponseBody body;

    public static CheckFcServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFcServiceLinkedRoleResponse self = new CheckFcServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckFcServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckFcServiceLinkedRoleResponse setBody(CheckFcServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckFcServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}

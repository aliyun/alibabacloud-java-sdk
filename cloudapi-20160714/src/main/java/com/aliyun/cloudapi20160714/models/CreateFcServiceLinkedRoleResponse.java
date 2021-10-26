// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateFcServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFcServiceLinkedRoleResponseBody body;

    public static CreateFcServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFcServiceLinkedRoleResponse self = new CreateFcServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateFcServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFcServiceLinkedRoleResponse setBody(CreateFcServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFcServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}

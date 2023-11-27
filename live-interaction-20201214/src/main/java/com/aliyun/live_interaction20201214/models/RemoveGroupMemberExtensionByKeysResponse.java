// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupMemberExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveGroupMemberExtensionByKeysResponseBody body;

    public static RemoveGroupMemberExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupMemberExtensionByKeysResponse self = new RemoveGroupMemberExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public RemoveGroupMemberExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveGroupMemberExtensionByKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveGroupMemberExtensionByKeysResponse setBody(RemoveGroupMemberExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveGroupMemberExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}

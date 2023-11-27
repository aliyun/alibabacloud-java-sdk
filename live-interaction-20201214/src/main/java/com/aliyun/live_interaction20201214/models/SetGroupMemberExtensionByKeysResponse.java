// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetGroupMemberExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetGroupMemberExtensionByKeysResponseBody body;

    public static SetGroupMemberExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGroupMemberExtensionByKeysResponse self = new SetGroupMemberExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public SetGroupMemberExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGroupMemberExtensionByKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetGroupMemberExtensionByKeysResponse setBody(SetGroupMemberExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGroupMemberExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}

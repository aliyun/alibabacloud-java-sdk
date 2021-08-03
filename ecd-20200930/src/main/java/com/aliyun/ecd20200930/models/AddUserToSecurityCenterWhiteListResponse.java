// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddUserToSecurityCenterWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserToSecurityCenterWhiteListResponseBody body;

    public static AddUserToSecurityCenterWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToSecurityCenterWhiteListResponse self = new AddUserToSecurityCenterWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToSecurityCenterWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserToSecurityCenterWhiteListResponse setBody(AddUserToSecurityCenterWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToSecurityCenterWhiteListResponseBody getBody() {
        return this.body;
    }

}

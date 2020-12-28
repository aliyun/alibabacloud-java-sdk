// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class BindAccountToClusterUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindAccountToClusterUserResponseBody body;

    public static BindAccountToClusterUserResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAccountToClusterUserResponse self = new BindAccountToClusterUserResponse();
        return TeaModel.build(map, self);
    }

    public BindAccountToClusterUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAccountToClusterUserResponse setBody(BindAccountToClusterUserResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAccountToClusterUserResponseBody getBody() {
        return this.body;
    }

}

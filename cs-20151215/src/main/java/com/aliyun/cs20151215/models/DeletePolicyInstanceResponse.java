// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeletePolicyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyInstanceResponse self = new DeletePolicyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}

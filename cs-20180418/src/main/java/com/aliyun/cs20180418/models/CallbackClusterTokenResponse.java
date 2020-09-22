// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class CallbackClusterTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static CallbackClusterTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackClusterTokenResponse self = new CallbackClusterTokenResponse();
        return TeaModel.build(map, self);
    }

    public CallbackClusterTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}

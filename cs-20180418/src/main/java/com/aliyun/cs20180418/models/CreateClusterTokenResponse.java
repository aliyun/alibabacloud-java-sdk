// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class CreateClusterTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static CreateClusterTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterTokenResponse self = new CreateClusterTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateClusterBootstrapActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClusterBootstrapActionResponseBody body;

    public static CreateClusterBootstrapActionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterBootstrapActionResponse self = new CreateClusterBootstrapActionResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterBootstrapActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterBootstrapActionResponse setBody(CreateClusterBootstrapActionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterBootstrapActionResponseBody getBody() {
        return this.body;
    }

}
